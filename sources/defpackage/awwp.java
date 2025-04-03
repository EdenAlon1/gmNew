package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awwp implements eyge {
    UNKNOWN_STATE(0),
    JOINED(1),
    DEPARTED(2),
    PENDING(3);

    public final int e;

    awwp(int i) {
        this.e = i;
    }

    public static awwp b(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return JOINED;
        }
        if (i == 2) {
            return DEPARTED;
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
