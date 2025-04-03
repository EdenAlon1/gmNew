package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmem implements eyge {
    RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED(0),
    LEGAL_FYI_SEEN(1),
    OOB_CONSENT(2),
    NO_OOB_CONSENT(3),
    UNRECOGNIZED(-1);

    private final int g;

    cmem(int i) {
        this.g = i;
    }

    public static cmem b(int i) {
        if (i == 0) {
            return RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return LEGAL_FYI_SEEN;
        }
        if (i == 2) {
            return OOB_CONSENT;
        }
        if (i != 3) {
            return null;
        }
        return NO_OOB_CONSENT;
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
