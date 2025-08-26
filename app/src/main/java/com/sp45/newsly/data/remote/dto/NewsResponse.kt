package com.sp45.newsly.data.remote.dto

import com.sp45.newsly.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)