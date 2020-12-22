package com.zlx.module_login;

import com.zlx.module_base.BaseApplication;
import com.zlx.module_base.config.ModuleLifecycleConfig;

/**
 * Created by andy on 2020/9/30 12:41
 * 
 * Description:
 */
public class LoginApp extends BaseApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }
}
