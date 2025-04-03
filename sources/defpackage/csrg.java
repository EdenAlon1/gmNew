package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrg {
    public final Context a;
    public final cqoh b;

    public csrg(Context context, cqoh cqohVar) {
        context.getClass();
        cqohVar.getClass();
        this.a = context;
        this.b = cqohVar;
    }

    public final CharSequence a(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        int i = true != DateFormat.is24HourFormat(this.a) ? 64 : 128;
        long epochMilli = this.b.f().toEpochMilli();
        Locale locale = this.a.getResources().getConfiguration().locale;
        locale.getClass();
        if (z4) {
            return csri.d(this.a, j, i);
        }
        long abs = Math.abs(epochMilli - j);
        if (!z2 && abs < 60000) {
            CharSequence text = this.a.getResources().getText(R.string.am_posted_now);
            text.getClass();
            return text;
        }
        if (!z2 && abs < 3600000) {
            long j2 = abs / 60000;
            String quantityString = this.a.getResources().getQuantityString(true != z3 ? R.plurals.bugle_num_minutes_ago : R.plurals.bugle_content_description_num_minutes_ago, (int) j2);
            quantityString.getClass();
            String format = String.format(quantityString, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            format.getClass();
            return format;
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        if (csri.a(j, epochMilli, systemDefault) == 0) {
            return csri.d(this.a, j, i);
        }
        if (abs < 604800000) {
            Context context = this.a;
            if (z) {
                String formatDateTime = DateUtils.formatDateTime(context, j, 32770 | i);
                formatDateTime.getClass();
                return formatDateTime;
            }
            if (ffkj.e(locale, Locale.US)) {
                return csri.b(j, i, true != z3 ? "EEE HH:mm" : "EEEE HH:mm", true != z3 ? "EEE h:mm aa" : "EEEE h:mm aa");
            }
            String formatDateTime2 = DateUtils.formatDateTime(context, j, 32771 | i);
            formatDateTime2.getClass();
            return formatDateTime2;
        }
        if (abs >= 31449600000L) {
            return csri.c(this.a, j, locale, z, i);
        }
        Context context2 = this.a;
        if (z) {
            String formatDateTime3 = DateUtils.formatDateTime(context2, j, 65560 | i);
            formatDateTime3.getClass();
            return formatDateTime3;
        }
        if (ffkj.e(locale, Locale.US)) {
            return csri.b(j, i, "MMM d, HH:mm", "MMM d, h:mm aa");
        }
        String formatDateTime4 = DateUtils.formatDateTime(context2, j, 65561 | i);
        formatDateTime4.getClass();
        return formatDateTime4;
    }
}
