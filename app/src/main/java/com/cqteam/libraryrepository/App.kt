package com.cqteam.libraryrepository

import android.app.Application
import com.cqteam.imageloaderx.ImageLoaderManager

/**
 * Author： 洪亮
 * Time： 2020/11/26 - 4:06 PM
 * Email：281332545@qq.com
 * <p>
 * 描述：
 */
class App: BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        ImageLoaderManager.init(this,ImageLoaderManager.Loader_Glide)
    }
}