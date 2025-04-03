package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awxj implements eyge {
    UNKNOWN_REQUESTED_REPORT(0),
    POSITIVE_DELIVERY(1),
    DISPLAY(2),
    NEGATIVE_DELIVERY(3);

    public final int e;

    awxj(int i) {
        this.e = i;
    }

    public static awxj b(int i) {
        if (i == 0) {
            return UNKNOWN_REQUESTED_REPORT;
        }
        if (i == 1) {
            return POSITIVE_DELIVERY;
        }
        if (i == 2) {
            return DISPLAY;
        }
        if (i != 3) {
            return null;
        }
        return NEGATIVE_DELIVERY;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
