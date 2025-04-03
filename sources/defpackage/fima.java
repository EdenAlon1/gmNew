package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fima {
    public static void a(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }
}
