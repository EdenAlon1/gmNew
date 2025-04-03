package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ezbd implements eygg {
    static final eygg a = new ezbd();

    private ezbd() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        ezbe ezbeVar;
        switch (i) {
            case 0:
                ezbeVar = ezbe.SOCKET_FAILURE_UNKNOWN;
                break;
            case 1:
                ezbeVar = ezbe.SOCKET_FAILURE_UNABLE_TO_OPEN;
                break;
            case 2:
                ezbeVar = ezbe.SOCKET_FAILURE_READ_TIMEOUT;
                break;
            case 3:
                ezbeVar = ezbe.SOCKET_FAILURE_WRITE_TIMEOUT;
                break;
            case 4:
                ezbeVar = ezbe.SOCKET_FAILURE_HOST_VERIFICATION_FAILED;
                break;
            case 5:
                ezbeVar = ezbe.SOCKET_FAILURE_READ_ERROR;
                break;
            case 6:
                ezbeVar = ezbe.SOCKET_FAILURE_WRITE_ERROR;
                break;
            case 7:
                ezbeVar = ezbe.SOCKET_FAILURE_UNABLE_TO_CLOSE;
                break;
            case 8:
                ezbeVar = ezbe.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
                break;
            default:
                ezbeVar = null;
                break;
        }
        return ezbeVar != null;
    }
}
