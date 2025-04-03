package defpackage;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feok {
    private static final long a = TimeUnit.SECONDS.toNanos(1);

    public static Boolean a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer c(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int intValue = d.intValue();
        if (intValue == d.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        Objects.toString(d);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
    }

    public static Long d(Map map, String str) {
        boolean z;
        int i;
        String e = e(map, str);
        if (e == null) {
            return null;
        }
        try {
            if (e.isEmpty() || e.charAt(e.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(e), 0);
            }
            if (e.charAt(0) == '-') {
                e = e.substring(1);
                z = true;
            } else {
                z = false;
            }
            String substring = e.substring(0, e.length() - 1);
            String str2 = "";
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            }
            long parseLong = Long.parseLong(substring);
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
            if (parseLong < 0) {
                throw new ParseException("Invalid duration string: ".concat(String.valueOf(e)), 0);
            }
            if (z) {
                parseLong = -parseLong;
                i = -i;
            }
            long j = i;
            try {
                long j2 = a;
                if (j <= (-j2) || j >= j2) {
                    parseLong = erlc.b(parseLong, j / j2);
                    i = (int) (j % j2);
                }
                if (parseLong > 0 && i < 0) {
                    parseLong--;
                    i = (int) (i + j2);
                }
                if (parseLong < 0 && i > 0) {
                    parseLong++;
                    i = (int) (i - j2);
                }
                if (parseLong >= -315576000000L && parseLong <= 315576000000L) {
                    long j3 = i;
                    if (j3 >= -999999999 && j3 < j2 && ((parseLong >= 0 && i >= 0) || (parseLong <= 0 && i <= 0))) {
                        long nanos = TimeUnit.SECONDS.toNanos(parseLong);
                        long j4 = nanos + j3;
                        if (!(((j3 ^ nanos) < 0) | ((nanos ^ j4) >= 0))) {
                            j4 = ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
                        }
                        return Long.valueOf(j4);
                    }
                }
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(parseLong), Integer.valueOf(i)));
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List f(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List g(Map map, String str) {
        List f = f(map, str);
        if (f == null) {
            return null;
        }
        j(f);
        return f;
    }

    public static List h(Map map, String str) {
        List f = f(map, str);
        if (f == null) {
            return null;
        }
        for (int i = 0; i < f.size(); i++) {
            if (!(f.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", f.get(i), Integer.valueOf(i), f));
            }
        }
        return f;
    }

    public static Map i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static void j(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }
}
