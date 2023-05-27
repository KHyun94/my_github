package com.kh.my_github.presentation.view

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.paging.cachedIn
import androidx.recyclerview.widget.LinearLayoutManager
import com.kh.my_github.BuildConfig
import com.kh.my_github.R
import com.kh.my_github.databinding.ActivityMainBinding
import com.kh.my_github.presentation.adapter.ReposPagingAdapter
import com.kh.my_github.presentation.viewmodel.MainViewModel
import com.kh.my_github.utils.CustomDecoration
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels<MainViewModel>()

    private val pagingAdapter = ReposPagingAdapter()

    private val itemDecoration = CustomDecoration(1.5f, 0f, Color.parseColor("#B0B1B3"))

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.rvRepositories.apply {
            adapter = pagingAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(itemDecoration)
        }
        lifecycleScope.launch {
            Log.d("TAG", "View Repos Collect Ready")
            viewModel.repos.collect {
                pagingAdapter.submitData(it)
                Log.d(
                    "TAG",
                    "View Repos Collecting... ${it.toString()} ${pagingAdapter.itemCount}개"
                )

            }
        }

        viewModel.nav.observe(this) {
            if (it == "LOGIN") {
                login(this)
            }
        }
    }

    private fun login(context: Context) {
        val loginUrl = Uri.Builder().scheme("https").authority("github.com")
            .appendPath("login")
            .appendPath("oauth")
            .appendPath("authorize")
            .appendQueryParameter("client_id", BuildConfig.CLIENT_ID)
            .appendQueryParameter("redirect_uri", "my-github://callback")
            .build()

        // CustomTabsIntent로 브라우저 열기
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(context, loginUrl)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent?.data != null) {
            val uri = intent.data
            Log.d("TAG", "URI => $uri")

            uri?.getQueryParameter("code")?.let { code ->
                viewModel.login(code = code)
            }
            // code 값을 사용하여 토큰을 요청하거나 필요한 작업을 수행
        }
    }
}

