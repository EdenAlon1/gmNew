package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjp implements Executor {
    private final Executor d;
    final Deque a = new ArrayDeque();
    private final bjo e = new bjo(this);
    int c = 1;
    long b = 0;

    public bjp(Executor executor) {
        ksw.h(executor);
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ksw.h(runnable);
        synchronized (this.a) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.b;
                bjn bjnVar = new bjn(runnable);
                this.a.add(bjnVar);
                this.c = 2;
                try {
                    this.d.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        if (this.b == j && this.c == 2) {
                            this.c = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        int i2 = this.c;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && this.a.removeLastOccurrence(bjnVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.a.add(runnable);
        }
    }
}
