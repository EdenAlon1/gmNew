package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgw {
    public static long a(Instant instant) {
        if (instant == null) {
            return 0L;
        }
        return instant.toEpochMilli();
    }

    public static Instant b(long j) {
        return j == 0 ? Instant.EPOCH : Instant.ofEpochMilli(j);
    }
}
