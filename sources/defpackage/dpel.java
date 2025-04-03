package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpel extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public dpel(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpel) c((dpdf) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(!(((dpdf) this.a) instanceof dpdd));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpel dpelVar = new dpel(ffguVar);
        dpelVar.a = obj;
        return dpelVar;
    }
}
