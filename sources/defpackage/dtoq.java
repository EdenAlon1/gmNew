package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoq {
    public final Queue a;
    private final Executor b;
    private final AtomicReference c;
    private final dtop d;
    private Throwable e;

    public dtoq(Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = new AtomicReference();
        this.a = new ConcurrentLinkedQueue();
        this.d = new dtop();
    }

    public final ListenableFuture a(Executor executor, erog erogVar) {
        final ListenableFuture n = erqt.n(eldl.c(erogVar), new dtof(this));
        return erqt.m(eldl.m(new Callable() { // from class: dtoh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dtoq.this.c(n);
            }
        }), executor);
    }

    public final Object b(erog erogVar) {
        return c(erqt.n(erogVar, new dtof(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        r5 = android.os.Process.getThreadPriority(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0277, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0278, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027b, code lost:
    
        if (r4 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027d, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0282, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0054, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0185, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0186, code lost:
    
        r9 = r3.f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019f, code lost:
    
        if (r3.f.compareAndSet(r9, defpackage.dtos.i(r9, false, false, true, 0, 0, 0, 123)) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a3, code lost:
    
        if (r3.c == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        r5 = defpackage.dtos.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b0, code lost:
    
        r9 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b8, code lost:
    
        if (defpackage.dtoo.c(r9) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01be, code lost:
    
        if (defpackage.dtoo.b(r9) > r5) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cb, code lost:
    
        if (r0.compareAndSet(r9, defpackage.dtoo.e(r9, r5, r7, false, 4)) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cd, code lost:
    
        r9 = r0.a;
        r10 = defpackage.dtor.b(r5, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d7, code lost:
    
        if (r9.c == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d9, code lost:
    
        r12 = r9.f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e9, code lost:
    
        if (defpackage.dtos.e(r12) != defpackage.dtor.c(r10)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f1, code lost:
    
        if (defpackage.dtos.a(r12) == (-21)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01fb, code lost:
    
        if (defpackage.dtos.a(r12) <= defpackage.dtor.a(r10)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fd, code lost:
    
        r14 = defpackage.dtos.i(r12, false, false, false, 0, defpackage.dtor.a(r10), 0, 95);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0213, code lost:
    
        if (defpackage.dtos.g(r12) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0226, code lost:
    
        if (defpackage.dtos.d(r12) != defpackage.dtos.d(r14)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022e, code lost:
    
        if (r9.f.compareAndSet(r12, r14) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024d, code lost:
    
        if (r9.f.compareAndSet(r12, defpackage.dtos.i(r14, false, true, false, 0, 0, 0, 125)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x024f, code lost:
    
        r9.a(defpackage.dtos.d(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        if (r9.f.compareAndSet(r12, r14) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0256, code lost:
    
        java.util.concurrent.locks.LockSupport.park(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0261, code lost:
    
        if (r0.c.get() != defpackage.dtok.a) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0273, code lost:
    
        r4 = r4 | java.lang.Thread.interrupted();
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0263, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0266, code lost:
    
        if (r4 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0268, code lost:
    
        r3.a.interrupt();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.common.util.concurrent.ListenableFuture r33) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtoq.c(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public final void d(Runnable runnable) {
        runnable.getClass();
        this.a.add(runnable);
    }
}
