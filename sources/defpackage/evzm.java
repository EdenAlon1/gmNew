package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evzm implements eyge {
    UNSPECIFIED(0),
    LIGHT(1),
    DARK(2);

    public final int d;

    evzm(int i) {
        this.d = i;
    }

    public static evzm b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return DARK;
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
