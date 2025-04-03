package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgu {
    public static long a(Duration duration) {
        if (duration == null) {
            return 0L;
        }
        return duration.toMillis();
    }

    public static Duration b(long j) {
        return j == 0 ? Duration.ZERO : Duration.ofMillis(j);
    }
}
