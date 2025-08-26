package com.sp45.newsly.domain.usecases.news

import com.sp45.newsly.data.local.NewsDao
import com.sp45.newsly.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}