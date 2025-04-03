package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.ehat;
import defpackage.ehau;
import defpackage.ehav;
import defpackage.ehiz;
import defpackage.ehjg;
import defpackage.ehkm;
import defpackage.ehku;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomNavigationView extends ehku {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ehku
    protected final ehkm a(Context context) {
        return new ehat(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            i3 = i2;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        yt b = ehiz.b(getContext(), attributeSet, ehav.a, i, i2, new int[0]);
        boolean p = b.p(2, true);
        ehat ehatVar = (ehat) this.b;
        if (ehatVar.a != p) {
            ehatVar.a = p;
            this.c.f(false);
        }
        if (b.q(0)) {
            setMinimumHeight(b.b(0, 0));
        }
        b.o();
        ehjg.i(this, new ehau());
    }
}
