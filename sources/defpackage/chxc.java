package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxc implements ciin {
    public final azsu a;
    public String b;
    private final ffsk c;
    private final fgsz d;
    private final ciil e;
    private long f;

    public chxc(ffsk ffskVar, fgsz fgszVar, azsu azsuVar, ciil ciilVar) {
        ffskVar.getClass();
        fgszVar.getClass();
        azsuVar.getClass();
        this.c = ffskVar;
        this.d = fgszVar;
        this.a = azsuVar;
        this.e = ciilVar;
        this.b = "";
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture c(fcfo fcfoVar) {
        fcfoVar.getClass();
        this.b = fcfoVar.c;
        fclp fclpVar = (fclp) fclq.a.createBuilder();
        fclpVar.getClass();
        fbqf a = fbqe.a((fcfn) fcfoVar.toBuilder());
        a.b(this.d);
        fcfo a2 = a.a();
        fclpVar.copyOnWrite();
        fclq fclqVar = (fclq) fclpVar.instance;
        fclqVar.c = a2;
        fclqVar.b |= 1;
        eyfy build = fclpVar.build();
        build.getClass();
        elfl e = elfo.e((fclq) build);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        elfl c;
        fclq fclqVar = (fclq) eyhsVar;
        chrvVar.getClass();
        fclqVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new chxb(chrvVar, this, fclqVar, null));
        return c;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        fcls fclsVar = (fcls) eyhsVar;
        fclsVar.getClass();
        fcfq fcfqVar = fclsVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.f = fcfqVar.b;
        elfl e = elfo.e(fclsVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "NetworkTransitionRpcHandlerImpl";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
