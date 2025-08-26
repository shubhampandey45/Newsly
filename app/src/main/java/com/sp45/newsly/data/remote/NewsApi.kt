package com.sp45.newsly.data.remote

import retrofit2.http.Query
import com.sp45.newsly.data.remote.dto.NewsResponse
import com.sp45.newsly.util.Constants.API_KEY
import retrofit2.http.GET

interface NewsApi {

    @GET("everything")
    suspend fun getNews(
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse

    @GET("everything")
    suspend fun searchNews(
        @Query("q") searchQuery: String,
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse
}