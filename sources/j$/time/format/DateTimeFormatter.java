package j$.time.format;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter g;
    private final C0035e a;
    private final Locale b;
    private final DecimalStyle c;
    private final D d;
    private final j$.time.chrono.r e;
    private final ZoneId f;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        E e = E.EXCEEDS_PAD;
        dateTimeFormatterBuilder.q(chronoField, 4, 10, e);
        dateTimeFormatterBuilder.e('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.p(chronoField2, 2);
        dateTimeFormatterBuilder.e('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        dateTimeFormatterBuilder.p(chronoField3, 2);
        D d = D.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.e;
        DateTimeFormatter z = dateTimeFormatterBuilder.z(d, rVar);
        ISO_LOCAL_DATE = z;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.v();
        dateTimeFormatterBuilder2.a(z);
        dateTimeFormatterBuilder2.j();
        dateTimeFormatterBuilder2.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.v();
        dateTimeFormatterBuilder3.a(z);
        dateTimeFormatterBuilder3.u();
        dateTimeFormatterBuilder3.j();
        dateTimeFormatterBuilder3.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.p(chronoField4, 2);
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.p(chronoField5, 2);
        dateTimeFormatterBuilder4.u();
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.p(chronoField6, 2);
        dateTimeFormatterBuilder4.u();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter z2 = dateTimeFormatterBuilder4.z(d, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.v();
        dateTimeFormatterBuilder5.a(z2);
        dateTimeFormatterBuilder5.j();
        dateTimeFormatterBuilder5.z(d, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.v();
        dateTimeFormatterBuilder6.a(z2);
        dateTimeFormatterBuilder6.u();
        dateTimeFormatterBuilder6.j();
        dateTimeFormatterBuilder6.z(d, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.v();
        dateTimeFormatterBuilder7.a(z);
        dateTimeFormatterBuilder7.e('T');
        dateTimeFormatterBuilder7.a(z2);
        DateTimeFormatter z3 = dateTimeFormatterBuilder7.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.v();
        dateTimeFormatterBuilder8.a(z3);
        dateTimeFormatterBuilder8.x();
        dateTimeFormatterBuilder8.j();
        dateTimeFormatterBuilder8.y();
        DateTimeFormatter z4 = dateTimeFormatterBuilder8.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(z4);
        dateTimeFormatterBuilder9.u();
        dateTimeFormatterBuilder9.e('[');
        dateTimeFormatterBuilder9.w();
        dateTimeFormatterBuilder9.r();
        dateTimeFormatterBuilder9.e(']');
        dateTimeFormatterBuilder9.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(z3);
        dateTimeFormatterBuilder10.u();
        dateTimeFormatterBuilder10.j();
        dateTimeFormatterBuilder10.u();
        dateTimeFormatterBuilder10.e('[');
        dateTimeFormatterBuilder10.w();
        dateTimeFormatterBuilder10.r();
        dateTimeFormatterBuilder10.e(']');
        dateTimeFormatterBuilder10.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.v();
        dateTimeFormatterBuilder11.q(chronoField, 4, 10, e);
        dateTimeFormatterBuilder11.e('-');
        dateTimeFormatterBuilder11.p(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.u();
        dateTimeFormatterBuilder11.j();
        dateTimeFormatterBuilder11.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.v();
        dateTimeFormatterBuilder12.q(j$.time.temporal.g.c, 4, 10, e);
        dateTimeFormatterBuilder12.f("-W");
        dateTimeFormatterBuilder12.p(j$.time.temporal.g.b, 2);
        dateTimeFormatterBuilder12.e('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.p(chronoField7, 1);
        dateTimeFormatterBuilder12.u();
        dateTimeFormatterBuilder12.j();
        dateTimeFormatterBuilder12.z(d, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.v();
        dateTimeFormatterBuilder13.c();
        g = dateTimeFormatterBuilder13.z(d, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.v();
        dateTimeFormatterBuilder14.p(chronoField, 4);
        dateTimeFormatterBuilder14.p(chronoField2, 2);
        dateTimeFormatterBuilder14.p(chronoField3, 2);
        dateTimeFormatterBuilder14.u();
        dateTimeFormatterBuilder14.x();
        dateTimeFormatterBuilder14.i("+HHMMss", "Z");
        dateTimeFormatterBuilder14.y();
        dateTimeFormatterBuilder14.z(d, rVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.v();
        dateTimeFormatterBuilder15.x();
        dateTimeFormatterBuilder15.u();
        dateTimeFormatterBuilder15.l(chronoField7, hashMap);
        dateTimeFormatterBuilder15.f(", ");
        dateTimeFormatterBuilder15.t();
        dateTimeFormatterBuilder15.q(chronoField3, 1, 2, E.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.e(' ');
        dateTimeFormatterBuilder15.l(chronoField2, hashMap2);
        dateTimeFormatterBuilder15.e(' ');
        dateTimeFormatterBuilder15.p(chronoField, 4);
        dateTimeFormatterBuilder15.e(' ');
        dateTimeFormatterBuilder15.p(chronoField4, 2);
        dateTimeFormatterBuilder15.e(':');
        dateTimeFormatterBuilder15.p(chronoField5, 2);
        dateTimeFormatterBuilder15.u();
        dateTimeFormatterBuilder15.e(':');
        dateTimeFormatterBuilder15.p(chronoField6, 2);
        dateTimeFormatterBuilder15.t();
        dateTimeFormatterBuilder15.e(' ');
        dateTimeFormatterBuilder15.i("+HHMM", "GMT");
        dateTimeFormatterBuilder15.z(D.SMART, rVar);
    }

    DateTimeFormatter(C0035e c0035e, Locale locale, DecimalStyle decimalStyle, D d, j$.time.chrono.r rVar, ZoneId zoneId) {
        Objects.a(c0035e, "printerParser");
        this.a = c0035e;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(decimalStyle, "decimalStyle");
        this.c = decimalStyle;
        Objects.a(d, "resolverStyle");
        this.d = d;
        this.e = rVar;
        this.f = zoneId;
    }

    private TemporalAccessor f(CharSequence charSequence) {
        String charSequence2;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.a(charSequence, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        w wVar = new w(this);
        int u = this.a.u(wVar, charSequence, parsePosition.getIndex());
        if (u < 0) {
            parsePosition.setErrorIndex(~u);
            wVar = null;
        } else {
            parsePosition.setIndex(u);
        }
        if (wVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return wVar.t(this.d);
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.a(formatStyle, "dateTimeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.g(formatStyle, formatStyle);
        return dateTimeFormatterBuilder.z(D.SMART, j$.time.chrono.r.e);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.k(str);
        return dateTimeFormatterBuilder.A(Locale.getDefault());
    }

    public final Chronology a() {
        return this.e;
    }

    public final DecimalStyle b() {
        return this.c;
    }

    public final Locale c() {
        return this.b;
    }

    public final ZoneId d() {
        return this.f;
    }

    public final Object e(CharSequence charSequence, j$.time.temporal.m mVar) {
        String charSequence2;
        Objects.a(charSequence, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        try {
            return ((C) f(charSequence)).D(mVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException(j$.time.d.d("Text '", charSequence2, "' could not be parsed: ", e2.getMessage()), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.a(temporalAccessor, "temporal");
        try {
            this.a.o(new y(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    final C0035e g() {
        return this.a.a();
    }

    public final String toString() {
        String c0035e = this.a.toString();
        return c0035e.startsWith("[") ? c0035e : c0035e.substring(1, c0035e.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e, this.f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.k(str);
        return dateTimeFormatterBuilder.A(locale);
    }
}
