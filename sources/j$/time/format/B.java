package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
class B {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new z();
    private static final B c = new B();
    public static final /* synthetic */ int d = 0;

    private static Object b(TemporalField temporalField, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap hashMap = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    Long valueOf = Long.valueOf(j);
                    String str = eras[i];
                    hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap2);
                hashMap.put(TextStyle.SHORT, hashMap2);
                hashMap.put(TextStyle.NARROW, hashMap3);
            }
            obj = new A(hashMap);
        } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
            j$.nio.channels.c.g(hashMap, DateFormatSymbols.getInstance(locale), locale);
            obj = new A(hashMap);
        } else if (temporalField == ChronoField.DAY_OF_WEEK) {
            j$.nio.channels.c.f(hashMap, DateFormatSymbols.getInstance(locale), locale);
            obj = new A(hashMap);
        } else if (temporalField == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j2 = i2;
                    hashMap4.put(Long.valueOf(j2), amPmStrings[i2]);
                    Long valueOf2 = Long.valueOf(j2);
                    String str2 = amPmStrings[i2];
                    hashMap5.put(valueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap4);
                hashMap.put(TextStyle.SHORT, hashMap4);
                hashMap.put(TextStyle.NARROW, hashMap5);
            }
            obj = new A(hashMap);
        } else {
            obj = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    static B c() {
        return c;
    }

    public String d(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.r.e || !(temporalField instanceof ChronoField)) {
            return e(temporalField, j, textStyle, locale);
        }
        return null;
    }

    public String e(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object b2 = b(temporalField, locale);
        if (b2 instanceof A) {
            return ((A) b2).a(j, textStyle);
        }
        return null;
    }

    public Iterator f(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.r.e || !(temporalField instanceof ChronoField)) {
            return g(temporalField, textStyle, locale);
        }
        return null;
    }

    public Iterator g(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        Object b2 = b(temporalField, locale);
        if (b2 instanceof A) {
            return ((A) b2).b(textStyle);
        }
        return null;
    }
}
