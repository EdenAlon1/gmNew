package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikj {
    public static final long a(iku ikuVar) {
        return j(ikuVar, false);
    }

    public static final long b(iku ikuVar) {
        return j(ikuVar, true);
    }

    public static final boolean c(iku ikuVar) {
        return (ikuVar.c() || ikuVar.h || !ikuVar.d) ? false : true;
    }

    public static final boolean d(iku ikuVar) {
        return !ikuVar.h && ikuVar.d;
    }

    public static final boolean e(iku ikuVar) {
        return (ikuVar.c() || !ikuVar.h || ikuVar.d) ? false : true;
    }

    public static final boolean f(iku ikuVar) {
        return ikuVar.h && !ikuVar.d;
    }

    public static final boolean g(iku ikuVar, long j, long j2) {
        boolean b = ilq.b(ikuVar.i, 1);
        long j3 = ikuVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = b ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > ((float) ((int) (j >> 32))) + f2) | (intBitsToFloat < (-f2)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + intBitsToFloat4);
    }

    public static final boolean h(iku ikuVar) {
        return !iak.i(j(ikuVar, false), 0L);
    }

    public static final boolean i(iku ikuVar) {
        return !iak.i(j(ikuVar, true), 0L);
    }

    private static final long j(iku ikuVar, boolean z) {
        long e = iak.e(ikuVar.c, ikuVar.g);
        if (z || !ikuVar.c()) {
            return e;
        }
        return 0L;
    }
}
