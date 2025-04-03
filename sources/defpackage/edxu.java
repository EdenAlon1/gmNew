package defpackage;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxu {
    public static final int a(emsj emsjVar, Instant instant) {
        long epochDay;
        int i = emsjVar.e;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 0) {
            return b(instant);
        }
        if (i3 == 1) {
            epochDay = instant.atZone(ZoneId.systemDefault()).b().toEpochDay();
        } else {
            if (i3 != 2) {
                throw new AssertionError("Invalid TimeZonePolicy");
            }
            epochDay = instant.atZone(ZoneId.of(emsjVar.f)).b().toEpochDay();
        }
        return (int) epochDay;
    }

    public static final int b(Instant instant) {
        return (int) instant.atZone(ZoneOffset.UTC).b().toEpochDay();
    }
}
