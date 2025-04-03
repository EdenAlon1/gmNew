package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class feu extends ffkk implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feu(ffix ffixVar, ffji ffjiVar) {
        super(3);
        this.a = ffixVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(759876635);
        cxy cxyVar = fez.a;
        Object f = hfdVar.f();
        if (f == hfc.a) {
            ffix ffixVar = this.a;
            hqg hqgVar = hkg.a;
            hgk hgkVar = new hgk(ffixVar, null);
            hfdVar.y(hgkVar);
            f = hgkVar;
        }
        hkx hkxVar = (hkx) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new cxj(new iak(fez.a(hkxVar)), fez.b, new iak(fez.c), 8);
            hfdVar.y(f2);
        }
        cxj cxjVar = (cxj) f2;
        ffcu ffcuVar = ffcu.a;
        boolean F = hfdVar.F(cxjVar);
        Object f3 = hfdVar.f();
        if (F || f3 == hfc.a) {
            f3 = new fey(hkxVar, cxjVar, null);
            hfdVar.y(f3);
        }
        hgs.g(ffcuVar, (ffjm) f3, hfdVar);
        cxv cxvVar = cxjVar.b;
        ffji ffjiVar = this.b;
        boolean D = hfdVar.D(cxvVar);
        Object f4 = hfdVar.f();
        if (D || f4 == hfc.a) {
            f4 = new fet(cxvVar);
            hfdVar.y(f4);
        }
        hvi hviVar = (hvi) ffjiVar.invoke((ffix) f4);
        hfdVar.o();
        return hviVar;
    }
}
