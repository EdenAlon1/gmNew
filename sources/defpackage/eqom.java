package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqom implements eyge {
    UNKNOWN(0),
    NOT_ENABLED(1),
    FALLBACK_TO_TELEPHONY(2),
    LOST_CONNECTION(3),
    THROTTLED(4),
    NO_PERMISSIONS(5),
    FAILED_TO_CREATE_BACKUP(6),
    RETRIES_FAILED(7),
    FILE_NOT_FOUND(8),
    UNEXPECTED_EXCEPTION(9),
    STABLE_RESTORE_VERSION_NOT_AVAILABLE(10),
    HEURISTICS_FAILED(11),
    MISSING_SESSION_ID(12),
    EMPTY_PFD(13),
    BACKUP_DB_COPY_FAILED(14),
    ATTACHMENT_COPY_FAILED(15),
    INVALID_REQUEST_ARGUMENT(16),
    EXPLICIT_WRITE_LOCK_DISABLED(17),
    SOURCE_MESSAGES_VERSION_TOO_LOW(18),
    TARGET_MESSAGES_VERSION_TOO_LOW(19),
    HEURISTICS_FAILED_TRANSFER_ZERO_FILES(20),
    NOT_DEFAULT_SMS_APP(21),
    MISSING_ITEM_METADATA(22),
    SESSION_ID_EMPTY(23),
    UNEXPECTED_SESSION_ID_BYTE_LENGTH(24);

    public final int z;

    eqom(int i) {
        this.z = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
