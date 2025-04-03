package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erqn implements Runnable {
    ListenableFuture a;
    Future b;

    public erqn(ListenableFuture listenableFuture, Future future) {
        this.a = listenableFuture;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        erqt.s(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
