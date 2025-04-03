package defpackage;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktd {
    private static final TimeZone a = DesugarTimeZone.getTimeZone("GMT-0");

    public static long a(String str) {
        if (!str.endsWith("Z")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz", Locale.US);
            simpleDateFormat.setTimeZone(a);
            return simpleDateFormat.parse(str).getTime();
        }
        try {
            try {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat2.setTimeZone(a);
                return simpleDateFormat2.parse(str).getTime();
            } catch (ParseException unused) {
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'", Locale.US);
                simpleDateFormat3.setLenient(true);
                simpleDateFormat3.setTimeZone(a);
                return simpleDateFormat3.parse(str).getTime();
            }
        } catch (ParseException unused2) {
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.US);
            simpleDateFormat4.setTimeZone(a);
            return simpleDateFormat4.parse(str).getTime();
        }
    }

    public static long b(String str) {
        try {
            return a(str);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String c(long j) {
        Calendar calendar = Calendar.getInstance(a);
        calendar.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        sb.append(calendar.get(1));
        sb.append("-");
        int i = calendar.get(2) + 1;
        if (i < 10) {
            sb.append(a.h(i, "0"));
        } else {
            sb.append(i);
        }
        sb.append("-");
        int i2 = calendar.get(5);
        if (i2 < 10) {
            sb.append(a.h(i2, "0"));
        } else {
            sb.append(i2);
        }
        sb.append("T");
        int i3 = calendar.get(11);
        if (i3 < 10) {
            sb.append(a.h(i3, "0"));
        } else {
            sb.append(i3);
        }
        sb.append(":");
        int i4 = calendar.get(12);
        if (i4 < 10) {
            sb.append(a.h(i4, "0"));
        } else {
            sb.append(i4);
        }
        sb.append(":");
        int i5 = calendar.get(13);
        if (i5 < 10) {
            sb.append(a.h(i5, "0"));
        } else {
            sb.append(i5);
        }
        sb.append("Z");
        return sb.toString();
    }
}
