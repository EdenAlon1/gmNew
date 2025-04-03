package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejks {
    public static ListenableFuture a(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        errj errjVar = new errj(callable);
        listenableFuture.b(errjVar, executor);
        b(listenableFuture, errjVar);
        return errjVar;
    }

    public static void b(final ListenableFuture listenableFuture, final ListenableFuture listenableFuture2) {
        listenableFuture2.b(new Runnable() { // from class: ejkp
            @Override // java.lang.Runnable
            public final void run() {
                if (ListenableFuture.this.isCancelled()) {
                    listenableFuture.cancel(true);
                }
            }
        }, erpp.a);
    }
}
