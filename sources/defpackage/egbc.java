package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egbc extends wc {
    final /* synthetic */ egjj a;
    final /* synthetic */ egbd b;

    public egbc(egbd egbdVar, egjj egjjVar) {
        this.a = egjjVar;
        this.b = egbdVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int N = ((GridLayoutManager) recyclerView.o).N() + BasePaymentResult.ERROR_REQUEST_FAILED;
        if (N > this.b.g) {
            this.a.a(N);
            this.b.g = N;
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}
