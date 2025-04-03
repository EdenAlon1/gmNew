package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esaa implements eyge {
    MESSAGE_TYPE_UNSPECIFIED(0),
    LIST_CONVERSATIONS(1),
    LIST_MESSAGES(2),
    SEND_MESSAGE(3),
    RESEND_MESSAGE(25),
    DOWNLOAD_MESSAGE(27),
    DELETE_MESSAGE(23),
    MESSAGE_UPDATES(4),
    LIST_TOP_CONTACTS(28),
    LIST_CONTACTS(6),
    GET_CONTACTS_THUMBNAIL(29),
    CONVERSATION_UPDATES(7),
    GET_OR_CREATE_CONVERSATION(9),
    MESSAGE_READ(10),
    BROWSER_PRESENCE_CHECK(11),
    TYPING_UPDATES(12),
    SETTINGS_UPDATE(13),
    USER_ALERT(14),
    UPDATE_CONVERSATION(15),
    GET_UPDATES(16),
    ACK_BROWSER_PRESENCE(17),
    LIST_STICKER_SETS(18),
    INSTALL_STICKER_SET(24),
    LEAVE_RCS_GROUP(19),
    ADD_PARTICIPANT_TO_RCS_GROUP(20),
    GET_CONVERSATION_TYPE(21),
    GET_CONTACT_RCS_GROUP_STATUS(26),
    NOTIFY_DITTO_ACTIVITY(22),
    CHANGE_PARTICIPANT_COLOR(30),
    IS_BUGLE_DEFAULT(31),
    STICKER_USER_CONTEXT(32),
    FAVORITE_STICKER_PACKS(33),
    RECENT_STICKERS(34),
    UPDATE_RECENT_STICKERS(35),
    GET_FULL_SIZE_IMAGE(36),
    GET_PARTICIPANTS_THUMBNAIL(37),
    SEND_REACTION(38),
    SEND_REPLY(39),
    GET_BLOB_FOR_ATTACHMENT(40),
    GET_DEVICES_AVAILABLE_FOR_GAIA_PAIRING(41),
    CREATE_GAIA_PAIRING(42),
    GET_CONVERSATION(43),
    CREATE_GAIA_PAIRING_CLIENT_INIT(44),
    CREATE_GAIA_PAIRING_CLIENT_FINISHED(45),
    UNPAIR_GAIA_PAIRING(46),
    CANCEL_GAIA_PAIRING(47),
    PREWARM(48),
    CONVERSATION_GROUP_NAME_SEARCH(49),
    LINK_RCS_IDENTITY(50),
    UNLINK_RCS_IDENTITY(51),
    UNRECOGNIZED(-1);

    private final int aa;

    esaa(int i) {
        this.aa = i;
    }

    public static esaa b(int i) {
        switch (i) {
            case 0:
                return MESSAGE_TYPE_UNSPECIFIED;
            case 1:
                return LIST_CONVERSATIONS;
            case 2:
                return LIST_MESSAGES;
            case 3:
                return SEND_MESSAGE;
            case 4:
                return MESSAGE_UPDATES;
            case 5:
            case 8:
            default:
                return null;
            case 6:
                return LIST_CONTACTS;
            case 7:
                return CONVERSATION_UPDATES;
            case 9:
                return GET_OR_CREATE_CONVERSATION;
            case 10:
                return MESSAGE_READ;
            case 11:
                return BROWSER_PRESENCE_CHECK;
            case 12:
                return TYPING_UPDATES;
            case 13:
                return SETTINGS_UPDATE;
            case 14:
                return USER_ALERT;
            case 15:
                return UPDATE_CONVERSATION;
            case 16:
                return GET_UPDATES;
            case 17:
                return ACK_BROWSER_PRESENCE;
            case 18:
                return LIST_STICKER_SETS;
            case 19:
                return LEAVE_RCS_GROUP;
            case 20:
                return ADD_PARTICIPANT_TO_RCS_GROUP;
            case 21:
                return GET_CONVERSATION_TYPE;
            case 22:
                return NOTIFY_DITTO_ACTIVITY;
            case 23:
                return DELETE_MESSAGE;
            case 24:
                return INSTALL_STICKER_SET;
            case 25:
                return RESEND_MESSAGE;
            case 26:
                return GET_CONTACT_RCS_GROUP_STATUS;
            case 27:
                return DOWNLOAD_MESSAGE;
            case 28:
                return LIST_TOP_CONTACTS;
            case 29:
                return GET_CONTACTS_THUMBNAIL;
            case 30:
                return CHANGE_PARTICIPANT_COLOR;
            case 31:
                return IS_BUGLE_DEFAULT;
            case 32:
                return STICKER_USER_CONTEXT;
            case 33:
                return FAVORITE_STICKER_PACKS;
            case 34:
                return RECENT_STICKERS;
            case 35:
                return UPDATE_RECENT_STICKERS;
            case 36:
                return GET_FULL_SIZE_IMAGE;
            case 37:
                return GET_PARTICIPANTS_THUMBNAIL;
            case 38:
                return SEND_REACTION;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return SEND_REPLY;
            case 40:
                return GET_BLOB_FOR_ATTACHMENT;
            case 41:
                return GET_DEVICES_AVAILABLE_FOR_GAIA_PAIRING;
            case 42:
                return CREATE_GAIA_PAIRING;
            case 43:
                return GET_CONVERSATION;
            case 44:
                return CREATE_GAIA_PAIRING_CLIENT_INIT;
            case 45:
                return CREATE_GAIA_PAIRING_CLIENT_FINISHED;
            case 46:
                return UNPAIR_GAIA_PAIRING;
            case 47:
                return CANCEL_GAIA_PAIRING;
            case 48:
                return PREWARM;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return CONVERSATION_GROUP_NAME_SEARCH;
            case 50:
                return LINK_RCS_IDENTITY;
            case 51:
                return UNLINK_RCS_IDENTITY;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.aa;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
