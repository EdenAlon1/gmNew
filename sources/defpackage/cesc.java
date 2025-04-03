package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesc extends ceut {
    public final ffbr a;
    private final errl b;

    public cesc(errl errlVar, ffbr ffbrVar) {
        this.b = errlVar;
        this.a = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        poh pohVar = new poh();
        pohVar.b = true;
        pohVar.c = true;
        pohVar.d = true;
        ((ceti) l).a = pohVar.a();
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RunAnalyzeHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return elfo.g(new Callable() { // from class: cesb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((dtve) cesc.this.a.b()).y("ANALYZE");
                return ceyt.i();
            }
        }, this.b);
    }
}
