package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eykj {
    public static eyev a(Duration duration) {
        return eyki.g(duration.getSeconds(), duration.getNano());
    }

    public static eyja b(Instant instant) {
        return eykm.g(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration c(eyev eyevVar) {
        return Duration.ofSeconds(eyki.g(eyevVar.b, eyevVar.c).b, r4.c);
    }

    public static Instant d(eyja eyjaVar) {
        return Instant.ofEpochSecond(eykm.g(eyjaVar.b, eyjaVar.c).b, r4.c);
    }
}
