package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.car.app.model.Alert;
import defpackage.dujn;
import defpackage.qp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ButtonWithMaxTextSize extends qp {
    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dujn.a);
        setTextSize(0, Math.min(getTextSize(), obtainStyledAttributes.getDimensionPixelSize(0, Alert.DURATION_SHOW_INDEFINITELY)));
        obtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
