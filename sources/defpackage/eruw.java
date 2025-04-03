package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eruw implements eyge {
    UNKNOWN_CONVERSATION_TYPE(0),
    XMS(1),
    RCS(2),
    UNRECOGNIZED(-1);

    private final int f;

    eruw(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
