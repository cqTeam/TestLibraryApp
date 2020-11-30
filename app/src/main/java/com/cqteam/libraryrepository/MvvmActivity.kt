package com.cqteam.libraryrepository

import android.os.Bundle
import com.cqteam.lib_androidx_mvvm.view.activity.BaseMvvmActivity
import com.cqteam.libraryrepository.databinding.ActivityMvvmBinding
import com.cqteam.libraryrepository.viewmodel.MvvmViewModel

class MvvmActivity : BaseMvvmActivity<ActivityMvvmBinding, MvvmViewModel>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
    }

    override fun createViewModel(): Class<MvvmViewModel> {
        return MvvmViewModel::class.java
    }

    override fun initViewBinding(): ActivityMvvmBinding {
        return ActivityMvvmBinding.inflate(layoutInflater)
    }

    override fun initView() {
    }

    override fun initData() {
    }

    override fun onLightClean() {
    }

    override fun onHeavyClean() {
    }
}