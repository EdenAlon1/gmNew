package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zuo {
    public static final String a(long j, Context context, boolean z) {
        String format = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalTime().format(DateTimeFormatter.ofPattern((z && DateFormat.is24HourFormat(context)) ? "HH:mm" : "h:mm a"));
        format.getClass();
        return format;
    }
}
