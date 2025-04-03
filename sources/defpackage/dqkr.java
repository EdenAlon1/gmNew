package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkr {
    public static final String a(Instant instant) {
        Locale.Category category;
        Locale locale;
        DateFormat instanceForSkeleton;
        Calendar calendar;
        TimeZone timeZone;
        String format;
        LocalDateTime L = instant.atZone(ZoneId.systemDefault()).L();
        L.getClass();
        category = Locale.Category.FORMAT;
        locale = Locale.getDefault(category);
        Date date = evpw.a;
        locale.getClass();
        instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEdjm", locale);
        long epochSecond = L.toEpochSecond(ZoneOffset.UTC) * 1000;
        long j = L.get(ChronoField.MILLI_OF_SECOND);
        calendar = instanceForSkeleton.getCalendar();
        if (afg$$ExternalSyntheticApiModelOutline0.m$1(calendar)) {
            afg$$ExternalSyntheticApiModelOutline0.m88m((Object) calendar).setGregorianChange(evpw.a);
        }
        calendar.setTimeInMillis(epochSecond + j);
        timeZone = TimeZone.GMT_ZONE;
        instanceForSkeleton.setTimeZone(timeZone);
        format = instanceForSkeleton.format(calendar);
        format.getClass();
        return format;
    }
}
