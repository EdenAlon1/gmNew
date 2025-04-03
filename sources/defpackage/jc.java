package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jc implements Executor {
    final Executor b;
    Runnable c;
    private final Object d = new Object();
    final Queue a = new ArrayDeque();

    public jc(Executor executor) {
        this.b = executor;
    }

    protected final void a() {
        synchronized (this.d) {
            Runnable runnable = (Runnable) this.a.poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.d) {
            this.a.add(new Runnable() { // from class: jb
                @Override // java.lang.Runnable
                public final void run() {
                    jc jcVar = jc.this;
                    try {
                        runnable.run();
                    } finally {
                        jcVar.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }
}
