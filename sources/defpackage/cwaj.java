package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwaj implements ffjm {
    final /* synthetic */ cvzr a;
    final /* synthetic */ hho b;

    public cwaj(cvzr cvzrVar, hho hhoVar) {
        this.a = cvzrVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1891620073);
            boolean D = hfdVar.D(this.a);
            final cvzr cvzrVar = this.a;
            final hho hhoVar = this.b;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: cwai
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cwap.e(hhoVar, new jvu("", 0L, 6));
                        cvzr.this.m.invoke("");
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwhl.b((ffix) f, null, false, null, null, cvym.a, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}
