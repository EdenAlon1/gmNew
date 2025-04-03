package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfp {
    public static ListenableFuture a(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        return ejks.a(listenableFuture, eldl.m(callable), executor);
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, erog erogVar, final Executor executor) {
        ListenableFuture n = erqt.n(new ejkr(eldl.c(erogVar), listenableFuture), new Executor() { // from class: ejkq
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ListenableFuture.this.b(runnable, executor);
            }
        });
        ejks.b(listenableFuture, n);
        return n;
    }
}
