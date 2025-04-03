package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhe {
    public static long a(Optional optional) {
        if (optional.isEmpty()) {
            return -1L;
        }
        return ((Instant) optional.get()).toEpochMilli();
    }

    public static Optional b(long j) {
        return j <= -1 ? Optional.empty() : Optional.of(Instant.ofEpochMilli(j));
    }
}
