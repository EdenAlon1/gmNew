package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernd {
    public static final long a(Instant instant) {
        instant.getClass();
        int i = ernf.a;
        return instant.getEpochSecond() < -9223372036854L ? erlc.b(erlc.c(instant.getEpochSecond() + 1, 1000000L), (instant.getNano() / 1000) - 1000000) : erlc.b(erlc.c(instant.getEpochSecond(), 1000000L), instant.getNano() / 1000);
    }
}
