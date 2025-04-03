package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aksx {
    private static final enru a = enru.c("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter");
    private final cqoh b;
    private final Context c;
    private final acdc d;

    public aksx(cqoh cqohVar, Context context, acdc acdcVar) {
        this.b = cqohVar;
        this.c = context;
        this.d = acdcVar;
    }

    private final String b(Instant instant) {
        Locale c = ctid.c(this.c);
        ensk e = a.e();
        e.Y(ente.a, "BugleScheduledSend");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToTime", 94, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToTime: %s", c);
        return d(c).equals(Locale.US) ? new SimpleDateFormat(c(instant), Locale.US).format(Long.valueOf(instant.toEpochMilli())) : this.d.b(instant.toEpochMilli());
    }

    private final String c(Instant instant) {
        return DateFormat.is24HourFormat(this.c) ? "H:mm z" : instant.atZone(ZoneId.systemDefault()).getMinute() == 0 ? "h aa z" : "h:mm aa z";
    }

    private static Locale d(Locale locale) {
        return new Locale.Builder().setLanguage(locale.getLanguage()).setRegion(locale.getCountry()).build();
    }

    public final String a(Instant instant) {
        int a2 = (int) csri.a(this.b.f().toEpochMilli(), instant.toEpochMilli(), ZoneId.systemDefault());
        if (a2 == 0) {
            return this.c.getString(R.string.scheduled_send_datetime_today_format, b(instant));
        }
        if (a2 == 1) {
            return this.c.getString(R.string.scheduled_send_datetime_tomorrow_format, b(instant));
        }
        Locale c = ctid.c(this.c);
        ensk e = a.e();
        e.Y(ente.a, "BugleScheduledSend");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToDateTime", 85, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToDateTime: %s", c);
        if (!d(c).equals(Locale.US)) {
            return this.d.c(instant.toEpochMilli());
        }
        int year = instant.atZone(ZoneId.systemDefault()).getYear();
        int year2 = this.b.f().atZone(ZoneId.systemDefault()).getYear();
        String c2 = c(instant);
        StringBuilder sb = new StringBuilder();
        sb.append(year == year2 ? "EEE, MMM d" : "EEE, MMM d, yyyy");
        sb.append(", ");
        sb.append(c2);
        return new SimpleDateFormat(sb.toString(), Locale.US).format(Long.valueOf(instant.toEpochMilli()));
    }
}
