package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzpv extends ffhv implements ffjm {
    final /* synthetic */ bzpx a;
    final /* synthetic */ bzrc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpv(bzpx bzpxVar, bzrc bzrcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bzpxVar;
        this.b = bzrcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzpv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bzrd) this.a.a.b()).a(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzpv(this.a, this.b, ffguVar);
    }
}
