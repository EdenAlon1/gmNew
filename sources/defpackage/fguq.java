package defpackage;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fguq extends fgun {
    private static final long serialVersionUID = -1367114409994225425L;
    final boolean c;

    public fguq(String str) {
        super(str);
        this.c = str.endsWith("'Z'");
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.b);
        gregorianCalendar.setTimeInMillis(date.getTime());
        fgur.c(stringBuffer, gregorianCalendar.get(11), 2);
        fgur.c(stringBuffer, gregorianCalendar.get(12), 2);
        fgur.c(stringBuffer, gregorianCalendar.get(13), 2);
        if (this.c) {
            stringBuffer.append("Z");
        }
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        if (this.c) {
            if (str.length() > 9 && !this.a) {
                parsePosition.setErrorIndex(9);
                return null;
            }
        } else if (str.length() > 6 && !this.a) {
            parsePosition.setErrorIndex(6);
            return null;
        }
        try {
            if (this.c && str.charAt(6) != 'Z') {
                parsePosition.setErrorIndex(6);
                return null;
            }
            Date time = fgur.b(this.a, this.b, 1970, 0, 1, Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)), Integer.parseInt(str.substring(4, 6))).getTime();
            parsePosition.setIndex(6);
            return time;
        } catch (Exception unused) {
            return null;
        }
    }
}
