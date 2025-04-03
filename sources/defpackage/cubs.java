package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubs {
    public static final emyl A;
    public static final emyl B;
    public static final emyl C;
    public static final cfva D;
    public static final cfva E;
    public static final cfva F;
    public static final cfva G;
    public static final emyl H;
    public static final emyl I;
    public static final cfup J;
    public static final emyl K;
    public static final emyl L;
    public static final emyl M;
    public static final emyl N;
    public static final emyl O;
    private static final emyl P;
    private static final emyl Q;
    public static final cfup a = cfvl.e(cfvl.b, "cs_user_replies_threshold", 5);
    public static final emyl b = cfvl.x(191513431, "moirai_enable_spam_reporting");
    public static final cfup c = cfvl.i(cfvl.b, "disable_logging_spam_consent", false);
    public static final cfup d = cfvl.i(cfvl.b, "enable_on_device_stranger_danger", false);
    public static final emyl e = cfvl.w("spam_send_server_info_to_hades");
    public static final cfup f;
    public static final cfva g;
    public static final cfva h;
    public static final emyl i;
    public static final emyl j;
    public static final emyl k;
    public static final cfup l;
    public static final cfup m;
    public static final cfup n;
    public static final cfup o;
    public static final cfup p;
    public static final emyl q;
    public static final emyl r;
    public static final emyl s;
    public static final emyl t;
    public static final emyl u;
    public static final emyl v;
    public static final emyl w;
    public static final emyl x;
    public static final emyl y;
    public static final emyl z;

    static {
        cfvl.w("spam_run_moirai_precheck_before_odsd");
        f = cfvl.i(cfvl.b, "enable_moirai_spam_protection", false);
        g = cfvl.e(cfvl.b, "tachyon_max_number_of_messages_to_send", 10);
        h = cfvl.e(cfvl.b, "spam_max_number_of_messages_to_send_to_carrier", 10);
        i = cfvl.w("add_block_and_spam_action_for_one_on_one_conversations");
        j = cfvl.y("enable_tartarus_v2");
        k = cfvl.y("enable_tartarus_v2_text_classification");
        l = cfvl.h(cfvl.b, "moirai_text_classification_blob_id", "");
        m = cfvl.h(cfvl.b, "moirai_destination_classification_blob_id", "");
        n = cfvl.f(cfvl.b, "moirai_destination_classification_update_frequency_hours", 24L);
        o = cfvl.h(cfvl.b, "moirai_region", "");
        p = cfvl.f(cfvl.b, "spam_notification_delay_timeout_ms", 4000L);
        q = cfvl.w("enable_safe_url_on_click_check");
        r = cfvl.y("enable_show_dialog_on_stranger_link_click");
        s = cfvl.y("exempt_otp_from_spam_notification_delay");
        t = cfvl.y("enable_delay_eligibility_check_all_participants_contact");
        u = cfvl.y("enable_delay_eligibility_check_first_message_convo");
        v = cfvl.y("spam_ignore_actions_from_short_codes");
        w = cfvl.y("spam_hades_enable_westworld_logging");
        emyl y2 = cfvl.y("spam_hades_enable_event_started_logging");
        y2.getClass();
        x = y2;
        y = cfvl.y("spam_hades_disable_migration_clearcut_logging");
        z = cfvl.y("spam_use_message_wrapper_6");
        A = cfvl.y("enable_spatula_classification");
        B = cfvl.y("enable_managed_users_signed_out_fix");
        C = cfvl.y("enable_automation_detection_for_click_events");
        D = cfvl.f(cfvl.b, "spatula_settings_timeout_millis", 1000L);
        E = cfvl.f(cfvl.b, "spatula_classification_timeout_seconds", 30L);
        F = cfvl.f(cfvl.b, "spatula_pending_verdict_timeout_millis", 60000L);
        G = cfvl.h(cfvl.b, "spatula_test_image_digest", "");
        H = cfvl.w("enable_sstoe");
        I = cfvl.y("ondevice_content_early_rejection_enabled");
        J = cfvl.i(cfvl.b, "enable_spam_rcs_location_text_killswitch", true);
        K = cfvl.y("spam_close_hades_after_classification");
        L = cfvl.y("spam_close_hades_on_memory_pressure");
        M = cfvl.y("enable_mapi_conversation_id_on_block_and_report_spam_api");
        N = cfvl.y("spam_use_bugle_logger_instead_of_emitter");
        P = cfvl.y("spam_fix_allow_external_reporting");
        O = cfvl.y("spam_fix_toolstone_margin");
        Q = cfvl.y("spam_disallow_double_reporting");
    }

    public static final Boolean a() {
        return (Boolean) ((cfup) M.get()).e();
    }

    public static final Boolean b() {
        return (Boolean) ((cfup) N.get()).e();
    }

    public static final boolean c() {
        Object e2 = ((cfup) C.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final boolean d() {
        Object e2 = ((cfup) B.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final boolean e() {
        return !((Boolean) c.e()).booleanValue();
    }

    public static final boolean f() {
        Object e2 = ((cfup) A.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final boolean g() {
        Object e2 = ((cfup) v.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final boolean h() {
        Object e2 = ((cfup) I.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }

    public static final Boolean i() {
        return (Boolean) ((cfup) Q.get()).e();
    }

    public static final Boolean j() {
        return (Boolean) ((cfup) P.get()).e();
    }
}
