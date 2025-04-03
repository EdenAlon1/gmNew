package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbbo implements Runnable {
    final /* synthetic */ fbbu a;
    final /* synthetic */ fbbp b;

    public fbbo(fbbp fbbpVar, fbbu fbbuVar) {
        this.a = fbbuVar;
        this.b = fbbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.isCancelled()) {
            ListenableFuture listenableFuture = this.b.a;
            boolean z = false;
            if ((listenableFuture instanceof fbbn) && ((fbbn) listenableFuture).d()) {
                z = true;
            }
            this.a.a(z);
        }
    }
}
