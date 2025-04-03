package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecpr extends ecpk implements ecgn {
    public final Context a;
    public final errm b;
    public final fazb c;
    public final Handler d;
    public final ecjc e;
    public final ecgt f;
    public final ecpw h;
    private final Executor k;
    private final ffbr l;
    public volatile boolean g = false;
    public final Object i = new Object();
    public volatile ecpv j = null;

    public ecpr(Context context, Executor executor, errm errmVar, fazb fazbVar, ecjd ecjdVar, ecpw ecpwVar, ecgt ecgtVar, ffbr ffbrVar, Handler handler) {
        this.a = context;
        this.b = errmVar;
        this.k = executor;
        this.c = fazbVar;
        this.l = ffbrVar;
        this.d = handler;
        this.f = ecgtVar;
        this.h = ecpwVar;
        this.e = ecjdVar.a(errmVar, fazbVar, ffbrVar);
    }

    public final void a() {
        if (!this.e.c(null)) {
            synchronized (this.i) {
                this.f.b(this);
            }
        } else if (((ecpj) this.c.b()).h().isEmpty()) {
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/stall/StallMetricServiceImpl", "readConfigsAndMaybeStart", 181, "StallMetricServiceImpl.java")).r("Stall thresholds list expected to have size > 0, was %s", ((ecpj) this.c.b()).h().size());
        } else {
            this.b.schedule(new Runnable() { // from class: ecpl
                @Override // java.lang.Runnable
                public final void run() {
                    ecpr ecprVar = ecpr.this;
                    ecpj ecpjVar = (ecpj) ecprVar.c.b();
                    ecpw ecpwVar = ecprVar.h;
                    dlpw dlpwVar = (dlpw) ecpwVar.a.b();
                    dlpwVar.getClass();
                    errm errmVar = (errm) ecpwVar.b.b();
                    errmVar.getClass();
                    ecfe ecfeVar = (ecfe) ecpwVar.c.b();
                    ecfeVar.getClass();
                    ecpjVar.getClass();
                    ecprVar.j = new ecpv(dlpwVar, errmVar, ecfeVar, ecpwVar.d, ecpjVar, ecprVar.e, ecprVar.d);
                    if (ecprVar.g) {
                        ecprVar.j.b();
                    }
                }
            }, ((ecpj) this.c.b()).e(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        this.g = false;
        if (this.j == null) {
            return;
        }
        erqt.l(new Runnable() { // from class: ecpq
            @Override // java.lang.Runnable
            public final void run() {
                ecpr ecprVar = ecpr.this;
                ecprVar.j.getClass();
                ecpv ecpvVar = ecprVar.j;
                if (!ecpvVar.i || ecpvVar.j.get() == null) {
                    return;
                }
                ecpvVar.i = false;
                ((Future) ecpvVar.j.get()).cancel(false);
            }
        }, this.b);
    }

    @Override // defpackage.ecgn
    public final void j(ecda ecdaVar) {
        this.g = true;
        if (this.j == null) {
            return;
        }
        erqt.l(new Runnable() { // from class: ecpp
            @Override // java.lang.Runnable
            public final void run() {
                ecpr ecprVar = ecpr.this;
                if (ecprVar.e.c(null)) {
                    ecprVar.j.getClass();
                    ecprVar.j.b();
                } else {
                    synchronized (ecprVar.i) {
                        ecprVar.f.b(ecprVar);
                    }
                }
            }
        }, this.b);
    }

    @Override // defpackage.ecpk, defpackage.ecje
    public final void n() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            fgpf fgpfVar = (fgpf) this.l.b();
            int a = fgpe.a(fgpfVar.d);
            if (a != 0 && a == 4 && fgpfVar.c == 0) {
                return;
            }
        }
        this.f.a(this);
        erqt.l(new Runnable() { // from class: ecpn
            @Override // java.lang.Runnable
            public final void run() {
                final ecpr ecprVar = ecpr.this;
                if (dubc.e(ecprVar.a)) {
                    ecprVar.a();
                } else {
                    dubc.b(ecprVar.a, new Runnable() { // from class: ecpm
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ecpr ecprVar2 = ecpr.this;
                            erqt.l(new Runnable() { // from class: ecpo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ecpr.this.a();
                                }
                            }, ecprVar2.b);
                        }
                    });
                }
            }
        }, this.k);
    }
}
