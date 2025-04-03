package j$.time;

/* loaded from: classes9.dex */
public class TimeConversions {
    public static java.time.ZonedDateTime convert(ZonedDateTime zonedDateTime) {
        java.time.ZonedDateTime of;
        if (zonedDateTime == null) {
            return null;
        }
        of = java.time.ZonedDateTime.of(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.b0(), zonedDateTime.a0(), convert(zonedDateTime.getZone()));
        return of;
    }

    public static java.time.ZoneId convert(ZoneId zoneId) {
        java.time.ZoneId of;
        if (zoneId == null) {
            return null;
        }
        of = java.time.ZoneId.of(zoneId.n());
        return of;
    }

    public static java.time.Instant convert(Instant instant) {
        java.time.Instant ofEpochSecond;
        if (instant == null) {
            return null;
        }
        ofEpochSecond = java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
        return ofEpochSecond;
    }
}
