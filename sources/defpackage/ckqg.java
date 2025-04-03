package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum ckqg implements eyge {
    DELETION_STRATEGY_UNSPECIFIED(0),
    DELETE(1),
    DELETE_IF_EMPTY(2),
    DO_NOT_DELETE(3),
    UNRECOGNIZED(-1);

    private final int g;

    ckqg(int i) {
        this.g = i;
    }

    public static ckqg b(int i) {
        if (i == 0) {
            return DELETION_STRATEGY_UNSPECIFIED;
        }
        if (i == 1) {
            return DELETE;
        }
        if (i == 2) {
            return DELETE_IF_EMPTY;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_DELETE;
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
