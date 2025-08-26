package com.sp45.newsly.domain.usecases.news

import javax.inject.Inject
import androidx.paging.PagingData
import com.sp45.newsly.domain.model.Article
import com.sp45.newsly.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            searchQuery = searchQuery,
            sources = sources
        )
    }
}