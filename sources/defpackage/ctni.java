package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctni {
    public static final cfva a = cfvl.e(cfvl.b, "p2p_suggestion_rewriter_max_number_of_rules_per_impression", 1);
    public static final cfva b = cfvl.e(cfvl.b, "smart_reply_lib_min_trim_level", 40);
    public static final cfva c = cfvl.f(cfvl.b, "smart_reply_lib_trim_throttle_seconds", TimeUnit.MINUTES.toSeconds(1));
    public static final cfva d;
    public static final emyl e;

    static {
        cfvl.i(cfvl.b, "enable_p2p_smart_assistant_suggestions", false);
        d = cfvl.i(cfvl.b, "enable_smart_reply_lib_creation_memory_diff", false);
        emyl w = cfvl.w("log_srlib_exceptions_silent_feedback");
        w.getClass();
        e = w;
    }
}
