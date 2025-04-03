package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum choc implements eyge {
    UNSET_TACHYON_STATE(0),
    NOT_REGISTERED(1),
    REGISTERED_WITHOUT_PREKEYS(2),
    REGISTERED_WITH_PREKEYS(3),
    UNRECOGNIZED(-1);

    private final int g;

    choc(int i) {
        this.g = i;
    }

    public static choc b(int i) {
        if (i == 0) {
            return UNSET_TACHYON_STATE;
        }
        if (i == 1) {
            return NOT_REGISTERED;
        }
        if (i == 2) {
            return REGISTERED_WITHOUT_PREKEYS;
        }
        if (i != 3) {
            return null;
        }
        return REGISTERED_WITH_PREKEYS;
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
