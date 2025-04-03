package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dinr {
    public static final deup a = a("enable_log_saver", true);
    public static final deup b = a("enable_persistent_logging", true);
    public static final deup c = b("default_persistent_log_saver_rotation_set_size", 4);
    public static final deup d;
    public static final deup e;
    public static final deup f;
    public static final deup g;
    public static final deup h;
    public static final deup i;
    public static final deup j;

    static {
        a("enable_realtime_exceptional_logging", false);
        d = b("default_persistent_log_saver_file_limit_bytes", 262144);
        e = a("save_all_logs", false);
        f = c("log_level", "INFO");
        g = a("enable_sensitive_logging", false);
        a("enable_dtmf_tone_logging", false);
        a("should_crash_on_wtf", false);
        h = a("enable_debug_mode", false);
        i = c("tycho_package", "com.google.android.apps.tycho");
        a("enable_woodpecker_persistent_logging", false);
        j = c("bugle_testing_simulation_session_id", "");
    }

    private static deup a(String str, Boolean bool) {
        return dins.e("carrier_services_".concat(str), bool.booleanValue());
    }

    private static deup b(String str, Integer num) {
        return dins.c("carrier_services_".concat(str), num);
    }

    private static deup c(String str, String str2) {
        return dins.d("carrier_services_".concat(str), str2);
    }
}
