package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esjn implements eyge {
    PRIORITY_UNKNOWN(0),
    PRIORITY_HIGH(1),
    PRIORITY_NORMAL(2),
    PRIORITY_LOW(3),
    UNRECOGNIZED(-1);

    private final int g;

    esjn(int i) {
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
