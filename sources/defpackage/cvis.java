package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cvis {
    LIST_CONVERSATIONS_REQUEST,
    LIST_MESSAGES_REQUEST,
    SEND_REACTION_REQUEST,
    REQUESTPAYLOAD_NOT_SET;

    public static cvis a(int i) {
        if (i == 0) {
            return REQUESTPAYLOAD_NOT_SET;
        }
        if (i == 2) {
            return LIST_CONVERSATIONS_REQUEST;
        }
        if (i == 3) {
            return LIST_MESSAGES_REQUEST;
        }
        if (i != 4) {
            return null;
        }
        return SEND_REACTION_REQUEST;
    }
}
