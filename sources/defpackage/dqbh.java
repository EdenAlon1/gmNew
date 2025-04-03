package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbh extends ffhv implements ffjm {
    final /* synthetic */ dpzx a;
    final /* synthetic */ fvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbh(dpzx dpzxVar, fvn fvnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpzxVar;
        this.b = fvnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dpzv) this.a).b.b(Boolean.valueOf(this.b.a.d() == gml.b));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqbh(this.a, this.b, ffguVar);
    }
}
