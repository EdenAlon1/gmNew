package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class DateTimeFormatterBuilder {
    private static final C0031a h = new C0031a();
    private static final HashMap i;
    public static final /* synthetic */ int j = 0;
    private DateTimeFormatterBuilder a;
    private final DateTimeFormatterBuilder b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = j$.time.temporal.g.a;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.i.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private DateTimeFormatter B(Locale locale, D d, j$.time.chrono.r rVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            t();
        }
        return new DateTimeFormatter(new C0035e(this.c, false), locale, DecimalStyle.d, d, rVar, null);
    }

    private int d(InterfaceC0036f interfaceC0036f) {
        Objects.a(interfaceC0036f, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            m mVar = new m(interfaceC0036f, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            interfaceC0036f = mVar;
        }
        dateTimeFormatterBuilder.c.add(interfaceC0036f);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        Objects.a(locale, "locale");
        Objects.a(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (!(dateInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateInstance)));
        }
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i2 = 0;
        boolean z = pattern.indexOf(66) != -1;
        boolean z2 = pattern.indexOf(98) != -1;
        if (!z && !z2) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder(pattern.length());
        char c = ' ';
        while (i2 < pattern.length()) {
            char charAt = pattern.charAt(i2);
            if (charAt != ' ') {
                if (charAt != 'B' && charAt != 'b') {
                    sb.append(charAt);
                }
            } else if (i2 == 0 || (c != 'B' && c != 'b')) {
                sb.append(charAt);
            }
            i2++;
            c = charAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    private void n(k kVar) {
        k e;
        E e2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = d(kVar);
            return;
        }
        k kVar2 = (k) dateTimeFormatterBuilder.c.get(i2);
        int i3 = kVar.b;
        int i4 = kVar.c;
        if (i3 == i4) {
            e2 = kVar.d;
            if (e2 == E.NOT_NEGATIVE) {
                e = kVar2.f(i4);
                d(kVar.e());
                this.a.g = i2;
                this.a.c.set(i2, e);
            }
        }
        e = kVar2.e();
        this.a.g = d(kVar);
        this.a.c.set(i2, e);
    }

    public final DateTimeFormatter A(Locale locale) {
        return B(locale, D.SMART, null);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g());
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            d(new g(chronoField, i2, i3, z));
        } else {
            n(new g(chronoField, i2, i3, z));
        }
    }

    public final void c() {
        d(new h());
    }

    public final void e(char c) {
        d(new C0034d(c));
    }

    public final void f(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new C0034d(str.charAt(0)));
        } else {
            d(new i(1, str));
        }
    }

    public final void g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        d(new j(formatStyle, formatStyle2));
    }

    public final void h(TextStyle textStyle) {
        Objects.a(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new i(0, textStyle));
    }

    public final void i(String str, String str2) {
        d(new l(str, str2));
    }

    public final void j() {
        d(l.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:284:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x047b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.k(java.lang.String):void");
    }

    public final void l(ChronoField chronoField, HashMap hashMap) {
        Objects.a(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        TextStyle textStyle = TextStyle.FULL;
        d(new s(chronoField, textStyle, new C0032b(new A(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void m(TemporalField temporalField, TextStyle textStyle) {
        Objects.a(temporalField, "field");
        Objects.a(textStyle, "textStyle");
        d(new s(temporalField, textStyle, B.c()));
    }

    public final void o(TemporalField temporalField) {
        n(new k(temporalField, 1, 19, E.NORMAL));
    }

    public final void p(TemporalField temporalField, int i2) {
        Objects.a(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            n(new k(temporalField, i2, i2, E.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void q(TemporalField temporalField, int i2, int i3, E e) {
        if (i2 == i3 && e == E.NOT_NEGATIVE) {
            p(temporalField, i3);
            return;
        }
        Objects.a(temporalField, "field");
        Objects.a(e, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            n(new k(temporalField, i2, i3, e));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void r() {
        d(new u(h, "ZoneRegionId()"));
    }

    public final void s(TextStyle textStyle) {
        d(new v(textStyle, false));
    }

    public final void t() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        C0035e c0035e = new C0035e(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        d(c0035e);
    }

    public final void u() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void v() {
        d(r.INSENSITIVE);
    }

    public final void w() {
        d(r.SENSITIVE);
    }

    public final void x() {
        d(r.LENIENT);
    }

    public final void y() {
        d(r.STRICT);
    }

    final DateTimeFormatter z(D d, j$.time.chrono.r rVar) {
        return B(Locale.getDefault(), d, rVar);
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }
}
