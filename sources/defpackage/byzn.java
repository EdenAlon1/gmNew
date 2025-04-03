package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum byzn implements eyge {
    UNKNOWN_TRIGGER(0),
    TEST_TRIGGER(1),
    UNRECOGNIZED(-1);

    private final int e;

    byzn(int i) {
        this.e = i;
    }

    public static byzn b(int i) {
        if (i == 0) {
            return UNKNOWN_TRIGGER;
        }
        if (i != 1) {
            return null;
        }
        return TEST_TRIGGER;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
