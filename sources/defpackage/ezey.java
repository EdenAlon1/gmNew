package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezey implements eygg {
    public static final eygg a = new ezey();

    private ezey() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        ezez ezezVar;
        switch (i) {
            case 0:
                ezezVar = ezez.RCS_PROVISIONING_UNKNOWN_STATE;
                break;
            case 1:
                ezezVar = ezez.RCS_PROVISIONING_ENABLED_STATE;
                break;
            case 2:
                ezezVar = ezez.RCS_PROVISIONING_DISABLED_STATE;
                break;
            case 3:
                ezezVar = ezez.RCS_PROVISIONING_READY_STATE;
                break;
            case 4:
                ezezVar = ezez.RCS_PROVISIONING_IN_PROGRESS_STATE;
                break;
            case 5:
                ezezVar = ezez.RCS_PROVISIONING_RETRY_STATE;
                break;
            case 6:
                ezezVar = ezez.RCS_PROVISIONING_CONFIGURED_STATE;
                break;
            case 7:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_NETWORK_STATE;
                break;
            case 8:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_CONSENT_STATE;
                break;
            case 9:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_CONSTELLATION_CONSENT_STATE;
                break;
            case 10:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
                break;
            case 11:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE;
                break;
            case 12:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
                break;
            case 13:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
                break;
            case 14:
                ezezVar = ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                break;
            case 15:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
                break;
            case 16:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_HE_PROXY_STATE;
                break;
            case 17:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
                break;
            case 18:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
                break;
            case 19:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
                break;
            case 20:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
                break;
            case 21:
                ezezVar = ezez.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
                break;
            case 22:
                ezezVar = ezez.RCS_PROVISIONING_VERIFY_OTP_STATE;
                break;
            case 23:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
                break;
            case 24:
                ezezVar = ezez.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
                break;
            case 25:
                ezezVar = ezez.RCS_PROVISIONING_SEND_DISABLE_RCS_STATE;
                break;
            case 26:
                ezezVar = ezez.RCS_PROVISIONING_DISABLE_RCS_RETRY_STATE;
                break;
            case 27:
                ezezVar = ezez.RCS_PROVISIONING_REPLAY_DISABLE_RCS_REQUEST_STATE;
                break;
            case 28:
                ezezVar = ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
                break;
            case 29:
                ezezVar = ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
                break;
            case 30:
                ezezVar = ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
                break;
            case 31:
                ezezVar = ezez.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
                break;
            case 32:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
                break;
            case 33:
                ezezVar = ezez.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE;
                break;
            default:
                ezezVar = null;
                break;
        }
        return ezezVar != null;
    }
}
