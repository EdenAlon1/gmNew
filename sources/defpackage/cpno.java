package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpno extends ceut {
    public static final entd a = entd.c("BugleTachygram");
    private final cpnb b;
    private final ffbr c;

    public cpno(cpnb cpnbVar, ffbr ffbrVar) {
        this.b = cpnbVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx a2 = cpoq.a();
        ((ceti) a2).b = ((cins) this.c.b()).b();
        return a2.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("TachygramRevokeMessageWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awyr.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return this.b.c(ceuwVar, (awyr) eyhsVar);
    }
}
