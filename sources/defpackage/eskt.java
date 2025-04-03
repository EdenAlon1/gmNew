package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eskt {
    CLIENT_INIT_REQUEST,
    CLIENT_INIT_RESPONSE,
    CLIENT_FINISHED_REQUEST,
    CLIENT_FINISHED_RESPONSE,
    CANCEL_REQUEST,
    CANCEL_RESPONSE,
    PAYLOAD_NOT_SET;

    public static eskt a(int i) {
        if (i == 0) {
            return PAYLOAD_NOT_SET;
        }
        switch (i) {
            case 11:
                return CLIENT_INIT_REQUEST;
            case 12:
                return CLIENT_INIT_RESPONSE;
            case 13:
                return CLIENT_FINISHED_REQUEST;
            case 14:
                return CLIENT_FINISHED_RESPONSE;
            case 15:
                return CANCEL_REQUEST;
            case 16:
                return CANCEL_RESPONSE;
            default:
                return null;
        }
    }
}
