package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkhb extends TimerTask {
    final /* synthetic */ dkha a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dkhc c;

    public dkhb(dkhc dkhcVar, dkha dkhaVar, boolean z) {
        this.a = dkhaVar;
        this.b = z;
        this.c = dkhcVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.a == dkho.RUNNING) {
            if (this.b) {
                dkhp dkhpVar = this.a.v;
                try {
                    eehr eehrVar = dkhpVar.a.l;
                    eehrVar.a();
                    eehy eehyVar = ((eehz) dkhpVar.c).a;
                    dkur dkurVar = dkhpVar.d;
                    djjr djjrVar = dkhpVar.b;
                    eenk r = dkurVar.r(eehyVar, eehrVar);
                    dkha dkhaVar = dkhpVar.a;
                    dkha a = dkhaVar.i.c.a(dkhaVar.y(), dkhpVar.a);
                    dkut.u(r, a != null ? a.x() : null, dkhpVar.a.al());
                    eeif l = eehyVar.l(r);
                    dkty.c("Created: %s", dkty.a(l.c));
                    if (l.h(10) != 2) {
                        if (l.g()) {
                            eenl b = l.b();
                            if (b == null) {
                                throw new eejg("SIP response is null");
                            }
                            eehrVar.q = b;
                            dkur dkurVar2 = dkhpVar.d;
                            djjr djjrVar2 = dkhpVar.b;
                            eehyVar.s(dkurVar2.q(eehyVar, eehrVar));
                            if (b.y() == 200) {
                                dkhpVar.b(eehrVar, b);
                            } else {
                                b.y();
                            }
                        } else {
                            dkty.g("Refreshing session failed - time out", new Object[0]);
                            dkhpVar.a.o(new dkqr(408, "Timeout"), 1, 1);
                        }
                    }
                } catch (Exception e) {
                    String format = String.format("Error while refreshing session: %s", e.getMessage());
                    dkty.i(e, "%s", format);
                    dkhpVar.a.o(new dkqr(0, format), 1, 1);
                }
            } else {
                dkha dkhaVar2 = this.a;
                long currentTimeMillis = System.currentTimeMillis();
                dkhp dkhpVar2 = dkhaVar2.v;
                if (currentTimeMillis - dkhpVar2.f > dkhpVar2.e * 1000) {
                    dkty.c("Session inactivity detected - terminating", new Object[0]);
                    dkhpVar2.a.n(1, 1);
                }
            }
        }
        this.c.d.remove(this.a);
    }
}
