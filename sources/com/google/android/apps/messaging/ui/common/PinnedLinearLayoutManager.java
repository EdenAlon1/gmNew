package com.google.android.apps.messaging.ui.common;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cxrc;
import defpackage.wf;
import defpackage.wo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PinnedLinearLayoutManager extends LinearLayoutManager {
    public int a;

    public PinnedLinearLayoutManager() {
        super.s(false);
        super.ae(true);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        cxrc cxrcVar = new cxrc(recyclerView.getContext());
        cxrcVar.g = i;
        bl(cxrcVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean cj() {
        return true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void o(wf wfVar, wo woVar) {
        int top;
        int bottom;
        int i;
        int i2;
        super.o(wfVar, woVar);
        int min = Math.min(this.a, at());
        if (min <= 0) {
            return;
        }
        int aE = (this.I - aE()) - az();
        if (this.m) {
            top = aH(at() - 1).getTop();
            bottom = aH(0).getBottom();
        } else {
            top = aH(0).getTop();
            bottom = aH(at() - 1).getBottom();
        }
        if (aE > bottom - top) {
            int aE2 = this.m ^ this.o ? aE() : this.I - az();
            for (int i3 = 0; i3 < min; i3++) {
                View aH = aH(this.o ? i3 : (at() - i3) - 1);
                int height = aH.getHeight();
                if (aH.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aH.getLayoutParams();
                    i2 = marginLayoutParams.topMargin;
                    i = marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                    i2 = 0;
                }
                Rect rect = new Rect();
                aN(aH, rect);
                if (this.m ^ this.o) {
                    int i4 = aE2 + rect.top + i2;
                    aH.setTop(i4);
                    int i5 = i4 + height;
                    aH.setBottom(i5);
                    aE2 = i5 + rect.bottom + i;
                } else {
                    int i6 = aE2 - (rect.bottom + i);
                    aH.setBottom(i6);
                    int i7 = i6 - height;
                    aH.setTop(i7);
                    aE2 = i7 - (rect.top + i2);
                }
            }
        }
    }
}
