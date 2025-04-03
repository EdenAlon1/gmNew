package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpy extends ffhv implements ffjm {
    final /* synthetic */ cmpz a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpy(cmpz cmpzVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmpzVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmpy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.a.b()).e("Bugle.UI.FiMultiDeviceSync.UserSignOut.Count", !this.b ? 1 : 0);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmpy(this.a, this.b, ffguVar);
    }
}
