package com.zlx.module_base.impl;

import android.view.View;

/**
 * FileName: INetView
 * Created by andy on 2020/9/22 10:38
 * 
 * Description:
 */
public interface INetView {

    void showLoading();

    void showLoading(View view);

    void showSuccess();

    void showEmpty();

    void onRetryBtnClick();

}
