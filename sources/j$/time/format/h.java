package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* loaded from: classes9.dex */
final class h implements InterfaceC0036f {
    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        Long e = yVar.e(ChronoField.INSTANT_SECONDS);
        TemporalAccessor d = yVar.d();
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long valueOf = d.f(chronoField) ? Long.valueOf(yVar.d().y(chronoField)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int a0 = chronoField.a0(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long f = j$.nio.file.attribute.p.f(j, 315569520000L) + 1;
            LocalDateTime e0 = LocalDateTime.e0(j$.nio.file.attribute.p.g(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (f > 0) {
                sb.append('+');
                sb.append(f);
            }
            sb.append(e0);
            if (e0.c0() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime e02 = LocalDateTime.e0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(e02);
            if (e02.c0() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (e02.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a0 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a0 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a0 / i2;
                sb.append((char) (i3 + 48));
                a0 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.e('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder.p(chronoField, 2);
        dateTimeFormatterBuilder.e(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.p(chronoField2, 2);
        dateTimeFormatterBuilder.e(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.p(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i4 = 0;
        dateTimeFormatterBuilder.b(chronoField4, 0, 9, true);
        dateTimeFormatterBuilder.e('Z');
        C0035e g = dateTimeFormatterBuilder.A(Locale.getDefault()).g();
        w d = wVar.d();
        int u = g.u(d, charSequence, i);
        if (u < 0) {
            return u;
        }
        long longValue = d.j(ChronoField.YEAR).longValue();
        int intValue = d.j(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = d.j(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = d.j(chronoField).intValue();
        int intValue4 = d.j(chronoField2).intValue();
        Long j = d.j(chronoField3);
        Long j2 = d.j(chronoField4);
        int intValue5 = j != null ? j.intValue() : 0;
        int intValue6 = j2 != null ? j2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i3 = intValue5;
            i4 = 1;
            i2 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            wVar.p();
            i2 = intValue3;
            i3 = 59;
        } else {
            i2 = intValue3;
            i3 = intValue5;
        }
        try {
            return wVar.o(chronoField4, intValue6, i, wVar.o(ChronoField.INSTANT_SECONDS, LocalDateTime.of(((int) longValue) % 10000, intValue, intValue2, i2, intValue4, i3, 0).plusDays(i4).toEpochSecond(ZoneOffset.UTC) + j$.time.b.d(longValue / 10000, 315569520000L), i, u));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
