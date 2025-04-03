package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clxt implements eyge {
    GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED(0),
    GOOGLE_TOS_CONSENTED(1),
    GOOGLE_TOS_DECLINED(2),
    UNRECOGNIZED(-1);

    private final int f;

    clxt(int i) {
        this.f = i;
    }

    public static clxt b(int i) {
        if (i == 0) {
            return GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return GOOGLE_TOS_CONSENTED;
        }
        if (i != 2) {
            return null;
        }
        return GOOGLE_TOS_DECLINED;
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
