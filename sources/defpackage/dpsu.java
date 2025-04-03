package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsu extends ffhv implements ffjm {
    final /* synthetic */ dptb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsu(dptb dptbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dptbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpsu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.invoke(dpse.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpsu(this.a, ffguVar);
    }
}
