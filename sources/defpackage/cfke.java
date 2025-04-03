package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfke extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfke(String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfke) c((ceze) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(ffkj.e(((ceze) this.a).r(), this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfke cfkeVar = new cfke(this.b, ffguVar);
        cfkeVar.a = obj;
        return cfkeVar;
    }
}
