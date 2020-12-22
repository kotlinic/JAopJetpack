package com.zlx.module_base.loadsir;

import android.content.Context;
import android.view.View;

import com.kingja.loadsir.callback.Callback;
import com.zlx.module_base.R;

/**
 * FileName: EmptyCallback
 * Created by andy on 2020/9/17 17:37
 * 
 * Description:
 */
public class EmptyCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.base_layout_empty;
    }

    //当前Callback的点击事件，如果返回true则覆盖注册时的onReload()，如果返回false则两者都执行，先执行onReloadEvent()。
    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return false;
    }
}
