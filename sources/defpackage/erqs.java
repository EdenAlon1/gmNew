package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ernr;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erqs extends ernr.i implements Runnable {
    private ListenableFuture a;

    public erqs(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.b(listenableFuture, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            m(listenableFuture);
        }
    }
}
