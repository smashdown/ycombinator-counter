package com.ycombinator.counter.ui.main

import com.ycombinator.counter.R
import com.ycombinator.counter.databinding.FragmentMainBinding
import com.ycombinator.counter.ui.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(MainViewModel::class) {
    override fun getLayoutRes(): Int = R.layout.fragment_main

    override fun observeViewModel() {
        super.observeViewModel()
    }
}
