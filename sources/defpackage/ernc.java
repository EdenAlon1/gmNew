package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernc {
    public static final long a(Duration duration) {
        int i = erne.a;
        return duration.getSeconds() < -9223372036854L ? erlc.b(erlc.c(duration.getSeconds() + 1, 1000000L), (duration.getNano() / 1000) - 1000000) : erlc.b(erlc.c(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }
}
