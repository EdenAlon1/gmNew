package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkt extends ffkk implements ffjm {
    final /* synthetic */ kev a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ djw d;
    final /* synthetic */ ffji e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkt(kev kevVar, ffix ffixVar, hvi hviVar, djw djwVar, ffji ffjiVar, int i) {
        super(2);
        this.a = kevVar;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = djwVar;
        this.e = ffjiVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dku.b(this.a, this.b, this.c, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
