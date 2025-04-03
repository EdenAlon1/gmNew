package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajco extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/penpal/conversation/autogenerate/PenpalConversationAutoGenerateHandler");
    public final ffbr b;
    public final ffbr c;
    public final Optional d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final ffsk k;

    public ajco(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, Optional optional, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.k = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = optional;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffbrVar8;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PenpalConversationAutoGenerateHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ajcq.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ((ajcq) eyhsVar).getClass();
        c = axol.c(this.k, ffhe.a, ffsm.a, new ajcn(this, null));
        return c;
    }
}
