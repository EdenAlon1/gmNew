package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwpg implements eyge {
    DEFAULT(0),
    NONE(1),
    SHA256(2);

    public final int d;

    dwpg(int i) {
        this.d = i;
    }

    public static dwpg b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return NONE;
        }
        if (i != 2) {
            return null;
        }
        return SHA256;
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
