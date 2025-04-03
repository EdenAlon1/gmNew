package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum amwk implements eyge {
    UNKNOWN(0),
    BUGLE(1),
    SATELLITE(2),
    WEAR_PHONE_RELAY(3),
    PENPAL_BOT(4),
    WEAR_RETAIL(5),
    RBM(6),
    EMERGENCY(7),
    UNRECOGNIZED(-1);

    private final int k;

    amwk(int i) {
        this.k = i;
    }

    public static amwk b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BUGLE;
            case 2:
                return SATELLITE;
            case 3:
                return WEAR_PHONE_RELAY;
            case 4:
                return PENPAL_BOT;
            case 5:
                return WEAR_RETAIL;
            case 6:
                return RBM;
            case 7:
                return EMERGENCY;
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
