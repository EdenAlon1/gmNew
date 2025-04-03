package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kal {
    public static final long a(double d) {
        return d(4294967296L, (float) d);
    }

    public static final long b(float f) {
        return d(4294967296L, f);
    }

    public static final long c(int i) {
        return d(4294967296L, i);
    }

    public static final long d(long j, float f) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = kak.a;
        return j | (floatToRawIntBits & 4294967295L);
    }

    public static final void e(long j) {
        if (kak.b(j) == 0) {
            jzy.a("Cannot perform operation for Unspecified type.");
        }
    }
}
