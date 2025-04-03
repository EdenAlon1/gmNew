package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkg implements ffjm {
    final /* synthetic */ dnkl a;

    public dnkg(dnkl dnklVar) {
        this.a = dnklVar;
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.b.size() > 1) {
            hfdVar.v(-1694942424);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfdVar.y(hicVar);
                f = hicVar;
            }
            final hho hhoVar = (hho) f;
            hfdVar.o();
            hfdVar.v(-1694940325);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffix() { // from class: dnke
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnkg.b(hho.this, true);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            dnkk.a((ffix) f2, hfdVar, 6);
            boolean booleanValue = ((Boolean) hhoVar.a()).booleanValue();
            dnkl dnklVar = this.a;
            hfdVar.v(-1694935620);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = new ffix() { // from class: dnkf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnkg.b(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            dnkk.b(booleanValue, dnklVar.b, (ffix) f3, hfdVar, 384);
        }
        return ffcu.a;
    }
}
