package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkf implements Closeable {
    public static final fhkt a;
    public final fhjs b;
    public final Map c = new LinkedHashMap();
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final fhhu h;
    public final fhhr i;
    public final fhhr j;
    public final fhhr k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final fhkt q;
    public fhkt r;
    public long s;
    public long t;
    public final fhko u;
    public final fhjx v;
    public final Set w;
    private long x;
    private long y;
    private final Socket z;

    static {
        fhkt fhktVar = new fhkt();
        fhktVar.g(7, 65535);
        fhktVar.g(5, 16384);
        a = fhktVar;
    }

    public fhkf(fhjq fhjqVar) {
        this.b = fhjqVar.f;
        String str = fhjqVar.c;
        fhmv fhmvVar = null;
        if (str == null) {
            ffkj.c("connectionName");
            str = null;
        }
        this.d = str;
        this.f = 3;
        fhhu fhhuVar = fhjqVar.a;
        this.h = fhhuVar;
        this.i = fhhuVar.a();
        this.j = fhhuVar.a();
        this.k = fhhuVar.a();
        fhkt fhktVar = new fhkt();
        fhktVar.g(7, 16777216);
        this.q = fhktVar;
        this.r = a;
        this.t = r0.c();
        Socket socket = fhjqVar.b;
        if (socket == null) {
            ffkj.c("socket");
            socket = null;
        }
        this.z = socket;
        fhmu fhmuVar = fhjqVar.e;
        if (fhmuVar == null) {
            ffkj.c("sink");
            fhmuVar = null;
        }
        this.u = new fhko(fhmuVar);
        fhmv fhmvVar2 = fhjqVar.d;
        if (fhmvVar2 == null) {
            ffkj.c("source");
        } else {
            fhmvVar = fhmvVar2;
        }
        this.v = new fhjx(this, new fhkj(fhmvVar));
        this.w = new LinkedHashSet();
    }

    public static final boolean j(int i) {
        return (i & 1) == 0;
    }

    public final synchronized fhkn a(int i) {
        return (fhkn) this.c.get(Integer.valueOf(i));
    }

    public final synchronized fhkn b(int i) {
        fhkn fhknVar;
        fhknVar = (fhkn) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return fhknVar;
    }

    public final void c(IOException iOException) {
        k(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k(1, 9, null);
    }

    public final void d() {
        this.u.d();
    }

    public final synchronized void e(long j) {
        long j2 = this.x + j;
        this.x = j2;
        long j3 = j2 - this.y;
        if (j3 >= this.q.c() / 2) {
            h(0, j3);
            this.y += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.u.a);
        r6 = r2;
        r8.s += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r9, boolean r10, defpackage.fhmt r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L63
        L7:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L62
            monitor-enter(r8)
        Lc:
            long r4 = r8.s     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            long r6 = r8.t     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r8.c     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            if (r2 == 0) goto L24
            r8.wait()     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            goto Lc
        L24:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            throw r9     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L51
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L51
            fhko r4 = r8.u     // Catch: java.lang.Throwable -> L51
            int r4 = r4.a     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L51
            long r4 = r8.s     // Catch: java.lang.Throwable -> L51
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L51
            long r4 = r4 + r6
            r8.s = r4     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)
            long r12 = r12 - r6
            fhko r4 = r8.u
            if (r10 == 0) goto L4c
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r3
        L4d:
            r4.c(r5, r9, r11, r2)
            goto L7
        L51:
            r9 = move-exception
            goto L60
        L53:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L51
            r9.interrupt()     // Catch: java.lang.Throwable -> L51
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L51
            r9.<init>()     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L60:
            monitor-exit(r8)
            throw r9
        L62:
            return
        L63:
            fhko r12 = r8.u
            r12.c(r10, r9, r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhkf.f(int, boolean, fhmt, long):void");
    }

    public final void g(boolean z, int i, int i2) {
        try {
            this.u.g(z, i, i2);
        } catch (IOException e) {
            c(e);
        }
    }

    public final void h(int i, long j) {
        this.i.f(new fhke(this.d + "[" + i + "] windowUpdate", this, i, j));
    }

    public final synchronized boolean i(long j) {
        if (this.g) {
            return false;
        }
        if (this.n < this.m) {
            if (j >= this.p) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        byte[] bArr = fhhl.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.c.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.c.values().toArray(new fhkn[0]);
                this.c.clear();
            }
        }
        fhkn[] fhknVarArr = (fhkn[]) objArr;
        if (fhknVarArr != null) {
            for (fhkn fhknVar : fhknVarArr) {
                try {
                    fhknVar.k(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.u.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.i.b();
        this.j.b();
        this.k.b();
    }

    public final void l(int i) {
        synchronized (this.u) {
            ffkz ffkzVar = new ffkz();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                ffkzVar.a = this.e;
                fhko fhkoVar = this.u;
                int i2 = ffkzVar.a;
                byte[] bArr = fhhl.a;
                fhkoVar.k(i2, i);
            }
        }
    }

    public final void m(int i, int i2) {
        this.u.j(i, i2);
    }

    public final void n(int i, int i2) {
        this.i.f(new fhkd(this.d + "[" + i + "] writeSynReset", this, i, i2));
    }
}
