package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgte implements eyge {
    DEFAULT_TYPE(0),
    ADMINISTRATED(1),
    UNRECOGNIZED(-1);

    private final int e;

    fgte(int i) {
        this.e = i;
    }

    public static fgte b(int i) {
        if (i == 0) {
            return DEFAULT_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return ADMINISTRATED;
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
