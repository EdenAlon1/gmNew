package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzn extends ceut {
    public static final entd a = entd.c("BugleContacts");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffsk g;
    private final ffbr h;

    public axzn(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        this.g = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.h = ffbrVar6;
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
        return eleg.f("BatchDeletedContactsSyncHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = axzp.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        axzp axzpVar = (axzp) eyhsVar;
        axzpVar.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new axzm(axzpVar, this, ceuwVar, null));
        return c;
    }

    public final void k(axzp axzpVar) {
        ((ecrj) this.f.b()).g(axup.g, null, null, ecrh.ERROR);
        ((ecrj) this.f.b()).g(axup.h, null, null, ecrh.ERROR);
        if (axzpVar.c == axzpVar.d) {
            ((azei) this.h.b()).d(new Consumer() { // from class: axzl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    axzy axzyVar = (axzy) obj;
                    entd entdVar = axzn.a;
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
