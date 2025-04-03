package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgx extends wc {
    final /* synthetic */ dcgy a;

    public dcgx(dcgy dcgyVar) {
        this.a = dcgyVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.K();
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        dcgy dcgyVar = this.a;
        boolean E = dcgyVar.E();
        if (dcgyVar.z().a() >= 15) {
            return;
        }
        int I = dcgyVar.I();
        if (E) {
            RecyclerView recyclerView2 = dcgyVar.b;
            recyclerView2.scrollBy(I - recyclerView2.getPaddingLeft(), 0);
        }
        RecyclerView recyclerView3 = dcgyVar.b;
        int i2 = true != E ? 0 : I;
        if (true == E) {
            I = 0;
        }
        recyclerView3.setPadding(i2, 0, I, 0);
    }
}
