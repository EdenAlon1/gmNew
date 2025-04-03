package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpob extends ceut {
    public static final entd a = entd.c("BugleTachygram");
    public final cpnb b;
    private final ffbr c;

    public cpob(cpnb cpnbVar, ffbr ffbrVar) {
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
        return eleg.f("TachygramSendMessageWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awyz.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return this.b.c(ceuwVar, (awyz) eyhsVar);
    }
}
