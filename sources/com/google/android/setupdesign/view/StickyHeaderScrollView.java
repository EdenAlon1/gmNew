package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickyHeaderScrollView extends BottomScrollView {
    private View b;
    private View c;
    private int d;

    public StickyHeaderScrollView(Context context) {
        super(context);
        this.d = 0;
    }

    private final void b() {
        View view = this.b;
        if (view != null) {
            View view2 = this.c;
            View view3 = view2 != null ? view2 : view;
            if ((view3.getTop() - getScrollY()) + (view2 != null ? view.getTop() : 0) < this.d || !view3.isShown()) {
                view3.setTranslationY(getScrollY() - r0);
            } else {
                view3.setTranslationY(0.0f);
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.d = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    @Override // com.google.android.setupdesign.view.BottomScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == null) {
            this.b = findViewWithTag("sticky");
            this.c = findViewWithTag("stickyContainer");
        }
        b();
    }

    @Override // com.google.android.setupdesign.view.BottomScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
    }
}
