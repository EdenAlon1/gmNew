package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydq extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffsk g;
    private final ffbr h;
    private final ffbr i;

    public aydq(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar7.getClass();
        this.g = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.h;
        cetx l = cety.l();
        l.c((int) ((Number) ffbrVar.b()).longValue());
        l.f(poa.EXPONENTIAL);
        Object b = this.i.b();
        b.getClass();
        l.g(((Number) b).longValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ContactRecipientDeletedSyncHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ayds.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ayds aydsVar = (ayds) eyhsVar;
        aydsVar.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new aydp(this, ceuwVar, aydsVar, null));
        return c;
    }
}
