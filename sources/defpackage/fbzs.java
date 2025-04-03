package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbzs implements eyge {
    UNKNOWN(0),
    MESSAGE_ACK(1),
    FIREBALL(2),
    TACHYON(3),
    BASIC(4),
    GROUP(5),
    DEPRECATED_CALL_CONTROLLER(6),
    USERDATA(7),
    MESSAGE_RECEIPT(8),
    SECURE(9),
    PREKEY_SECURE(10),
    RCS_MESSAGE(11),
    SYSTEM_MESSAGE(12),
    MATCHSTICK(13),
    WIREBALL(14),
    SECURE_GROUP_KEY_DISTRIBUTION(15),
    ENGAGEMENT_NOTIFICATION(16),
    COMMON_MEDIA_MESSAGE(17),
    FIREBALL_MESSAGE_ANNOTATION(18),
    DITTO(19),
    SECURE_ONE_TIME_KEY(20),
    DUO_STATE_SYNC_MESSAGE(21),
    GROUP_CALL_STATE(22),
    BUGLE_AGENT(23),
    LIGHTER_MESSAGE(24),
    DUO_UPLOAD_LOGS_MESSAGE(25),
    DUO_GROUP_KEY_DISTRIBUTION(26),
    AQUARIUS_MESSAGE(27),
    CLOUDCAST_MESSAGE(28),
    CHROMOTING_MESSAGE(29),
    DUO_PRECALL(30),
    DUO_MEDIA_CAPTURE_MESSAGE(31),
    DUO_GROUP_KEY_REQUEST(32),
    BUGLE_PUSH(33),
    CMS_NOTIFICATION(34),
    DUO_MESSAGE(35),
    TACHYGRAM_MESSAGE(36),
    MOMENT_MEDIA_MESSAGE(37),
    DUO_IN_CALL_CAPS_CHANGE_MESSAGE(38),
    COMMSSUITE_NOTIFICATION(39),
    MESSAGES_DATA_DONATION(40),
    EXO_MESSAGE(41),
    TINCAN_MESSAGE(42),
    CMS_RPC_MESSAGE(43),
    TACHYGRAM_CONTROL_MESSAGE(44),
    REFLECTED_TACHYGRAM_MESSAGE(45),
    MLS_CONTROL_MESSAGE(46),
    SERVER_MLS_CONTROL_MESSAGE(47),
    UNRECOGNIZED(-1);

    private final int Y;

    fbzs(int i) {
        this.Y = i;
    }

    public static fbzs b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MESSAGE_ACK;
            case 2:
                return FIREBALL;
            case 3:
                return TACHYON;
            case 4:
                return BASIC;
            case 5:
                return GROUP;
            case 6:
                return DEPRECATED_CALL_CONTROLLER;
            case 7:
                return USERDATA;
            case 8:
                return MESSAGE_RECEIPT;
            case 9:
                return SECURE;
            case 10:
                return PREKEY_SECURE;
            case 11:
                return RCS_MESSAGE;
            case 12:
                return SYSTEM_MESSAGE;
            case 13:
                return MATCHSTICK;
            case 14:
                return WIREBALL;
            case 15:
                return SECURE_GROUP_KEY_DISTRIBUTION;
            case 16:
                return ENGAGEMENT_NOTIFICATION;
            case 17:
                return COMMON_MEDIA_MESSAGE;
            case 18:
                return FIREBALL_MESSAGE_ANNOTATION;
            case 19:
                return DITTO;
            case 20:
                return SECURE_ONE_TIME_KEY;
            case 21:
                return DUO_STATE_SYNC_MESSAGE;
            case 22:
                return GROUP_CALL_STATE;
            case 23:
                return BUGLE_AGENT;
            case 24:
                return LIGHTER_MESSAGE;
            case 25:
                return DUO_UPLOAD_LOGS_MESSAGE;
            case 26:
                return DUO_GROUP_KEY_DISTRIBUTION;
            case 27:
                return AQUARIUS_MESSAGE;
            case 28:
                return CLOUDCAST_MESSAGE;
            case 29:
                return CHROMOTING_MESSAGE;
            case 30:
                return DUO_PRECALL;
            case 31:
                return DUO_MEDIA_CAPTURE_MESSAGE;
            case 32:
                return DUO_GROUP_KEY_REQUEST;
            case 33:
                return BUGLE_PUSH;
            case 34:
                return CMS_NOTIFICATION;
            case 35:
                return DUO_MESSAGE;
            case 36:
                return TACHYGRAM_MESSAGE;
            case 37:
                return MOMENT_MEDIA_MESSAGE;
            case 38:
                return DUO_IN_CALL_CAPS_CHANGE_MESSAGE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return COMMSSUITE_NOTIFICATION;
            case 40:
                return MESSAGES_DATA_DONATION;
            case 41:
                return EXO_MESSAGE;
            case 42:
                return TINCAN_MESSAGE;
            case 43:
                return CMS_RPC_MESSAGE;
            case 44:
                return TACHYGRAM_CONTROL_MESSAGE;
            case 45:
                return REFLECTED_TACHYGRAM_MESSAGE;
            case 46:
                return MLS_CONTROL_MESSAGE;
            case 47:
                return SERVER_MLS_CONTROL_MESSAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
