package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dfkd implements eyge {
    D2D_NOT_SET(0),
    D2D_TEST_APPLICATION(1),
    D2D_GOOGLE_MESSAGES(2),
    D2D_IOS_MESSAGES(3),
    UNRECOGNIZED(-1);

    private final int g;

    dfkd(int i) {
        this.g = i;
    }

    public static dfkd b(int i) {
        if (i == 0) {
            return D2D_NOT_SET;
        }
        if (i == 1) {
            return D2D_TEST_APPLICATION;
        }
        if (i == 2) {
            return D2D_GOOGLE_MESSAGES;
        }
        if (i != 3) {
            return null;
        }
        return D2D_IOS_MESSAGES;
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
