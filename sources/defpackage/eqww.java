package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqww implements eyge {
    CHAT_API_ERROR_CAUSE_UNKNOWN(0),
    CHAT_API_GENERIC_TRANSPORT_ERROR(1),
    CHAT_API_TRANSPORT_NOT_CONNECTED(2),
    CHAT_API_GROUP_TOO_FEW_PARTICIPANTS(3),
    CHAT_API_GROUP_TOO_MANY_PARTICIPANTS(4),
    CHAT_API_USER_NOT_A_GROUP_PARTICIPANT(5),
    CHAT_API_INVALID_LOCAL_PARTICIPANT(6),
    CHAT_API_INVALID_REMOTE_PARTICIPANT(7),
    CHAT_API_INVALID_FILE_UPLOAD_RESULT(8),
    CHAT_API_SERIALIZATION_ERROR(9),
    CHAT_API_NO_RCS_SUBSCRIPTION(10),
    CHAT_API_UPLOAD_START_FAILED(11),
    CHAT_API_GROUP_NOT_FOUND(12),
    CHAT_API_EMPTY_CHAT_MESSAGE(13),
    CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED(14),
    CHAT_API_TRANSPORT_INTERNAL_ERROR(15),
    CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS(16),
    CHAT_API_INVALID_CONVERSATION_ID(17),
    CHAT_API_INVALID_CONFERENCE_URI(18),
    CHAT_API_NETWORK_CONNECTION_ERROR(19),
    CHAT_API_NETWORK_PERMISSION_DENIED(20),
    CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE(21),
    CHAT_API_TRANSPORT_UNAVAILABLE(22),
    CHAT_API_INVALID_REPLY_TO_CHAT_ENDPOINT(23),
    CHAT_API_INVALID_SELF_CHAT_ENDPOINT(24),
    CHAT_API_INVALID_OPAQUE_DATA(25),
    CHAT_API_INVALID_GROUP_TOKEN(26),
    CHAT_API_INVALID_SENDER_TOKEN(27);

    public final int C;

    eqww(int i) {
        this.C = i;
    }

    public static eqww b(int i) {
        switch (i) {
            case 0:
                return CHAT_API_ERROR_CAUSE_UNKNOWN;
            case 1:
                return CHAT_API_GENERIC_TRANSPORT_ERROR;
            case 2:
                return CHAT_API_TRANSPORT_NOT_CONNECTED;
            case 3:
                return CHAT_API_GROUP_TOO_FEW_PARTICIPANTS;
            case 4:
                return CHAT_API_GROUP_TOO_MANY_PARTICIPANTS;
            case 5:
                return CHAT_API_USER_NOT_A_GROUP_PARTICIPANT;
            case 6:
                return CHAT_API_INVALID_LOCAL_PARTICIPANT;
            case 7:
                return CHAT_API_INVALID_REMOTE_PARTICIPANT;
            case 8:
                return CHAT_API_INVALID_FILE_UPLOAD_RESULT;
            case 9:
                return CHAT_API_SERIALIZATION_ERROR;
            case 10:
                return CHAT_API_NO_RCS_SUBSCRIPTION;
            case 11:
                return CHAT_API_UPLOAD_START_FAILED;
            case 12:
                return CHAT_API_GROUP_NOT_FOUND;
            case 13:
                return CHAT_API_EMPTY_CHAT_MESSAGE;
            case 14:
                return CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED;
            case 15:
                return CHAT_API_TRANSPORT_INTERNAL_ERROR;
            case 16:
                return CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS;
            case 17:
                return CHAT_API_INVALID_CONVERSATION_ID;
            case 18:
                return CHAT_API_INVALID_CONFERENCE_URI;
            case 19:
                return CHAT_API_NETWORK_CONNECTION_ERROR;
            case 20:
                return CHAT_API_NETWORK_PERMISSION_DENIED;
            case 21:
                return CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case 22:
                return CHAT_API_TRANSPORT_UNAVAILABLE;
            case 23:
                return CHAT_API_INVALID_REPLY_TO_CHAT_ENDPOINT;
            case 24:
                return CHAT_API_INVALID_SELF_CHAT_ENDPOINT;
            case 25:
                return CHAT_API_INVALID_OPAQUE_DATA;
            case 26:
                return CHAT_API_INVALID_GROUP_TOKEN;
            case 27:
                return CHAT_API_INVALID_SENDER_TOKEN;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.C;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.C);
    }
}
