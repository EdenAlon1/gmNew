package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahno {
    private static final enru a = enru.c("com/google/android/apps/messaging/linkify/TextLinkToLinkifyEntityTypeConverter");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final cgln a(exam examVar) {
        if (examVar.a() <= 0) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) j.h("com/google/android/apps/messaging/linkify/TextLinkToLinkifyEntityTypeConverter", "getLinkifyEntityType", 17, "TextLinkToLinkifyEntityTypeConverter.kt")).q("TextLink has no entity type!");
            return cgln.UNKNOWN;
        }
        String b = examVar.b(0);
        switch (b.hashCode()) {
            case -1271823248:
                if (b.equals("flight")) {
                    return cgln.FLIGHT_NUMBER;
                }
                break;
            case -1147692044:
                if (b.equals("address")) {
                    return cgln.STREET_ADDRESS;
                }
                break;
            case -133689903:
                if (b.equals("tracking_number")) {
                    return cgln.TRACKING_NUMBER;
                }
                break;
            case 116079:
                if (b.equals("url")) {
                    return cgln.WEB_URL;
                }
                break;
            case 3076014:
                if (b.equals("date")) {
                    return cgln.DATE;
                }
                break;
            case 3594628:
                if (b.equals("unit")) {
                    return cgln.UNIT;
                }
                break;
            case 96619420:
                if (b.equals("email")) {
                    return cgln.EMAIL_ADDRESS;
                }
                break;
            case 106642798:
                if (b.equals("phone")) {
                    return cgln.PHONE_NUMBER;
                }
                break;
            case 1793702779:
                if (b.equals("datetime")) {
                    return cgln.DATE_TIME;
                }
                break;
        }
        return cgln.UNKNOWN;
    }
}
