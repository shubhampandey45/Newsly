package com.sp45.newsly.domain.usecases.news

import androidx.paging.PagingData
import com.sp45.newsly.domain.model.Article
import com.sp45.newsly.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNews @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}