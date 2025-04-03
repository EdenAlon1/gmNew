package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cnuu implements eyge {
    CODE_UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    cnuu(int i) {
        this.f = i;
    }

    public static cnuu b(int i) {
        if (i == 0) {
            return CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return FAILURE;
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
