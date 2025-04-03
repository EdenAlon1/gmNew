package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqjv implements eyge {
    UNKNOWN_SUPER_SORT_LABEL(0),
    PERSONAL(1),
    TRANSACTION(2),
    PROMOTION(3),
    UPDATE(4),
    OTP(5),
    ALL(6),
    BUSINESS_UPDATE(7);

    public final int i;

    eqjv(int i) {
        this.i = i;
    }

    public static eqjv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SUPER_SORT_LABEL;
            case 1:
                return PERSONAL;
            case 2:
                return TRANSACTION;
            case 3:
                return PROMOTION;
            case 4:
                return UPDATE;
            case 5:
                return OTP;
            case 6:
                return ALL;
            case 7:
                return BUSINESS_UPDATE;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
