package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzki extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ bzka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzki(bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzki) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
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
        bzki bzkiVar = new bzki(this.b, ffguVar);
        bzkiVar.a = obj;
        return bzkiVar;
    }
}
