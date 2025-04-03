package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awwv implements eyge {
    UNKNOWN_STATE(0),
    MEMBERSHIP_CONFIRMED(1),
    LEFT_GROUP(2),
    KICKED_OUT(3);

    public final int e;

    awwv(int i) {
        this.e = i;
    }

    public static awwv b(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return MEMBERSHIP_CONFIRMED;
        }
        if (i == 2) {
            return LEFT_GROUP;
        }
        if (i != 3) {
            return null;
        }
        return KICKED_OUT;
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
