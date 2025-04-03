package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoks implements eyge {
    UNKNOWN_BUGLE_CONVERSATION_TYPE(0),
    CONVERSATION_TYPE_ONE_ON_ONE(1),
    CONVERSATION_TYPE_GROUP_MMS(2),
    CONVERSATION_TYPE_GROUP_RCS(3),
    CONVERSATION_TYPE_GROUP_BROADCAST(4);

    public final int f;

    eoks(int i) {
        this.f = i;
    }

    public static eoks b(int i) {
        if (i == 0) {
            return UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        if (i == 1) {
            return CONVERSATION_TYPE_ONE_ON_ONE;
        }
        if (i == 2) {
            return CONVERSATION_TYPE_GROUP_MMS;
        }
        if (i == 3) {
            return CONVERSATION_TYPE_GROUP_RCS;
        }
        if (i != 4) {
            return null;
        }
        return CONVERSATION_TYPE_GROUP_BROADCAST;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
