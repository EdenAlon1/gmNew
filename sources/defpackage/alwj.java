package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwj {
    public static final emyl a = cfvl.y("cobalt_logger_enabled");
    public static final emyl b = cfvl.y("app_install_action_metric_enabled");
    public static final emyl c = cfvl.y("active_user_action_metric_enabled");
    public static final cfup d;
    public static final emyl e;
    public static final emyl f;
    public static final cfva g;
    public static final cfva h;

    static {
        cfvl.e(cfvl.b, "cobalt_logger_uploading_interval_in_hours", 1);
        d = cfvl.e(cfvl.b, "cobalt_init_sync_interval_in_hours", 8);
        e = cfvl.y("use_blocking_executor");
        f = cfvl.y("use_background_executor");
        ecwh ecwhVar = cfvl.b;
        ezgv ezgvVar = (ezgv) ezgw.a.createBuilder();
        ezgvVar.a(engw.C("US", "GB", "DE", "FR", "IN", "ES", "IT", "ZA", "BR", "MX", "CA", "AU", new String[0]));
        g = cfvl.u(ecwhVar, "am_top_slice_country_codes", (ezgw) ezgvVar.build(), new ecwg() { // from class: alwi
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
        ecwh ecwhVar2 = cfvl.b;
        ezgv ezgvVar2 = (ezgv) ezgw.a.createBuilder();
        ezgvVar2.a(engw.A("LG", "SAMSUNG", "GOOGLE", "XIAOMI", "OPPO", "VIVO", "MOTOROLA", "TECNOMOBILELIMITED", "ONEPLUS", "HMDGLOBAL"));
        h = cfvl.u(ecwhVar2, "am_top_slice_manufacturers", (ezgw) ezgvVar2.build(), new ecwg() { // from class: alwi
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
    }
}
