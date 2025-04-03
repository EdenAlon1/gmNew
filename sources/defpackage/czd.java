package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czd extends ffhv implements ffjm {
    /* synthetic */ float a;

    public czd(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czd) c(Float.valueOf(((Number) obj).floatValue()), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a > 0.0f);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        czd czdVar = new czd(ffguVar);
        czdVar.a = ((Number) obj).floatValue();
        return czdVar;
    }
}
