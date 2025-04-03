package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoov implements eyge {
    UNKNOWN_FORMAT_TYPE(0),
    FORMAT_3GPP_GSM(1),
    FORMAT_3GPP2_CDMA(2);

    public final int d;

    eoov(int i) {
        this.d = i;
    }

    public static eoov b(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT_TYPE;
        }
        if (i == 1) {
            return FORMAT_3GPP_GSM;
        }
        if (i != 2) {
            return null;
        }
        return FORMAT_3GPP2_CDMA;
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
