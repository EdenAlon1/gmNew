package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbre implements eyge {
    UNKNOWN_STATE(0),
    UNCONSUMED(1),
    CONSUMED(2),
    UNRECOGNIZED(-1);

    private final int f;

    fbre(int i) {
        this.f = i;
    }

    public static fbre b(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return UNCONSUMED;
        }
        if (i != 2) {
            return null;
        }
        return CONSUMED;
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
