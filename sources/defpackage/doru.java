package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doru implements ffjn {
    final /* synthetic */ dlsr a;
    final /* synthetic */ hho b;

    public doru(dlsr dlsrVar, hho hhoVar) {
        this.a = dlsrVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlsr dlsrVar = this.a;
            dwjt.b(dlsrVar.a, null, 0L, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65022);
            dlsr dlsrVar2 = this.a;
            boolean booleanValue = ((Boolean) this.b.a()).booleanValue();
            hfdVar.v(-365262292);
            final hho hhoVar = this.b;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dort
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dose.f(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            boolean z = dlsrVar2.h;
            hfdVar.o();
            dose.k(dlsrVar2.g, z, booleanValue, (ffix) f, hfdVar, 3072);
        }
        return ffcu.a;
    }
}
