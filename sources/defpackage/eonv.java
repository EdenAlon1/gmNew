package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eonv implements eyge {
    UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON(0),
    INSTANT_MESSAGING_ALWAYS_ON(1),
    INSTANT_MESSAGING_NOT_ALWAYS_ON(2);

    public final int d;

    eonv(int i) {
        this.d = i;
    }

    public static eonv b(int i) {
        if (i == 0) {
            return UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
        }
        if (i == 1) {
            return INSTANT_MESSAGING_ALWAYS_ON;
        }
        if (i != 2) {
            return null;
        }
        return INSTANT_MESSAGING_NOT_ALWAYS_ON;
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
