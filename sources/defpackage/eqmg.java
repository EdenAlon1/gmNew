package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqmg implements eygg {
    static final eygg a = new eqmg();

    private eqmg() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqmh eqmhVar;
        switch (i) {
            case 0:
                eqmhVar = eqmh.UNKNOWN_RESULT_STATUS;
                break;
            case 1:
                eqmhVar = eqmh.SUCCESS_CACHE;
                break;
            case 2:
                eqmhVar = eqmh.SUCCESS;
                break;
            case 3:
                eqmhVar = eqmh.STATUS_CODE_NOT_MAPPED;
                break;
            case 4:
                eqmhVar = eqmh.GMS_ERROR;
                break;
            case 5:
                eqmhVar = eqmh.TARGET_NODE_NOT_CONNECTED;
                break;
            case 6:
                eqmhVar = eqmh.DUPLICATE_LISTENER;
                break;
            case 7:
                eqmhVar = eqmh.UNKNOWN_LISTENER;
                break;
            case 8:
                eqmhVar = eqmh.DATA_ITEM_TOO_LARGE;
                break;
            case 9:
                eqmhVar = eqmh.INVALID_TARGET_NODE;
                break;
            case 10:
                eqmhVar = eqmh.ASSET_UNAVAILABLE;
                break;
            case 11:
                eqmhVar = eqmh.DUPLICATE_CAPABILITY;
                break;
            case 12:
                eqmhVar = eqmh.UNKNOWN_CAPABILITY;
                break;
            case 13:
                eqmhVar = eqmh.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                break;
            case 14:
                eqmhVar = eqmh.UNSUPPORTED_BY_TARGET_NODE;
                break;
            case 15:
                eqmhVar = eqmh.SIGN_IN_REQUIRED;
                break;
            case 16:
                eqmhVar = eqmh.INVALID_ACCOUNT;
                break;
            case 17:
                eqmhVar = eqmh.RESOLUTION_REQUIRED;
                break;
            case 18:
                eqmhVar = eqmh.NETWORK_ERROR;
                break;
            case 19:
                eqmhVar = eqmh.INTERNAL_ERROR;
                break;
            case 20:
                eqmhVar = eqmh.DEVELOPER_ERROR;
                break;
            case 21:
                eqmhVar = eqmh.INTERRUPTED;
                break;
            case 22:
                eqmhVar = eqmh.TIMEOUT;
                break;
            case 23:
                eqmhVar = eqmh.CANCELED;
                break;
            case 24:
                eqmhVar = eqmh.API_NOT_CONNECTED;
                break;
            case 25:
                eqmhVar = eqmh.DEAD_CLIENT;
                break;
            case 26:
                eqmhVar = eqmh.REMOTE_EXCEPTION;
                break;
            case 27:
                eqmhVar = eqmh.CONNECTION_SUSPENDED_DURING_CALL;
                break;
            case 28:
                eqmhVar = eqmh.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                break;
            case 29:
                eqmhVar = eqmh.RECONNECTION_TIMED_OUT;
                break;
            case 30:
                eqmhVar = eqmh.CLIENT_FAILURE;
                break;
            case 31:
                eqmhVar = eqmh.TASK_TIMEOUT;
                break;
            case 32:
                eqmhVar = eqmh.FEATURE_UNSUPPORTED;
                break;
            case 33:
                eqmhVar = eqmh.REMOTE_ERROR;
                break;
            case 34:
                eqmhVar = eqmh.REMOTE_PARSE_ERROR;
                break;
            case 35:
                eqmhVar = eqmh.REMOTE_EXECUTION_TIMEOUT;
                break;
            case 36:
                eqmhVar = eqmh.REMOTE_INVALID_PARAMETER;
                break;
            case 37:
                eqmhVar = eqmh.RESPONSE_PARSE_ERROR;
                break;
            default:
                eqmhVar = null;
                break;
        }
        return eqmhVar != null;
    }
}
