package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqol implements eygg {
    static final eygg a = new eqol();

    private eqol() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqom eqomVar;
        switch (i) {
            case 0:
                eqomVar = eqom.UNKNOWN;
                break;
            case 1:
                eqomVar = eqom.NOT_ENABLED;
                break;
            case 2:
                eqomVar = eqom.FALLBACK_TO_TELEPHONY;
                break;
            case 3:
                eqomVar = eqom.LOST_CONNECTION;
                break;
            case 4:
                eqomVar = eqom.THROTTLED;
                break;
            case 5:
                eqomVar = eqom.NO_PERMISSIONS;
                break;
            case 6:
                eqomVar = eqom.FAILED_TO_CREATE_BACKUP;
                break;
            case 7:
                eqomVar = eqom.RETRIES_FAILED;
                break;
            case 8:
                eqomVar = eqom.FILE_NOT_FOUND;
                break;
            case 9:
                eqomVar = eqom.UNEXPECTED_EXCEPTION;
                break;
            case 10:
                eqomVar = eqom.STABLE_RESTORE_VERSION_NOT_AVAILABLE;
                break;
            case 11:
                eqomVar = eqom.HEURISTICS_FAILED;
                break;
            case 12:
                eqomVar = eqom.MISSING_SESSION_ID;
                break;
            case 13:
                eqomVar = eqom.EMPTY_PFD;
                break;
            case 14:
                eqomVar = eqom.BACKUP_DB_COPY_FAILED;
                break;
            case 15:
                eqomVar = eqom.ATTACHMENT_COPY_FAILED;
                break;
            case 16:
                eqomVar = eqom.INVALID_REQUEST_ARGUMENT;
                break;
            case 17:
                eqomVar = eqom.EXPLICIT_WRITE_LOCK_DISABLED;
                break;
            case 18:
                eqomVar = eqom.SOURCE_MESSAGES_VERSION_TOO_LOW;
                break;
            case 19:
                eqomVar = eqom.TARGET_MESSAGES_VERSION_TOO_LOW;
                break;
            case 20:
                eqomVar = eqom.HEURISTICS_FAILED_TRANSFER_ZERO_FILES;
                break;
            case 21:
                eqomVar = eqom.NOT_DEFAULT_SMS_APP;
                break;
            case 22:
                eqomVar = eqom.MISSING_ITEM_METADATA;
                break;
            case 23:
                eqomVar = eqom.SESSION_ID_EMPTY;
                break;
            case 24:
                eqomVar = eqom.UNEXPECTED_SESSION_ID_BYTE_LENGTH;
                break;
            default:
                eqomVar = null;
                break;
        }
        return eqomVar != null;
    }
}
