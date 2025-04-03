package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbqp implements eyge {
    UNKNOWN_SOURCE(0),
    NOTIFICATION_VIEW(1),
    CONVERSATIONS_LIST_VIEW(2),
    CONVERSATION_VIEW(3),
    UNRECOGNIZED(-1);

    private final int g;

    fbqp(int i) {
        this.g = i;
    }

    public static fbqp b(int i) {
        if (i == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i == 1) {
            return NOTIFICATION_VIEW;
        }
        if (i == 2) {
            return CONVERSATIONS_LIST_VIEW;
        }
        if (i != 3) {
            return null;
        }
        return CONVERSATION_VIEW;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
