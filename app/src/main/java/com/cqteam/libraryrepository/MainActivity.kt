package com.cqteam.libraryrepository

import com.cqteam.imageloaderx.ImageLoader
import com.cqteam.lib_androidx_mvvm.view.activity.BaseActivity
import com.cqteam.libraryrepository.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun beforeInitView() {

    }

    override fun initView() {

    }

    override fun initData() {
        mViewBinding.nameTv.text = "测试数据"
        ImageLoader.show(mViewBinding.mFrescoIv,"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1898440656,3421570551&fm=26&gp=0.jpg")
    }

    override fun onLightClean() {
    }

    override fun onHeavyClean() {
    }
}