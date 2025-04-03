package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum akdb implements eyge {
    UNDEFINED(0),
    TEST(1),
    D2D(2);

    public final int d;

    akdb(int i) {
        this.d = i;
    }

    public static akdb b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return TEST;
        }
        if (i != 2) {
            return null;
        }
        return D2D;
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
