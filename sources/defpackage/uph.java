package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uph implements ljv {
    private final ffbr c;
    private final ffbr d;
    private final eg f;
    private final cqoh g;
    private Instant h;
    private final cskc b = cskc.g("Bugle", "ConversationScreenErrorStateLogger");
    public final AtomicInteger a = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);

    public uph(eg egVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar) {
        this.f = egVar;
        this.d = ffbrVar;
        this.c = ffbrVar2;
        this.g = cqohVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.b.m("onDestroy called:");
        if (Duration.between(this.h, this.g.f()).compareTo(Duration.ofMillis(((Long) adzy.a.e()).longValue())) <= 0 || this.e.get() == 3) {
            return;
        }
        eqnp eqnpVar = (eqnp) eqnq.a.createBuilder();
        eppd eppdVar = (eppd) eppe.a.createBuilder();
        int a = eppc.a(this.a.get());
        if (a == 0) {
            throw null;
        }
        eppdVar.copyOnWrite();
        eppe eppeVar = (eppe) eppdVar.instance;
        eppeVar.d = a - 1;
        eppeVar.b |= 2;
        boolean a2 = ((adhk) this.d.b()).a(this.f);
        eppdVar.copyOnWrite();
        eppe eppeVar2 = (eppe) eppdVar.instance;
        eppeVar2.b |= 1;
        eppeVar2.c = a2;
        eqnpVar.copyOnWrite();
        eqnq eqnqVar = (eqnq) eqnpVar.instance;
        eppe eppeVar3 = (eppe) eppdVar.build();
        eppeVar3.getClass();
        eqnqVar.d = eppeVar3;
        eqnqVar.b |= 2;
        eppf eppfVar = (eppf) eppi.a.createBuilder();
        int a3 = epph.a(this.e.get());
        if (a3 == 0) {
            throw null;
        }
        eppfVar.copyOnWrite();
        eppi eppiVar = (eppi) eppfVar.instance;
        eppiVar.c = a3 - 1;
        eppiVar.b |= 1;
        eqnpVar.copyOnWrite();
        eqnq eqnqVar2 = (eqnq) eqnpVar.instance;
        eppi eppiVar2 = (eppi) eppfVar.build();
        eppiVar2.getClass();
        eqnqVar2.c = eppiVar2;
        eqnqVar2.b |= 1;
        akxl akxlVar = (akxl) this.c.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.CONVERSATION_SCREEN_METRIC_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqnr eqnrVar = (eqnr) eqns.a.createBuilder();
        eqnrVar.copyOnWrite();
        eqns eqnsVar = (eqns) eqnrVar.instance;
        eqnq eqnqVar3 = (eqnq) eqnpVar.build();
        eqnqVar3.getClass();
        eqnsVar.c = eqnqVar3;
        eqnsVar.b = 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqns eqnsVar2 = (eqns) eqnrVar.build();
        eqnsVar2.getClass();
        eolvVar2.bC = eqnsVar2;
        eolvVar2.g |= 32;
        akxlVar.k(eoluVar, epyw.CONVERSATION_SCREEN_METRIC_EVENT);
    }

    public final void g(int i) {
        this.e.set(i - 1);
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        this.b.m("onCreate called:");
        this.h = this.g.f();
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
