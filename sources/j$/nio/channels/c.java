package j$.nio.channels;

import j$.nio.file.attribute.m;
import j$.nio.file.attribute.p;
import j$.time.format.TextStyle;
import java.nio.file.attribute.FileAttribute;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class c {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.nio.channels.c.a(this, doubleConsumer3);
            }
        };
    }

    private static String b(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String c(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static /* synthetic */ m[] d(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            mVarArr[i] = p.a(fileAttributeArr[i]);
        }
        return mVarArr;
    }

    public static /* synthetic */ FileAttribute[] e(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr[i] = p.c(mVarArr[i]);
        }
        return fileAttributeArr;
    }

    public static void f(HashMap hashMap, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getWeekdays().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
        for (long j = 1; j <= length; j++) {
            String b = b(j, "cccc", locale);
            linkedHashMap.put(Long.valueOf(j), b);
            linkedHashMap2.put(Long.valueOf(j), z ? new StringBuilder().appendCodePoint(b.codePointBefore(b.length())).toString() : b.substring(0, Character.charCount(b.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), b(j, "ccc", locale));
        }
        if (length > 0) {
            hashMap.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            hashMap.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            hashMap.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
            hashMap.put(TextStyle.FULL, linkedHashMap);
            hashMap.put(TextStyle.NARROW, linkedHashMap2);
            hashMap.put(TextStyle.SHORT, linkedHashMap3);
        }
    }

    public static void g(HashMap hashMap, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (long j = 1; j <= length; j++) {
            String c = c(j, "LLLL", locale);
            linkedHashMap.put(Long.valueOf(j), c);
            linkedHashMap2.put(Long.valueOf(j), c.substring(0, Character.charCount(c.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), c(j, "LLL", locale));
        }
        if (length > 0) {
            hashMap.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            hashMap.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            hashMap.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
            hashMap.put(TextStyle.FULL, linkedHashMap);
            hashMap.put(TextStyle.NARROW, linkedHashMap2);
            hashMap.put(TextStyle.SHORT, linkedHashMap3);
        }
    }
}
