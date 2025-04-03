package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cloy implements eyge {
    UNKNOWN_TYPE(0),
    PRESENT(1),
    ABSENT(2),
    PENDING(3);

    public final int e;

    cloy(int i) {
        this.e = i;
    }

    public static cloy b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return PRESENT;
        }
        if (i == 2) {
            return ABSENT;
        }
        if (i != 3) {
            return null;
        }
        return PENDING;
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
