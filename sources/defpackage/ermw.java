package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermw {
    public static int a(long j, long j2) {
        return Long.compare(b(j), b(j2));
    }

    private static long b(long j) {
        return j ^ Long.MIN_VALUE;
    }
}
