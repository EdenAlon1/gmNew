package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum ayhd implements eyge {
    NONE(0),
    RCS_GROUP_SELF_ONLY(1),
    RCS_GROUP_CREATED_TOO_LARGE(2),
    RCS_GROUP_NOT_FOUND(3),
    UNRECOGNIZED(-1);

    private final int g;

    ayhd(int i) {
        this.g = i;
    }

    public static ayhd b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return RCS_GROUP_SELF_ONLY;
        }
        if (i == 2) {
            return RCS_GROUP_CREATED_TOO_LARGE;
        }
        if (i != 3) {
            return null;
        }
        return RCS_GROUP_NOT_FOUND;
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
