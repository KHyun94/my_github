package com.kh.my_github.di

import android.content.Context
import com.kh.my_github.data.datasource.TokenRemoteDataSource
import com.kh.my_github.data.datasource.GitHubApiRemoteDataSource
import com.kh.my_github.data.datasource.RepoPagingSource
import com.kh.my_github.data.db.DataStoreManager
import com.kh.my_github.data.network.service.RepoService
import com.kh.my_github.data.repository.LoginRepository
import com.kh.my_github.data.network.service.TokenService
import com.kh.my_github.data.network.service.UserService
import com.kh.my_github.data.repository.GitHubApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Data module(Data Layer 관련 모듈)
 *
 * @constructor Create empty Data module
 */
@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    /**
     * Provide data store manager
     *
     * @param context
     * @return
     */
    @Provides
    @Singleton
    fun provideDataStoreManager(@ApplicationContext context: Context): DataStoreManager {
        return DataStoreManager(context)
    }

    /**
     * Provide token remote data source
     *
     * @param service
     * @return
     */
    @Provides
    @Singleton
    fun provideTokenRemoteDataSource(service: TokenService): TokenRemoteDataSource {
        return TokenRemoteDataSource(service)
    }


    /**
     * Provide token remote data source
     *
     * @param service
     * @return
     */
    @Provides
    @Singleton
    fun provideUserRemoteDataSource(
        userService: UserService,
        repoService: RepoService
    ): GitHubApiRemoteDataSource {
        return GitHubApiRemoteDataSource(userService = userService, repoService = repoService)
    }

    @Provides
    @Singleton
    fun provideReposPagingDataSource(
        repoService: RepoService
    ): RepoPagingSource {
        return RepoPagingSource(repoService)
    }

    /**
     * Provide data store manager
     *
     * @param context
     * @return
     */
    @Provides
    @Singleton
    fun provideLoginRepository(
        remoteDataSource: TokenRemoteDataSource,
        dataStoreManager: DataStoreManager
    ): LoginRepository {
        return LoginRepository(
            tokenRemoteDataSource = remoteDataSource,
            dataStoreManager = dataStoreManager
        )
    }

    @Provides
    @Singleton
    fun provideUserRepository(remoteDataSource: GitHubApiRemoteDataSource, repoPagingSource: RepoPagingSource): GitHubApiRepository {
        return GitHubApiRepository(
            gitHubApiRemoteDataSource = remoteDataSource,
            repoPagingSource = repoPagingSource
        )
    }
}
