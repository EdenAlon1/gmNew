package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbrr implements eyge {
    PROTOCOL_UNSPECIFIED(0),
    RCS(1),
    XMS(2),
    UNRECOGNIZED(-1);

    private final int f;

    fbrr(int i) {
        this.f = i;
    }

    public static fbrr b(int i) {
        if (i == 0) {
            return PROTOCOL_UNSPECIFIED;
        }
        if (i == 1) {
            return RCS;
        }
        if (i != 2) {
            return null;
        }
        return XMS;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
