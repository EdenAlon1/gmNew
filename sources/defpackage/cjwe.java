package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjwe implements eyge {
    PREFER_UNKNOWN(0),
    PREFER_PROFILE_PHOTO(1),
    PREFER_CONTACT_PHOTO(2),
    UNRECOGNIZED(-1);

    private final int f;

    cjwe(int i) {
        this.f = i;
    }

    public static cjwe b(int i) {
        if (i == 0) {
            return PREFER_UNKNOWN;
        }
        if (i == 1) {
            return PREFER_PROFILE_PHOTO;
        }
        if (i != 2) {
            return null;
        }
        return PREFER_CONTACT_PHOTO;
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
