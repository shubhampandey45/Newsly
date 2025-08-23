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
        title = "Discover Amazing Recipes",
        description = "Explore a wide variety of delicious recipes from around the world. Find your next favorite meal here!",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Save Your Favorites",
        description = "Easily save and organize recipes you love. Access them anytime, anywhere.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Plan Your Meals",
        description = "Create weekly meal plans and generate shopping lists with just a few taps. Make cooking hassle-free.",
        image = R.drawable.onboarding3
    )
)
