package com.sp45.newsly.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import com.sp45.newsly.domain.model.Article
import com.sp45.newsly.presentation.Dimens.MediumPadding1
import com.sp45.newsly.presentation.common.ArticlesList
import com.sp45.newsly.presentation.common.SearchBar

private val EdgePadding = 12.dp // tighter than MediumPadding1

@Composable
fun HomeScreen(
    articles: LazyPagingItems<Article>,
    navigateToSearch: () -> Unit,
    navigateToDetails: (Article) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(top = MediumPadding1)
    ) {
        // Search
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = EdgePadding),
            text = "",
            readOnly = true,
            onValueChange = {},
            onSearch = {},
            onClick = navigateToSearch
        )

        Spacer(modifier = Modifier.height(12.dp))

        ArticlesList(
            modifier = Modifier.padding(horizontal = EdgePadding),
            articles = articles,
            onClick = navigateToDetails
        )
    }
}