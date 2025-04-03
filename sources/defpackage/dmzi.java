package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmzi extends ffhv implements ffjm {
    final /* synthetic */ dmzr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmzi(dmzr dmzrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dmzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmzi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmzi(this.a, ffguVar);
    }
}
