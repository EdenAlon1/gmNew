package com.google.android.apps.messaging.ui.rcs.consent;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.dcxu;
import defpackage.dcyc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InterceptTouchConstraintLayout extends ConstraintLayout {
    public dcxu i;

    public InterceptTouchConstraintLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dcxu dcxuVar = this.i;
        if (dcxuVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        dcyc dcycVar = dcxuVar.a;
        int i = dcycVar.l;
        if (i == 1 || i == 0) {
            View view = dcycVar.e;
            view.getLocationInWindow(dcxuVar.c);
            Rect rect = dcxuVar.b;
            int i2 = dcxuVar.c[0];
            rect.set(i2 - 30, r5[1] - 30, i2 + view.getWidth() + 30, dcxuVar.c[1] + view.getHeight() + 30);
            if (!dcxuVar.b.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                dcxuVar.a.b();
            }
        }
        return false;
    }

    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
