package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feli implements feqr {
    public final feds b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public feqq f;
    private final Executor j;
    private final fdzv i = fdzv.a(feli.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile felh h = new felh(null, null);

    public feli(Executor executor, feds fedsVar) {
        this.j = executor;
        this.b = fedsVar;
    }

    final void a(feao feaoVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new felh(feaoVar, this.h.b);
            if (feaoVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    felg felgVar = (felg) arrayList.get(i);
                    feak a = feaoVar.a(felgVar.a);
                    fdxj fdxjVar = ((fery) felgVar.a).a;
                    if (fdxjVar.i() && a.d()) {
                        felgVar.d = a.c;
                    }
                    fejv c = fend.c(a, fdxjVar.i());
                    if (c != null) {
                        Executor executor = this.j;
                        Executor executor2 = fdxjVar.c;
                        fdyn a2 = felgVar.b.a();
                        try {
                            feal fealVar = felgVar.a;
                            fejs d = c.d(((fery) fealVar).c, ((fery) fealVar).b, ((fery) fealVar).a, felgVar.c);
                            felgVar.b.f(a2);
                            Runnable q = felgVar.q(d);
                            if (q != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(q);
                            }
                            arrayList2.add(felgVar);
                        } catch (Throwable th) {
                            felgVar.b.f(a2);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (b()) {
                        this.g.removeAll(arrayList2);
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!b()) {
                            this.b.c(this.d);
                            if (this.h.b != null && (runnable = this.e) != null) {
                                this.b.c(runnable);
                                this.e = null;
                            }
                        }
                        this.b.b();
                    }
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r3 = new defpackage.felg(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r0.a.i() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r4.d() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r3.d = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r2.g.add(r3);
        r4 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r0 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r0 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        r2.b.c(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r4 = r6.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r0 >= r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        r1 = r6[r0];
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [fejs] */
    /* JADX WARN: Type inference failed for: r3v4, types: [femm] */
    /* JADX WARN: Type inference failed for: r3v5, types: [fejs] */
    /* JADX WARN: Type inference failed for: r3v7, types: [felg, java.lang.Object] */
    @Override // defpackage.fejv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fejs d(defpackage.febs r3, defpackage.febo r4, defpackage.fdxj r5, defpackage.fdxt[] r6) {
        /*
            r2 = this;
            fery r0 = new fery     // Catch: java.lang.Throwable -> L86
            fere r1 = new fere     // Catch: java.lang.Throwable -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L86
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L86
            felh r3 = r2.h     // Catch: java.lang.Throwable -> L86
        Lc:
            io.grpc.Status r4 = r3.b     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L16
            femm r3 = new femm     // Catch: java.lang.Throwable -> L86
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L86
            goto L77
        L16:
            feao r4 = r3.a     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L33
            feak r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L86
            fdxj r5 = r0.a     // Catch: java.lang.Throwable -> L86
            boolean r1 = r5.i()     // Catch: java.lang.Throwable -> L86
            fejv r1 = defpackage.fend.c(r4, r1)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L34
            febs r3 = r0.c     // Catch: java.lang.Throwable -> L86
            febo r4 = r0.b     // Catch: java.lang.Throwable -> L86
            fejs r3 = r1.d(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L77
        L33:
            r4 = 0
        L34:
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L86
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L86
            felh r1 = r2.h     // Catch: java.lang.Throwable -> L83
            if (r3 != r1) goto L80
            felg r3 = new felg     // Catch: java.lang.Throwable -> L83
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L83
            fdxj r0 = r0.a     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L54
            if (r4 == 0) goto L54
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L54
            io.grpc.Status r4 = r4.c     // Catch: java.lang.Throwable -> L83
            r3.d = r4     // Catch: java.lang.Throwable -> L83
        L54:
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L83
            r4.add(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r4 = r2.a     // Catch: java.lang.Throwable -> L83
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L83
            java.util.Collection r0 = r2.g     // Catch: java.lang.Throwable -> L7d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            r4 = 1
            if (r0 != r4) goto L6d
            feds r4 = r2.b     // Catch: java.lang.Throwable -> L83
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L83
            r4.c(r0)     // Catch: java.lang.Throwable -> L83
        L6d:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L83
            r0 = 0
        L6f:
            if (r0 >= r4) goto L76
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L83
            int r0 = r0 + 1
            goto L6f
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
        L77:
            feds r4 = r2.b
            r4.b()
            return r3
        L7d:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L83
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            r3 = r1
            goto Lc
        L83:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            throw r3     // Catch: java.lang.Throwable -> L86
        L86:
            r3 = move-exception
            feds r4 = r2.b
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feli.d(febs, febo, fdxj, fdxt[]):fejs");
    }

    @Override // defpackage.feqr
    public final Runnable e(feqq feqqVar) {
        throw null;
    }

    @Override // defpackage.feqr
    public final void n(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.b != null) {
                return;
            }
            this.h = new felh(this.h.a, status);
            this.b.c(new felf(this));
            if (!b() && (runnable = this.e) != null) {
                this.b.c(runnable);
                this.e = null;
            }
            this.b.b();
        }
    }

    @Override // defpackage.feqr
    public final void o(Status status) {
        throw null;
    }
}
