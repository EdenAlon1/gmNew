package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eslr implements eyge {
    UNKNOWN(0),
    OTHER(1),
    CHROME(2),
    FIREFOX(3),
    SAFARI(4),
    OPERA(5),
    IE(6),
    EDGE(7),
    UNRECOGNIZED(-1);

    private final int k;

    eslr(int i) {
        this.k = i;
    }

    public static eslr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OTHER;
            case 2:
                return CHROME;
            case 3:
                return FIREFOX;
            case 4:
                return SAFARI;
            case 5:
                return OPERA;
            case 6:
                return IE;
            case 7:
                return EDGE;
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
