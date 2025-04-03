package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapr extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapr(ffgu ffguVar, bara baraVar) {
        super(2, ffguVar);
        this.a = baraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bapr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((cgst) this.a.B.b()).a());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bapr baprVar = new bapr(ffguVar, this.a);
        baprVar.b = obj;
        return baprVar;
    }
}
