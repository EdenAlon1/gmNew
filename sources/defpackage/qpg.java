package defpackage;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpg {
    public static long a(String str) {
        try {
            return c("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                qox.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            qox.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static qnv b(qoh qohVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Map map = qohVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = currentTimeMillis;
            j5 = a(str4);
        } else {
            j4 = currentTimeMillis;
            j5 = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j8 = (j3 * 1000) + j4;
            if (z) {
                j7 = j8;
            } else {
                Long.signum(j2);
                j7 = (j2 * 1000) + j8;
            }
            j6 = j8;
        } else {
            j6 = (a <= j || a2 < a) ? j : (a2 - a) + j4;
            j7 = j6;
        }
        qnv qnvVar = new qnv();
        qnvVar.a = qohVar.b;
        qnvVar.b = str5;
        qnvVar.f = j6;
        qnvVar.e = j7;
        qnvVar.c = a;
        qnvVar.d = j5;
        qnvVar.g = map;
        qnvVar.h = qohVar.d;
        return qnvVar;
    }

    public static SimpleDateFormat c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
