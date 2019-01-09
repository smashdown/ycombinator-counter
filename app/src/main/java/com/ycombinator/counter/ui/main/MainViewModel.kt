package com.ycombinator.counter.ui.main

import com.ycombinator.counter.ui.base.BaseViewModel
import com.ycombinator.counter.utils.arch.SingleLiveEvent

class MainViewModel : BaseViewModel() {
    /**
     * Basically, Android View Model handles Lifecycle itself.
     * No need to override onSaveInstanceState() anymore.
     */
    val count = SingleLiveEvent(0) // survey ID included in tag

    fun onClick() {
        var next = count.value?.inc()
        if (next == Int.MAX_VALUE) next = 0
        count.value = next
    }
}
