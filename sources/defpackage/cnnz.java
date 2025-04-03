package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnz {
    public static final cnuh a(int i) {
        cnuh cnuhVar;
        switch (i - 2) {
            case 0:
                cnuhVar = cnuh.SESSION_STATUS_UNKNOWN;
                break;
            case 1:
                cnuhVar = cnuh.SESSION_STATUS_OFF;
                break;
            case 2:
                cnuhVar = cnuh.SESSION_STATUS_DEMO;
                break;
            case 3:
                cnuhVar = cnuh.SESSION_STATUS_NON_EMERGENCY;
                break;
            case 4:
                cnuhVar = cnuh.SESSION_STATUS_EMERGENCY;
                break;
            case 5:
                cnuhVar = cnuh.SESSION_STATUS_DISABLING;
                break;
            case 6:
                cnuhVar = cnuh.SESSION_STATUS_ENDING_EMERGENCY;
                break;
            case 7:
                cnuhVar = cnuh.SESSION_STATUS_NON_STARGATE_SESSION;
                break;
            default:
                cnuhVar = cnuh.UNRECOGNIZED;
                break;
        }
        cnuhVar.getClass();
        return cnuhVar;
    }
}
