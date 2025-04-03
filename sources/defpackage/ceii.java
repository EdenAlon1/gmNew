package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceii {
    public static final String a(Instant instant) {
        LocalDateTime ofInstant = LocalDateTime.ofInstant(instant, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        Object a = ceiw.a.a();
        a.getClass();
        String format = ((DateTimeFormatter) a).format(ofInstant);
        format.getClass();
        return format;
    }
}
