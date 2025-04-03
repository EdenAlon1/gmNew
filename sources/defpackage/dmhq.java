package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmhq extends ffhv implements ffjm {
    final /* synthetic */ dly a;
    final /* synthetic */ dmht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmhq(dly dlyVar, dmht dmhtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dlyVar;
        this.b = dmhtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmhq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.f() == dmhe.b) {
            this.b.b.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmhq(this.a, this.b, ffguVar);
    }
}
