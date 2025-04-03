package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jzm {
    public static float a(jzn jznVar, float f) {
        return f / jznVar.ec();
    }

    public static float b(jzn jznVar, int i) {
        return i / jznVar.ec();
    }

    public static float c(jzn jznVar, long j) {
        if (!kam.b(kak.c(j), 4294967296L)) {
            jzy.b("Only Sp can convert to Px");
        }
        return jznVar.em(jznVar.ef(j));
    }

    public static float d(jzn jznVar, float f) {
        return f * jznVar.ec();
    }

    public static int e(jzn jznVar, long j) {
        return Math.round(jznVar.el(j));
    }

    public static int f(jzn jznVar, float f) {
        float em = jznVar.em(f);
        return Float.isInfinite(em) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(em);
    }

    public static long g(jzn jznVar, long j) {
        if (j != 9205357640488583168L) {
            return jzr.b(jznVar.eg(Float.intBitsToFloat((int) (j >> 32))), jznVar.eg(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long h(jzn jznVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float em = jznVar.em(jzv.b(j));
        float em2 = jznVar.em(jzv.a(j));
        return (Float.floatToRawIntBits(em) << 32) | (Float.floatToRawIntBits(em2) & 4294967295L);
    }

    public static long i(jzn jznVar, float f) {
        return jznVar.er(jznVar.eg(f));
    }
}
