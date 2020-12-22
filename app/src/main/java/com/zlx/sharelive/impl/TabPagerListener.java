package com.zlx.sharelive.impl;

import androidx.fragment.app.Fragment;

/**
 * FileName: TabPagerListener
 * Created by andy on 2020/9/18 14:40
 * 
 * Description:
 */
public interface TabPagerListener {
    Fragment getFragment(int position);

    int count();
}
