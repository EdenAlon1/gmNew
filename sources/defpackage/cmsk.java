package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsk {
    public static final emyl a = cfvl.w("enable_xms_reactions_sending");
    public static final cfup b = cfvl.i(cfvl.b, "enable_reactions_configurable_logging", false);
    public static final cfup c = cfvl.h(cfvl.b, "reactions_configurable_log_level", "FINEST");
    public static final cfup d = cfvl.e(cfvl.b, "reactions_xms_search_message_limit", 50);
    public static final cfup e = cfvl.e(cfvl.b, "reactions_xms_matched_result_limit", 2);
    public static final cfup f = cfvl.e(cfvl.b, "reactions_matcher_duplicate_distance_limit", 30);
    public static final cfup g = cfvl.i(cfvl.b, "disable_reactions_promo_for_hawkeye", false);

    public static boolean a() {
        return ((Boolean) ((cfup) a.get()).e()).booleanValue();
    }
}
