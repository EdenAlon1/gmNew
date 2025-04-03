package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fikw implements Executor {
    private final Executor a;
    private final Runnable b = new Runnable() { // from class: fikv
        @Override // java.lang.Runnable
        public final void run() {
            fikw.this.a();
        }
    };
    private final ArrayDeque c = new ArrayDeque();
    private boolean d;

    public fikw(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            Runnable runnable = (Runnable) this.c.pollFirst();
            this.d = runnable != null;
            while (runnable != null) {
                try {
                    runnable.run();
                    synchronized (this.c) {
                        runnable = (Runnable) this.c.pollFirst();
                        this.d = runnable != null;
                    }
                } catch (Throwable th) {
                    synchronized (this.c) {
                        this.d = false;
                        try {
                            this.a.execute(this.b);
                        } catch (RejectedExecutionException unused) {
                        }
                        throw th;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
