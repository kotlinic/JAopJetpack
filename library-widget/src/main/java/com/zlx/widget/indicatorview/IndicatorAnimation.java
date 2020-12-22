package com.zlx.widget.indicatorview;

/**
 * Created by andy on 2020/9/29 9:58
 * 
 * Description:
 */
public enum IndicatorAnimation {
    NORMAL(0),
    ACCELERATE(1),
    BOUNCE(2);

    int value;

    IndicatorAnimation(int value) {
        this.value = value;
    }
}
