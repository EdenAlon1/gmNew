package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cgdz implements eyge {
    GSOS_UNKNOWN(0),
    GSOS_INTENTIONALLY_SIGNED_OUT(1),
    GSOS_UNINTENTIONALLY_SIGNED_OUT(2);

    public final int d;

    cgdz(int i) {
        this.d = i;
    }

    public static cgdz b(int i) {
        if (i == 0) {
            return GSOS_UNKNOWN;
        }
        if (i == 1) {
            return GSOS_INTENTIONALLY_SIGNED_OUT;
        }
        if (i != 2) {
            return null;
        }
        return GSOS_UNINTENTIONALLY_SIGNED_OUT;
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
