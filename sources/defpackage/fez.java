package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fez {
    public static final cxy a = new cxy(Float.NaN, Float.NaN);
    public static final dbv b = new dbw(fer.a, fes.a);
    public static final long c;
    public static final dac d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new dac(0.0f, new iak(floatToRawIntBits), 3);
    }

    public static final long a(hkx hkxVar) {
        return ((iak) hkxVar.a()).a;
    }

    public static final hvi b(hvi hviVar, ffix ffixVar, ffji ffjiVar) {
        hvi g;
        g = huz.g(hviVar, new feu(ffixVar, ffjiVar));
        return g;
    }
}
