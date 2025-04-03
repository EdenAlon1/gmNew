package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fcmv {
    OFFER,
    ANSWER,
    WIREBALL_OFFER,
    WIREBALL_ANSWER,
    ICE_CANDIDATES_UPDATE,
    CREATE_PAIRING,
    REVOKE_PAIRING,
    WAKE_UP,
    CONNECTION_ERROR,
    BODY_NOT_SET;

    public static fcmv a(int i) {
        switch (i) {
            case 0:
                return BODY_NOT_SET;
            case 1:
                return OFFER;
            case 2:
                return ANSWER;
            case 3:
                return ICE_CANDIDATES_UPDATE;
            case 4:
                return CREATE_PAIRING;
            case 5:
                return REVOKE_PAIRING;
            case 6:
                return WAKE_UP;
            case 7:
                return CONNECTION_ERROR;
            case 8:
                return WIREBALL_OFFER;
            case 9:
                return WIREBALL_ANSWER;
            default:
                return null;
        }
    }
}
