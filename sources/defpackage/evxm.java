package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evxm implements eyge {
    UNKNOWN_LAYOUT(0),
    VERTICAL(1),
    HORIZONTAL(2);

    public final int d;

    evxm(int i) {
        this.d = i;
    }

    public static evxm b(int i) {
        if (i == 0) {
            return UNKNOWN_LAYOUT;
        }
        if (i == 1) {
            return VERTICAL;
        }
        if (i != 2) {
            return null;
        }
        return HORIZONTAL;
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
