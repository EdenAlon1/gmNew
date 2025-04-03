package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaGridLayoutManager extends GridLayoutManager {
    private final Context J;
    private final Rect K;

    public MediaGridLayoutManager(Context context, int i) {
        super(i);
        this.K = new Rect();
        this.J = context;
    }

    public final int bM() {
        int az;
        int aE;
        DisplayMetrics displayMetrics = this.J.getResources().getDisplayMetrics();
        if (this.k == 1) {
            az = displayMetrics.widthPixels - aC();
            aE = aB();
        } else {
            az = displayMetrics.heightPixels - az();
            aE = aE();
        }
        return (az - aE) / ((GridLayoutManager) this).b;
    }

    public final int bN(View view) {
        int bM;
        int i;
        aN(view, this.K);
        if (this.k == 1) {
            bM = bM() - this.K.left;
            i = this.K.right;
        } else {
            bM = bM() - this.K.top;
            i = this.K.bottom;
        }
        return bM - i;
    }
}
