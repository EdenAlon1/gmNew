package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cloc implements eyge {
    DISPOSITION_NOTIFICATION_TYPE_UNKNOWN(0),
    DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY(1),
    DISPOSITION_NOTIFICATION_TYPE_DISPLAY(2),
    DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY(3);

    public final int e;

    cloc(int i) {
        this.e = i;
    }

    public static cloc b(int i) {
        if (i == 0) {
            return DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        if (i == 2) {
            return DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
        }
        if (i != 3) {
            return null;
        }
        return DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY;
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
