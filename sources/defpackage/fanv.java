package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanv {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "CLIENT_START";
            case 2:
                return "CLIENT_WAITING_FOR_SERVER_INIT";
            case 3:
                return "CLIENT_AFTER_SERVER_INIT";
            case 4:
                return "SERVER_START";
            case 5:
                return "SERVER_AFTER_CLIENT_INIT";
            case 6:
                return "SERVER_WAITING_FOR_CLIENT_FINISHED";
            case 7:
                return "HANDSHAKE_VERIFICATION_NEEDED";
            case 8:
                return "HANDSHAKE_VERIFICATION_IN_PROGRESS";
            case 9:
                return "HANDSHAKE_FINISHED";
            case 10:
                return "HANDSHAKE_ALREADY_USED";
            case 11:
                return "HANDSHAKE_ERROR";
            default:
                return "null";
        }
    }
}
