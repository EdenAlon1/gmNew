package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefs extends fefu implements fekh, fefe {
    public final feey a;
    public final feff b;
    public final long c;
    public ScheduledFuture d;
    private final ferd n;
    private final Executor o;
    private final AtomicInteger p;
    private final fehh q;
    private feqq r;
    private int s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fefs(defpackage.fefh r8, defpackage.feef r9, defpackage.fejw r10) {
        /*
            r7 = this;
            ferd r0 = r8.c
            fdxd r10 = r10.b
            android.content.Context r1 = r8.a
            feeq r2 = r8.g
            fdxd r3 = defpackage.fdxd.a
            fdxb r3 = new fdxb
            fdxd r4 = defpackage.fdxd.a
            r3.<init>(r4)
            fdxc r4 = defpackage.femv.a
            fecq r5 = defpackage.fecq.NONE
            r3.b(r4, r5)
            fdxc r4 = defpackage.femv.b
            r3.b(r4, r10)
            fdxc r10 = defpackage.fdzi.b
            feef r1 = defpackage.feef.b(r1)
            r3.b(r10, r1)
            fdxc r10 = defpackage.fdzi.a
            r3.b(r10, r9)
            fdxc r10 = defpackage.fefs.h
            r3.b(r10, r2)
            fdxd r10 = r3.a()
            android.content.Context r1 = r8.a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "->"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.Class<fefs> r2 = defpackage.fefs.class
            fdzv r1 = defpackage.fdzv.a(r2, r1)
            r7.<init>(r0, r10, r1)
            r10 = 1001(0x3e9, float:1.403E-42)
            r7.s = r10
            ferd r10 = r8.d
            r7.n = r10
            feey r0 = r8.e
            r7.a = r0
            java.lang.Object r10 = r10.a()
            r7.o = r10
            r0 = 60000(0xea60, double:2.9644E-319)
            r7.c = r0
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>()
            r7.p = r10
            fehh r10 = new fehh
            emyv r0 = defpackage.emyv.b
            r10.<init>()
            r7.q = r10
            fehl r1 = new fehl
            java.util.concurrent.Executor r2 = r8.b
            android.content.Context r3 = r8.a
            android.content.Intent r9 = r9.a
            android.content.Intent r4 = r9.cloneFilter()
            feei r8 = r8.f
            int r5 = r8.b
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r6.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fefs.<init>(fefh, feef, fejw):void");
    }

    private static fejs A(Status status, fdxd fdxdVar, fdxt[] fdxtVarArr) {
        fevo.l(fdxtVarArr, fdxdVar).a();
        return new femm(status, fdxtVarArr);
    }

    @Override // defpackage.fefe
    public final synchronized void a(IBinder iBinder) {
        r(fegu.b(iBinder, this.o));
    }

    @Override // defpackage.fefe
    public final synchronized void b(Status status) {
        t(status, true);
    }

    @Override // defpackage.fejv
    public final synchronized fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        Throwable th;
        try {
            try {
                try {
                    if (!z(3)) {
                        return A(w() ? this.l : Status.o.withDescription("newStream() before transportReady()"), this.k, fdxtVarArr);
                    }
                    int i = this.s;
                    int i2 = i + 1;
                    this.s = i2;
                    if (i2 == 16777215) {
                        this.s = 1001;
                    }
                    fevo l = fevo.l(fdxtVarArr, this.k);
                    fegf fegfVar = new fegf(this, this.k, i, fend.j(fdxjVar));
                    if (this.j.putIfAbsent(Integer.valueOf(i), fegfVar) != null) {
                        Status withDescription = Status.o.withDescription("Clashing call IDs");
                        t(withDescription, true);
                        return A(withDescription, this.k, fdxtVarArr);
                    }
                    if (fegfVar.a && this.p.getAndIncrement() == 0) {
                        this.r.a(true);
                    }
                    fegv fegvVar = new fegv(this, i, febsVar, feboVar, l);
                    if (febsVar.a.a()) {
                        return new fehm(fegfVar, fegvVar);
                    }
                    return new fego(fegfVar, fegvVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.feqr
    public final synchronized Runnable e(feqq feqqVar) {
        this.r = feqqVar;
        return new Runnable() { // from class: fefo
            @Override // java.lang.Runnable
            public final void run() {
                final fefs fefsVar = fefs.this;
                synchronized (fefsVar) {
                    if (fefsVar.z(1)) {
                        fefsVar.y(2);
                        fefsVar.b.a();
                        fefsVar.d = fefsVar.i.schedule(new Runnable() { // from class: fefp
                            @Override // java.lang.Runnable
                            public final void run() {
                                fefs.this.l();
                            }
                        }, fefsVar.c, TimeUnit.MILLISECONDS);
                    }
                }
            }
        };
    }

    public final synchronized void f(Throwable th) {
        t(Status.o.withDescription("Could not evaluate SecurityPolicy").d(th), true);
    }

    public final synchronized void g(IBinder iBinder, Status status) {
        if (z(2)) {
            if (!status.f()) {
                t(status, true);
                return;
            }
            if (!x(fegu.b(iBinder, this.o))) {
                t(Status.p.withDescription("Failed to observe outgoing binder"), true);
                return;
            }
            if (!w()) {
                y(3);
                feqq feqqVar = this.r;
                fdxd fdxdVar = this.k;
                feqqVar.e();
                this.k = fdxdVar;
                this.r.b();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                }
            }
        }
    }

    @Override // defpackage.fefu
    protected final void h(Parcel parcel) {
        parcel.readInt();
        this.q.a();
    }

    @Override // defpackage.fefu
    protected final void i(Parcel parcel) {
        final int callingUid = Binder.getCallingUid();
        fdxb fdxbVar = new fdxb(this.k);
        fdxbVar.b(f, Integer.valueOf(callingUid));
        fdxbVar.b(femv.a, callingUid == Process.myUid() ? fecq.PRIVACY_AND_INTEGRITY : fecq.INTEGRITY);
        this.k = fdxbVar.a();
        if (z(2)) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                t(Status.p.withDescription("Wire format version mismatch"), true);
            } else if (readStrongBinder == null) {
                t(Status.p.withDescription("Malformed SETUP_TRANSPORT data"), true);
            } else {
                feey feeyVar = this.a;
                erqt.r(feeyVar instanceof feeg ? ((feeg) feeyVar).b(callingUid) : erqt.m(new Callable() { // from class: fefq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fefs.this.a.a(callingUid);
                    }
                }, this.o), new fefr(this, readStrongBinder), this.o);
            }
        }
    }

    @Override // defpackage.fefu
    public final void j(Status status) {
        this.r.c(status);
    }

    @Override // defpackage.fefu
    public final void k() {
        if (this.p.getAndSet(0) > 0) {
            this.r.a(false);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
        ((fehl) this.b).c(Status.c);
        this.r.d();
    }

    public final synchronized void l() {
        if (z(2)) {
            this.d = null;
            long j = this.c;
            t(Status.f.withDescription("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    @Override // defpackage.fefu
    public final void m() {
        super.m();
        this.n.b(this.o);
    }

    @Override // defpackage.feqr
    public final synchronized void n(Status status) {
        status.getClass();
        t(status, false);
    }

    @Override // defpackage.feqr
    public final synchronized void o(Status status) {
        throw null;
    }

    @Override // defpackage.fefu
    protected final void p(fegj fegjVar) {
        if (fegjVar.e() && this.p.decrementAndGet() == 0) {
            this.r.a(false);
        }
        super.p(fegjVar);
    }
}
