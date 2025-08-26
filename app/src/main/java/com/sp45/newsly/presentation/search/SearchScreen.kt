package com.sp45.newsly.presentation.search

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.paging.compose.collectAsLazyPagingItems
import com.sp45.newsly.domain.model.Article
import com.sp45.newsly.presentation.common.ArticlesList
import com.sp45.newsly.presentation.common.SearchBar

private val EdgePadding = 12.dp

@Composable
fun SearchScreen(
    state: SearchState,
    event: (SearchEvent) -> Unit,
    navigateToDetails: (Article) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = EdgePadding, vertical = 8.dp)
    ) {
        SearchBar(
            modifier = Modifier.fillMaxWidth(),
            text = state.searchQuery,
            readOnly = false,
            onValueChange = { event(SearchEvent.UpdateSearchQuery(it)) },
            onSearch = { event(SearchEvent.SearchNews) }
        )

        Spacer(modifier = Modifier.height(12.dp))

        state.articles?.let {
            val articles = it.collectAsLazyPagingItems()
            ArticlesList(
                modifier = Modifier.fillMaxSize(),
                articles = articles,
                onClick = navigateToDetails
            )
        }
    }
}