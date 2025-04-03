package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhj {
    public static final eqmh a(int i) {
        if (i == -1) {
            return eqmh.SUCCESS_CACHE;
        }
        if (i == 0) {
            return eqmh.SUCCESS;
        }
        if (i == 10) {
            return eqmh.DEVELOPER_ERROR;
        }
        switch (i) {
            case 4:
                return eqmh.SIGN_IN_REQUIRED;
            case 5:
                return eqmh.INVALID_ACCOUNT;
            case 6:
                return eqmh.RESOLUTION_REQUIRED;
            case 7:
                return eqmh.NETWORK_ERROR;
            case 8:
                return eqmh.INTERNAL_ERROR;
            default:
                switch (i) {
                    case 13:
                        return eqmh.GMS_ERROR;
                    case 14:
                        return eqmh.INTERRUPTED;
                    case 15:
                        return eqmh.TIMEOUT;
                    case 16:
                        return eqmh.CANCELED;
                    case 17:
                        return eqmh.API_NOT_CONNECTED;
                    case 18:
                        return eqmh.DEAD_CLIENT;
                    case 19:
                        return eqmh.REMOTE_EXCEPTION;
                    case 20:
                        return eqmh.CONNECTION_SUSPENDED_DURING_CALL;
                    case 21:
                        return eqmh.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                    case 22:
                        return eqmh.RECONNECTION_TIMED_OUT;
                    default:
                        switch (i) {
                            case 4000:
                                return eqmh.TARGET_NODE_NOT_CONNECTED;
                            case 4001:
                                return eqmh.DUPLICATE_LISTENER;
                            case 4002:
                                return eqmh.UNKNOWN_LISTENER;
                            case 4003:
                                return eqmh.DATA_ITEM_TOO_LARGE;
                            case 4004:
                                return eqmh.INVALID_TARGET_NODE;
                            case 4005:
                                return eqmh.ASSET_UNAVAILABLE;
                            case 4006:
                                return eqmh.DUPLICATE_CAPABILITY;
                            case 4007:
                                return eqmh.UNKNOWN_CAPABILITY;
                            case 4008:
                                return eqmh.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                            case 4009:
                                return eqmh.UNSUPPORTED_BY_TARGET_NODE;
                            default:
                                return eqmh.STATUS_CODE_NOT_MAPPED;
                        }
                }
        }
    }
}
