package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efve extends wc {
    final /* synthetic */ GridLayoutManager a;
    final /* synthetic */ efvf b;

    public efve(efvf efvfVar, GridLayoutManager gridLayoutManager) {
        this.a = gridLayoutManager;
        this.b = efvfVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int N = this.a.N() + 50;
        efvf efvfVar = this.b;
        if (N > efvfVar.an) {
            efvfVar.am.a(N);
            this.b.an = N;
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}
