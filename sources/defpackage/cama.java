package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cama implements eyge {
    UNSET(0),
    PROVISIONED(1),
    NOT_PROVISIONED(2),
    NOT_PROVISIONED_BUT_INITIALIZED(3),
    UNRECOGNIZED(-1);

    private final int g;

    cama(int i) {
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
