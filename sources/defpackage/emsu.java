package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emsu implements eyge {
    RELEASE_STAGE_NOT_SET(0),
    DEBUG(10),
    FISHFOOD(20),
    DOGFOOD(40),
    OPEN_BETA(60),
    GA(99),
    UNRECOGNIZED(-1);

    private final int i;

    emsu(int i) {
        this.i = i;
    }

    public static emsu b(int i) {
        if (i == 0) {
            return RELEASE_STAGE_NOT_SET;
        }
        if (i == 10) {
            return DEBUG;
        }
        if (i == 20) {
            return FISHFOOD;
        }
        if (i == 40) {
            return DOGFOOD;
        }
        if (i == 60) {
            return OPEN_BETA;
        }
        if (i != 99) {
            return null;
        }
        return GA;
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
