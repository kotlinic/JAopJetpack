package com.zlx.module_base.widget.shinebutton.interpolator;

import android.view.animation.Interpolator;

import androidx.annotation.NonNull;

/**
 * Created by andy on 2020/9/27 14:46
 *
 * Description:
 */
public class EasingInterpolator implements Interpolator {

    private final Ease ease;

    public EasingInterpolator(@NonNull Ease ease) {
        this.ease = ease;
    }

    @Override
    public float getInterpolation(float input) {
        return EasingProvider.get(this.ease, input);
    }

    public Ease getEase() {
        return ease;
    }
}
