package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.od;
import defpackage.os;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationMenuView extends RecyclerView implements os {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ap(new LinearLayoutManager(1));
    }

    @Override // defpackage.os
    public final void a(od odVar) {
    }
}
