package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cigp extends ffhv implements ffjm {
    final /* synthetic */ cigq a;
    final /* synthetic */ ciff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cigp(cigq cigqVar, ciff ciffVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cigqVar;
        this.b = ciffVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cigp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        esds esdsVar = (esds) esdt.a.createBuilder();
        esdsVar.getClass();
        esdu.b(((bzgd) this.a.a.b()).t(((cibs) this.b).c), esdsVar);
        return esdu.a(esdsVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cigp(this.a, this.b, ffguVar);
    }
}
