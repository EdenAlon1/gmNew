package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adnx implements eyge {
    PAS_UNKNOWN(0),
    PAS_READY_TO_SIGN_OUT(1),
    PAS_NOT_READY_UNKNOWN_REASON(2),
    PAS_NOT_READY_DISABLE_D13Y_FAIL(3),
    UNRECOGNIZED(-1);

    private final int g;

    adnx(int i) {
        this.g = i;
    }

    public static adnx b(int i) {
        if (i == 0) {
            return PAS_UNKNOWN;
        }
        if (i == 1) {
            return PAS_READY_TO_SIGN_OUT;
        }
        if (i == 2) {
            return PAS_NOT_READY_UNKNOWN_REASON;
        }
        if (i != 3) {
            return null;
        }
        return PAS_NOT_READY_DISABLE_D13Y_FAIL;
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
