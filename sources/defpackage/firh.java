package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class firh {
    public static volatile Map a;
    private static final firg b;
    private static volatile firg c;

    static {
        firg firgVar = new firg();
        b = firgVar;
        c = firgVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", firk.a);
        linkedHashMap.put("UTC", firk.a);
        linkedHashMap.put("GMT", firk.a);
        d(linkedHashMap, "EST", "America/New_York");
        d(linkedHashMap, "EDT", "America/New_York");
        d(linkedHashMap, "CST", "America/Chicago");
        d(linkedHashMap, "CDT", "America/Chicago");
        d(linkedHashMap, "MST", "America/Denver");
        d(linkedHashMap, "MDT", "America/Denver");
        d(linkedHashMap, "PST", "America/Los_Angeles");
        d(linkedHashMap, "PDT", "America/Los_Angeles");
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final DateFormatSymbols b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final firb c(firb firbVar) {
        return firbVar == null ? fist.N() : firbVar;
    }

    private static void d(Map map, String str, String str2) {
        try {
            map.put(str, firk.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
