package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyyk implements eygg {
    static final eygg a = new eyyk();

    private eyyk() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eyyl eyylVar;
        switch (i) {
            case 0:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_UNKNOWN;
                break;
            case 1:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED;
                break;
            case 2:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED;
                break;
            case 3:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY;
                break;
            case 4:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE;
                break;
            case 5:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED;
                break;
            case 6:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR;
                break;
            case 7:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED;
                break;
            case 8:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE;
                break;
            case 9:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE;
                break;
            case 10:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE;
                break;
            case 11:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE;
                break;
            case 12:
                eyylVar = eyyl.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION;
                break;
            default:
                eyylVar = null;
                break;
        }
        return eyylVar != null;
    }
}
