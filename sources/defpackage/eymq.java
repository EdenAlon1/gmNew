package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eymq implements eyge {
    INVALID(0),
    VISIBLE(1),
    INVISIBLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    eymq(int i) {
        this.f = i;
    }

    public static eymq b(int i) {
        if (i == 0) {
            return INVALID;
        }
        if (i == 1) {
            return VISIBLE;
        }
        if (i != 2) {
            return null;
        }
        return INVISIBLE;
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
