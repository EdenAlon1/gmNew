package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duij implements erqj {
    final /* synthetic */ dhri a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ dhqg c;

    public duij(dhri dhriVar, ListenableFuture listenableFuture, dhqg dhqgVar) {
        this.a = dhriVar;
        this.b = listenableFuture;
        this.c = dhqgVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.b(obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (this.b.isCancelled()) {
            this.c.a();
        } else if (th instanceof Exception) {
            this.a.a((Exception) th);
        } else {
            this.a.a(new ExecutionException(th));
        }
    }
}
