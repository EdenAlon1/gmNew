package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esjx implements eyge {
    NOT_SET(0),
    DISABLED(1),
    ENABLED(2),
    ENABLING(3),
    UNRECOGNIZED(-1);

    private final int g;

    esjx(int i) {
        this.g = i;
    }

    public static esjx b(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return DISABLED;
        }
        if (i == 2) {
            return ENABLED;
        }
        if (i != 3) {
            return null;
        }
        return ENABLING;
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
