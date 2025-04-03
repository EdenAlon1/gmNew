package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum chob implements eyge {
    UNSET_PREKEYS(0),
    SUFFICIENT_PREKEYS(1),
    LOW_PREKEYS(2),
    UNRECOGNIZED(-1);

    private final int f;

    chob(int i) {
        this.f = i;
    }

    public static chob b(int i) {
        if (i == 0) {
            return UNSET_PREKEYS;
        }
        if (i == 1) {
            return SUFFICIENT_PREKEYS;
        }
        if (i != 2) {
            return null;
        }
        return LOW_PREKEYS;
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
