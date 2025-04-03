package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awxx implements eyge {
    UNKNOWN_MESSAGE_PRIORITY(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);

    public final int e;

    awxx(int i) {
        this.e = i;
    }

    public static awxx b(int i) {
        if (i == 0) {
            return UNKNOWN_MESSAGE_PRIORITY;
        }
        if (i == 1) {
            return HIGH;
        }
        if (i == 2) {
            return NORMAL;
        }
        if (i != 3) {
            return null;
        }
        return LOW;
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
