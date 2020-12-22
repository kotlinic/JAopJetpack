package com.zlx.module_network.api1.livedata;

/**
 * Copyright (C)
 * FileName: BaseObserverCallBack
 * author: andy
 * 
 * Date: 2020/9/17 10:30
 * Description:
 */
public abstract class BaseObserverCallBack<T> {

    public abstract void onSuccess(T data);

    public boolean showErrorMsg() {
        return false;
    }

    public void onFail(String msg) {

    }

    public void onFinish() {

    }

}
