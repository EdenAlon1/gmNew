package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cful {
    public static final cfup A;
    public static final cfup B;
    public static final cfup C;
    public static final cfup D;
    public static final cfup E;
    public static final cfup F;
    public static final cfup G;
    public static final cfup H;
    public static final cfup I;
    public static final cfup J;
    public static final cfup K;
    public static final cfup L;
    public static final cfup M;
    public static final cfuz N;
    public static final cfup O;
    public static final cfup P;
    public static final cfup Q;
    public static final cfup R;
    public static final cfup S;
    public static final cfup T;
    public static final cfup U;
    public static final cfup V;
    public static final cfup W;
    public static final cfup X;
    public static final cfup Y;
    public static final cfup Z;
    public static final cfup aa;
    public static final cfup ab;
    public static final cfup ac;
    public static final cfup ad;
    public static final cfup ae;
    public static final cfup af;
    public static final cfup ag;
    public static final cfup ah;
    public static final cfup ai;
    public static final cfup aj;
    public static final cfva ak;
    public static final cfup al;
    public static final cfup am;
    public static final cfup an;
    public static final cfva ao;
    public static final cfva ap;
    public static final cfup i;
    public static final cfup j;
    public static final cfup k;
    public static final cfup l;
    public static final cfup m;
    public static final cfup n;
    public static final cfup o;
    public static final cfup p;
    public static final cfup q;
    public static final cfup r;
    public static final cfup s;
    public static final cfup t;
    public static final cfup u;
    public static final cfup v;
    public static final cfup w;
    public static final cfup x;
    public static final cfup y;
    public static final cfup z;
    public static final cfup a = cfvl.i(cfvl.b, "enable_c2o_device_camera", false);
    public static final cfup b = cfvl.i(cfvl.b, "enable_c2o_customization", false);
    public static final cfup c = cfvl.i(cfvl.b, "enable_c2o_gif_search", false);
    public static final cfup d = cfvl.i(cfvl.b, "enable_c2o_gif_search_recents", false);
    public static final cfup e = cfvl.e(cfvl.b, "c2o_gif_search_thumbnail_size", 100000);
    public static final cfup f = cfvl.i(cfvl.b, "enable_c2o_expressive_stickers", false);
    public static final cfup g = cfvl.i(cfvl.b, "enable_emoji_button_uplevel", false);
    public static final cfup h = cfvl.i(cfvl.b, "enable_grpc_compression", true);

    static {
        cfvl.i(cfvl.b, "enable_smart_linkify_flag", false);
        cfvl.i(cfvl.b, "enable_tclib_smart_linkify", false);
        i = cfvl.i(cfvl.b, "enable_multi_device", true);
        j = cfvl.i(cfvl.b, "enable_rbm_sort_messages_by_sent_timestamp", false);
        k = cfvl.i(cfvl.b, "enable_rbm_trigger_missing_rich_card_thumbnail_download_from_ui", false);
        l = cfvl.i(cfvl.b, "enable_rbm_generalized_verifier_ui", false);
        m = cfvl.h(cfvl.b, "listnr_feedback_category", "");
        n = cfvl.h(cfvl.b, "jibe_global_term_of_service", "https://jibe.google.com/policies/terms/");
        o = cfvl.n(cfvl.b, "enable_attachment_content_refactor", false);
        p = cfvl.n(cfvl.b, "enable_draft_ui_decouple", false);
        q = cfvl.i(cfvl.b, "enable_send_conversation_id_to_gboard", false);
        r = cfvl.c(cfvl.b, "report_slow_code_ratio", 1.0d);
        s = cfvl.e(cfvl.b, "minimum_conversation_number", 3);
        t = cfvl.h(cfvl.b, "rcs_help_url_pattern", "https://support.google.com/messages/?p=eligible&hl=%s");
        u = cfvl.c(cfvl.b, "async_minimum_timeout_reporting_ratio", eobe.a);
        v = cfvl.h(cfvl.b, "uma_upload_ratio_map", "");
        w = cfvl.i(cfvl.b, "enable_link_preview_untrusted_senders", false);
        x = cfvl.e(cfvl.b, "link_preview_manual_preview_trust_threshold", 3);
        cfvl.h(cfvl.b, "link_preview_help_center_link", "https://support.google.com/messages/?p=link_previews");
        y = cfvl.h(cfvl.b, "rich_cards_help_center_link", "https://support.google.com/messages/?p=rich_cards");
        z = cfvl.h(cfvl.b, "rich_cards_opt_in_consent_banner_learn_more_link", "");
        A = cfvl.h(cfvl.b, "rich_cards_opt_in_consent_banner_help_center_topic", "privacy_tour");
        B = cfvl.i(cfvl.b, "defer_background_from_broadcast", true);
        C = cfvl.i(cfvl.b, "actions_use_work_manager", false);
        D = cfvl.i(cfvl.b, "enable_verbose_bug_reports", false);
        E = cfvl.i(cfvl.b, "enable_clearcut_throttled_logging", true);
        F = cfvl.i(cfvl.b, "enable_new_image_compression", false);
        G = cfvl.i(cfvl.b, "skip_signature_check_for_g1_restore", false);
        H = cfvl.f(cfvl.b, "orphan_raw_sms_expiration_age_ms", 0L);
        I = cfvl.i(cfvl.b, "enable_annotations_indexing", true);
        J = cfvl.i(cfvl.b, "enable_non_contact_participant_indexing", true);
        K = cfvl.e(cfvl.b, "icing_indexing_batch_size", 20);
        cfvl.f(cfvl.b, "icing_indexing_all_messages_window_size", 5000L);
        L = cfvl.c(cfvl.b, "icing_clearcut_log_sampling_rate", 0.01d);
        M = cfvl.h(cfvl.b, "expressive_stickers_metadata_version", "1000001");
        N = cfvl.s(cfvl.b, "expressive_stickers_market_config", new emyl() { // from class: cfuk
            @Override // defpackage.emyl
            public final Object get() {
                cfup cfupVar = cful.a;
                return ewnm.a.toByteArray();
            }
        });
        O = cfvl.e(cfvl.b, "recent_expressive_stickers_limit", 12);
        P = cfvl.e(cfvl.b, "expressive_stickers_c2o_toggle_button_landing_page", 1);
        Q = cfvl.e(cfvl.b, "expressive_stickers_c2o_overflow_button_landing_page", 1);
        R = cfvl.i(cfvl.b, "enable_expressive_stickers_c2o_my_stickers_button", true);
        S = cfvl.e(cfvl.b, "generic_worker_action_max_retries", 10);
        T = cfvl.i(cfvl.b, "enable_lg_default_sim_switch", false);
        U = cfvl.i(cfvl.b, "enable_non_dds_mms_popup", false);
        V = cfvl.i(cfvl.b, "enable_camera_gallery_roll", true);
        W = cfvl.e(cfvl.b, "compose_entry_point_icons_version", 0);
        X = cfvl.i(cfvl.b, "enable_draft_visual_state", false);
        Y = cfvl.f(cfvl.b, "remote_instance_refresh_interval_ms", TimeUnit.HOURS.toMillis(24L));
        Z = cfvl.i(cfvl.b, "huawei_mate20_upgrade_cleardata", true);
        aa = cfvl.i(cfvl.b, "enable_self_exclusive_worker", true);
        cfvl.i(cfvl.b, "enable_gif_staggered_grid_layout", false);
        ab = cfvl.i(cfvl.b, "enabled_verified_sms", false);
        cfvl.i(cfvl.b, "enable_inbox_archive_animation", false);
        ac = cfvl.h(cfvl.b, "verified_sms_privacy_tour_topic", "verified_sms_pt");
        ad = cfvl.h(cfvl.b, "verified_sms_host_and_port", "verifiedsms-pa.googleapis.com:443");
        cfvl.f(cfvl.b, "verified_sms_verify_message_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        ae = cfvl.f(cfvl.b, "verified_sms_key_rotation_frequency_ms", TimeUnit.DAYS.toMillis(14L));
        af = cfvl.i(cfvl.b, "enable_verified_sms_key_rotation", false);
        ag = cfvl.i(cfvl.b, "force_show_rcs_upsell", false);
        ah = cfvl.i(cfvl.b, "enable_message_status_logging", false);
        ai = cfvl.e(cfvl.b, "message_status_logging_cleanup_for_messages_in_final_state_in_days", 2);
        aj = cfvl.e(cfvl.b, "message_status_logging_cleanup_for_messages_in_non_final_state_in_days", 14);
        cfvl.i(cfvl.b, "enable_d26r_query_logger", true);
        cfvl.c(cfvl.b, "d26r_query_logger_uma_upload_ratio", 0.01d);
        cfvl.c(cfvl.b, "d26r_query_logger_unknown_query_uma_upload_ratio", eobe.a);
        ak = cfvl.i(cfvl.b, "custom_conversation_scroll_animation", true);
        al = cfvl.i(cfvl.b, "debug_menu_default_available", false);
        am = cfvl.i(cfvl.b, "force_check_rcs_session_id", true);
        an = cfvl.i(cfvl.b, "enable_overlapping_rendering_overriding_in_conversation_message_view", false);
        cfvl.i(cfvl.b, "enable_logging_send_failure_country_code", false);
        cfvl.i(cfvl.b, "enable_contact_picker_refactor_logging", false);
        cfvl.e(cfvl.b, "contact_picker_max_journey_history", -1);
        cfvl.i(cfvl.b, "enable_sent_timestamp_for_rcs_reports", false);
        ao = cfvl.n(cfvl.b, "use_system_font", false);
        ap = cfvl.n(cfvl.b, "enable_input_manager_refactor", false);
    }

    public static boolean a(Random random, cfva cfvaVar) {
        double doubleValue = ((Double) cfvaVar.e()).doubleValue();
        if (doubleValue <= eobe.a) {
            return false;
        }
        return doubleValue >= 1.0d || random.nextDouble() < doubleValue;
    }
}
