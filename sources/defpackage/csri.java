package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csri {
    public static final long a(long j, long j2, ZoneId zoneId) {
        zoneId.getClass();
        return Math.abs(ChronoUnit.DAYS.between(Instant.ofEpochMilli(j).atZone(zoneId).b(), Instant.ofEpochMilli(j2).atZone(zoneId).b()));
    }

    public static final CharSequence b(long j, int i, String str, String str2) {
        String format = ((i & 128) == 128 ? new SimpleDateFormat(str) : new SimpleDateFormat(str2)).format(Long.valueOf(j));
        format.getClass();
        return format;
    }

    public static final CharSequence c(Context context, long j, Locale locale, boolean z, int i) {
        context.getClass();
        locale.getClass();
        if (z) {
            if (ffkj.e(locale, Locale.US)) {
                return b(j, i, "M/d/yy", "M/d/yy");
            }
            String formatDateTime = DateUtils.formatDateTime(context, j, 131092);
            formatDateTime.getClass();
            return formatDateTime;
        }
        if (ffkj.e(locale, Locale.US)) {
            return b(j, i, "M/d/yy, HH:mm", "M/d/yy, h:mm aa");
        }
        String formatDateTime2 = DateUtils.formatDateTime(context, j, 131093 | i);
        formatDateTime2.getClass();
        return formatDateTime2;
    }

    public static final CharSequence d(Context context, long j, int i) {
        String formatDateTime = DateUtils.formatDateTime(context, j, i | 1);
        formatDateTime.getClass();
        return formatDateTime;
    }
}
