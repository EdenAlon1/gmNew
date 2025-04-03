package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftd implements ffte {
    private final Future a;

    public fftd(Future future) {
        this.a = future;
    }

    @Override // defpackage.ffte
    public final void hO() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
