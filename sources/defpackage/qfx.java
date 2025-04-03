package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfx {
    public static final float a(qci qciVar, qgk qgkVar, float f) {
        if (f < 0.0f && qciVar == null) {
            return 1.0f;
        }
        if (qciVar == null) {
            return 0.0f;
        }
        if (f < 0.0f) {
            if (qgkVar == null) {
                return 1.0f;
            }
            return qgkVar.a(qciVar);
        }
        if (qgkVar == null) {
            return 0.0f;
        }
        return qgkVar.b(qciVar);
    }

    public static final Object b(qfn qfnVar, ffgu ffguVar) {
        Object b = qfm.b(qfnVar, null, a(qfnVar.j(), qfnVar.k(), qfnVar.f()), ffguVar, 9);
        return b == ffhh.a ? b : ffcu.a;
    }

    public static final qfn c(hfd hfdVar) {
        hfdVar.v(2024497114);
        hfdVar.v(-1736573089);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new qfw();
            hfdVar.y(f);
        }
        qfn qfnVar = (qfn) f;
        hfdVar.o();
        hfdVar.o();
        return qfnVar;
    }
}
