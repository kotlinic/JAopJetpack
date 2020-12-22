package com.zlx.widget.viewpager.animviewpager;

/**
 * Created by andy on 2020/10/22 10:46
 * 
 * Description:
 */
public interface LiquidSwipeLayout {
    public ClipPathProvider clipPathProvider();

    public Float currentRevealPercent();

    public void revealForPercentage(Float percent);
}
