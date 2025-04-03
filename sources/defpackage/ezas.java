package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ezas implements eygg {
    static final eygg a = new ezas();

    private ezas() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        ezat ezatVar;
        switch (i) {
            case 0:
                ezatVar = ezat.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
            case 1:
                ezatVar = ezat.SIP_REGISTRATION_STOPPED_STATE;
                break;
            case 2:
                ezatVar = ezat.SIP_REGISTRATION_READY_STATE;
                break;
            case 3:
                ezatVar = ezat.SIP_REGISTRATION_WAIT_FOR_NETWORK_STATE;
                break;
            case 4:
                ezatVar = ezat.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 5:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 6:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 7:
                ezatVar = ezat.SIP_REGISTRATION_SUBSCRIBING_STATE;
                break;
            case 8:
                ezatVar = ezat.SIP_REGISTRATION_SUBSCRIBED_STATE;
                break;
            case 9:
                ezatVar = ezat.SIP_REGISTRATION_REREGISTERING_STATE;
                break;
            case 10:
                ezatVar = ezat.SIP_REGISTRATION_REREGISTERED_STATE;
                break;
            case 11:
                ezatVar = ezat.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 12:
                ezatVar = ezat.SIP_REGISTRATION_DEREGISTERED_STATE;
                break;
            case 13:
                ezatVar = ezat.SIP_REGISTRATION_RECONFIGURATION_REQUIRED_STATE;
                break;
            case 14:
                ezatVar = ezat.SIP_REGISTRATION_RETRY_STATE;
                break;
            case 15:
                ezatVar = ezat.SIP_REGISTRATION_DISABLED_STATE;
                break;
            case 16:
                ezatVar = ezat.SIP_REGISTRATION_SIM_REMOVED_STATE;
                break;
            case 17:
                ezatVar = ezat.SIP_REGISTRATION_RECEIVE_CONFIGURATION_STATE;
                break;
            case 18:
                ezatVar = ezat.SIP_REGISTRATION_RECEIVE_FEATURE_TAGS_STATE;
                break;
            case 19:
                ezatVar = ezat.SIP_REGISTRATION_INACTIVE_STATE;
                break;
            case 20:
                ezatVar = ezat.SIP_REGISTRATION_TERMINATED_STATE;
                break;
            case 21:
                ezatVar = ezat.SIP_REGISTRATION_PUBLISHED_STATE;
                break;
            default:
                ezatVar = null;
                break;
        }
        return ezatVar != null;
    }
}
