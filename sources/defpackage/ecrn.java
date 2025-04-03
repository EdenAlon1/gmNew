package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecrn extends ecrj implements ecje, ecre {
    static final enip a = enip.v("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int g = 0;
    public final ecjc b;
    final ConcurrentHashMap c = new ConcurrentHashMap();
    public final fazb d;
    public final fazb e;
    public final emyl f;
    private final Executor h;

    public ecrn(ecjd ecjdVar, Executor executor, final fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, final ecst ecstVar) {
        this.b = ecjdVar.a(erpp.a, fazbVar, ffbrVar);
        this.h = executor;
        this.d = fazbVar;
        this.e = fazbVar2;
        this.f = emys.a(new emyl() { // from class: ecrm
            @Override // defpackage.emyl
            public final Object get() {
                int i = ecrn.g;
                return ecst.this.a(((ecrg) fazbVar.b()).d());
            }
        });
    }

    private final ListenableFuture i(final String str, final long j, final ecri ecriVar, final fgmh fgmhVar) {
        return erqt.n(new erog() { // from class: ecrl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ecrn ecrnVar = ecrn.this;
                if (!((ecss) ecrnVar.f.get()).a()) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 435, "TimerMetricServiceImpl.java")).q("TimerMetric not recorded, metric was rejected by sampling configuration.");
                    return erre.a;
                }
                ecri ecriVar2 = ecriVar;
                long j2 = j;
                ((ecrg) ecrnVar.d.b()).e();
                ecjc ecjcVar = ecrnVar.b;
                eciu m = eciv.m();
                int i = 1;
                m.c(true);
                ecim ecimVar = (ecim) m;
                ecimVar.d = Long.valueOf(j2);
                emxc emxcVar = (emxc) ecrnVar.e.b();
                fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                boolean booleanValue = ((Boolean) emxcVar.b(new emwl() { // from class: ecrk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((ecip) obj).b();
                        return false;
                    }
                }).e(false)).booleanValue();
                fgqy fgqyVar = (fgqy) fgqz.a.createBuilder();
                long b = booleanValue ? ecriVar2.b() : ecriVar2.a();
                fgqyVar.copyOnWrite();
                fgqz fgqzVar = (fgqz) fgqyVar.instance;
                fgqzVar.b |= 1;
                fgqzVar.c = b;
                int ordinal = ecriVar2.c.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 2;
                    } else if (ordinal == 2) {
                        i = 3;
                    } else if (ordinal == 3) {
                        i = 4;
                    }
                }
                fgmh fgmhVar2 = fgmhVar;
                String str2 = str;
                fgqyVar.copyOnWrite();
                fgqz fgqzVar2 = (fgqz) fgqyVar.instance;
                fgqzVar2.d = i - 1;
                fgqzVar2.b = 2 | fgqzVar2.b;
                fgqz fgqzVar3 = (fgqz) fgqyVar.build();
                fgqwVar.copyOnWrite();
                fgqx fgqxVar = (fgqx) fgqwVar.instance;
                fgqzVar3.getClass();
                fgqxVar.g = fgqzVar3;
                fgqxVar.b |= 16;
                m.f((fgqx) fgqwVar.build());
                ecimVar.a = str2;
                ecimVar.b = fgmhVar2;
                return ecjcVar.b(m.a());
            }
        }, this.h);
    }

    private final synchronized ListenableFuture j(ecri ecriVar, String str, fgmh fgmhVar, ecrh ecrhVar) {
        Throwable th;
        ListenableFuture h;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (ecri.e(ecriVar)) {
                    return erre.a;
                }
                long a2 = this.b.a(str);
                if (a2 == -1) {
                    return erre.a;
                }
                ecriVar.c();
                ecriVar.d(ecrhVar);
                if (!ecri.e(ecriVar) && !emxe.c(str)) {
                    h = a.contains(str) ? erqt.h(new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str))) : i(str, a2, ecriVar, fgmhVar);
                    return h;
                }
                h = erqt.h(new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
                return h;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private final synchronized ListenableFuture k(String str, String str2, fgmh fgmhVar, ecrh ecrhVar) {
        Throwable th;
        try {
            try {
                ecri ecriVar = (ecri) this.c.remove(str);
                if (ecri.e(ecriVar)) {
                    try {
                        ((enrr) ((enrr) ecdj.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 308, "TimerMetricServiceImpl.java")).t("Can't stop global event '%s' that was never started or has already been stopped", str);
                        return erre.a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                long a2 = this.b.a(str);
                if (a2 == -1) {
                    return erre.a;
                }
                ecriVar.c();
                ecriVar.d(ecrhVar);
                ((enrr) ((enrr) ecdj.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 323, "TimerMetricServiceImpl.java")).J("Stopped global timer for event name %s. realtime: %d ms, uptime: %d ms", str, Long.valueOf(ecriVar.a()), Long.valueOf(ecriVar.b()));
                return i(true == emxe.c(str2) ? str : str2, a2, ecriVar, fgmhVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.ecre
    public final ListenableFuture a(ecda ecdaVar, long j, long j2, fgmh fgmhVar) {
        return h(ecdaVar.a, new ecri(j, j2, ecrh.UNKNOWN), fgmhVar);
    }

    @Override // defpackage.ecre
    public final ListenableFuture b(ecda ecdaVar, long j, long j2, ecrh ecrhVar) {
        return h(ecdaVar.a, new ecri(j, j2, ecrhVar), null);
    }

    @Override // defpackage.ecrj
    public final ecri c(ecda ecdaVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = ecdaVar.a;
        ecri ecriVar = (ecri) concurrentHashMap.remove(str);
        if (ecri.e(ecriVar)) {
            ((enrr) ((enrr) ecdj.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 388, "TimerMetricServiceImpl.java")).t("Can't cancel global event '%s' that was never started or has already been stopped", str);
            return ecri.a;
        }
        ((enrr) ((enrr) ecdj.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 393, "TimerMetricServiceImpl.java")).t("Cancelled global timer for event name %s", str);
        return ecriVar;
    }

    @Override // defpackage.ecrj
    public final ecri d() {
        return !this.b.d() ? ecri.a : new ecri();
    }

    @Override // defpackage.ecrj
    public final ecri e(ecda ecdaVar) {
        enip enipVar = a;
        String str = ecdaVar.a;
        if (enipVar.contains(str)) {
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "startGlobal", 133, "TimerMetricServiceImpl.java")).t("%s is reserved event. Dropping timer.", str);
            return ecri.a;
        }
        if (!this.b.d()) {
            return ecri.a;
        }
        ecri ecriVar = new ecri();
        this.c.put(str, ecriVar);
        return ecriVar;
    }

    @Override // defpackage.ecrj
    public final ListenableFuture f(ecri ecriVar, ecda ecdaVar, fgmh fgmhVar, ecrh ecrhVar) {
        return j(ecriVar, ecdaVar.a, fgmhVar, ecrhVar);
    }

    @Override // defpackage.ecrj
    public final ListenableFuture g(ecda ecdaVar, ecda ecdaVar2, fgmh fgmhVar, ecrh ecrhVar) {
        return k(ecdaVar.a, ecda.d(ecdaVar2), fgmhVar, ecrhVar);
    }

    final ListenableFuture h(String str, ecri ecriVar, fgmh fgmhVar) {
        long a2 = this.b.a(str);
        return a2 == -1 ? erre.a : i(str, a2, ecriVar, fgmhVar);
    }

    @Override // defpackage.ecje
    public final /* synthetic */ void n() {
    }
}
