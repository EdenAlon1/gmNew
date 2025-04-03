package defpackage;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgup extends fgun {
    private static final long serialVersionUID = 3005824302269636122L;
    final boolean c;

    public fgup(String str) {
        super(str);
        this.c = str.endsWith("'Z'");
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.b);
        gregorianCalendar.setTimeInMillis(date.getTime());
        fgur.c(stringBuffer, gregorianCalendar.get(1), 4);
        fgur.c(stringBuffer, gregorianCalendar.get(2) + 1, 2);
        fgur.c(stringBuffer, gregorianCalendar.get(5), 2);
        stringBuffer.append("T");
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
            if (str.length() > 20 && !this.a) {
                parsePosition.setErrorIndex(20);
                return null;
            }
        } else if (str.length() > 17 && !this.a) {
            parsePosition.setErrorIndex(17);
            return null;
        }
        try {
            if (str.charAt(8) != 'T') {
                parsePosition.setErrorIndex(8);
                return null;
            }
            if (this.c && str.charAt(15) != 'Z') {
                parsePosition.setErrorIndex(15);
                return null;
            }
            Date time = fgur.b(this.a, this.b, Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(4, 6)) - 1, Integer.parseInt(str.substring(6, 8)), Integer.parseInt(str.substring(9, 11)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(13, 15))).getTime();
            parsePosition.setIndex(15);
            return time;
        } catch (Exception unused) {
            return null;
        }
    }
}
