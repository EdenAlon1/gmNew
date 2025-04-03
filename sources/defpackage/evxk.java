package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evxk implements eyge {
    UNKNOWN_ALIGNMENT(0),
    RIGHT(1),
    CENTER(2);

    public final int d;

    evxk(int i) {
        this.d = i;
    }

    public static evxk b(int i) {
        if (i == 0) {
            return UNKNOWN_ALIGNMENT;
        }
        if (i == 1) {
            return RIGHT;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
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
