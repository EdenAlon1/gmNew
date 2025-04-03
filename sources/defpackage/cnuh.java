package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cnuh implements eyge {
    SESSION_STATUS_UNKNOWN(0),
    SESSION_STATUS_OFF(1),
    SESSION_STATUS_DEMO(2),
    SESSION_STATUS_NON_EMERGENCY(3),
    SESSION_STATUS_EMERGENCY(4),
    SESSION_STATUS_DISABLING(5),
    SESSION_STATUS_ENDING_EMERGENCY(6),
    SESSION_STATUS_NON_STARGATE_SESSION(7),
    UNRECOGNIZED(-1);

    private final int k;

    cnuh(int i) {
        this.k = i;
    }

    public static cnuh b(int i) {
        switch (i) {
            case 0:
                return SESSION_STATUS_UNKNOWN;
            case 1:
                return SESSION_STATUS_OFF;
            case 2:
                return SESSION_STATUS_DEMO;
            case 3:
                return SESSION_STATUS_NON_EMERGENCY;
            case 4:
                return SESSION_STATUS_EMERGENCY;
            case 5:
                return SESSION_STATUS_DISABLING;
            case 6:
                return SESSION_STATUS_ENDING_EMERGENCY;
            case 7:
                return SESSION_STATUS_NON_STARGATE_SESSION;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
