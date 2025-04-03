package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fcib implements eyge {
    UNKNOWN_REMOVAL_POLICY(0),
    NO_USER_REMOVAL_ALLOWED(1),
    REMOVAL_ALLOWED_FOR_ALL(2),
    REMOVAL_ALLOWED_FOR_ADMINS(3),
    UNRECOGNIZED(-1);

    private final int g;

    fcib(int i) {
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
