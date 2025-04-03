package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydl extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientChangeSyncHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final ffsk i;
    private final ffbr j;
    private final ffbr k;

    public aydl(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.i = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.h = ffbrVar9;
    }

    public static final boolean k(aydn aydnVar) {
        int i = aydnVar.d;
        return i > 0 && i == aydnVar.e;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.j;
        cetx l = cety.l();
        l.c((int) ((Number) ffbrVar.b()).longValue());
        l.f(poa.EXPONENTIAL);
        Object b = this.k.b();
        b.getClass();
        l.g(((Number) b).longValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ContactRecipientChangeSyncHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = aydn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        aydn aydnVar = (aydn) eyhsVar;
        aydnVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new aydk(aydnVar, this, ceuwVar, null));
        return c;
    }
}
