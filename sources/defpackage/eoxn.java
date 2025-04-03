package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoxn implements eyge {
    UNKNOWN_SEND_MODE(0),
    SEND_MODE_AUTO(1),
    SEND_MODE_XMS(2),
    SEND_MODE_XMS_LATCH(3);

    public final int e;

    eoxn(int i) {
        this.e = i;
    }

    public static eoxn b(int i) {
        if (i == 0) {
            return UNKNOWN_SEND_MODE;
        }
        if (i == 1) {
            return SEND_MODE_AUTO;
        }
        if (i == 2) {
            return SEND_MODE_XMS;
        }
        if (i != 3) {
            return null;
        }
        return SEND_MODE_XMS_LATCH;
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
