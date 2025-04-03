package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbj extends ffkk implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hvi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbj(int i, ffji ffjiVar, hvi hviVar) {
        super(2);
        this.a = i;
        this.b = ffjiVar;
        this.c = hviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (gdj.a(this.a, 0)) {
            hfdVar.v(-716568759);
            boolean D = hfdVar.D(this.b);
            ffji ffjiVar = this.b;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gbh(ffjiVar);
                hfdVar.y(f);
            }
            gem.b((ffix) f, this.c, false, null, null, fym.a, hfdVar, 1572864, 60);
            hfdVar.o();
        } else {
            hfdVar.v(-716258976);
            boolean D2 = hfdVar.D(this.b);
            ffji ffjiVar2 = this.b;
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new gbi(ffjiVar2);
                hfdVar.y(f2);
            }
            gem.b((ffix) f2, this.c, false, null, null, fym.b, hfdVar, 1572864, 60);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
