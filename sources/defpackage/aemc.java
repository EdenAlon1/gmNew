package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aemc implements ljv {
    private static final cskc e = cskc.g("Bugle", "HomeErrorStateLogger");
    private static final enru f = enru.c("com/google/android/apps/messaging/home/log/HomeErrorStateLogger");
    public Instant a;
    public boolean b;
    public final AtomicBoolean c;
    public final AtomicInteger d;
    private final cqoh g;
    private final ffbr h;
    private final eg i;
    private final ffbr j;
    private final aube k;
    private final AtomicInteger l;
    private final AtomicInteger m;
    private boolean n;

    public aemc(cqoh cqohVar, ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2, eg egVar, ffbr ffbrVar3, aube aubeVar) {
        cqohVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        egVar.getClass();
        ffbrVar3.getClass();
        aubeVar.getClass();
        this.g = cqohVar;
        this.h = ffbrVar2;
        this.i = egVar;
        this.j = ffbrVar3;
        this.k = aubeVar;
        this.c = new AtomicBoolean();
        this.l = new AtomicInteger(0);
        this.d = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        if (this.n || !this.b) {
            return;
        }
        this.n = true;
        if (this.m.get() != 2 && Duration.between(g(), this.g.f()).toMillis() > ((Number) adzy.a.e()).longValue()) {
            if (this.k.a()) {
                ensk h = f.h();
                h.Y(ente.a, "HomeErrorStateLogger");
                ((enrr) h.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "logToClearcutIfHomeScreenIsInErrorState", 88, "HomeErrorStateLogger.kt")).q("About to log HomeScreenBlankError to clearcut");
            } else {
                csjb c = e.c();
                c.I("About to log HomeScreenBlankError to clearcut");
                c.r();
            }
            eqrt eqrtVar = (eqrt) eqru.a.createBuilder();
            eqrtVar.getClass();
            eqrr eqrrVar = (eqrr) eqrs.a.createBuilder();
            eqrrVar.copyOnWrite();
            eqrs eqrsVar = (eqrs) eqrrVar.instance;
            eqrsVar.b |= 1;
            eqrsVar.c = false;
            eqrs eqrsVar2 = (eqrs) eqrrVar.build();
            eqrsVar2.getClass();
            eqrtVar.copyOnWrite();
            eqru eqruVar = (eqru) eqrtVar.instance;
            eqruVar.e = eqrsVar2;
            eqruVar.b |= 8;
            eppd eppdVar = (eppd) eppe.a.createBuilder();
            eppdVar.getClass();
            int a = eppc.a(this.d.get());
            if (a == 0) {
                throw null;
            }
            eppdVar.copyOnWrite();
            eppe eppeVar = (eppe) eppdVar.instance;
            eppeVar.d = a - 1;
            eppeVar.b |= 2;
            boolean a2 = ((adhk) this.h.b()).a(this.i);
            eppdVar.copyOnWrite();
            eppe eppeVar2 = (eppe) eppdVar.instance;
            eppeVar2.b |= 1;
            eppeVar2.c = a2;
            eyfy build = eppdVar.build();
            build.getClass();
            eqrtVar.copyOnWrite();
            eqru eqruVar2 = (eqru) eqrtVar.instance;
            eqruVar2.d = (eppe) build;
            eqruVar2.b |= 4;
            eppf eppfVar = (eppf) eppi.a.createBuilder();
            eppfVar.getClass();
            int a3 = epph.a(this.l.get());
            if (a3 == 0) {
                throw null;
            }
            eppfVar.copyOnWrite();
            eppi eppiVar = (eppi) eppfVar.instance;
            eppiVar.c = a3 - 1;
            eppiVar.b |= 1;
            eyfy build2 = eppfVar.build();
            build2.getClass();
            eqrtVar.copyOnWrite();
            eqru eqruVar3 = (eqru) eqrtVar.instance;
            eqruVar3.c = (eppi) build2;
            eqruVar3.b |= 2;
            eqrn eqrnVar = (eqrn) eqrq.a.createBuilder();
            eqrnVar.getClass();
            int a4 = eqrp.a(this.m.get());
            if (a4 == 0) {
                throw null;
            }
            eqrnVar.copyOnWrite();
            eqrq eqrqVar = (eqrq) eqrnVar.instance;
            eqrqVar.c = a4 - 1;
            eqrqVar.b |= 1;
            eyfy build3 = eqrnVar.build();
            build3.getClass();
            eqrtVar.copyOnWrite();
            eqru eqruVar4 = (eqru) eqrtVar.instance;
            eqruVar4.f = (eqrq) build3;
            eqruVar4.b |= 16;
            eyfy build4 = eqrtVar.build();
            build4.getClass();
            akxl akxlVar = (akxl) this.j.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.HOME_SCREEN_METRICS_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eqrx eqrxVar = (eqrx) eqry.a.createBuilder();
            eqrxVar.copyOnWrite();
            eqry eqryVar = (eqry) eqrxVar.instance;
            eqryVar.c = (eqru) build4;
            eqryVar.b = 1;
            eqry eqryVar2 = (eqry) eqrxVar.build();
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eqryVar2.getClass();
            eolvVar2.bz = eqryVar2;
            eolvVar2.g |= 2;
            akxlVar.k(eoluVar, epyw.HOME_SCREEN_METRICS_EVENT);
        } else if (this.k.a()) {
            ensk h2 = f.h();
            h2.Y(ente.a, "HomeErrorStateLogger");
            ((enrr) h2.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "logToClearcutIfHomeScreenIsInErrorState", 81, "HomeErrorStateLogger.kt")).q("Skipping logging to clearcut since conditions are not met.");
        } else {
            csjb c2 = e.c();
            c2.I("Skipping logging to clearcut since conditions are not met.");
            c2.r();
        }
        if (this.c.get()) {
            if (!this.k.a()) {
                e.m("Home screen and conversation list show after launch");
                return;
            }
            ensk e2 = f.e();
            e2.Y(ente.a, "HomeErrorStateLogger");
            ((enrr) e2.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "onStop", 169, "HomeErrorStateLogger.kt")).q("Home screen and conversation list show after launch");
            return;
        }
        long seconds = Duration.between(g(), this.g.f()).getSeconds();
        if (!this.k.a()) {
            e.p(a.y(seconds, "Home screen is blank for ", " seconds until user leave the app"));
            return;
        }
        ensk h3 = f.h();
        h3.Y(ente.a, "HomeErrorStateLogger");
        ((enrr) h3.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "onStop", 163, "HomeErrorStateLogger.kt")).s("Home screen is blank for %d seconds until user leave the app", seconds);
    }

    public final Instant g() {
        Instant instant = this.a;
        if (instant != null) {
            return instant;
        }
        ffkj.c("startTime");
        return null;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        if (this.a == null) {
            Instant f2 = this.g.f();
            f2.getClass();
            this.a = f2;
        }
    }

    public final void h(int i) {
        this.m.set(i - 1);
    }

    public final void i(int i) {
        this.l.set(i - 1);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
