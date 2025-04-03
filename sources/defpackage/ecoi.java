package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecoi extends ecnx implements ecje, ecno {
    public final Context a;
    public final errm b;
    public final dlpw c;
    public final fazb d;
    public final ecjc e;
    public final ecoo f;
    final AtomicReference g = new AtomicReference(ecnp.a);
    final ConcurrentHashMap h = new ConcurrentHashMap();
    private final ecdn i;
    private final boolean j;
    private volatile ListenableFuture k;
    private final ecnw l;

    public ecoi(ecjd ecjdVar, dlpw dlpwVar, Context context, ecnw ecnwVar, errm errmVar, fazb fazbVar, ecoo ecooVar, ecdn ecdnVar, ffbr ffbrVar, Executor executor) {
        this.l = ecnwVar;
        this.i = ecdnVar;
        this.e = ecjdVar.a(executor, fazbVar, ffbrVar);
        this.a = context;
        this.b = errmVar;
        this.c = dlpwVar;
        this.d = fazbVar;
        this.f = ecooVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.j = bool.booleanValue();
    }

    public static final boolean h(int i) {
        return i != 1;
    }

    @Override // defpackage.ecno
    public final void a(ecda ecdaVar) {
        ConcurrentHashMap concurrentHashMap = this.h;
        String str = ecdaVar.a;
        ListenableFuture listenableFuture = (ListenableFuture) concurrentHashMap.remove(str);
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "cancelDiffMeasurement", 332, "MemoryMetricServiceImpl.java")).t("Canceled memory diff measurement for custom event %s", str);
        }
    }

    @Override // defpackage.ecno
    public final void b(ecda ecdaVar) {
        final String str = ecdaVar.a;
        erqt.n(new erog() { // from class: ecob
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ecoi ecoiVar = ecoi.this;
                if (!ecoiVar.e.d()) {
                    return erre.a;
                }
                String str2 = str;
                if (ecoiVar.h.size() >= 10) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 290, "MemoryMetricServiceImpl.java")).t("Max snapshots reached, memory diff measurement for custom event %s not started", str2);
                    return erqt.g();
                }
                ListenableFuture f = ecoiVar.f();
                ListenableFuture listenableFuture = (ListenableFuture) ecoiVar.h.put(str2, f);
                if (listenableFuture == null || f == listenableFuture) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 303, "MemoryMetricServiceImpl.java")).t("Starting memory diff measurement for custom event %s", str2);
                } else {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 299, "MemoryMetricServiceImpl.java")).t("Replaced memory diff measurement for custom event %s", str2);
                    listenableFuture.cancel(true);
                }
                return erny.f(f, new emwn(null), erpp.a);
            }
        }, this.b);
    }

    @Override // defpackage.ecno
    public final void c(final ecda ecdaVar) {
        ConcurrentHashMap concurrentHashMap = this.h;
        String str = ecdaVar.a;
        final ListenableFuture listenableFuture = (ListenableFuture) concurrentHashMap.remove(str);
        if (listenableFuture == null) {
            erqt.h(new IllegalStateException("Could not find the start memory diff measurement for custom event: ".concat(String.valueOf(str))));
        } else {
            final ListenableFuture f = f();
            erqt.d(listenableFuture, f).b(new erog() { // from class: ecoc
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:143:0x0387  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x038a  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 1030
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ecoc.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.b).b(new Runnable() { // from class: ecod
                @Override // java.lang.Runnable
                public final void run() {
                    ecoi.this.h.remove(ecdaVar.a);
                }
            }, erpp.a);
        }
    }

    @Override // defpackage.ecnx
    public final void d() {
        ecnv ecnvVar = new ecnv() { // from class: ecoe
            @Override // defpackage.ecnv
            public final void a(int i, String str) {
                ecoi.this.i(null, i, str, null);
            }
        };
        final ecnw ecnwVar = this.l;
        ecnwVar.d = ecnvVar;
        if (ecnwVar.c.getAndSet(true)) {
            return;
        }
        erqt.n(new erog() { // from class: ecnr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ((ecnn) ecnw.this.a.b()).j();
                return erre.a;
            }
        }, ecnwVar.b);
    }

    @Override // defpackage.ecnx
    public final void e(ecda ecdaVar, fgmh fgmhVar) {
        i(ecdaVar.a, 1, null, fgmhVar);
    }

    final ListenableFuture f() {
        synchronized (this.g) {
            if (this.k != null) {
                return this.k;
            }
            ecnp ecnpVar = (ecnp) this.g.get();
            if (ecnpVar != ecnp.a && this.c.a() - ecnpVar.b <= 1000) {
                return erqt.i(ecnpVar);
            }
            if (this.g.get() != ecnpVar) {
                return erqt.i((ecnp) this.g.get());
            }
            ListenableFuture g = this.i.a ? erqt.g() : erqt.n(new erog() { // from class: ecnz
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ecoi ecoiVar = ecoi.this;
                    if (!ecoiVar.e.d()) {
                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "scheduleSnapshot", 160, "MemoryMetricServiceImpl.java")).q("Memory service not enabled, snapshot cancelled");
                        return erqt.g();
                    }
                    ecoo ecooVar = ecoiVar.f;
                    dlpw dlpwVar = ecoiVar.c;
                    fgmq c = ecooVar.c(1, null);
                    long a = dlpwVar.a();
                    emxf.a(a > 0);
                    c.getClass();
                    return erqt.i(new ecnp(a, c));
                }
            }, this.b);
            this.k = g;
            erqt.r(this.k, new ecoh(this), erpp.a);
            return g;
        }
    }

    public final void i(final String str, final int i, final String str2, final fgmh fgmhVar) {
        if (this.i.a) {
            erqt.g();
        } else {
            erqt.n(new erog() { // from class: ecny
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final ecoi ecoiVar = ecoi.this;
                    final ecnn ecnnVar = (ecnn) ecoiVar.d.b();
                    final int i2 = i;
                    boolean h = ecoi.h(i2);
                    final String str3 = str;
                    long a = h ? true != ecnnVar.c() ? -1L : 1000L : ecoiVar.e.a(str3);
                    if (a == -1) {
                        return erre.a;
                    }
                    if (ecnnVar.f()) {
                        System.gc();
                        System.runFinalization();
                        System.gc();
                    }
                    fgmh fgmhVar2 = fgmhVar;
                    ListenableFuture i3 = erqt.i(fgmhVar2);
                    if (fgmhVar2 == null) {
                        ecnnVar.d();
                    }
                    final long j = a;
                    final String str4 = str2;
                    return erny.g(ernq.f(erqc.o(i3), RuntimeException.class, new emwl() { // from class: ecof
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g((RuntimeException) obj)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 419, "MemoryMetricServiceImpl.java")).q("Metric extension provider failed.");
                            return null;
                        }
                    }, ecoiVar.b), new eroh() { // from class: ecog
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            int i4 = i2;
                            String str5 = str4;
                            long j2 = j;
                            String str6 = str3;
                            ecoi ecoiVar2 = ecoi.this;
                            fgmh fgmhVar3 = (fgmh) obj;
                            if (!ecnnVar.g()) {
                                fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                                fgmq c = ecoiVar2.f.c(i4, str5);
                                fgqwVar.copyOnWrite();
                                fgqx fgqxVar = (fgqx) fgqwVar.instance;
                                c.getClass();
                                fgqxVar.f = c;
                                fgqxVar.b |= 8;
                                fgqx fgqxVar2 = (fgqx) fgqwVar.build();
                                eciu m = eciv.m();
                                ecim ecimVar = (ecim) m;
                                ecimVar.a = str6;
                                m.c(true);
                                ecimVar.d = Long.valueOf(j2);
                                m.f(fgqxVar2);
                                ecimVar.b = fgmhVar3;
                                if (ecoi.h(i4)) {
                                    m.d(true);
                                }
                                return ecoiVar2.e.b(m.a());
                            }
                            final echk a2 = echh.a(ecoiVar2.a, "recordMemoryPerProcess");
                            if (!((eche) a2).a) {
                                return erre.a;
                            }
                            ArrayList arrayList = new ArrayList(a2.c().size());
                            ecoiVar2.a.getPackageName();
                            engw c2 = a2.c();
                            int size = c2.size();
                            int i5 = 0;
                            while (i5 < size) {
                                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) c2.get(i5);
                                fgqw fgqwVar2 = (fgqw) fgqx.a.createBuilder();
                                int i6 = size;
                                int i7 = i5;
                                fgmq b = ecoiVar2.f.b(i4, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str5, new emyl() { // from class: ecoa
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return echk.this;
                                    }
                                });
                                fgqwVar2.copyOnWrite();
                                fgqx fgqxVar3 = (fgqx) fgqwVar2.instance;
                                b.getClass();
                                fgqxVar3.f = b;
                                fgqxVar3.b |= 8;
                                fgqx fgqxVar4 = (fgqx) fgqwVar2.build();
                                eciu m2 = eciv.m();
                                ecim ecimVar2 = (ecim) m2;
                                ecimVar2.a = str6;
                                m2.c(true);
                                ecimVar2.d = Long.valueOf(j2);
                                m2.f(fgqxVar4);
                                ecimVar2.b = fgmhVar3;
                                if (ecoi.h(i4)) {
                                    m2.d(true);
                                }
                                arrayList.add(ecoiVar2.e.b(m2.a()));
                                i5 = i7 + 1;
                                size = i6;
                            }
                            return erqt.c(arrayList).a(new eroi(null), erpp.a);
                        }
                    }, ecoiVar.b);
                }
            }, this.b);
        }
    }

    @Override // defpackage.ecje
    public final void n() {
        if (this.j) {
            d();
        }
    }
}
