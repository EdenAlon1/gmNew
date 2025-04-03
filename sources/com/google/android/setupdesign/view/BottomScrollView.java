package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import defpackage.eipu;
import defpackage.eirc;
import defpackage.eird;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomScrollView extends ScrollView {
    public eird a;
    private int b;
    private boolean c;
    private final Runnable d;

    public BottomScrollView(Context context) {
        super(context);
        this.c = false;
        this.d = new eirc(this);
    }

    public final void a() {
        if (this.a != null) {
            if (getScrollY() >= this.b) {
                ((eipu) this.a).a.n(true);
            } else {
                if (this.c) {
                    return;
                }
                this.c = true;
                ((eipu) this.a).a.n(false);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.b = Math.max(0, ((childAt.getMeasuredHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.d);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i4 != i2) {
            a();
        }
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = new eirc(this);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = new eirc(this);
    }
}
