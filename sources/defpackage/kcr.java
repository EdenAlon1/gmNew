package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcr extends ffhv implements ffjm {
    final /* synthetic */ kel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcr(kel kelVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = kelVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kcr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.show();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new kcr(this.a, ffguVar);
    }
}
