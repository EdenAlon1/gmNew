package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbk extends ffhv implements ffjm {
    /* synthetic */ int a;

    public fgbk(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgbk) c(Integer.valueOf(((Number) obj).intValue()), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgbk fgbkVar = new fgbk(ffguVar);
        fgbkVar.a = ((Number) obj).intValue();
        return fgbkVar;
    }
}
