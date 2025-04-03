package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyxc implements eyge {
    OPERATION_TYPE_UNKNOWN(0),
    OPERATION_TYPE_SETUP_VENDOR_IMS(1),
    OPERATION_TYPE_TERMINATE_VENDOR_IMS(2);

    public final int d;

    eyxc(int i) {
        this.d = i;
    }

    public static eyxc b(int i) {
        if (i == 0) {
            return OPERATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPERATION_TYPE_SETUP_VENDOR_IMS;
        }
        if (i != 2) {
            return null;
        }
        return OPERATION_TYPE_TERMINATE_VENDOR_IMS;
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
