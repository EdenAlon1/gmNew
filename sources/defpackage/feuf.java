package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuf implements Executor, Runnable {
    private static final Logger b = Logger.getLogger(feuf.class.getName());
    private static final feuc c;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        feuc feueVar;
        try {
            feueVar = new feud(AtomicIntegerFieldUpdater.newUpdater(feuf.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            feueVar = new feue();
        }
        c = feueVar;
    }

    public feuf(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.d;
            while (executor == this.d && (runnable = (Runnable) this.e.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", a.G(runnable, "Exception while executing runnable "), (Throwable) e);
                }
            }
            c.b(this);
            if (this.e.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            c.b(this);
            throw th;
        }
    }
}
