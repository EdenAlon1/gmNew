package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzh extends ceut {
    public static final entd a = entd.c("BugleContacts");
    public final axwk b;
    public final axwf c;
    public final ayag d;
    public final ffbr e;
    public final aydo f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final cbwj k;
    private final ffsk l;

    public axzh(ffsk ffskVar, cbwj cbwjVar, axwk axwkVar, axwf axwfVar, ayag ayagVar, ffbr ffbrVar, aydo aydoVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        cbwjVar.getClass();
        axwkVar.getClass();
        axwfVar.getClass();
        ffbrVar.getClass();
        aydoVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.l = ffskVar;
        this.k = cbwjVar;
        this.b = axwkVar;
        this.c = axwfVar;
        this.d = ayagVar;
        this.e = ffbrVar;
        this.f = aydoVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        Object e = axum.f.e();
        e.getClass();
        l.c(((Number) e).intValue());
        l.f(poa.EXPONENTIAL);
        Object e2 = axum.g.e();
        e2.getClass();
        l.g(((Number) e2).longValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("BatchContactsImportHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = axzj.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        axzj axzjVar = (axzj) eyhsVar;
        axzjVar.getClass();
        c = axol.c(this.l, ffhe.a, ffsm.a, new axzg(axzjVar, this, ceuwVar, null));
        return c;
    }

    public final void k(axzj axzjVar) {
        ((alrv) this.g.b()).g(axup.g, ecrh.ERROR);
        ((alrv) this.g.b()).g(axup.h, ecrh.ERROR);
        if (axzjVar.c == axzjVar.d) {
            ((azei) this.j.b()).d(new Consumer() { // from class: axzd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    axzy axzyVar = (axzy) obj;
                    entd entdVar = axzh.a;
                    axzyVar.getClass();
                    axzyVar.b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
