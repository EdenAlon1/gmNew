package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.dcau;
import defpackage.wr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FullscreenGalleryRecyclerView extends RecyclerView implements dcau {
    public GridLayoutManager ac;
    public int ad;
    private final int ae;
    private final int af;

    public FullscreenGalleryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = 1;
        this.ae = context.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.columnWidth});
        this.af = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.dcau
    public final List B() {
        int L = this.ac.L();
        int N = this.ac.N();
        ArrayList arrayList = new ArrayList();
        if (L >= 0) {
            while (L <= N) {
                wr i = i(L);
                if (i != null) {
                    arrayList.add(i.a);
                }
                L++;
            }
        }
        return arrayList;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.af > 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.ae;
            int max = Math.max(1, (size - (i3 + i3)) / this.af);
            this.ad = max;
            this.ac.r(max);
        }
    }

    @Override // defpackage.dcau
    public final void C(int i, int i2) {
    }
}
