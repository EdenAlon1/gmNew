package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezaj implements eyge {
    NETWORK_INTERFACE_TYPE_UNKNOWN(0),
    NETWORK_INTERFACE_TYPE_MOBILE_DATA(1),
    NETWORK_INTERFACE_TYPE_WIFI(2),
    NETWORK_INTERFACE_TYPE_VPN(3);

    public final int e;

    ezaj(int i) {
        this.e = i;
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
