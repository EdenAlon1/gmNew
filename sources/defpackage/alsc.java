package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alsc {
    public static final cfva a = cfvl.n(cfvl.b, "enable_prime_jank_metrics", false);
    public static final cfva b = cfvl.n(cfvl.b, "primes_jank_monitor_all_activities", false);
    public static final cfva c = cfvl.n(cfvl.b, "enable_stall_metrics", false);
    public static final cfva d = cfvl.k(cfvl.b, "stalls_initial_monitoring_delay_ms", 250);
    public static final cfva e = cfvl.k(cfvl.b, "stalls_check_for_response_interval_ms", 250);
    public static final cfva f = cfvl.k(cfvl.b, "stalls_mid_stall_interval_ms", 250);
    public static final cfva g;
    public static final cfva h;
    public static final cfva i;
    public static final cfva j;
    static final cfva k;
    static final cfva l;
    public static final cfva m;
    public static final cfva n;
    public static final cfva o;
    public static final cfva p;
    public static final cfva q;

    static {
        ecwh ecwhVar = cfvl.b;
        ezgt ezgtVar = (ezgt) ezgu.a.createBuilder();
        ezgtVar.a(1000);
        ezgtVar.a(2500);
        ezgtVar.a(5000);
        g = cfvl.u(ecwhVar, "stalls_threshold_list_ms", (ezgu) ezgtVar.build(), new ecwg() { // from class: alsb
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgu) eyfy.parseFrom(ezgu.a, bArr);
            }
        });
        h = cfvl.k(cfvl.b, "stalls_post_to_main_interval_ms", 250);
        i = cfvl.n(cfvl.b, "enable_cpu_profiling_v2", false);
        j = cfvl.n(cfvl.b, "enable_native_crash_reporting", false);
        k = cfvl.n(cfvl.b, "enable_memory_monitoring", false);
        l = cfvl.n(cfvl.b, "enable_network_monitoring", false);
        m = cfvl.n(cfvl.b, "enable_auto_url_sanitization_for_network_monitoring", false);
        n = cfvl.n(cfvl.b, "enable_metric_extension_for_network_monitoring", false);
        o = cfvl.n(cfvl.b, "enable_latency_monitoring", false);
        p = cfvl.n(cfvl.b, "enable_package_monitoring", false);
        q = cfvl.n(cfvl.b, "enable_battery_monitoring", false);
    }

    public final boolean a() {
        return ((Boolean) k.e()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) l.e()).booleanValue();
    }
}
