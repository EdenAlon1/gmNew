package defpackage;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fguo extends fgun {
    private static final long serialVersionUID = -7626077667268431779L;

    public fguo(String str) {
        super(str);
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        Calendar calendar = Calendar.getInstance(this.b);
        calendar.setTimeInMillis(date.getTime());
        fgur.c(stringBuffer, calendar.get(1), 4);
        fgur.c(stringBuffer, calendar.get(2) + 1, 2);
        fgur.c(stringBuffer, calendar.get(5), 2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        if (str.length() > 8 && !this.a) {
            parsePosition.setErrorIndex(8);
            return null;
        }
        try {
            Date time = fgur.b(this.a, this.b, Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(4, 6)) - 1, Integer.parseInt(str.substring(6, 8)), 0, 0, 0).getTime();
            parsePosition.setIndex(8);
            return time;
        } catch (Exception unused) {
            return null;
        }
    }
}
