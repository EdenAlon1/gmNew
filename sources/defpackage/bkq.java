package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ bkr c;

    public bkq(bkr bkrVar, int i, ListenableFuture listenableFuture) {
        this.c = bkrVar;
        this.a = i;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
