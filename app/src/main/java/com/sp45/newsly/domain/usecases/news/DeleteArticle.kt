package com.sp45.newsly.domain.usecases.news

import com.sp45.newsly.data.local.NewsDao
import com.sp45.newsly.domain.model.Article
import javax.inject.Inject

class DeleteArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.delete(article = article)
    }

}