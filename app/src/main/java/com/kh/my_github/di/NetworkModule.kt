package com.kh.my_github.di

import com.kh.my_github.BuildConfig
import com.kh.my_github.data.db.DataStoreManager
import com.kh.my_github.data.network.service.TokenService
import com.kh.my_github.data.network.RequestInterceptor
import com.kh.my_github.data.network.service.RepoService
import com.kh.my_github.data.network.service.UserService
import com.skydoves.sandwich.adapters.ApiResponseCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PublicAccess

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PrivateAccess

/**
 * 네트워크 관련 모듈
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    @PublicAccess
    fun providePublicOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.HEADERS
                level =HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    /**
     * Okhttp Client 모듈
     * - 요청 시 토큰을 RequestIntercepter에서 처리
     * - 통신 중 로그를 남김
     * @param dataStoreManager
     * @return
     */
    @Provides
    @Singleton
    @PrivateAccess
    fun providePrivateOkHttpClient(dataStoreManager: DataStoreManager): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(RequestInterceptor(dataStoreManager))
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.HEADERS
                level =HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    /**
     * Retrofit 모듈
     * - Gson 변환 사용. 추후 Moshi로 전환 예정
     *
     * @param okHttpClient
     * @return
     */
    @Provides
    @Singleton
    @PublicAccess
    fun providePublicRetrofit(@PublicAccess okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BuildConfig.MAIN_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ApiResponseCallAdapterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @PrivateAccess
    fun providePrivateRetrofit(@PrivateAccess okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BuildConfig.API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ApiResponseCallAdapterFactory.create())
            .build()
    }

    /**
     * Retrofit을 이용한 KameloService 모듈
     *
     * @param retrofit
     * @return
     */
    @Provides
    @Singleton
    fun provideTokenService(@PublicAccess retrofit: Retrofit): TokenService {
        return retrofit.create(TokenService::class.java)
    }

    @Provides
    @Singleton
    fun provideUserService(@PrivateAccess retrofit: Retrofit): UserService {
        return retrofit.create(UserService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepoService(@PrivateAccess retrofit: Retrofit): RepoService {
        return retrofit.create(RepoService::class.java)
    }
}
