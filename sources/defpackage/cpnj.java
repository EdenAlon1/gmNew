package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpnj extends ceut {
    private final cpnb a;
    private final ffbr b;

    public cpnj(cpnb cpnbVar, ffbr ffbrVar) {
        this.a = cpnbVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx a = cpoq.a();
        ((ceti) a).b = ((cins) this.b.b()).b();
        return a.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("TachygramRemoveUserFromGroupWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awyl.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "tachygram_group_handler_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return this.a.c(ceuwVar, (awyl) eyhsVar);
    }
}
