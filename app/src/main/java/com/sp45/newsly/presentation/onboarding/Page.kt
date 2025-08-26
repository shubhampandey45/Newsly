package com.sp45.newsly.presentation.onboarding

import androidx.annotation.DrawableRes
import com.sp45.newsly.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,

    )

val pages = listOf(
    Page(
        title = "Clarity in the Chaos",
        description = "Every headline tells a story. Explore ideas, spark curiosity, and see perspectives that matter.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Find what matters to you.",
        description = "From global headlines to your favorite niche, search and discover stories that spark your curiosity.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Save. Read. Remember.",
        description = "Bookmark the stories you love and dive deeper anytime your personal news hub, always with you.",
        image = R.drawable.onboarding3
    )
)
