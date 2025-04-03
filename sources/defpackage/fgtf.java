package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgtf implements eyge {
    DEFAULT_ROLE(0),
    ADMIN(1),
    REGULAR(2),
    UNRECOGNIZED(-1);

    private final int f;

    fgtf(int i) {
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
