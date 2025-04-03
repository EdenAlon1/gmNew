package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smc extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public smc(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((smc) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((hij) this.a).b(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        smc smcVar = new smc(ffguVar);
        smcVar.a = obj;
        return smcVar;
    }
}
