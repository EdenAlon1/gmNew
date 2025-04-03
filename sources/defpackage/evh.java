package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evh extends ffhv implements ffjm {
    final /* synthetic */ ild a;
    final /* synthetic */ evy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evh(ild ildVar, evy evyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ildVar;
        this.b = evyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((evh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.c;
        ffqy.d(ffskVar, null, ffsm.d, new evf(this.a, this.b, null), 1);
        return ffqy.d(ffskVar, null, ffsm.d, new evg(this.a, this.b, null), 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        evh evhVar = new evh(this.a, this.b, ffguVar);
        evhVar.c = obj;
        return evhVar;
    }
}
