package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayaf extends ceut {
    public static final entd a = entd.c("BugleContacts");
    public final comc b;
    public final aybz c;
    public final cqoh d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffsk j;

    public ayaf(ffsk ffskVar, comc comcVar, aybz aybzVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        comcVar.getClass();
        aybzVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.j = ffskVar;
        this.b = comcVar;
        this.c = aybzVar;
        this.d = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
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
        return eleg.f("IncrementalContactsImportHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = eyex.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ((eyex) eyhsVar).getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new ayae(this, ceuwVar, null));
        return c;
    }

    public final void k() {
        ((ecrj) this.f.b()).g(axup.g, null, null, ecrh.ERROR);
        if (((Boolean) this.i.b()).booleanValue()) {
            return;
        }
        ((azei) this.h.b()).d(new Consumer() { // from class: ayaa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                axzy axzyVar = (axzy) obj;
                entd entdVar = ayaf.a;
                axzyVar.getClass();
                axzyVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
