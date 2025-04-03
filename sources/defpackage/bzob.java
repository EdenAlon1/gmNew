package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzob extends ceut implements bznw {
    public static final cskc a = cskc.g("BugleJobs", "ConnectToTachyonWorker");
    static final cfup b = cfvl.i(cfvl.b, "tachyon_autoconnect_on_metered_network", false);
    public final fazb c;
    private final fazb d;
    private final errl e;
    private final errl f;

    public bzob(fazb fazbVar, fazb fazbVar2, errl errlVar, errl errlVar2) {
        this.c = fazbVar;
        this.d = fazbVar2;
        this.e = errlVar;
        this.f = errlVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        int i = true != ((Boolean) b.e()).booleanValue() ? 3 : 2;
        cetx l = cety.l();
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(i);
        ((ceti) l).a = pohVar.a();
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ConnectToTachyonWorkerImpl");
    }

    @Override // defpackage.bznw
    public final void c() {
        a.m("Scheduling ConnectToTachyonWorker.");
        ((cevh) ((bznv) this.c.b()).a.b()).g(ceyr.g("connect_to_tachyon_anonymously", cetw.a));
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final void g() {
        a.m("Canceling previously scheduled ConnectToTachyonWorker.");
        elfo.g(new Callable() { // from class: bznx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((cevh) ((bznv) bzob.this.c.b()).a.b()).f("connect_to_tachyon_anonymously");
                return true;
            }
        }, this.f).k(axou.a(new bzoa()), this.e);
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        a.m("Attempting to auto-connect to Tachyon for anonymous device ID...");
        return ((cilk) this.d.b()).d().h(new emwl() { // from class: bzny
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = bzob.a;
                return ceyt.i();
            }
        }, this.e).e(fedn.class, new emwl() { // from class: bznz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzob.a.s("Failed to start anonymous bind handler", (fedn) obj);
                return ceyt.k();
            }
        }, erpp.a);
    }
}
