package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.dbxs;
import defpackage.vk;
import defpackage.vx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContentGridView extends RecyclerView {
    public int ac;
    public dbxs ad;

    public ContentGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.ad.p();
    }

    public final void aP(int i, int i2) {
        vk vkVar = this.n;
        if (vkVar != null) {
            vkVar.u(i, i2);
        }
    }

    public final void aQ(int i, int i2) {
        vx vxVar = this.o;
        if (vxVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) vxVar).ac(i, i2);
        }
    }

    public final void aR(int i) {
        this.ac = i;
        dbxs dbxsVar = this.ad;
        if (dbxsVar != null) {
            dbxsVar.m(i);
        }
    }
}
