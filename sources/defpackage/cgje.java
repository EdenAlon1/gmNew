package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgje {
    public static final emyl a = cfvl.y("lighter_enable_lighter");
    public static final emyl b = cfvl.y("lighter_enable_component_check");
    public static final cfup c;

    static {
        cfvl.y("lighter_trigger_intent_filter_on_account_change");
        c = cfvl.h(cfvl.b, "lighter_learn_more_url", "https://support.google.com/messages/answer/9836003?ref_topic=7501205");
        cfvl.y("enable_info_icon_tooltip_auto_popup");
        cfvl.f(cfvl.b, "lighter_photos_images_ttl_millis", 2592000000L);
        cfvl.y("enable_lighter_logging");
        cfvl.f(cfvl.b, "lighter_home_action_timeout_millis", 30000L);
    }

    public static final boolean a() {
        if (adhu.a()) {
            return ((Boolean) ((cfup) a.get()).e()).booleanValue() || aspf.a();
        }
        return false;
    }
}
