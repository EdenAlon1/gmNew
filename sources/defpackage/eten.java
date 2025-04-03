package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eten implements eyge {
    REGISTRATION_TYPE_UNSPECIFIED(0),
    RCS(1),
    C11N(2),
    C11N_RCS(3),
    UNRECOGNIZED(-1);

    private final int g;

    eten(int i) {
        this.g = i;
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
