package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dokj implements ffjm {
    final /* synthetic */ dojy a;
    final /* synthetic */ hjz b;

    public dokj(dojy dojyVar, hjz hjzVar) {
        this.a = dojyVar;
        this.b = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dojy dojyVar = this.a;
            final hjz hjzVar = this.b;
            final int i = 0;
            for (Object obj3 : dojyVar.a) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                final dokl doklVar = (dokl) obj3;
                String str = doklVar.a;
                String str2 = doklVar.b;
                hfdVar.v(1056085030);
                boolean D = hfdVar.D(hjzVar) | hfdVar.B(i) | hfdVar.D(doklVar);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dokg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            hjz hjzVar2 = hjzVar;
                            int c = hjzVar2.c();
                            int i3 = i;
                            if (c != i3) {
                                dokl doklVar2 = doklVar;
                                hjzVar2.i(i3);
                                doklVar2.c.invoke();
                            }
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                final dokl doklVar2 = new dokl(str, str2, (ffix) f);
                boolean z = hjzVar.c() == i;
                hvi e = ebs.e(ebs.x(hvi.e, 48.0f, 0.0f, 2), 48.0f);
                long j = gft.a(hfdVar).a;
                long j2 = gft.a(hfdVar).s;
                hfdVar.v(1056092820);
                boolean D2 = hfdVar.D(doklVar2);
                Object f2 = hfdVar.f();
                if (D2 || f2 == hfc.a) {
                    f2 = new ffix() { // from class: dokh
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dokl.this.c.invoke();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f2);
                }
                hfdVar.o();
                dwjg.a(z, (ffix) f2, e, false, hpx.d(-783659254, new doki(doklVar2), hfdVar), j, j2, hfdVar, 24960, 296);
                i = i2;
            }
        }
        return ffcu.a;
    }
}
