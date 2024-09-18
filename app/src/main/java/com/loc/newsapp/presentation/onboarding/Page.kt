package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Смотрите свежие новости",
        description = "Смотрите свежие новости на главном экране",
        image = R.drawable.img1
    ),
    Page(
        title = "Ищите нужные новости",
        description = "Ищите интересующие вас новости на экране поиска.",
        image = R.drawable.img2
    ),
    Page(
        title = "Сохраняйте новости в закладки",
        description = "Сохраняйте необходимые новости в закладки и смотрите их позже на экране закладок",
        image = R.drawable.img3
    )
)
