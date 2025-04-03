package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhnx {
    public static final fhnx j = new fhnw();
    private boolean a;
    private long b;
    private long c;
    private volatile Object d;

    public void g() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean h() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = java.lang.Math.min(r1, j() - java.lang.System.nanoTime());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.concurrent.locks.Condition r10) {
        /*
            r9 = this;
            boolean r0 = r9.h()     // Catch: java.lang.InterruptedException -> L50
            long r1 = r9.o()     // Catch: java.lang.InterruptedException -> L50
            r3 = 0
            if (r0 != 0) goto L15
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L11
            goto L15
        L11:
            r10.await()     // Catch: java.lang.InterruptedException -> L50
            return
        L15:
            if (r0 == 0) goto L29
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L29
            long r5 = r9.j()     // Catch: java.lang.InterruptedException -> L50
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L50
            long r5 = r5 - r7
            long r1 = java.lang.Math.min(r1, r5)     // Catch: java.lang.InterruptedException -> L50
            goto L35
        L29:
            if (r0 == 0) goto L35
            long r0 = r9.j()     // Catch: java.lang.InterruptedException -> L50
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L50
            long r0 = r0 - r5
            r1 = r0
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r5 = "timeout"
            if (r0 <= 0) goto L4a
            long r0 = r10.awaitNanos(r1)     // Catch: java.lang.InterruptedException -> L50
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 <= 0) goto L44
            return
        L44:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L50
            r10.<init>(r5)     // Catch: java.lang.InterruptedException -> L50
            throw r10     // Catch: java.lang.InterruptedException -> L50
        L4a:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L50
            r10.<init>(r5)     // Catch: java.lang.InterruptedException -> L50
            throw r10     // Catch: java.lang.InterruptedException -> L50
        L50:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhnx.i(java.util.concurrent.locks.Condition):void");
    }

    public long j() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public fhnx k() {
        this.a = false;
        return this;
    }

    public fhnx l() {
        this.c = 0L;
        return this;
    }

    public fhnx m(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public fhnx n(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j2 < 0) {
            throw new IllegalArgumentException(a.s(j2, "timeout < 0: "));
        }
        this.c = timeUnit.toNanos(j2);
        return this;
    }

    public long o() {
        return this.c;
    }
}
