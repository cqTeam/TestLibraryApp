package com.cqteam.libraryrepository

import android.app.Application

/**
 * Author： 洪亮
 * Time： 2020/11/30 - 3:55 PM
 * Email：281332545@qq.com
 * <p>
 * 描述：
 */
abstract class BaseApplication: Application(){
    companion object{
        private var instance: Application? = null
        fun getApplication(): Application{
            if (instance == null) instance = Application()
            return instance!!
        }
    }
}