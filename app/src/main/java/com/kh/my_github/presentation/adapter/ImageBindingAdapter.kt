package com.kh.my_github.presentation.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kh.my_github.R

@BindingAdapter(value = ["imageUrl"], requireAll = false)
fun ImageView.loadCircleImage(url: String?) {
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.ic_thumbnail_placeholder)
        .error(R.drawable.ic_thumbnail_error)
        .circleCrop()
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)
}