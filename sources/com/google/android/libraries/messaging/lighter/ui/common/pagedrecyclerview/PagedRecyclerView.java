package com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.dzyh;
import defpackage.dzyo;
import defpackage.dzyp;
import defpackage.dzyr;
import defpackage.emxg;
import defpackage.enfc;
import defpackage.ku;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PagedRecyclerView extends RecyclerView {
    public final LinearLayoutManager ac;
    public Drawable ad;
    private dzyr ae;

    public PagedRecyclerView(Context context) {
        this(context, null);
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        Drawable a;
        getContext();
        dzyo dzyoVar = new dzyo();
        this.ac = dzyoVar;
        ap(dzyoVar);
        am(new dzyp());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dzyh.b, i, 0);
        final int integer = obtainStyledAttributes.getInteger(1, dzyr.MORE_ON_BOTTOM.c);
        this.ae = (dzyr) enfc.e(dzyr.values()).a(new emxg() { // from class: dzyq
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzyr) obj).c == integer;
            }
        }).e(dzyr.MORE_ON_BOTTOM);
        this.ad = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (a = ku.a(context, resourceId)) == null) ? obtainStyledAttributes.getDrawable(0) : a;
        obtainStyledAttributes.recycle();
        dzyoVar.ae(this.ae == dzyr.MORE_ON_TOP);
    }
}
