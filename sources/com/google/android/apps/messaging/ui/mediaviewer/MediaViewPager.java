package com.google.android.apps.messaging.ui.mediaviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.cskc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaViewPager extends ViewPager {
    private static final cskc l = cskc.g("Bugle", "MediaViewPager");
    private boolean m;

    public MediaViewPager(Context context) {
        super(context);
        this.m = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            l.o("ViewPager threw IllegalArgumentException", e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            l.o("ViewPager threw IllegalArgumentException", e);
            return false;
        }
    }

    public final void v(boolean z) {
        onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        this.m = z;
    }

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
    }
}
