package com.google.android.libraries.compose.ui.views.recycler.reactive;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import defpackage.dtct;
import defpackage.dtcy;
import defpackage.dtcz;
import defpackage.dtdd;
import defpackage.dtde;
import defpackage.dtdf;
import defpackage.dtdj;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffko;
import defpackage.fflc;
import defpackage.ffls;
import defpackage.ffmx;
import defpackage.wf;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReactiveGridLayoutManager extends GridLayoutManager {
    static final /* synthetic */ ffmx[] J;
    public static final /* synthetic */ int M = 0;
    public final dtdj K;
    public RecyclerView L;
    private final dtcz N;
    private final ffbz O;
    private final ffls P;

    static {
        ffko ffkoVar = new ffko(ReactiveGridLayoutManager.class, "observer", "getObserver()Lcom/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver;", 0);
        int i = fflc.a;
        J = new ffmx[]{ffkoVar};
    }

    public ReactiveGridLayoutManager(dtcz dtczVar, final int i, dtdj dtdjVar) {
        super(1, 1);
        this.N = dtczVar;
        this.K = dtdjVar;
        this.O = ffca.a(new ffix() { // from class: dtda
            @Override // defpackage.ffix
            public final Object invoke() {
                int i2 = ReactiveGridLayoutManager.M;
                return new dtct(i);
            }
        });
        this.P = new dtdf();
        dtde dtdeVar = (dtde) dtdjVar.b;
        if (dtdeVar != null) {
            this.g = new dtdd(dtdeVar, this);
        }
    }

    private final dtct bM() {
        return (dtct) this.O.a();
    }

    private final void bN(dtcy dtcyVar) {
        this.P.d(J[0], dtcyVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void Y(RecyclerView recyclerView, wf wfVar) {
        wfVar.getClass();
        bM().b(recyclerView);
        this.L = null;
        bN((dtcy) null);
    }

    @Override // defpackage.vx
    public final void aV(RecyclerView recyclerView) {
        this.L = recyclerView;
        bM().a(recyclerView);
        bN(this.N.a(recyclerView, this, new ffji() { // from class: dtdb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Integer.valueOf(ReactiveGridLayoutManager.this.k);
            }
        }, new ffji() { // from class: dtdc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                int intValue = num.intValue();
                ReactiveGridLayoutManager reactiveGridLayoutManager = ReactiveGridLayoutManager.this;
                reactiveGridLayoutManager.r(reactiveGridLayoutManager.K.a.a(intValue));
                return ffcu.a;
            }
        }));
    }
}
