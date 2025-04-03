package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsb extends ffkk implements ffjm {
    final /* synthetic */ ftb a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsb(ftb ftbVar, boolean z) {
        super(2);
        this.a = ftbVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = guj.g.b;
            ftb ftbVar = this.a;
            boolean z = this.b;
            for (int i2 = 0; i2 < i; i2++) {
                int a = guj.g.a(i2);
                hve hveVar = hvi.e;
                boolean B = hfdVar.B(i2);
                Object f = hfdVar.f();
                if (B || f == hfc.a) {
                    f = new gsa(i2);
                    hfdVar.y(f);
                }
                c = jjs.c(hveVar, false, (ffji) f);
                guj.k(c, ftbVar, a, z, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
