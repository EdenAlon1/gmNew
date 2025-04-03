package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqna implements eyge {
    TRANSPORT_UNKNOWN(0),
    TRANSPORT_RCS(1),
    TRANSPORT_TACHYGRAM(2),
    TRANSPORT_SINGLE_REGISTRATION(3);

    public final int e;

    eqna(int i) {
        this.e = i;
    }

    public static eqna b(int i) {
        if (i == 0) {
            return TRANSPORT_UNKNOWN;
        }
        if (i == 1) {
            return TRANSPORT_RCS;
        }
        if (i == 2) {
            return TRANSPORT_TACHYGRAM;
        }
        if (i != 3) {
            return null;
        }
        return TRANSPORT_SINGLE_REGISTRATION;
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
