package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbq implements ffjn {
    final /* synthetic */ dpzx a;
    final /* synthetic */ dqbx b;

    public dqbq(dqbx dqbxVar, dpzx dpzxVar) {
        this.b = dqbxVar;
        this.a = dpzxVar;
    }

    public static final float b(hkx hkxVar) {
        return ((jzq) hkxVar.a()).a;
    }

    public static final void c(hho hhoVar, float f) {
        hhoVar.b(new jzq(f));
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gmk a = gmd.a(false, fvj.a, gml.c, true, hfdVar, 0, 49);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new god();
                hfdVar.y(f);
            }
            god godVar = (god) f;
            boolean D = hfdVar.D(a) | hfdVar.D(godVar);
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new fvn(a, godVar);
                hfdVar.y(f2);
            }
            fvn fvnVar = (fvn) f2;
            hfdVar.v(-2044987752);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                Object hicVar = new hic(new jzq(64.0f), hla.a);
                hfdVar.y(hicVar);
                f3 = hicVar;
            }
            final hho hhoVar = (hho) f3;
            hfdVar.o();
            final jzn jznVar = (jzn) hfdVar.e(jdr.e);
            hfdVar.v(-2044980113);
            boolean D2 = hfdVar.D(jznVar) | ((intValue & 14) == 4);
            Object f4 = hfdVar.f();
            if (D2 || f4 == hfc.a) {
                f4 = new ffix() { // from class: dqbd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        float ek = jzn.this.ek(jzk.a(dynVar.a)) - ((jzq) hhoVar.a()).a;
                        ebe ebeVar = dpyw.a;
                        return new jzq(ek - 36.0f);
                    }
                };
                hfdVar.y(f4);
            }
            hfdVar.o();
            hqg hqgVar = hkg.a;
            hgk hgkVar = new hgk((ffix) f4, null);
            hfdVar.v(-2044975114);
            Object f5 = hfdVar.f();
            if (f5 == hfc.a) {
                f5 = new hhw(0.0f);
                hfdVar.y(f5);
            }
            hfdVar.o();
            dskb.a(true, null, hpx.d(2052207940, new dqbp(fvnVar, this.b, hgkVar, dynVar, this.a, (hjx) f5, hhoVar), hfdVar), hfdVar, 390, 2);
        }
        return ffcu.a;
    }
}
