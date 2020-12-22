package com.zlx.module_home;

import com.zlx.module_base.BaseApplication;
import com.zlx.module_base.config.ModuleLifecycleConfig;

/**
 * Created by andy on 2020/9/30 12:32
 * 
 * Description:
 */
public class HomeApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }
}
