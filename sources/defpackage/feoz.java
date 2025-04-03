package defpackage;

import io.grpc.Status;
import java.lang.Thread;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feoz implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ feqc a;

    public feoz(feqc feqcVar) {
        this.a = feqcVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        feqc.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(this.a.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        feqc feqcVar = this.a;
        if (feqcVar.v) {
            return;
        }
        feqcVar.v = true;
        try {
            feqcVar.i(true);
            feqcVar.n(false);
        } finally {
            feqcVar.o(new feah(feak.a(Status.o.withDescription("Panic! This is a bug!").d(th))));
            feqcVar.J.d(null);
            feqcVar.H.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            feqcVar.p.a(fdyc.TRANSIENT_FAILURE);
        }
    }
}
