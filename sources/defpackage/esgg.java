package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esgg implements eyge {
    UPI_ELIGIBILITY_UNSPECIFIED(0),
    ELIGIBLE(1),
    INELIGIBLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    esgg(int i) {
        this.f = i;
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
