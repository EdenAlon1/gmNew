package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecky extends eckt implements ecje, ecgw, ecgn {
    public volatile ecda a;
    public final fazb b;
    public final ffbr d;
    public final ffbr e;
    public final eckl f;
    public final ecks g;
    private final Executor i;
    private final ecjc j;
    private final emxc k;
    private final ecgx l;
    private final ecgt m;
    private final ecst n;
    private final ffbr s;
    private final emxc t;
    private final ffbr u;
    private final ffbr v;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public ecky(ecjd ecjdVar, Executor executor, fazb fazbVar, emxc emxcVar, ecgx ecgxVar, ecgt ecgtVar, ecst ecstVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, eckl ecklVar, ecks ecksVar, emxc emxcVar2, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = fazbVar;
        this.k = emxcVar;
        this.l = ecgxVar;
        this.m = ecgtVar;
        this.n = ecstVar;
        this.j = ecjdVar.a(erpp.a, fazbVar, null);
        this.i = executor;
        this.s = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ecklVar;
        this.g = ecksVar;
        this.t = emxcVar2;
        this.u = ffbrVar4;
        this.v = ffbrVar5;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        erqt.n(new erog() { // from class: ecku
            @Override // defpackage.erog
            public final ListenableFuture a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return erre.a;
                }
                int i2 = i;
                ecky eckyVar = ecky.this;
                return eckyVar.o(i2, (ecki) eckyVar.b.b());
            }
        }, this.i);
    }

    @Override // defpackage.ecgw
    public final void a(Activity activity, Bundle bundle) {
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 413, "CrashMetricServiceImpl.java")).q("onActivityCreated");
        if (this.r.getAndSet(true)) {
            return;
        }
        q(4, this.p);
    }

    @Override // defpackage.ecgw
    public final void d(Activity activity) {
        erqt.n(new erog() { // from class: eckw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ecky eckyVar = ecky.this;
                if (eckyVar.m()) {
                    final eckl ecklVar = eckyVar.f;
                    if (ecklVar.g.getAndSet(false)) {
                        erqt.n(new erog() { // from class: eckk
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                eckl ecklVar2 = eckl.this;
                                emxc emxcVar = (emxc) ecklVar2.b.get();
                                boolean g = emxcVar.g();
                                Object obj = ecklVar2.c.get();
                                if (g) {
                                    emxc emxcVar2 = (emxc) obj;
                                    if (emxcVar2.g()) {
                                        eckj eckjVar = new eckj((File) emxcVar.c(), (String) emxcVar2.c());
                                        int a = eckjVar.a();
                                        eckjVar.b().delete();
                                        eckjVar.b = 0;
                                        eckjVar.c = true;
                                        if (a < ((eckn) ecklVar2.f.b()).c) {
                                            return erre.a;
                                        }
                                        ecjc ecjcVar = ecklVar2.e;
                                        eciu m = eciv.m();
                                        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                                        fgqp fgqpVar = (fgqp) fgqt.a.createBuilder();
                                        fgqpVar.copyOnWrite();
                                        fgqt fgqtVar = (fgqt) fgqpVar.instance;
                                        fgqtVar.c = 6;
                                        fgqtVar.b = 1 | fgqtVar.b;
                                        fgqwVar.copyOnWrite();
                                        fgqx fgqxVar = (fgqx) fgqwVar.instance;
                                        fgqt fgqtVar2 = (fgqt) fgqpVar.build();
                                        fgqtVar2.getClass();
                                        fgqxVar.x = fgqtVar2;
                                        fgqxVar.b |= 16777216;
                                        m.f((fgqx) fgqwVar.build());
                                        return ecjcVar.b(m.a());
                                    }
                                }
                                return erre.a;
                            }
                        }, ecklVar.d);
                    } else {
                        ListenableFuture listenableFuture = erre.a;
                    }
                }
                return erre.a;
            }
        }, this.i);
    }

    @Override // defpackage.ecgw
    public final void f(Activity activity) {
        this.a = ecda.b(activity.getClass());
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        this.a = null;
    }

    @Override // defpackage.eckt
    public final void k() {
        if (this.h.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new eckx(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|1e|11|(5:13|(1:15)(2:55|(1:57)(5:58|(2:60|(2:62|(1:64)(7:65|(2:67|(8:68|69|71|72|73|74|76|93))(0)|105|80|(1:82)(1:83)|17|(16:20|21|22|(1:24)(1:51)|25|27|(2:30|28)|31|32|(1:36)|37|(2:40|38)|41|(2:44|42)|45|(2:47|48)(1:50)))))|106|17|(16:20|21|22|(0)(0)|25|27|(1:28)|31|32|(2:34|36)|37|(1:38)|41|(1:42)|45|(0)(0))))|16|17|(0))(1:107)|54|21|22|(0)(0)|25|27|(1:28)|31|32|(0)|37|(1:38)|41|(1:42)|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x027c, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0205 A[Catch: InterruptedException -> 0x027c, all -> 0x0283, TryCatch #10 {InterruptedException -> 0x027c, all -> 0x0283, blocks: (B:22:0x01ff, B:24:0x0205, B:25:0x021a, B:51:0x0210), top: B:21:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028b A[LOOP:0: B:28:0x0283->B:30:0x028b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c7 A[LOOP:1: B:38:0x02ad->B:40:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bd A[LOOP:2: B:42:0x02b5->B:44:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0210 A[Catch: InterruptedException -> 0x027c, all -> 0x0283, TryCatch #10 {InterruptedException -> 0x027c, all -> 0x0283, blocks: (B:22:0x01ff, B:24:0x0205, B:25:0x021a, B:51:0x0210), top: B:21:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.fgpu r26) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecky.l(fgpu):void");
    }

    public final boolean m() {
        return ((eckn) this.e.b()).b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ffbr, java.lang.Object] */
    @Override // defpackage.ecje
    public final void n() {
        ((eclf) ((emxn) this.k).a.b()).a(this);
        this.l.a(this);
        this.m.a(this);
        q(3, this.o);
        erqt.n(new erog() { // from class: eckv
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ecky eckyVar = ecky.this;
                return (!eckyVar.m() || eckyVar.c.getAndSet(true)) ? erre.a : eckyVar.p(6, (ecki) eckyVar.b.b(), ((eckn) eckyVar.e.b()).f);
            }
        }, this.i);
    }

    public final ListenableFuture o(int i, ecki eckiVar) {
        return p(i, eckiVar, eckiVar.d() / 100.0f);
    }

    public final ListenableFuture p(int i, ecki eckiVar, float f) {
        if (!eckiVar.c()) {
            return erre.a;
        }
        if (!this.n.a(f).a()) {
            return erre.a;
        }
        ecjc ecjcVar = this.j;
        eciu m = eciv.m();
        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
        fgqp fgqpVar = (fgqp) fgqt.a.createBuilder();
        float f2 = 1.0f / f;
        fgqpVar.copyOnWrite();
        fgqt fgqtVar = (fgqt) fgqpVar.instance;
        fgqtVar.b |= 2;
        fgqtVar.d = (int) f2;
        fgqpVar.copyOnWrite();
        fgqt fgqtVar2 = (fgqt) fgqpVar.instance;
        fgqtVar2.c = i - 1;
        fgqtVar2.b |= 1;
        fgqwVar.copyOnWrite();
        fgqx fgqxVar = (fgqx) fgqwVar.instance;
        fgqt fgqtVar3 = (fgqt) fgqpVar.build();
        fgqtVar3.getClass();
        fgqxVar.x = fgqtVar3;
        fgqxVar.b |= 16777216;
        m.f((fgqx) fgqwVar.build());
        return ecjcVar.b(m.a());
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ecgn
    public final /* synthetic */ void j(ecda ecdaVar) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
