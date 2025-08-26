package com.sp45.newsly.presentation.bookmark

import com.sp45.newsly.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)