package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dntd implements ffjn {
    final /* synthetic */ ffjn a;
    final /* synthetic */ dntl b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;

    public dntd(ffjn ffjnVar, dntl dntlVar, boolean z, long j) {
        this.a = ffjnVar;
        this.b = dntlVar;
        this.c = z;
        this.d = j;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object a = this.a.a(this.b.a, Integer.valueOf(((jzn) hfdVar.e(jdr.e)).eo(dynVar.d())), dnte.h(this.b, hfdVar));
            hfdVar.v(851868852);
            boolean z = this.c;
            final dntl dntlVar = this.b;
            hvi hviVar = hvi.e;
            if (z) {
                hve hveVar = hvi.e;
                hfdVar.v(84304362);
                boolean D = hfdVar.D(dntlVar);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dntc
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffix ffixVar = dntl.this.b;
                            if (ffixVar != null) {
                                ffixVar.invoke();
                            }
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                hviVar = dfb.d(hveVar, false, null, (ffix) f, 7);
            }
            hfdVar.o();
            dwjt.a(dnte.a((String) a, this.c, this.d), hviVar, this.d, 0L, 0L, null, 0L, 0, false, 0, null, null, dnte.h(this.b, hfdVar), hfdVar, 0, 0, 65528);
        }
        return ffcu.a;
    }
}
