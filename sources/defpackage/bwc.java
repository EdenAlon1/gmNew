package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwc {
    public static long a(long j, int i) {
        long j2 = i;
        ksw.b(j2 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static long b(long j, int i) {
        long j2 = i;
        ksw.b(j2 > 0, "bytesPerFrame must be greater than 0.");
        return j / j2;
    }
}
