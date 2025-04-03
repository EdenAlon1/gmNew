package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdyj implements Runnable {
    final fdyh a;
    public final fdyn b;
    private final Executor c;

    public fdyj(Executor executor, fdyh fdyhVar, fdyn fdynVar) {
        this.c = executor;
        this.a = fdyhVar;
        this.b = fdynVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            fdyn.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
