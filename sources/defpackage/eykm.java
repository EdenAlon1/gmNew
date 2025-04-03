package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eykm {
    public static final eyja a;
    public static final eyja b;
    public static final eyja c;
    private static final ThreadLocal d;

    static {
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).b = -62135596800L;
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).c = 0;
        a = (eyja) eyizVar.build();
        eyiz eyizVar2 = (eyiz) eyja.a.createBuilder();
        eyizVar2.copyOnWrite();
        ((eyja) eyizVar2.instance).b = 253402300799L;
        eyizVar2.copyOnWrite();
        ((eyja) eyizVar2.instance).c = 999999999;
        b = (eyja) eyizVar2.build();
        eyiz eyizVar3 = (eyiz) eyja.a.createBuilder();
        eyizVar3.copyOnWrite();
        ((eyja) eyizVar3.instance).b = 0L;
        eyizVar3.copyOnWrite();
        ((eyja) eyizVar3.instance).c = 0;
        c = (eyja) eyizVar3.build();
        d = new eykk();
        l("now");
        l("getEpochSecond");
        l("getNano");
    }

    public static long a(eyja eyjaVar) {
        j(eyjaVar);
        return erlc.b(erlc.c(eyjaVar.b, 1000000L), eyjaVar.c / 1000);
    }

    public static long b(eyja eyjaVar) {
        j(eyjaVar);
        return erlc.b(erlc.c(eyjaVar.b, 1000L), eyjaVar.c / 1000000);
    }

    @Deprecated
    public static eyev c(eyja eyjaVar, eyja eyjaVar2) {
        j(eyjaVar);
        j(eyjaVar2);
        long d2 = erlc.d(eyjaVar2.b, eyjaVar.b);
        int i = eyjaVar2.c;
        int i2 = eyjaVar.c;
        long j = i - i2;
        int i3 = (int) j;
        erld.a(j == ((long) i3), "checkedSubtract", i, i2);
        return eyki.g(d2, i3);
    }

    public static eyja d(long j) {
        return g(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static eyja e(long j) {
        return g(j / 1000000000, (int) (j % 1000000000));
    }

    public static eyja f(long j) {
        return g(j, 0);
    }

    public static eyja g(long j, int i) {
        if (!k(j)) {
            throw new IllegalArgumentException(emyk.a("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = erlc.b(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = erlc.d(j, 1L);
        }
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).b = j;
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).c = i;
        eyja eyjaVar = (eyja) eyizVar.build();
        j(eyjaVar);
        return eyjaVar;
    }

    public static eyja h(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException(a.a(str, "Failed to parse timestamp: invalid timestamp \"", "\""), 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String substring = str.substring(0, indexOf2);
        int indexOf3 = substring.indexOf(46);
        if (indexOf3 != -1) {
            String substring2 = substring.substring(0, indexOf3);
            str2 = substring.substring(indexOf3 + 1);
            substring = substring2;
        } else {
            str2 = "";
        }
        long time = ((SimpleDateFormat) d.get()).parse(substring).getTime() / 1000;
        if (str2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                i *= 10;
                if (i2 < str2.length()) {
                    if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i += str2.charAt(i2) - '0';
                }
            }
        }
        int i3 = indexOf2 + 1;
        if (str.charAt(indexOf2) != 'Z') {
            String substring3 = str.substring(i3);
            int indexOf4 = substring3.indexOf(58);
            if (indexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(String.valueOf(substring3)), 0);
            }
            try {
                long parseLong = ((Long.parseLong(substring3.substring(0, indexOf4)) * 60) + Long.parseLong(substring3.substring(indexOf4 + 1))) * 60;
                time = str.charAt(indexOf2) == '+' ? time - parseLong : time + parseLong;
            } catch (NumberFormatException e) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(String.valueOf(substring3)), 0);
                parseException.initCause(e);
                throw parseException;
            }
        } else if (str.length() != i3) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
        }
        try {
            return g(time, i);
        } catch (IllegalArgumentException e2) {
            ParseException parseException2 = new ParseException(a.a(str, "Failed to parse timestamp ", " Timestamp is out of range."), 0);
            parseException2.initCause(e2);
            throw parseException2;
        }
    }

    public static String i(eyja eyjaVar) {
        j(eyjaVar);
        long j = eyjaVar.b;
        int i = eyjaVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) d.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            sb.append(i % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i / 1000000)) : i % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i)));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static void j(eyja eyjaVar) {
        long j = eyjaVar.b;
        boolean k = k(j);
        int i = eyjaVar.c;
        if (!k || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(emyk.a("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean k(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void l(String str) {
        try {
            Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
        }
    }
}
