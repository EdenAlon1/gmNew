package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmau implements eyge {
    RESPONSE_STATUS_UNKNOWN(0),
    OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE(1),
    OTP_FORCE_VERIFICATION_THROTTLED(2),
    OTP_THROTTLED(5),
    OTP_TIMEOUT(3),
    OTP_COMPLETE(4),
    UNRECOGNIZED(-1);

    private final int i;

    cmau(int i) {
        this.i = i;
    }

    public static cmau b(int i) {
        if (i == 0) {
            return RESPONSE_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE;
        }
        if (i == 2) {
            return OTP_FORCE_VERIFICATION_THROTTLED;
        }
        if (i == 3) {
            return OTP_TIMEOUT;
        }
        if (i == 4) {
            return OTP_COMPLETE;
        }
        if (i != 5) {
            return null;
        }
        return OTP_THROTTLED;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
