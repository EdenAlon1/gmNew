package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjr {
    public static final cfup a = cfvl.i(cfvl.b, "enable_message_reminder", false);
    public static final emyl b = cfvl.y("enable_updated_message_reminder_feature");
    public static final emyl c = cfvl.y("enable_reminder_expiration");
    public static final cfup d = cfvl.f(cfvl.b, "reminder_expiration_millis", 259200000);
    public static final cfup e = cfvl.i(cfvl.b, "enable_incoming_message_notification_reminder", false);
    public static final cfup f = cfvl.f(cfvl.b, "debug_reminder_snooze_override_in_seconds", -1);
    public static final cfup g = cfvl.f(cfvl.b, "debug_reminder_override_expiration_in_seconds", -1);
    public static final cfup h = cfvl.i(cfvl.b, "reminder_scroll_flash", false);
    public static final cfup i = cfvl.e(cfvl.b, "reminder_scroll_flash_delay", 400);
    public static final cfup j = cfvl.e(cfvl.b, "reminder_scroll_flash_duration", 300);
    public static final cfup k = cfvl.e(cfvl.b, "reminder_scroll_flash_fade_out_duration", 5);
    public static final cfup l = cfvl.i(cfvl.b, "enable_one_hour_default_smart_action_reminder", false);

    public static boolean a() {
        return ((Boolean) a.e()).booleanValue() && !c();
    }

    public static boolean b() {
        if (ersy.a("bugle.disable_reminders_with_conversation_2", "bugle")) {
            return false;
        }
        return ((Boolean) a.e()).booleanValue() || c();
    }

    public static boolean c() {
        return ((Boolean) ((cfup) b.get()).e()).booleanValue();
    }
}
