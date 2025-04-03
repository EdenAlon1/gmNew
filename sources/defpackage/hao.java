package defpackage;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hao extends ham {
    public static final ZoneId c = ZoneId.of("UTC");
    private final int d;
    private final List e;

    public hao(Locale locale) {
        super(locale);
        this.d = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            arrayList.add(new ffcf(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.e = arrayList;
    }

    private final haq l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.d;
        if (value < 0) {
            value += 7;
        }
        return new haq(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.B(LocalTime.MIDNIGHT).q(c).toInstant().toEpochMilli());
    }

    @Override // defpackage.ham
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ham
    public final hal b(long j) {
        LocalDate b = Instant.ofEpochMilli(j).atZone(c).b();
        return new hal(b.getYear(), b.getMonthValue(), b.getDayOfMonth(), 1000 * b.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // defpackage.ham
    public final hal c() {
        LocalDate now = LocalDate.now();
        return new hal(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.B(LocalTime.MIDNIGHT).q(c).toInstant().toEpochMilli());
    }

    @Override // defpackage.ham
    public final hal d(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, han.a(str2, locale, this.b));
            return new hal(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.B(LocalTime.MIDNIGHT).q(c).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // defpackage.ham
    public final haq e(long j) {
        return l(Instant.ofEpochMilli(j).atZone(c).withDayOfMonth(1).b());
    }

    @Override // defpackage.ham
    public final haq f(hal halVar) {
        return l(LocalDate.of(halVar.a, halVar.b, 1));
    }

    @Override // defpackage.ham
    public final haq g(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // defpackage.ham
    public final haq h(haq haqVar, int i) {
        return i <= 0 ? haqVar : l(Instant.ofEpochMilli(haqVar.e).atZone(c).b().plusMonths(i));
    }

    @Override // defpackage.ham
    public final haw i(Locale locale) {
        String B = ffpc.B(ffpc.q(new ffpa("y{1,4}").a(new ffpa("M{1,2}").a(new ffpa("d{1,2}").a(new ffpa("[^dMy/\\-.]").a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.CC.ofLocale(locale), locale), ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
        ffos e = new ffpa("[/\\-.]").e(B);
        e.getClass();
        ffor b = ((ffov) e).b.b(0);
        b.getClass();
        return new haw(B, b.a.charAt(0));
    }

    @Override // defpackage.ham
    public final String j(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(c).b().format(han.a(str, locale, this.b));
    }

    @Override // defpackage.ham
    public final List k() {
        return this.e;
    }

    public final String toString() {
        return "CalendarModel";
    }
}
