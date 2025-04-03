package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqqc implements eygg {
    static final eygg a = new eqqc();

    private eqqc() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqqd eqqdVar;
        switch (i) {
            case 0:
                eqqdVar = eqqd.UNKNOWN;
                break;
            case 1:
                eqqdVar = eqqd.CANT_SYNC_WITH_TELEPHONY;
                break;
            case 2:
                eqqdVar = eqqd.SYNC_ALREADY_IN_PROGRESS;
                break;
            case 3:
                eqqdVar = eqqd.BUGLE_NOT_DEFAULT_SMS_APP;
                break;
            case 4:
                eqqdVar = eqqd.BATCH_IS_ORPHAN;
                break;
            case 5:
                eqqdVar = eqqd.BATCH_IS_DIRTY;
                break;
            case 6:
                eqqdVar = eqqd.CURSOR_SCAN_FAILED;
                break;
            case 7:
                eqqdVar = eqqd.MISSING_PERMISSIONS;
                break;
            case 8:
                eqqdVar = eqqd.FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP;
                break;
            case 9:
                eqqdVar = eqqd.PARTIAL_SYNC_QUEUED;
                break;
            case 10:
                eqqdVar = eqqd.FULL_SYNC_DELAYED;
                break;
            case 11:
                eqqdVar = eqqd.FULL_SYNC_DO_NOT_START;
                break;
            case 12:
                eqqdVar = eqqd.WEAR_UTIL_IS_PRESENT;
                break;
            case 13:
                eqqdVar = eqqd.NOT_SMS_CAPABLE;
                break;
            case 14:
                eqqdVar = eqqd.SMS_NOT_ALLOWED_FOR_USER;
                break;
            case 15:
                eqqdVar = eqqd.SYNC_DISABLED;
                break;
            case 16:
                eqqdVar = eqqd.REDESIGN_DISABLED_DURING_EXECUTION;
                break;
            case 17:
                eqqdVar = eqqd.REDESIGN_ENABLED_DURING_EXECUTION;
                break;
            case 18:
                eqqdVar = eqqd.NON_SMS_CAPABLE_WEAR_DEVICE;
                break;
            case 19:
                eqqdVar = eqqd.DUPLICATE_TELEPHONY_MESSAGE_TIMESTAMP_FOUND;
                break;
            case 20:
                eqqdVar = eqqd.OLDER_MESSAGES_OUT_OF_SYNC_AFTER_RETRY;
                break;
            case 21:
                eqqdVar = eqqd.RECENT_MESSAGES_OUT_OF_SYNC_AFTER_RETRY;
                break;
            case 22:
                eqqdVar = eqqd.STALLED;
                break;
            default:
                eqqdVar = null;
                break;
        }
        return eqqdVar != null;
    }
}
