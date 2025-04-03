package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewgz implements eyge {
    CONFIGURATION_TYPE_UNKNOWN(0),
    CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS(1),
    CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS(2),
    CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS(3),
    CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION(4),
    UNRECOGNIZED(-1);

    private final int h;

    ewgz(int i) {
        this.h = i;
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
