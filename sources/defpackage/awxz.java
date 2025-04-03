package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awxz implements eyge {
    UNKNOWN_MESSAGE_SOURCE(0),
    USER(1),
    CONTROL(2);

    public final int d;

    awxz(int i) {
        this.d = i;
    }

    public static awxz b(int i) {
        if (i == 0) {
            return UNKNOWN_MESSAGE_SOURCE;
        }
        if (i == 1) {
            return USER;
        }
        if (i != 2) {
            return null;
        }
        return CONTROL;
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
