package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhid implements fhfe {
    public final fhgs a;
    public final fhgv b;
    public final fhii c;
    public final fhfy d;
    public final fhic e;
    public fhhz f;
    public fhig g;
    public fhhy h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile boolean l;
    public volatile fhhy m;
    public volatile fhig n;
    private final AtomicBoolean o;
    private Object p;

    public fhid(fhgs fhgsVar, fhgv fhgvVar) {
        this.a = fhgsVar;
        this.b = fhgvVar;
        this.c = fhgsVar.d.a;
        fhfy fhfyVar = fhgsVar.A.a;
        byte[] bArr = fhhl.a;
        this.d = fhfyVar;
        fhic fhicVar = new fhic(this);
        fhicVar.n(0L, TimeUnit.MILLISECONDS);
        this.e = fhicVar;
        this.o = new AtomicBoolean();
        this.k = true;
    }

    private final IOException k(IOException iOException) {
        IOException iOException2;
        Socket g;
        byte[] bArr = fhhl.a;
        fhig fhigVar = this.g;
        if (fhigVar != null) {
            synchronized (fhigVar) {
                g = g();
            }
            if (this.g == null) {
                if (g != null) {
                    fhhl.r(g);
                }
            } else if (g != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.e.f()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    private final void l() {
        this.p = fhlc.b.i();
    }

    @Override // defpackage.fhfe
    public final fhhb a() {
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.e.e();
        l();
        try {
            this.a.c.b(this);
            return h();
        } finally {
            this.a.c.d(this);
        }
    }

    @Override // defpackage.fhfe
    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        fhhy fhhyVar = this.m;
        if (fhhyVar != null) {
            fhhyVar.c.f();
        }
        fhig fhigVar = this.n;
        if (fhigVar != null) {
            fhigVar.b();
        }
    }

    @Override // defpackage.fhfe
    public final void c(fhff fhffVar) {
        fhia fhiaVar;
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        l();
        fhgs fhgsVar = this.a;
        fhia fhiaVar2 = new fhia(this, fhffVar);
        fhfu fhfuVar = fhgsVar.c;
        synchronized (fhfuVar) {
            fhfuVar.a.add(fhiaVar2);
            String a = fhiaVar2.a();
            Iterator it = fhfuVar.b.iterator();
            it.getClass();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = fhfuVar.a.iterator();
                    it2.getClass();
                    while (true) {
                        if (!it2.hasNext()) {
                            fhiaVar = null;
                            break;
                        } else {
                            fhiaVar = (fhia) it2.next();
                            if (ffkj.e(fhiaVar.a(), a)) {
                                break;
                            }
                        }
                    }
                } else {
                    fhiaVar = (fhia) it.next();
                    if (ffkj.e(fhiaVar.a(), a)) {
                        break;
                    }
                }
            }
            if (fhiaVar != null) {
                fhiaVar2.a = fhiaVar.a;
            }
        }
        fhfuVar.e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new fhid(this.a, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r2.k != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException d(defpackage.fhhy r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            fhhy r0 = r2.m
            boolean r3 = defpackage.ffkj.e(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = r3
        L1c:
            if (r4 == 0) goto L20
            r2.i = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.j = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r0 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = r0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.m = r4
            fhig r4 = r2.g
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r3 = r2.k(r6)
            return r3
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhid.d(fhhy, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException e(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.k) {
                this.k = false;
                if (!this.i) {
                    if (!this.j) {
                        z = true;
                    }
                }
            }
        }
        return z ? k(iOException) : iOException;
    }

    public final String f() {
        return this.b.a.e();
    }

    public final Socket g() {
        fhig fhigVar = this.g;
        fhigVar.getClass();
        byte[] bArr = fhhl.a;
        List list = fhigVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ffkj.e(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.g = null;
        if (list.isEmpty()) {
            fhigVar.m = System.nanoTime();
            fhii fhiiVar = this.c;
            if (fhigVar.i) {
                fhigVar.l();
                fhiiVar.d.remove(fhigVar);
                if (fhiiVar.d.isEmpty()) {
                    fhiiVar.b.a();
                }
                return fhigVar.a();
            }
            fhiiVar.b.f(fhiiVar.c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fhhb h() {
        /*
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            fhgs r0 = r9.a
            java.util.List r0 = r0.e
            defpackage.ffdx.w(r2, r0)
            fhix r0 = new fhix
            fhgs r1 = r9.a
            r0.<init>(r1)
            r2.add(r0)
            fhin r0 = new fhin
            fhgs r1 = r9.a
            fhft r1 = r1.j
            r0.<init>(r1)
            r2.add(r0)
            fhhn r0 = new fhhn
            r0.<init>()
            r2.add(r0)
            fhhv r0 = defpackage.fhhv.a
            r2.add(r0)
            fhgs r0 = r9.a
            java.util.List r0 = r0.f
            defpackage.ffdx.w(r2, r0)
            fhio r0 = new fhio
            r0.<init>()
            r2.add(r0)
            fhiu r0 = new fhiu
            fhgv r5 = r9.b
            fhgs r1 = r9.a
            int r6 = r1.w
            int r7 = r1.x
            int r8 = r1.y
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            fhhb r0 = r0.b(r5)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            boolean r3 = r1.l     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            if (r3 != 0) goto L5d
            r9.e(r2)
            return r0
        L5d:
            defpackage.fhhl.q(r0)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            throw r0     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
        L68:
            r0 = move-exception
            r3 = 0
            goto L76
        L6b:
            r0 = move-exception
            java.io.IOException r0 = r9.e(r0)     // Catch: java.lang.Throwable -> L74
            r0.getClass()     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            r3 = 1
        L76:
            if (r3 != 0) goto L7b
            r9.e(r2)
        L7b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhid.h():fhhb");
    }

    public final void i(fhig fhigVar) {
        byte[] bArr = fhhl.a;
        if (this.g != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.g = fhigVar;
        fhigVar.l.add(new fhib(this, this.p));
    }

    public final void j(boolean z) {
        fhhy fhhyVar;
        synchronized (this) {
            if (!this.k) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (fhhyVar = this.m) != null) {
            fhhyVar.c.f();
            fhhyVar.a.d(fhhyVar, true, true, null);
        }
        this.h = null;
    }
}
