package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbbn extends ernr implements Runnable {
    private ListenableFuture a;

    public fbbn(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public final boolean d() {
        return super.n();
    }

    @Override // defpackage.ernr
    protected final String gP() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.i(listenableFuture, "delegate=[", "]");
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
