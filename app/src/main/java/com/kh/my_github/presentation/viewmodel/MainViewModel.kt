package com.kh.my_github.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.kh.my_github.data.model.GitRepository
import com.kh.my_github.data.model.User
import com.kh.my_github.data.repository.GitHubApiRepository
import com.kh.my_github.data.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val gitHubApiRepo: GitHubApiRepository, private val loginRepo: LoginRepository) :
    ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    private val _repos: MutableStateFlow<PagingData<GitRepository>> =
        MutableStateFlow(PagingData.empty())
    val repos: StateFlow<PagingData<GitRepository>> = _repos

    private val _nav = MutableLiveData<String>()
    val nav: LiveData<String> get() = _nav

    init {
        viewModelScope.launch {
            gitHubApiRepo.getUser({}, {}, {
                _nav.postValue("LOGIN")
            }).collect { user ->
                Log.d("TAG", "USER -> ${user.toString()}")
                _user.value = user
            }
        }
    }

    fun login(code: String)  = viewModelScope.launch{

        loginRepo.login(code, {
            Log.d("TAG", " ONSTART => ")
        }, {
            Log.d("TAG", " ONCOMPLETED => ")
        }).collect { info ->
            viewModelScope.launch {
                gitHubApiRepo.getUser({}, {}, {

                }).collect { user ->
                    Log.d("TAG", "USER -> ${user.toString()}")
                    _user.value = user
                }
            }
        }
    }

    fun getMyRepos(url: String): Flow<PagingData<GitRepository>> = flow {
        try {
            Log.d("TAG", "USER 2 => ${user.toString()}")
            emitAll(gitHubApiRepo.getMyReposByPage(url).flow.cachedIn(viewModelScope))
        } catch (e: Exception) {
            // Handle error
            e.printStackTrace()
        }
    }
}




