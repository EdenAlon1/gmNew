package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awua implements eyge {
    UNKNOWN_CAUSE(0),
    NOT_CONNECTED(1),
    GROUP_TOO_FEW_PARTICIPANTS(2),
    GROUP_TOO_MANY_PARTICIPANTS(3),
    USER_NOT_A_GROUP_PARTICIPANT(4),
    TRANSPORT_GENERIC_ERROR(5),
    INVALID_LOCAL_PARTICIPANT(6),
    INVALID_REMOTE_PARTICIPANT(7),
    GROUP_NOT_FOUND(8),
    LOW_PRIORITY_MESSAGE_REJECTED(9),
    TRANSPORT_INTERNAL_ERROR(10),
    REMOTE_PARTICIPANT_NOT_RCS_CAPABLE(11),
    NETWORK_CONNECTION_ERROR(16),
    NETWORK_PERMISSION_DENIED(17),
    TRANSPORT_UNAVAILABLE(18),
    INVALID_REPLY_TO_CHAT_ENDPOINT(19),
    INVALID_SELF_CHAT_ENDPOINT(20),
    INVALID_OPAQUE_DATA(21),
    INVALID_GROUP_TOKEN(22),
    INVALID_SENDER_TOKEN(23),
    INVALID_MY_IDENTITY_TOKEN(24);

    public final int v;

    awua(int i) {
        this.v = i;
    }

    public static awua b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CAUSE;
            case 1:
                return NOT_CONNECTED;
            case 2:
                return GROUP_TOO_FEW_PARTICIPANTS;
            case 3:
                return GROUP_TOO_MANY_PARTICIPANTS;
            case 4:
                return USER_NOT_A_GROUP_PARTICIPANT;
            case 5:
                return TRANSPORT_GENERIC_ERROR;
            case 6:
                return INVALID_LOCAL_PARTICIPANT;
            case 7:
                return INVALID_REMOTE_PARTICIPANT;
            case 8:
                return GROUP_NOT_FOUND;
            case 9:
                return LOW_PRIORITY_MESSAGE_REJECTED;
            case 10:
                return TRANSPORT_INTERNAL_ERROR;
            case 11:
                return REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return null;
            case 16:
                return NETWORK_CONNECTION_ERROR;
            case 17:
                return NETWORK_PERMISSION_DENIED;
            case 18:
                return TRANSPORT_UNAVAILABLE;
            case 19:
                return INVALID_REPLY_TO_CHAT_ENDPOINT;
            case 20:
                return INVALID_SELF_CHAT_ENDPOINT;
            case 21:
                return INVALID_OPAQUE_DATA;
            case 22:
                return INVALID_GROUP_TOKEN;
            case 23:
                return INVALID_SENDER_TOKEN;
            case 24:
                return INVALID_MY_IDENTITY_TOKEN;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
