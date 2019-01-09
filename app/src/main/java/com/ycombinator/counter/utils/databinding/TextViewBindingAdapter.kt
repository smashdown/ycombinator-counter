package com.ycombinator.counter.utils.databinding

import android.widget.TextView
import androidx.databinding.BindingAdapter

object TextViewBindingAdapter {
    @JvmStatic
    @BindingAdapter("count")
    fun setCount(view: TextView, count: Int) {
        view.text = count.toString()
    }
}