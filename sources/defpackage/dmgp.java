package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgp extends ffhv implements ffjm {
    final /* synthetic */ dmgr a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgp(dmgr dmgrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dmgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.b;
        ffqy.d(ffskVar, null, null, new dmgm(this.a, null), 3);
        ffqy.d(ffskVar, null, null, new dmgo(this.a, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dmgp dmgpVar = new dmgp(this.a, ffguVar);
        dmgpVar.b = obj;
        return dmgpVar;
    }
}
