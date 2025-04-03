package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkq extends ffkk implements ffjm {
    final /* synthetic */ kev a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ ffji d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkq(kev kevVar, ffix ffixVar, hvi hviVar, ffji ffjiVar, int i) {
        super(2);
        this.a = kevVar;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = ffjiVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dku.c(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
