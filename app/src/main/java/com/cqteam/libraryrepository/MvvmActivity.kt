package com.cqteam.libraryrepository

import com.cqteam.lib_androidx_mvvm.MvvmManager
import com.cqteam.lib_androidx_mvvm.view.activity.BaseMvvmActivity
import com.cqteam.libraryrepository.databinding.ActivityMvvmBinding
import com.cqteam.libraryrepository.viewmodel.MvvmViewModel

class MvvmActivity : BaseMvvmActivity<ActivityMvvmBinding, MvvmViewModel>() {

    override fun createViewModel(): Class<MvvmViewModel> {
        return MvvmViewModel::class.java
    }

    override fun initViewBinding(): ActivityMvvmBinding {
        MvvmManager.setIsHaveNetwork(false)
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