package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dops {
    public static final hik a = new hky(new ffix() { // from class: dopr
        @Override // defpackage.ffix
        public final Object invoke() {
            hik hikVar = dops.a;
            return dops.a(dwki.a());
        }
    });

    public static final dopq a(gvs gvsVar) {
        hhw hhwVar = new hhw(1.0f);
        jpo y = jpo.y(gvsVar.j, 0L, 0L, jsy.h, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777211);
        jpo y2 = jpo.y(gvsVar.j, 0L, kal.c(20), null, null, null, null, 0L, null, 0, 0, kal.c(24), null, null, 0, 16646141);
        jpo y3 = jpo.y(gvsVar.k, 0L, 0L, null, new jss(1), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777207);
        long c = kal.c(9);
        long c2 = kal.c(9);
        return new dopq(hhwVar, y, y2, y3, jpo.y(gvsVar.o, 0L, c, null, null, null, null, kal.a(0.1d), null, 0, 0, c2, null, null, 0, 16646013), jpo.y(gvsVar.g, 0L, kal.c(18), null, null, null, null, 0L, null, 0, 0, kal.c(24), null, null, 0, 16646141), jpo.y(gvsVar.i, 0L, 0L, null, null, null, null, 0L, null, 0, 0, kal.c(18), null, null, 0, 16646143), gvsVar);
    }

    public static final jpo b(jpo jpoVar, hfd hfdVar) {
        jpoVar.getClass();
        hfdVar.v(-572197895);
        float floatValue = ((Number) dooy.d(hfdVar).a.a()).floatValue();
        long g = jpoVar.g();
        kal.e(g);
        long d = kal.d(kak.b(g), kak.a(g) * floatValue);
        if (Float.isNaN(kak.a(d)) || kak.a(d) < 0.0f) {
            d = kal.d(4294967296L, 10.0f);
        }
        long j = d;
        long i = jpoVar.i();
        kal.e(i);
        long d2 = kal.d(kak.b(i), kak.a(i) * floatValue);
        if (Float.isNaN(kak.a(d2)) || kak.a(d2) < 0.0f) {
            d2 = kal.d(4294967296L, 10.0f);
        }
        jpo y = jpo.y(jpoVar, 0L, j, null, null, null, null, 0L, null, 0, 0, d2, null, null, 0, 16646141);
        hfdVar.o();
        return y;
    }
}
