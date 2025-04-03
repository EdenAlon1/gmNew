package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum akue implements eyge {
    UNSET(0),
    USER_ENABLED_FEATURE(1),
    USER_DISABLED_FEATURE(2),
    CONSENT_NOTICE_SHOWN(3),
    CONSENT_ENABLED_FEATURE(4),
    UNRECOGNIZED(-1);

    private final int h;

    akue(int i) {
        this.h = i;
    }

    public static akue b(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return USER_ENABLED_FEATURE;
        }
        if (i == 2) {
            return USER_DISABLED_FEATURE;
        }
        if (i == 3) {
            return CONSENT_NOTICE_SHOWN;
        }
        if (i != 4) {
            return null;
        }
        return CONSENT_ENABLED_FEATURE;
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
