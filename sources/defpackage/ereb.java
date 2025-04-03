package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ereb implements eyge {
    UNKNOWN_CONVERSATION_PROTOCOL(0),
    SMS(1),
    MMS(2),
    RCS(3),
    RBM(4),
    LIGHTER(5),
    UNRECOGNIZED(-1);

    private final int i;

    ereb(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
