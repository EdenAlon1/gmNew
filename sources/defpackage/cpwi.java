package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwi implements cqfh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch");
    public final ffbr b;
    public final cqoh c;
    public final comc d;
    private final ffsk e;
    private final ffbr f;

    public cpwi(ffsk ffskVar, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        ffbrVar2.getClass();
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = cqohVar;
        this.f = ffbrVar2;
        comy comyVar = (comy) ffbrVar2.b();
        comu c = comv.c();
        c.d(comb.REVERSE_TELEPHONY_SYNC_STATE);
        c.f(cpvu.a);
        this.d = comyVar.a(c.a());
    }

    @Override // defpackage.cqfh
    public final Object a(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e.hT()), new cpwh(null, this), ffguVar);
    }
}
