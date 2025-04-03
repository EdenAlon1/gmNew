package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrh {
    public final csrg a;
    private final Context b;

    public csrh(Context context, csrg csrgVar) {
        this.b = context;
        this.a = csrgVar;
    }

    public static String h(long j) {
        if (j <= 0) {
            return "0:00";
        }
        if (j >= 359999000) {
            return "99:59:59";
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        return hours > 0 ? String.format(Locale.US, "%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format(Locale.US, "%01d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public final CharSequence a(long j) {
        return f(j, true, false, false);
    }

    public final CharSequence b(long j) {
        return csri.c(this.b, j, this.b.getResources().getConfiguration().locale, false, true != DateFormat.is24HourFormat(this.b) ? 64 : 128);
    }

    public final CharSequence c(long j) {
        csrg csrgVar = this.a;
        cqoh cqohVar = csrgVar.b;
        boolean is24HourFormat = DateFormat.is24HourFormat(csrgVar.a);
        long epochMilli = cqohVar.f().toEpochMilli();
        long j2 = epochMilli - j;
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        long a = csri.a(j, epochMilli, systemDefault);
        int i = true != is24HourFormat ? 64 : 128;
        if (a == 0) {
            return csri.d(csrgVar.a, j, i);
        }
        if (a == 1) {
            Context context = csrgVar.a;
            String string = context.getResources().getString(R.string.message_metadata_separator);
            string.getClass();
            String string2 = context.getResources().getString(R.string.posted_yesterday, string, csri.d(context, j, i));
            string2.getClass();
            return string2;
        }
        if (j2 < 604800000) {
            Context context2 = csrgVar.a;
            Resources resources = context2.getResources();
            resources.getClass();
            String formatDateTime = DateUtils.formatDateTime(context2, j, 2);
            String string3 = resources.getString(R.string.message_metadata_separator);
            string3.getClass();
            String string4 = resources.getString(R.string.posted_this_week, formatDateTime, string3, csri.d(context2, j, i));
            string4.getClass();
            return string4;
        }
        if (j2 >= 31449600000L) {
            Context context3 = csrgVar.a;
            String string5 = context3.getResources().getString(R.string.message_metadata_separator);
            string5.getClass();
            String string6 = context3.getResources().getString(R.string.posted_over_a_year, DateUtils.formatDateTime(context3, j, 65558 | i), string5, csri.d(context3, j, i));
            string6.getClass();
            return string6;
        }
        Context context4 = csrgVar.a;
        Resources resources2 = context4.getResources();
        resources2.getClass();
        String formatDateTime2 = DateUtils.formatDateTime(context4, j, 65562 | i);
        String string7 = resources2.getString(R.string.message_metadata_separator);
        string7.getClass();
        String string8 = resources2.getString(R.string.posted_this_year, formatDateTime2, string7, csri.d(context4, j, i));
        string8.getClass();
        return string8;
    }

    public final CharSequence d(long j) {
        return f(j, false, false, false);
    }

    public final CharSequence e(long j) {
        return this.a.a(j, false, false, false, true);
    }

    public final CharSequence f(long j, boolean z, boolean z2, boolean z3) {
        return this.a.a(j, z, z2, z3, false);
    }

    public final String g(long j) {
        if (j <= 0) {
            j = 0;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        Resources resources = this.b.getResources();
        StringBuilder sb = new StringBuilder();
        if (hours > 0) {
            int i = (int) hours;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_hours, i, Integer.valueOf(i)));
        }
        if (minutes > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i2 = (int) minutes;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_minutes, i2, Integer.valueOf(i2)));
        }
        if (seconds > 0 || j == 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i3 = (int) seconds;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_seconds, i3, Integer.valueOf(i3)));
        }
        return sb.toString();
    }
}
