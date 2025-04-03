package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjwi implements eyge {
    PROFILE_UNSPECIFIED_SOURCE(0),
    PROFILE_CONTACT_SOURCE(1),
    PROFILE_PEOPLE_SHARING_SOURCE(2),
    UNRECOGNIZED(-1);

    private final int f;

    cjwi(int i) {
        this.f = i;
    }

    public static cjwi b(int i) {
        if (i == 0) {
            return PROFILE_UNSPECIFIED_SOURCE;
        }
        if (i == 1) {
            return PROFILE_CONTACT_SOURCE;
        }
        if (i != 2) {
            return null;
        }
        return PROFILE_PEOPLE_SHARING_SOURCE;
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
