package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djka {
    public static ezaj a(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 4 ? ezaj.NETWORK_INTERFACE_TYPE_UNKNOWN : ezaj.NETWORK_INTERFACE_TYPE_VPN : ezaj.NETWORK_INTERFACE_TYPE_WIFI : ezaj.NETWORK_INTERFACE_TYPE_MOBILE_DATA;
    }

    public static String b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 4 ? "Unknown" : "VPN" : "WiFi" : "Mobile";
    }
}
