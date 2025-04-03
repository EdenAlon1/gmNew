package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkj extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ bzka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkj(bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkj) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.b.e((eisx) this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzkj bzkjVar = new bzkj(this.b, ffguVar);
        bzkjVar.a = obj;
        return bzkjVar;
    }
}
