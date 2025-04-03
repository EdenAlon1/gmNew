package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrb implements ffrd {
    private final Future a;

    public ffrb(Future future) {
        this.a = future;
    }

    @Override // defpackage.ffrd
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + "]";
    }
}
