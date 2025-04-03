package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezck implements eyge {
    UNKNOWN_MSISDN_SOURCE(0),
    SIM(1),
    MANUAL_MSISDN(2);

    public final int d;

    ezck(int i) {
        this.d = i;
    }

    public static ezck b(int i) {
        if (i == 0) {
            return UNKNOWN_MSISDN_SOURCE;
        }
        if (i == 1) {
            return SIM;
        }
        if (i != 2) {
            return null;
        }
        return MANUAL_MSISDN;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
