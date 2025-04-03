package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eogb implements eogh {
    @Override // defpackage.eogh
    public final void c(Exception exc, long j) {
        eogi.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
    }

    @Override // defpackage.eogh
    public final void d(Exception exc) {
        eogi.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
    }

    @Override // defpackage.eogh
    public final void a() {
    }

    @Override // defpackage.eogh
    public final void b() {
    }
}
