package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cuef implements eyge {
    CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED(0),
    SUBSCRIBE_SENT(1),
    SUBSCRIBE_CONFIRMED(2),
    UNSUBSCRIBE_SENT(3),
    UNSUBSCRIBE_CONFIRMED(4),
    UNSUBSCRIBE_ERROR(5),
    SUBSCRIBE_ERROR(6),
    UNRECOGNIZED(-1);

    private final int j;

    cuef(int i2) {
        this.j = i2;
    }

    public static cuef b(int i2) {
        switch (i2) {
            case 0:
                return CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED;
            case 1:
                return SUBSCRIBE_SENT;
            case 2:
                return SUBSCRIBE_CONFIRMED;
            case 3:
                return UNSUBSCRIBE_SENT;
            case 4:
                return UNSUBSCRIBE_CONFIRMED;
            case 5:
                return UNSUBSCRIBE_ERROR;
            case 6:
                return SUBSCRIBE_ERROR;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
