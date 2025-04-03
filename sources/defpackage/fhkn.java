package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkn {
    public final int a;
    public final fhkf b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final fhkl g;
    public final fhkk h;
    public final fhkm i;
    public final fhkm j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private int n;

    public fhkn(int i, fhkf fhkfVar, boolean z, boolean z2, fhgh fhghVar) {
        this.a = i;
        this.b = fhkfVar;
        this.f = fhkfVar.r.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.g = new fhkl(this, fhkfVar.q.c(), z2);
        this.h = new fhkk(this, z);
        this.i = new fhkm(this);
        this.j = new fhkm(this);
        if (fhghVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(fhghVar);
        }
    }

    private final boolean n(int i, IOException iOException) {
        byte[] bArr = fhhl.a;
        synchronized (this) {
            if (this.n != 0) {
                return false;
            }
            this.n = i;
            this.k = iOException;
            notifyAll();
            if (this.g.b) {
                if (this.h.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized fhgh a() {
        Object removeFirst;
        this.i.e();
        while (this.l.isEmpty() && this.n == 0) {
            try {
                g();
            } catch (Throwable th) {
                this.i.b();
                throw th;
            }
        }
        this.i.b();
        if (this.l.isEmpty()) {
            IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.n;
            if (i == 0) {
                throw null;
            }
            throw new fhku(i);
        }
        removeFirst = this.l.removeFirst();
        removeFirst.getClass();
        return (fhgh) removeFirst;
    }

    public final fhnt b() {
        synchronized (this) {
            if (!this.m && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final void c(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() {
        boolean z;
        boolean i;
        byte[] bArr = fhhl.a;
        synchronized (this) {
            fhkl fhklVar = this.g;
            z = false;
            if (!fhklVar.b && fhklVar.e) {
                fhkk fhkkVar = this.h;
                if (fhkkVar.a || fhkkVar.b) {
                    z = true;
                }
            }
            i = i();
        }
        if (z) {
            k(9, null);
        } else {
            if (i) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void e() {
        fhkk fhkkVar = this.h;
        if (fhkkVar.b) {
            throw new IOException("stream closed");
        }
        if (fhkkVar.a) {
            throw new IOException("stream finished");
        }
        int i = this.n;
        if (i != 0) {
            IOException iOException = this.k;
            if (iOException == null) {
                throw new fhku(i);
            }
            throw iOException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:
    
        if (r4 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.fhgh r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            byte[] r0 = defpackage.fhhl.a
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 == 0) goto Le
            if (r4 != 0) goto L17
            r4 = 0
        Le:
            r2.m = r1     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque r0 = r2.l     // Catch: java.lang.Throwable -> L2d
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L1b
        L17:
            fhkl r3 = r2.g     // Catch: java.lang.Throwable -> L2d
            r3.b = r1     // Catch: java.lang.Throwable -> L2d
        L1b:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L2d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r3 != 0) goto L2c
            fhkf r3 = r2.b
            int r4 = r2.a
            r3.b(r4)
        L2c:
            return
        L2d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhkn.f(fhgh, boolean):void");
    }

    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        return (this.a & 1) == 1;
    }

    public final synchronized boolean i() {
        if (this.n != 0) {
            return false;
        }
        fhkl fhklVar = this.g;
        if (fhklVar.b || fhklVar.e) {
            fhkk fhkkVar = this.h;
            if (fhkkVar.a || fhkkVar.b) {
                if (this.m) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized int j() {
        return this.n;
    }

    public final void k(int i, IOException iOException) {
        if (n(i, iOException)) {
            this.b.m(this.a, i);
        }
    }

    public final void l(int i) {
        if (n(i, null)) {
            this.b.n(this.a, i);
        }
    }

    public final synchronized void m(int i) {
        if (this.n == 0) {
            this.n = i;
            notifyAll();
        }
    }
}
