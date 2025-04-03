package com.google.android.libraries.user.profile.photopicker.fragment.suggestiontabs.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.fdrm;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhotoPickerViewPager extends ViewPager {
    public PhotoPickerViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (fdrm.w() || !fdrm.j()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (fdrm.w() || !fdrm.j()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    protected final boolean q(View view, boolean z, int i, int i2, int i3) {
        if (super.q(view, z, i, i2, i3)) {
            return true;
        }
        if (z && fdrm.w()) {
            return view.canScrollHorizontally(-1) || view.canScrollHorizontally(1);
        }
        return false;
    }

    public PhotoPickerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
