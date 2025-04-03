package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmby extends ffhv implements ffjm {
    final /* synthetic */ dmas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmby(dmas dmasVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dmasVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmby) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmby(this.a, ffguVar);
    }
}
