package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffto extends ffti {
    protected abstract Thread g();

    protected void k(long j, fftl fftlVar) {
        ffsq.a.w(j, fftlVar);
    }

    protected final void z() {
        Thread g = g();
        if (Thread.currentThread() != g) {
            LockSupport.unpark(g);
        }
    }
}
