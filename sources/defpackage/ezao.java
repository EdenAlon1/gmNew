package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ezao implements eygg {
    static final eygg a = new ezao();

    private ezao() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        ezap ezapVar;
        switch (i) {
            case 0:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
                break;
            case 1:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
                break;
            case 2:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
                break;
            case 3:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
                break;
            case 4:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
                break;
            case 5:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
                break;
            case 6:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
                break;
            case 7:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
                break;
            case 8:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
                break;
            case 9:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
                break;
            case 10:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
                break;
            case 11:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
                break;
            case 12:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
                break;
            case 13:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
                break;
            case 14:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
                break;
            case 15:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
                break;
            case 16:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
                break;
            case 17:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
                break;
            case 18:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
                break;
            case 19:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
                break;
            case 20:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
                break;
            case 21:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
                break;
            case 22:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
                break;
            case 23:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
                break;
            case 24:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
                break;
            case 25:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
                break;
            case 26:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
                break;
            case 27:
                ezapVar = ezap.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
                break;
            default:
                ezapVar = null;
                break;
        }
        return ezapVar != null;
    }
}
