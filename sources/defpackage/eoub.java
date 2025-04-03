package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoub implements eyge {
    PHONE_TYPE_NONE(0),
    PHONE_TYPE_GSM(1),
    PHONE_TYPE_CDMA(2),
    PHONE_TYPE_SIP(3);

    public final int e;

    eoub(int i) {
        this.e = i;
    }

    public static eoub b(int i) {
        if (i == 0) {
            return PHONE_TYPE_NONE;
        }
        if (i == 1) {
            return PHONE_TYPE_GSM;
        }
        if (i == 2) {
            return PHONE_TYPE_CDMA;
        }
        if (i != 3) {
            return null;
        }
        return PHONE_TYPE_SIP;
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
