package com.ycombinator.counter.ui.main

import com.ycombinator.counter.R
import com.ycombinator.counter.databinding.ActivityMainBinding
import com.ycombinator.counter.ui.base.BaseActivity
import com.ycombinator.counter.ui.base.DummyViewModel

class MainActivity : BaseActivity<ActivityMainBinding, DummyViewModel>(DummyViewModel::class) {
    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun initViews() {
        setSupportActionBar(binding.appBar.toolbar)
    }
}
