package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.efrp;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ScrollViewWithSizeCallback extends ScrollView {
    public efrp a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        efrp efrpVar = this.a;
        if (efrpVar == null || i4 == i2 || i2 == 0) {
            return;
        }
        efrpVar.a(i2);
    }
}
