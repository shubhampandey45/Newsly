package com.sp45.newsly.presentation.details.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sp45.newsly.R
import com.sp45.newsly.ui.theme.NewslyTheme

@Composable
fun DetailsTopBar(
    modifier: Modifier = Modifier,
    onBrowsingClick: () -> Unit,
    onShareClick: () -> Unit,
    onBookMarkClick: () -> Unit,
    onBackClick: () -> Unit,
    isBookmarked: Boolean = false,
) {
    val bookmarkScale by animateFloatAsState(
        targetValue = if (isBookmarked) 1.2f else 1f,
        animationSpec = spring(dampingRatio = 0.6f)
    )

    val bookmarkColor by animateColorAsState(
        targetValue = if (isBookmarked) {
            MaterialTheme.colorScheme.error
        } else {
            MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
        },
        animationSpec = spring()
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 20.dp, end = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Back Button
            Surface(
                modifier = Modifier.size(48.dp),
                shape = CircleShape,
                color = Color.White.copy(alpha = 0.9f),
                shadowElevation = 8.dp
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_back_arrow),
                        contentDescription = "Back",
                        tint = Color.Black.copy(alpha = 0.8f)
                    )
                }
            }

            // Action Buttons Row
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Bookmark Button
                Surface(
                    modifier = Modifier
                        .size(48.dp)
                        .scale(bookmarkScale),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.primary,
                    shadowElevation = if (isBookmarked) 12.dp else 8.dp
                ) {
                    IconButton(
                        onClick = onBookMarkClick,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) {
                                Icons.Filled.Favorite
                            } else {
                                Icons.Outlined.Favorite
                            },
                            contentDescription = if (isBookmarked) "Remove bookmark" else "Add bookmark",
                            tint = bookmarkColor
                        )
                    }
                }

                // Share Button
                Surface(
                    modifier = Modifier.size(48.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.primary,
                    shadowElevation = 8.dp
                ) {
                    IconButton(
                        onClick = onShareClick,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "Share",
                            tint = Color.Black.copy(alpha = 0.8f)
                        )
                    }
                }

                // Open in Browser Button
                Surface(
                    modifier = Modifier.size(48.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.primary,
                    shadowElevation = 12.dp
                ) {
                    IconButton(
                        onClick = onBrowsingClick,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_network),
                            contentDescription = "Open in browser",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DetailsTopBarPreview() {
    NewslyTheme(dynamicColor = false) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Blue.copy(alpha = 0.8f),
                            Color.Transparent
                        )
                    )
                )
        ) {
            DetailsTopBar(
                onShareClick = { /*TODO*/ },
                onBookMarkClick = { /*TODO*/ },
                onBrowsingClick = { /*TODO*/ },
                onBackClick = { /*TODO*/ },
                isBookmarked = false
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DetailsTopBarBookmarkedPreview() {
    NewslyTheme(dynamicColor = false) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Blue.copy(alpha = 0.8f),
                            Color.Transparent
                        )
                    )
                )
        ) {
            DetailsTopBar(
                onShareClick = { /*TODO*/ },
                onBookMarkClick = { /*TODO*/ },
                onBrowsingClick = { /*TODO*/ },
                onBackClick = { /*TODO*/ },
                isBookmarked = true
            )
        }
    }
}