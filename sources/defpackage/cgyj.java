package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgyj {
    public static final cfup a = cfvl.h(cfvl.b, "tachyon_media_path", "https://instantmessaging-pa.googleapis.com/upload");
    public static final cfup b = cfvl.f(cfvl.b, "tachyon_registration_timeout_slop_ms", TimeUnit.MINUTES.toMillis(10));
    public static final cfup c = cfvl.h(cfvl.b, "tachyon_registration_pin", "");

    @Deprecated
    public static final cfup d = cfvl.i(cfvl.b, "tachyon_phone_registration", true);
    public static final cfup e = cfvl.h(cfvl.b, "jibe_pcscf_regex", ".*telephony.goog$");
    public static final cfup f = cfvl.e(cfvl.b, "bind_retry_delay_scale_factor", 1);
    public static final cfup g = cfvl.e(cfvl.b, "phone_pong_watchdog_seconds", 15);
    public static final cfup h = cfvl.e(cfvl.b, "phone_idle_timeout_seconds", 65);
    public static final cfup i = cfvl.e(cfvl.b, "phone_bind_retry_times", 2);
    public static final cfup j = cfvl.e(cfvl.b, "ditto_pong_watchdog_seconds", 15);
    public static final cfup k = cfvl.e(cfvl.b, "ditto_idle_timeout_seconds", 65);
    public static final cfup l = cfvl.e(cfvl.b, "ditto_bind_retry_times", 3);
    public static final cfup m = cfvl.e(cfvl.b, "gditto_pong_watchdog_seconds", 15);
    public static final cfup n = cfvl.e(cfvl.b, "gditto_idle_timeout_seconds", 65);
    public static final cfup o = cfvl.e(cfvl.b, "gditto_bind_retry_times", 2);
    public static final cfup p = cfvl.e(cfvl.b, "cms_pong_watchdog_seconds", 15);
    public static final cfup q = cfvl.e(cfvl.b, "cms_idle_timeout_seconds", 65);
    public static final cfup r = cfvl.e(cfvl.b, "cms_bind_retry_times", 2);
    public static final cfup s = cfvl.e(cfvl.b, "bind_handler_pull_delay_seconds", 2);
}
