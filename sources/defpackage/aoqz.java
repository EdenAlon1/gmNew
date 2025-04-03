package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aoqz implements eyge {
    UNKNOWN_DESTINATION_TYPE(0),
    PHONE_E164(1),
    EMAIL(2),
    BOT(3),
    UNKNOWN_SENDER(4),
    PHONE_SHORT_NO_COUNTRY(5),
    PHONE_SHORT_WITH_COUNTRY(6),
    PHONE_EMERGENCY(7),
    PHONE_LOCAL_WITH_COUNTRY(8),
    PHONE_LOCAL_NO_COUNTRY(9),
    PHONE_NATIONAL(10),
    SATELLITE_ESP(11),
    PENPAL_BOT(12),
    ALPHA_SHORT_NO_COUNTRY(13),
    ALPHA_SHORT_WITH_COUNTRY(14),
    PHONE_WITH_COUNTRY(15),
    PHONE_WITH_IDD(16),
    PHONE_WITH_PLUS(17),
    PHONE_INVALID_TOO_SHORT(18),
    PHONE_INVALID_TOO_LONG(19),
    PHONE_INVALID_LENGTH(20),
    PHONE_INVALID_COUNTRY_CODE(21),
    UNKNOWN_DIALABLE(22),
    UNRECOGNIZED(-1);

    private final int z;

    aoqz(int i) {
        this.z = i;
    }

    public static aoqz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DESTINATION_TYPE;
            case 1:
                return PHONE_E164;
            case 2:
                return EMAIL;
            case 3:
                return BOT;
            case 4:
                return UNKNOWN_SENDER;
            case 5:
                return PHONE_SHORT_NO_COUNTRY;
            case 6:
                return PHONE_SHORT_WITH_COUNTRY;
            case 7:
                return PHONE_EMERGENCY;
            case 8:
                return PHONE_LOCAL_WITH_COUNTRY;
            case 9:
                return PHONE_LOCAL_NO_COUNTRY;
            case 10:
                return PHONE_NATIONAL;
            case 11:
                return SATELLITE_ESP;
            case 12:
                return PENPAL_BOT;
            case 13:
                return ALPHA_SHORT_NO_COUNTRY;
            case 14:
                return ALPHA_SHORT_WITH_COUNTRY;
            case 15:
                return PHONE_WITH_COUNTRY;
            case 16:
                return PHONE_WITH_IDD;
            case 17:
                return PHONE_WITH_PLUS;
            case 18:
                return PHONE_INVALID_TOO_SHORT;
            case 19:
                return PHONE_INVALID_TOO_LONG;
            case 20:
                return PHONE_INVALID_LENGTH;
            case 21:
                return PHONE_INVALID_COUNTRY_CODE;
            case 22:
                return UNKNOWN_DIALABLE;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
