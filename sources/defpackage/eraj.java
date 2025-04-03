package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eraj implements eyge {
    UPDATE_TRIGGER_UNKNOWN(0),
    UPDATE_TRIGGER_APP_START(1),
    UPDATE_TRIGGER_SUBSCRIPTIONS_CHANGED(2),
    UPDATE_TRIGGER_CARRIER_CONFIG_CHANGED(3),
    UPDATE_TRIGGER_DEFAULT_SUBSCRIPTION_CHANGED(4),
    UPDATE_TRIGGER_DEFAULT_SMS_SUBSCRIPTION_CHANGED(5),
    UPDATE_TRIGGER_SIM_STATE_LOADED(6),
    UPDATE_TRIGGER_SIM_STATE_ABSENT(7),
    UPDATE_TRIGGER_SIM_STATE_NOT_READY(8),
    UPDATE_TRIGGER_UNSTABLE_SUBSCRIPTION(9),
    UNRECOGNIZED(-1);

    private final int m;

    eraj(int i) {
        this.m = i;
    }

    public static eraj b(int i) {
        switch (i) {
            case 0:
                return UPDATE_TRIGGER_UNKNOWN;
            case 1:
                return UPDATE_TRIGGER_APP_START;
            case 2:
                return UPDATE_TRIGGER_SUBSCRIPTIONS_CHANGED;
            case 3:
                return UPDATE_TRIGGER_CARRIER_CONFIG_CHANGED;
            case 4:
                return UPDATE_TRIGGER_DEFAULT_SUBSCRIPTION_CHANGED;
            case 5:
                return UPDATE_TRIGGER_DEFAULT_SMS_SUBSCRIPTION_CHANGED;
            case 6:
                return UPDATE_TRIGGER_SIM_STATE_LOADED;
            case 7:
                return UPDATE_TRIGGER_SIM_STATE_ABSENT;
            case 8:
                return UPDATE_TRIGGER_SIM_STATE_NOT_READY;
            case 9:
                return UPDATE_TRIGGER_UNSTABLE_SUBSCRIPTION;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
