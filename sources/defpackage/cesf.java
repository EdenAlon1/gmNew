package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesf extends ceut {
    public final ffbr a;
    private final errl b;

    public cesf(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateArchiveStatusHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cesh.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cesh ceshVar = (cesh) eyhsVar;
        return elfo.g(new Callable() { // from class: cese
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cbek cbekVar = (cbek) cesf.this.a.b();
                cesh ceshVar2 = ceshVar;
                cbekVar.b(bdgq.e(ceshVar2.c), byyt.values()[ceshVar2.d]);
                return ceyt.i();
            }
        }, this.b);
    }
}
