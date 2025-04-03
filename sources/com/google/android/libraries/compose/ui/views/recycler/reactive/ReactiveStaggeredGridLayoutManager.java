package com.google.android.libraries.compose.ui.views.recycler.reactive;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveStaggeredGridLayoutManager;
import defpackage.drfl;
import defpackage.dtct;
import defpackage.dtcy;
import defpackage.dtcz;
import defpackage.dtdj;
import defpackage.dtdn;
import defpackage.dtdo;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffko;
import defpackage.fflc;
import defpackage.ffls;
import defpackage.ffmx;
import defpackage.vz;
import defpackage.wf;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReactiveStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    static final /* synthetic */ ffmx[] k;
    public static final /* synthetic */ int m = 0;
    public final dtdj l;
    private final dtcz n;
    private final ffbz o;
    private final vz p;
    private final ffls q;

    static {
        ffko ffkoVar = new ffko(ReactiveStaggeredGridLayoutManager.class, "observer", "getObserver()Lcom/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver;", 0);
        int i = fflc.a;
        k = new ffmx[]{ffkoVar};
    }

    public ReactiveStaggeredGridLayoutManager(dtcz dtczVar, final int i, dtdj dtdjVar) {
        super(1);
        this.n = dtczVar;
        this.l = dtdjVar;
        this.o = ffca.a(new ffix() { // from class: dtdk
            @Override // defpackage.ffix
            public final Object invoke() {
                int i2 = ReactiveStaggeredGridLayoutManager.m;
                return new dtct(i);
            }
        });
        this.q = new dtdo();
        drfl drflVar = (drfl) dtdjVar.b;
        this.p = drflVar != null ? new dtdn(drflVar) : null;
        N();
    }

    private final dtct O() {
        return (dtct) this.o.a();
    }

    private final void P(dtcy dtcyVar) {
        this.q.d(k[0], dtcyVar);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, defpackage.vx
    public final void Y(RecyclerView recyclerView, wf wfVar) {
        wfVar.getClass();
        O().b(recyclerView);
        vz vzVar = this.p;
        if (vzVar != null) {
            recyclerView.ag(vzVar);
        }
        P((dtcy) null);
        super.Y(recyclerView, wfVar);
    }

    @Override // defpackage.vx
    public final void aV(RecyclerView recyclerView) {
        O().a(recyclerView);
        vz vzVar = this.p;
        if (vzVar != null) {
            recyclerView.x(vzVar);
        }
        P(this.n.a(recyclerView, this, new ffji() { // from class: dtdl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Integer.valueOf(ReactiveStaggeredGridLayoutManager.this.d);
            }
        }, new ffji() { // from class: dtdm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                int intValue = num.intValue();
                ReactiveStaggeredGridLayoutManager reactiveStaggeredGridLayoutManager = ReactiveStaggeredGridLayoutManager.this;
                reactiveStaggeredGridLayoutManager.J(reactiveStaggeredGridLayoutManager.l.a.a(intValue));
                return ffcu.a;
            }
        }));
    }
}
