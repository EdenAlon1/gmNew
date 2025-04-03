package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psh implements Runnable {
    private final ListenableFuture a;
    private final ffrf b;

    public psh(ListenableFuture listenableFuture, ffrf ffrfVar) {
        this.a = listenableFuture;
        this.b = ffrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCancelled()) {
            this.b.h(null);
            return;
        }
        try {
            this.b.w(puc.b(this.a));
        } catch (ExecutionException e) {
            this.b.w(ffci.a(puc.c(e)));
        }
    }
}
