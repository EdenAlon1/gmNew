package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clrh implements eyge {
    RESPONSE_STATUS_UNKNOWN(0),
    RESPONSE_STATUS_OK(1),
    RESPONSE_STATUS_FAILED(2);

    public final int d;

    clrh(int i) {
        this.d = i;
    }

    public static clrh b(int i) {
        if (i == 0) {
            return RESPONSE_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return RESPONSE_STATUS_OK;
        }
        if (i != 2) {
            return null;
        }
        return RESPONSE_STATUS_FAILED;
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
