package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aorb implements eyge {
    UNSPECIFIED(0),
    NOT_MODIFIED(1),
    MODIFIED_AREA_CODE(2),
    MODIFIED_COUNTRY_CODE(3),
    MODIFIED_AND_INFORMED(4),
    UNRECOGNIZED(-1);

    private final int h;

    aorb(int i) {
        this.h = i;
    }

    public static aorb b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NOT_MODIFIED;
        }
        if (i == 2) {
            return MODIFIED_AREA_CODE;
        }
        if (i == 3) {
            return MODIFIED_COUNTRY_CODE;
        }
        if (i != 4) {
            return null;
        }
        return MODIFIED_AND_INFORMED;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
