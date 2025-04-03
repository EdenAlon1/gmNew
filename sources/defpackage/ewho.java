package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewho implements eyge {
    PROVISIONING_RULE_UNSPECIFIED(0),
    SIM_ROLE_DEFAULT_CALL(1),
    SIM_ROLE_DEFAULT_SMS(2),
    SIM_ROLE_DEFAULT_DATA(3),
    SIM_ROLE_ANY(4),
    SIM_ROLE_DISABLED_FOR_NON_DEFAULT_CALL(5),
    SIM_ROLE_MULTI_SIM_DISABLED(6),
    UNRECOGNIZED(-1);

    private final int j;

    ewho(int i2) {
        this.j = i2;
    }

    public static ewho b(int i2) {
        switch (i2) {
            case 0:
                return PROVISIONING_RULE_UNSPECIFIED;
            case 1:
                return SIM_ROLE_DEFAULT_CALL;
            case 2:
                return SIM_ROLE_DEFAULT_SMS;
            case 3:
                return SIM_ROLE_DEFAULT_DATA;
            case 4:
                return SIM_ROLE_ANY;
            case 5:
                return SIM_ROLE_DISABLED_FOR_NON_DEFAULT_CALL;
            case 6:
                return SIM_ROLE_MULTI_SIM_DISABLED;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
