package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyyl implements eyge {
    FILE_TRANSFER_FAILURE_REASON_UNKNOWN(0),
    FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED(1),
    FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED(2),
    FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY(3),
    FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE(4),
    FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED(5),
    FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR(6),
    FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED(7),
    FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE(8),
    FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE(9),
    FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE(10),
    FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE(11),
    FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION(12);

    public final int n;

    eyyl(int i) {
        this.n = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
