package com.zlx.library_common.provier;

import android.app.Application;

/**
 * FileName: AppBridge
 * Created by andy on 2020/9/22 10:22
 * 
 * Description:
 */
public class AppBridge {

    public static Application getApplicationByReflect() {
        return ActivityLifecycleImpl.INSTANCE.getApplicationByReflect();
    }
}
