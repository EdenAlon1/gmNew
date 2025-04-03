package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static ZoneId toZoneId(TimeZone timeZone) {
        String id = timeZone.getID();
        java.util.Map map = ZoneId.a;
        Objects.a(id, "zoneId");
        Objects.a(map, "aliasMap");
        return ZoneId.of((String) Objects.requireNonNullElse((String) map.get(id), id));
    }
}
