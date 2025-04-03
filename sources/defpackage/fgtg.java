package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgtg implements eyge {
    UNSET(0),
    PHONE_NUMBER(1),
    GROUP_ID(2),
    FIREBALL_BOT(3),
    CALL_CONTROLLER(4),
    SUGGESTER(5),
    FI_ID(6),
    SYSTEM(7),
    DUO_BOT(8),
    MATCHBOX_ID(9),
    RCS_BOT(10),
    WIREBALL(11),
    SERVICE_ACCOUNT(12),
    DEVICE_ID(13),
    FOREIGN_RCS_GROUP(14),
    DITTO(15),
    EMAIL(16),
    GAIA_ID(17),
    LIGHTER_ID(18),
    OPAQUE_ID(19),
    SERVER(20),
    SHORT_CODE(21),
    CLOUDCAST_PLAYER_ID(22),
    CHROMOTING_ID(23),
    UNNORMALIZABLE_PHONE_NUMBER(24),
    NOT_KNOWN(25),
    ANDROID_ID(26),
    NEARBY_ID(27),
    WAZE_ID(28),
    GUEST(29),
    MESSAGES_DATA_DONATION(30),
    DUO_CLIP_ID(31),
    ACCOUNT_ID(32),
    CARRIER_ID(33),
    EXTERNAL_PARTNER_ID(34),
    UNAUTHENTICATED_USER_ID(35),
    SUPPORT_CASES_ID(36),
    FITBIT_P11_ID(37),
    SHORT_PHONE_NUMBER(38),
    USER_HANDLE(39),
    PENPAL_CONVERSATION_ID(40),
    EMERGENCY(41),
    UNRECOGNIZED(-1);

    private final int S;

    fgtg(int i) {
        this.S = i;
    }

    public static fgtg b(int i) {
        switch (i) {
            case 0:
                return UNSET;
            case 1:
                return PHONE_NUMBER;
            case 2:
                return GROUP_ID;
            case 3:
                return FIREBALL_BOT;
            case 4:
                return CALL_CONTROLLER;
            case 5:
                return SUGGESTER;
            case 6:
                return FI_ID;
            case 7:
                return SYSTEM;
            case 8:
                return DUO_BOT;
            case 9:
                return MATCHBOX_ID;
            case 10:
                return RCS_BOT;
            case 11:
                return WIREBALL;
            case 12:
                return SERVICE_ACCOUNT;
            case 13:
                return DEVICE_ID;
            case 14:
                return FOREIGN_RCS_GROUP;
            case 15:
                return DITTO;
            case 16:
                return EMAIL;
            case 17:
                return GAIA_ID;
            case 18:
                return LIGHTER_ID;
            case 19:
                return OPAQUE_ID;
            case 20:
                return SERVER;
            case 21:
                return SHORT_CODE;
            case 22:
                return CLOUDCAST_PLAYER_ID;
            case 23:
                return CHROMOTING_ID;
            case 24:
                return UNNORMALIZABLE_PHONE_NUMBER;
            case 25:
                return NOT_KNOWN;
            case 26:
                return ANDROID_ID;
            case 27:
                return NEARBY_ID;
            case 28:
                return WAZE_ID;
            case 29:
                return GUEST;
            case 30:
                return MESSAGES_DATA_DONATION;
            case 31:
                return DUO_CLIP_ID;
            case 32:
                return ACCOUNT_ID;
            case 33:
                return CARRIER_ID;
            case 34:
                return EXTERNAL_PARTNER_ID;
            case 35:
                return UNAUTHENTICATED_USER_ID;
            case 36:
                return SUPPORT_CASES_ID;
            case 37:
                return FITBIT_P11_ID;
            case 38:
                return SHORT_PHONE_NUMBER;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return USER_HANDLE;
            case 40:
                return PENPAL_CONVERSATION_ID;
            case 41:
                return EMERGENCY;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.S;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
