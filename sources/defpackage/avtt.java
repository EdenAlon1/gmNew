package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avtt extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqww eqwwVar = (eqww) obj;
        int ordinal = eqwwVar.ordinal();
        if (ordinal == 12) {
            return awua.GROUP_NOT_FOUND;
        }
        if (ordinal == 14) {
            return awua.LOW_PRIORITY_MESSAGE_REJECTED;
        }
        if (ordinal == 15) {
            return awua.TRANSPORT_INTERNAL_ERROR;
        }
        switch (ordinal) {
            case 0:
                return awua.UNKNOWN_CAUSE;
            case 1:
                return awua.TRANSPORT_GENERIC_ERROR;
            case 2:
                return awua.NOT_CONNECTED;
            case 3:
                return awua.GROUP_TOO_FEW_PARTICIPANTS;
            case 4:
                return awua.GROUP_TOO_MANY_PARTICIPANTS;
            case 5:
                return awua.USER_NOT_A_GROUP_PARTICIPANT;
            case 6:
                return awua.INVALID_LOCAL_PARTICIPANT;
            case 7:
                return awua.INVALID_REMOTE_PARTICIPANT;
            default:
                switch (ordinal) {
                    case 19:
                        return awua.NETWORK_CONNECTION_ERROR;
                    case 20:
                        return awua.NETWORK_PERMISSION_DENIED;
                    case 21:
                        return awua.REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
                    case 22:
                        return awua.TRANSPORT_UNAVAILABLE;
                    case 23:
                        return awua.INVALID_REPLY_TO_CHAT_ENDPOINT;
                    case 24:
                        return awua.INVALID_SELF_CHAT_ENDPOINT;
                    case 25:
                        return awua.INVALID_OPAQUE_DATA;
                    case 26:
                        return awua.INVALID_GROUP_TOKEN;
                    case 27:
                        return awua.INVALID_SENDER_TOKEN;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(eqwwVar.toString()));
                }
        }
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awua awuaVar = (awua) obj;
        switch (awuaVar) {
            case UNKNOWN_CAUSE:
                return eqww.CHAT_API_ERROR_CAUSE_UNKNOWN;
            case NOT_CONNECTED:
                return eqww.CHAT_API_TRANSPORT_NOT_CONNECTED;
            case GROUP_TOO_FEW_PARTICIPANTS:
                return eqww.CHAT_API_GROUP_TOO_FEW_PARTICIPANTS;
            case GROUP_TOO_MANY_PARTICIPANTS:
                return eqww.CHAT_API_GROUP_TOO_MANY_PARTICIPANTS;
            case USER_NOT_A_GROUP_PARTICIPANT:
                return eqww.CHAT_API_USER_NOT_A_GROUP_PARTICIPANT;
            case TRANSPORT_GENERIC_ERROR:
                return eqww.CHAT_API_GENERIC_TRANSPORT_ERROR;
            case INVALID_LOCAL_PARTICIPANT:
                return eqww.CHAT_API_INVALID_LOCAL_PARTICIPANT;
            case INVALID_REMOTE_PARTICIPANT:
                return eqww.CHAT_API_INVALID_REMOTE_PARTICIPANT;
            case GROUP_NOT_FOUND:
                return eqww.CHAT_API_GROUP_NOT_FOUND;
            case LOW_PRIORITY_MESSAGE_REJECTED:
                return eqww.CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED;
            case TRANSPORT_INTERNAL_ERROR:
                return eqww.CHAT_API_TRANSPORT_INTERNAL_ERROR;
            case REMOTE_PARTICIPANT_NOT_RCS_CAPABLE:
                return eqww.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case NETWORK_CONNECTION_ERROR:
                return eqww.CHAT_API_NETWORK_CONNECTION_ERROR;
            case NETWORK_PERMISSION_DENIED:
                return eqww.CHAT_API_NETWORK_PERMISSION_DENIED;
            case TRANSPORT_UNAVAILABLE:
                return eqww.CHAT_API_TRANSPORT_UNAVAILABLE;
            case INVALID_REPLY_TO_CHAT_ENDPOINT:
                return eqww.CHAT_API_INVALID_REPLY_TO_CHAT_ENDPOINT;
            case INVALID_SELF_CHAT_ENDPOINT:
                return eqww.CHAT_API_INVALID_SELF_CHAT_ENDPOINT;
            case INVALID_OPAQUE_DATA:
                return eqww.CHAT_API_INVALID_OPAQUE_DATA;
            case INVALID_GROUP_TOKEN:
                return eqww.CHAT_API_INVALID_GROUP_TOKEN;
            case INVALID_SENDER_TOKEN:
                return eqww.CHAT_API_INVALID_SENDER_TOKEN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(awuaVar.toString()));
        }
    }
}
