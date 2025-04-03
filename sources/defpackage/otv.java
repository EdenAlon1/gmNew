package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otv implements Executor {
    private final Executor a;
    private final ArrayDeque b;
    private Runnable c;
    private final Object d;

    public otv(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        synchronized (this.d) {
            Object poll = this.b.poll();
            Runnable runnable = (Runnable) poll;
            this.c = runnable;
            if (poll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new Runnable() { // from class: otu
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    otv otvVar = this;
                    try {
                        runnable2.run();
                    } finally {
                        otvVar.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }
}
