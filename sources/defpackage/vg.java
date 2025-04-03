package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vg {
    public final /* synthetic */ RecyclerView a;

    public vg(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(wr wrVar, vq vqVar, vq vqVar2) {
        wrVar.n(false);
        RecyclerView recyclerView = this.a;
        if (recyclerView.E.r(wrVar, vqVar, vqVar2)) {
            recyclerView.aa();
        }
    }

    public final void b(wr wrVar, vq vqVar, vq vqVar2) {
        this.a.e.o(wrVar);
        RecyclerView recyclerView = this.a;
        recyclerView.v(wrVar);
        wrVar.n(false);
        if (recyclerView.E.t(wrVar, vqVar, vqVar2)) {
            recyclerView.aa();
        }
    }

    public final void c(wr wrVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.o.bb(wrVar.a, recyclerView.e);
    }
}
