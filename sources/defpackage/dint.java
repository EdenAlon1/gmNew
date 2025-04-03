package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dint {
    public static final deup a = a("white_listed_packages", "com.google.android.apps.messaging");
    public static final deup b = a("test_service_white_listed_packages", "com.google.android.ims.mobly.snippets");
    public static final deup c = a("white_listed_signatures", "B28C3EDB665DF32686224DF800F603E9959BBE4E,0980A12BE993528C19107BC21AD811478C63CEFC");
    public static final deup d = a("test_service_white_listed_signatures", "AE41481F52E0F58DF2806D5A38EB3DBCA5AE02B0,E165542B31953CC282AA4EF2F4D5F07F7663A2A2");
    public static final deup e;

    static {
        Boolean bool = false;
        bool.getClass();
        e = dins.e("carrier_services_security_flags_allow_http_urls", false);
    }

    private static deup a(String str, String str2) {
        return dins.d("carrier_services_security_flags_".concat(str), str2);
    }
}
