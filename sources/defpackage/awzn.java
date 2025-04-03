package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awzn implements eyge {
    UNKNOWN_RECEIPT_TYPE(1),
    DELIVERY(2),
    DISPLAYED(3),
    DELIVERY_FAILED(4);

    public final int e;

    awzn(int i) {
        this.e = i;
    }

    public static awzn b(int i) {
        if (i == 1) {
            return UNKNOWN_RECEIPT_TYPE;
        }
        if (i == 2) {
            return DELIVERY;
        }
        if (i == 3) {
            return DISPLAYED;
        }
        if (i != 4) {
            return null;
        }
        return DELIVERY_FAILED;
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
