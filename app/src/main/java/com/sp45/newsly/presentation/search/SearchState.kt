package com.sp45.newsly.presentation.search

import androidx.paging.PagingData
import com.sp45.newsly.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)