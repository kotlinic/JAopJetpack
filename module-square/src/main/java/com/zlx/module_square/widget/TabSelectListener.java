package com.zlx.module_square.widget;

/**
 * FileName: TabSelectListener
 * Created by andy on 2020/9/18 10:45
 * 
 * Description:
 */
public interface TabSelectListener {
    /**
     * 选中
     */
    void onSelect(int index, int totalCount);

    /**
     * 未选中
     */
    void onDeselected(int index, int totalCount);
}
