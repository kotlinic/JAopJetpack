package com.zlx.module_base.impl;

/**
 * Created by andy on 2020/9/22 13:58
 * 
 * Description:
 */
public interface IAcView {
    void initViews();
    void initEvents();
    void beforeOnCreate();
    void afterOnCreate();
    void initImmersionBar();
}
