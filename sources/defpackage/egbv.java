package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egbv extends wc {
    final /* synthetic */ GridLayoutManager a;
    final /* synthetic */ egjl b;
    final /* synthetic */ egbw c;

    public egbv(egbw egbwVar, GridLayoutManager gridLayoutManager, egjl egjlVar) {
        this.a = gridLayoutManager;
        this.b = egjlVar;
        this.c = egbwVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int N = this.a.N() + BasePaymentResult.ERROR_REQUEST_FAILED;
        if (N > this.c.g) {
            this.b.b(N);
            this.c.g = N;
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}
