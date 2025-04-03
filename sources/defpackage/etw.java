package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etw extends ffhv implements ffjm {
    final /* synthetic */ ild a;
    final /* synthetic */ evy b;
    final /* synthetic */ fhi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etw(ild ildVar, evy evyVar, fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ildVar;
        this.b = evyVar;
        this.c = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((etw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.d;
        ffqy.d(ffskVar, null, ffsm.d, new ett(this.a, this.b, null), 1);
        ffqy.d(ffskVar, null, ffsm.d, new etv(this.a, this.c, null), 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        etw etwVar = new etw(this.a, this.b, this.c, ffguVar);
        etwVar.d = obj;
        return etwVar;
    }
}
