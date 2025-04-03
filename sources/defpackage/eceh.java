package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum eceh implements eyge {
    UNSET(0),
    PERIODIC(1),
    STALL(2);

    public final int d;

    eceh(int i) {
        this.d = i;
    }

    public static eceh b(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return PERIODIC;
        }
        if (i != 2) {
            return null;
        }
        return STALL;
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
