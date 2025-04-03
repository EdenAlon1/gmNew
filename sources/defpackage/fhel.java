package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhel {
    private static final Map a = new ConcurrentHashMap();

    static {
        a("ical4j.unfolding.relaxed", "true".equals(fhem.a("ical4j.unfolding.relaxed")));
        a("ical4j.parsing.relaxed", "true".equals(fhem.a("ical4j.parsing.relaxed")));
        a("ical4j.validation.relaxed", "true".equals(fhem.a("ical4j.validation.relaxed")));
        a("ical4j.compatibility.outlook", "true".equals(fhem.a("ical4j.compatibility.outlook")));
        a("ical4j.compatibility.notes", "true".equals(fhem.a("ical4j.compatibility.notes")));
    }

    public static void a(String str, boolean z) {
        a.put(str, Boolean.valueOf(z));
    }

    public static boolean b(String str) {
        Map map = a;
        return map.get(str) != null ? ((Boolean) map.get(str)).booleanValue() : "true".equals(fhem.a(str));
    }
}
