package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum byys implements eyge {
    UNKNOWN_WORKER(0),
    PHONE_NUMBER_NORMALIZATION(1),
    PARTICIPANTS_TABLE_MY_IDENTITY(2),
    MY_IDENTITY_FOREIGN_KEY(3),
    UNRECOGNIZED(-1);

    private final int g;

    byys(int i) {
        this.g = i;
    }

    public static byys b(int i) {
        if (i == 0) {
            return UNKNOWN_WORKER;
        }
        if (i == 1) {
            return PHONE_NUMBER_NORMALIZATION;
        }
        if (i == 2) {
            return PARTICIPANTS_TABLE_MY_IDENTITY;
        }
        if (i != 3) {
            return null;
        }
        return MY_IDENTITY_FOREIGN_KEY;
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
