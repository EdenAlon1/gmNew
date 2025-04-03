package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ehdr;
import defpackage.ehiz;
import defpackage.ehmm;
import defpackage.ehmq;
import defpackage.ehua;
import defpackage.re;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialRadioButton extends re {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int b = ehdr.b(this, com.google.android.apps.messaging.R.attr.colorControlActivated);
                int b2 = ehdr.b(this, com.google.android.apps.messaging.R.attr.colorOnSurface);
                int b3 = ehdr.b(this, com.google.android.apps.messaging.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{ehdr.f(b3, b, 1.0f), ehdr.f(b3, b2, 0.54f), ehdr.f(b3, b2, 0.38f), ehdr.f(b3, b2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray a2 = ehiz.a(context2, attributeSet, ehmm.a, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(ehmq.c(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }
}
