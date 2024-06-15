package com.example.affirmationapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class affirmations(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int
)
val data = listOf(
    affirmations(R.drawable.image1,R.string.affirmation1),
    affirmations(R.drawable.image2,R.string.affirmation2),
    affirmations(R.drawable.image3,R.string.affirmation3),
    affirmations(R.drawable.image4,R.string.affirmation4),
    affirmations(R.drawable.image5,R.string.affirmation5),
    affirmations(R.drawable.image6,R.string.affirmation6),
    affirmations(R.drawable.image7,R.string.affirmation7),
    affirmations(R.drawable.image8,R.string.affirmation8),
    affirmations(R.drawable.image9,R.string.affirmation9)
)