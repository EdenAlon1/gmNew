package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eszw implements eyge {
    MULTI_DEVICE_STATE_UNSPECIFIED(0),
    DISABLED(1),
    ENABLED(2),
    ENABLING(3),
    UNRECOGNIZED(-1);

    private final int g;

    eszw(int i) {
        this.g = i;
    }

    public static eszw b(int i) {
        if (i == 0) {
            return MULTI_DEVICE_STATE_UNSPECIFIED;
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
