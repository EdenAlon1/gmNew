package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adop implements eyge {
    SOAFS_UNKNOWN(0),
    SOAFS_SIGNING_OUT_D13Y_TOGGLE_ON(1),
    SOAFS_SIGNING_OUT_D13Y_TOGGLE_OFF(2),
    SOAFS_FAILED_TO_SIGN_OUT_D13Y_FAIL(3),
    SOAFS_FAILED_TO_SIGN_OUT_UNKNOWN(4),
    SOAFS_SIGNING_OUT_NO_D13Y_TOGGLE(5),
    UNRECOGNIZED(-1);

    private final int i;

    adop(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
