package com.kh.my_github.presentation.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.kh.my_github.utils.RandomColorGenerator

@BindingAdapter("backgroundTintWithHash")
fun setBackgroundTintWithHash(view: TextView, input: String) {
    val colorCode = RandomColorGenerator.hashStringToColor(input)
    view.backgroundTintList = ColorStateList.valueOf(Color.parseColor(colorCode))
}