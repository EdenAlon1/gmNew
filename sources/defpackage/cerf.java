package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerf extends ceut {
    public static final cskc a = cskc.g("BugleDataModel", "LowStorageHandler");
    public final coxb b;
    private final errl c;

    public cerf(coxb coxbVar, errl errlVar) {
        this.b = coxbVar;
        this.c = errlVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WAKELOCK);
        poh pohVar = new poh();
        pohVar.c = false;
        pohVar.d = false;
        ((ceti) l).a = pohVar.a();
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("LowStorageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cerj.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cerj cerjVar = (cerj) eyhsVar;
        return elfo.g(new Callable() { // from class: cere
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cerf.a.m("Receiving clean up messages for low storage");
                cerj cerjVar2 = cerjVar;
                int a2 = cerh.a(cerjVar2.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                cerf.this.b.c(a2 - 1, cerjVar2.d);
                return ceyt.i();
            }
        }, this.c);
    }
}
