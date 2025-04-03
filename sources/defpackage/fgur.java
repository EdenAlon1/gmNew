package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgur {
    private static final Log a = LogFactory.getLog(fgur.class);

    private fgur() {
    }

    public static DateFormat a(String str) {
        if (str.equals("yyyyMMdd'T'HHmmss") || str.equals("yyyyMMdd'T'HHmmss'Z'")) {
            return new fgup(str);
        }
        if (str.equals("yyyyMMdd")) {
            return new fguo(str);
        }
        if (str.equals("HHmmss") || str.equals("HHmmss'Z'")) {
            return new fguq(str);
        }
        Log log = a;
        if (log.isDebugEnabled()) {
            log.debug("unexpected date format pattern: ".concat(String.valueOf(str)));
        }
        return new SimpleDateFormat(str);
    }

    public static Calendar b(boolean z, TimeZone timeZone, int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setLenient(z);
        gregorianCalendar.set(i, i2, i3, i4, i5, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar;
    }

    public static void c(StringBuffer stringBuffer, int i, int i2) {
        String num = Integer.toString(i);
        int length = i2 - num.length();
        for (int i3 = 0; i3 < length; i3++) {
            stringBuffer.append("0");
        }
        stringBuffer.append(num);
    }
}
