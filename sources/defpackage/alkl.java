package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum alkl implements eyge {
    TRANSPORT_OTHER(0),
    TRANSPORT_BLUETOOTH(1),
    TRANSPORT_CELLULAR(2),
    TRANSPORT_ETHERNET(3),
    TRANSPORT_VPN(4),
    TRANSPORT_WIFI(5);

    public final int g;

    alkl(int i) {
        this.g = i;
    }

    public static alkl b(int i) {
        if (i == 0) {
            return TRANSPORT_OTHER;
        }
        if (i == 1) {
            return TRANSPORT_BLUETOOTH;
        }
        if (i == 2) {
            return TRANSPORT_CELLULAR;
        }
        if (i == 3) {
            return TRANSPORT_ETHERNET;
        }
        if (i == 4) {
            return TRANSPORT_VPN;
        }
        if (i != 5) {
            return null;
        }
        return TRANSPORT_WIFI;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
