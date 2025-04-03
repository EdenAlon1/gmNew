package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdj implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ zch d;
    final /* synthetic */ ffji e;

    public zdj(int i, String str, boolean z, zch zchVar, ffji ffjiVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = zchVar;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = this.a;
            hvi hviVar = hvi.e;
            if (i <= 2) {
                hviVar = eba.j(hvi.e, 0.0f, 28.0f, 0.0f, 0.0f, 13);
            }
            String str = this.b;
            boolean z = this.c;
            boolean z2 = this.d == null;
            String str2 = "ThemeHolder " + (this.a + 1);
            hfdVar.v(1160714386);
            boolean D = hfdVar.D(this.e) | hfdVar.F(this.d);
            final ffji ffjiVar = this.e;
            final zch zchVar = this.d;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: zdi
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffji.this.invoke(zchVar);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            zdl.l(hviVar, str, z, z2, str2, (ffix) f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
