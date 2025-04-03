package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ehrk;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yt k = yt.k(context, attributeSet, ehrk.a);
        this.a = k.m(2);
        this.b = k.h(0);
        this.c = k.f(1, 0);
        k.o();
    }
}
