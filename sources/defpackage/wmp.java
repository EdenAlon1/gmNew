package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmp extends ffhv implements ffjm {
    final /* synthetic */ wmq a;
    final /* synthetic */ eqss b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmp(wmq wmqVar, eqss eqssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wmqVar;
        this.b = eqssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((wmf) this.a.a.b()).n(this.b);
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmp(this.a, this.b, ffguVar);
    }
}
