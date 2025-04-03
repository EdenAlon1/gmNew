package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfy {
    static int a(long j) {
        if (j <= 0) {
            return 0;
        }
        return ((int) Math.log10(j)) + 1;
    }

    public static long b(long j) {
        return (long) Math.pow(10.0d, a(j) - 1);
    }
}
