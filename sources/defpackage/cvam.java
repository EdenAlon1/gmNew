package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cvam implements eyge {
    UNKNOWN_TYPE(0),
    NOT_YET_KNOWN(1),
    RCS(2),
    C11N(3),
    C11N_RCS(4),
    UNRECOGNIZED(-1);

    private final int h;

    cvam(int i) {
        this.h = i;
    }

    public static cvam b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return NOT_YET_KNOWN;
        }
        if (i == 2) {
            return RCS;
        }
        if (i == 3) {
            return C11N;
        }
        if (i != 4) {
            return null;
        }
        return C11N_RCS;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
