package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfq implements ffjn {
    final /* synthetic */ dngn a;
    final /* synthetic */ hho b;

    public dnfq(dngn dngnVar, hho hhoVar) {
        this.a = dngnVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            for (final dlsr dlsrVar : this.a.c) {
                boolean z = dlsrVar.f;
                hpn d = hpx.d(497826503, new dnfp(dlsrVar), hfdVar);
                hfdVar.v(2045075759);
                boolean D = hfdVar.D(dlsrVar);
                final hho hhoVar = this.b;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dnfo
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            dngm.e(hhoVar, false);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dwhw.a(d, (ffix) f, null, null, z, null, null, hfdVar, 6, 476);
            }
        }
        return ffcu.a;
    }
}
