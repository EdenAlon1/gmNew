package defpackage;

import j$.time.Instant;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxv {
    public static final eyja a(Instant instant) {
        Instant instant2 = instant.atZone(ZoneOffset.UTC).b().atStartOfDay(ZoneOffset.UTC).toInstant();
        instant2.getClass();
        return eykn.b(instant2);
    }
}
