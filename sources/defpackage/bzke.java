package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzke extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ bzka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzke(bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzke) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eisx eisxVar = (eisx) this.a;
        eisxVar.getClass();
        return this.b.e(eisxVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzke bzkeVar = new bzke(this.b, ffguVar);
        bzkeVar.a = obj;
        return bzkeVar;
    }
}
