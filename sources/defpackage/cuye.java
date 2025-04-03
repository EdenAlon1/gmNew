package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cuye {
    public static final cfva a = cfvl.f(cfvl.b, "verified_sms_c11n_check_interval", TimeUnit.DAYS.toMillis(7));
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;
    public static final cfva e;

    static {
        cfvl.f(cfvl.b, "verified_sms_valid_key_duration_ms", 1382400000L);
        b = cfvl.n(cfvl.b, "vsms_suppress_unverified_ui", false);
        c = cfvl.i(cfvl.b, "enable_vsms_diagnostic_rpc", false);
        d = cfvl.h(cfvl.b, "allowed_senders_diagnostic_rpc_regex", ".^");
        e = cfvl.h(cfvl.b, "verified_sms_report_diagnostic_link", "https://goto.corp.google.com/vsms-diagnostic-information");
    }

    elfl a();

    boolean b();

    boolean c();

    boolean d();
}
