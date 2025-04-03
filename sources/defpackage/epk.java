package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epk extends ffhv implements ffjm {
    final /* synthetic */ epm a;
    final /* synthetic */ ioc b;
    final /* synthetic */ ffix c;
    final /* synthetic */ ffix d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epk(epm epmVar, ioc iocVar, ffix ffixVar, ffix ffixVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = epmVar;
        this.b = iocVar;
        this.c = ffixVar;
        this.d = ffixVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((epk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.e;
        ffqy.d(ffskVar, null, null, new epi(this.a, this.b, this.c, null), 3);
        return ffqy.d(ffskVar, null, null, new epj(this.a, this.d, null), 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        epk epkVar = new epk(this.a, this.b, this.c, this.d, ffguVar);
        epkVar.e = obj;
        return epkVar;
    }
}
