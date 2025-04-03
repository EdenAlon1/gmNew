package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecmt {
    public abstract ListenableFuture<Void> b(ecmr ecmrVar);

    public abstract void d(ecda ecdaVar);

    public final ListenableFuture<Void> e(ecda ecdaVar, fgmh fgmhVar) {
        ecmq g = ecmr.g();
        g.d(ecdaVar);
        ((ecmf) g).a = null;
        return b(g.a());
    }

    public final void f(RecyclerView recyclerView, ecda ecdaVar, fgmh fgmhVar) {
        recyclerView.z(new ecms(this, ecdaVar));
    }

    public final void g(ecda ecdaVar, fgmh fgmhVar) {
        ecmq g = ecmr.g();
        g.d(ecdaVar);
        ((ecmf) g).a = fgmhVar;
        b(g.a());
    }
}
