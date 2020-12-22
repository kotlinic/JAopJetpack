package com.zlx.widget.viewpager.animviewpager;

import android.graphics.Path;
import android.graphics.Region;
import android.view.View;

/**
 * Created by andy on 2020/10/22 10:47
 * 
 * Description:
 */
public abstract class ClipPathProvider {
    protected Path path = new Path();
    Region.Op op = Region.Op.INTERSECT;

    abstract Path getPath(Float percent, View view);
}
