package defpackage;

import com.google.android.rcs.client.events.EventService;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coli implements ehxi, ckgc {
    public static final Duration a = Duration.ofHours(1);
    public final fazb b;
    private final fazb c;
    private final colj d;
    private final fazb e;
    private elfl f;
    private int g = 0;
    private final emyl h = emys.a(new emyl() { // from class: colg
        @Override // defpackage.emyl
        public final Object get() {
            Duration duration = coli.a;
            eofx d = eofx.d(Duration.ofSeconds(1L), 2.0d, 10);
            Duration duration2 = coli.a;
            return new eofu(d, duration2.isZero() ? new eofs(48) : new eofr(duration2));
        }
    });
    private final errm i;

    public coli(fazb fazbVar, colj coljVar, fazb fazbVar2, fazb fazbVar3, errm errmVar) {
        this.c = fazbVar;
        this.d = coljVar;
        this.e = fazbVar2;
        this.b = fazbVar3;
        this.i = errmVar;
    }

    private final long a(eofx eofxVar) {
        Duration a2 = eofxVar.a(this.g);
        elfl elflVar = this.f;
        if (elflVar == null || elflVar.isDone() || this.f.isCancelled()) {
            this.g++;
            this.f = elfl.g(this.i.schedule(new Runnable() { // from class: colh
                @Override // java.lang.Runnable
                public final void run() {
                    ((ckge) ((csjk) coli.this.b.b()).a()).o(ckgb.NO_HINT);
                }
            }, a2.toMillis(), TimeUnit.MILLISECONDS));
        }
        return a2.toMillis();
    }

    @Override // defpackage.ckgc
    public final void al(ckgd ckgdVar) {
        if (ckgdVar.b() == eqwf.AVAILABLE) {
            this.d.m();
        }
    }

    @Override // defpackage.ehxi
    public final void d(String str, ehxh ehxhVar) {
        ekzz f = eleg.f("RcsServiceListener#handleServiceConnectFailed");
        try {
            long a2 = a((eofx) this.h.get());
            csjy.f("BugleRcs", str + " RCS service failed to connect: " + String.valueOf(ehxhVar) + " [Will retry in " + a2 + "ms]");
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehxi
    public final void e(String str) {
        ekzz f = eleg.f("RcsServiceListener#handleServiceConnected");
        try {
            csjy.i("BugleRcs", a.v(str, " RCS service connected"));
            this.g = 0;
            if (this.d.b().isConnected() && this.d.d().isConnected() && this.d.c().isConnected() && this.d.e().isConnected()) {
                try {
                    f = eleg.f("subscribe");
                    try {
                        EventService b = this.d.b();
                        cnki cnkiVar = (cnki) this.c.b();
                        if (!b.isSubscribed(cnkiVar)) {
                            csjy.i("BugleRcs", "subscribing to global rcs listener");
                            b.subscribe(3, cnkiVar);
                            b.subscribe(5, cnkiVar);
                            b.subscribe(2, cnkiVar);
                        }
                        f.close();
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (ehxg e) {
                    csjy.p("BugleRcs", e, "exception subscribing to RCS events");
                }
                csjy.l("BugleRcs", "kicking off RCS sending/receiving");
                ((clws) this.e.b()).p();
            }
            f.close();
        } finally {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }

    @Override // defpackage.ehxi
    public final void f(String str) {
        ekzz f = eleg.f("RcsServiceListener::ServiceDisconnected");
        try {
            csjy.f("BugleRcs", str + " RCS service disconnected [Will reconnect in " + a((eofx) this.h.get()) + "ms]");
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
