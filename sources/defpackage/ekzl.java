package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzl implements elat, elen {
    public final elat a;
    public Thread b;
    public eleb c;
    private final elem d;
    private final eleo e;

    private ekzl(elem elemVar, ekzl ekzlVar, elao elaoVar) {
        this.d = elemVar;
        this.e = ekzlVar.e;
        this.a = ekzlVar;
        eleb elebVar = elaoVar.e;
        if (elebVar == null) {
            this.c = null;
            this.b = Thread.currentThread();
        } else {
            this.c = elebVar;
            this.b = null;
        }
    }

    private final void h() {
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    @Override // defpackage.elat
    public final elat a() {
        return this.a;
    }

    @Override // defpackage.elat
    public final eleb b() {
        return this.c;
    }

    @Override // defpackage.elat
    public final String c() {
        return this.d.c;
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ekyf.p(this);
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.elat
    public final Thread d() {
        return this.b;
    }

    @Override // defpackage.elat
    public final UUID e() {
        return this.e.b;
    }

    @Override // defpackage.elen
    public final int f() {
        return this.d.f;
    }

    @Override // defpackage.elen
    public final eldu g() {
        return this.e.b();
    }

    @Override // defpackage.elat
    public final elaa i(elab elabVar) {
        return elae.j(elabVar, j());
    }

    @Override // defpackage.elat
    public final elae j() {
        elem elemVar = this.d;
        return elae.e(elemVar.e, elemVar.c());
    }

    @Override // defpackage.elat
    public final elae l() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r9 = new defpackage.ekzl(r2, r8, r11);
        r10 = r9.a;
        r11 = defpackage.ekyf.a;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r9.b != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r9.c == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        defpackage.emxf.m(r10, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        r10 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r10 != ((defpackage.ekzl) r9.a).c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r2.h = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (((defpackage.ekzl) r9.a).b != r9.b) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r10 = true;
     */
    @Override // defpackage.elat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elat m(java.lang.String r9, defpackage.elae r10, defpackage.elao r11) {
        /*
            r8 = this;
            eleo r1 = r8.e
            long r5 = r1.a()
            elem r2 = new elem
            elem r3 = r8.d
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r7)
        Lf:
            java.util.concurrent.atomic.AtomicReference r9 = r1.e
            java.lang.Object r9 = r9.get()
            elem r9 = (defpackage.elem) r9
            int r10 = r9.f
            r0 = 1
            int r10 = r10 + r0
            elco r3 = r1.a
            int r3 = r3.f
            if (r10 < r3) goto L33
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
            r2.d(r9, r10)
            monitor-enter(r1)
            int r9 = r1.g     // Catch: java.lang.Throwable -> L2f
            int r9 = r9 + r0
            r1.g = r9     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L45
        L2f:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r9
        L33:
            r2.d(r10, r9)
            java.util.concurrent.atomic.AtomicReference r10 = r1.e
        L38:
            boolean r3 = r10.compareAndSet(r9, r2)
            if (r3 != 0) goto L45
            java.lang.Object r3 = r10.get()
            if (r3 == r9) goto L38
            goto Lf
        L45:
            ekzl r9 = new ekzl
            r9.<init>(r2, r8, r11)
            elat r10 = r9.a
            boolean r11 = defpackage.ekyf.a
            r10.getClass()
            java.lang.Thread r10 = r9.b
            r11 = 0
            if (r10 != 0) goto L5d
            eleb r10 = r9.c
            if (r10 == 0) goto L5b
            goto L5d
        L5b:
            r10 = r11
            goto L5e
        L5d:
            r10 = r0
        L5e:
            java.lang.String r1 = "isSynchronousChild should not be called if the trace has been closed on its creation thread."
            defpackage.emxf.m(r10, r1)
            eleb r10 = r9.c
            if (r10 == 0) goto L70
            elat r1 = r9.a
            ekzl r1 = (defpackage.ekzl) r1
            eleb r1 = r1.c
            if (r10 != r1) goto L7b
            goto L7c
        L70:
            elat r10 = r9.a
            ekzl r10 = (defpackage.ekzl) r10
            java.lang.Thread r10 = r10.b
            java.lang.Thread r1 = r9.b
            if (r10 != r1) goto L7b
            goto L7c
        L7b:
            r0 = r11
        L7c:
            r2.h = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekzl.m(java.lang.String, elae, elao):elat");
    }

    @Override // defpackage.elat
    public final void n(int i) {
        elem elemVar = this.d;
        if (elemVar.f()) {
            elemVar = elemVar.b;
        }
        elemVar.addAndGet(i);
        h();
    }

    @Override // defpackage.elat
    public final void o(elab elabVar, Object obj) {
        elem elemVar;
        elej a;
        elej elejVar = new elej(elabVar, obj);
        do {
            elemVar = this.d;
            a = elem.a.a(elemVar);
            if (a != null) {
                elejVar.c = a;
            }
        } while (!elem.a.b(elemVar, a, elejVar));
        h();
    }

    @Override // defpackage.elat
    public final void p(boolean z) {
        long a = this.e.a();
        elem elemVar = this.d;
        long j = a - elemVar.d;
        emxf.l(!elemVar.e());
        elemVar.i = (j & 4611686018427387903L) | (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE;
        h();
    }

    @Override // defpackage.elat
    public final boolean q() {
        return this.e.c;
    }

    @Override // defpackage.elat
    public final void s() {
        this.d.j = 3;
    }

    public final String toString() {
        return ekyf.o(this);
    }

    public ekzl(elem elemVar, eleo eleoVar, elao elaoVar) {
        this.d = elemVar;
        this.e = eleoVar;
        Thread thread = null;
        this.a = null;
        eleb elebVar = elaoVar.e;
        if (elebVar == null) {
            this.c = null;
            thread = Thread.currentThread();
        } else {
            this.c = elebVar;
        }
        this.b = thread;
    }
}
