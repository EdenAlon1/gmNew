package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eshv implements eyge {
    UNKNOWN_CONVERSATION_TYPE(0),
    CONVERSATION_TYPE_ONE_ON_ONE(1),
    CONVERSATION_TYPE_GROUP_XMS(2),
    CONVERSATION_TYPE_GROUP_RCS(3),
    UNRECOGNIZED(-1);

    private final int g;

    eshv(int i) {
        this.g = i;
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
