package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fext implements Runnable {
    final /* synthetic */ feir a;

    public fext(feir feirVar) {
        this.a = feirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feir feirVar = this.a;
        AtomicLong atomicLong = feirVar.b.c;
        long j = feirVar.a;
        long max = Math.max(j + j, j);
        if (atomicLong.compareAndSet(j, max)) {
            feis.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{feirVar.b.b, Long.valueOf(max)});
        }
    }
}
