package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zix implements ffjn {
    final /* synthetic */ eey a;
    final /* synthetic */ hjz b;
    final /* synthetic */ hjz c;

    public zix(eey eeyVar, hjz hjzVar, hjz hjzVar2) {
        this.a = eeyVar;
        this.b = hjzVar;
        this.c = hjzVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(161924902);
            final eey eeyVar = this.a;
            final hjz hjzVar = this.b;
            final hjz hjzVar2 = this.c;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                ffix ffixVar = new ffix() { // from class: ziw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        int e = eey.this.d().e();
                        return Integer.valueOf(e - Math.min(hjzVar.c() + hjzVar2.c(), e / 2));
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar, null);
                hfdVar.y(hgkVar);
                f = hgkVar;
            }
            hfdVar.o();
            hve hveVar = hvi.e;
            int intValue2 = ((Number) ((hkx) f).a()).intValue();
            hfdVar.v(-475029924);
            float ek = ((jzn) hfdVar.e(jdr.e)).ek(intValue2);
            hfdVar.o();
            ebv.a(jfw.a(eba.j(hveVar, 0.0f, ek, 0.0f, 0.0f, 13), "columnSpacer"), hfdVar);
        }
        return ffcu.a;
    }
}
