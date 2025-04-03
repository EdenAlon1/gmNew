package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snz {
    private static final enip a;
    private static final enip b;
    private static final enip c;
    private static final enip d;
    private static final enip e;
    private static volatile ctzc f;
    private static final enip g;
    private static final enip h;
    private static final enip i;
    private static final enip j;
    private static volatile ctzc k;

    static {
        Integer valueOf = Integer.valueOf(R.string.rcs_tos_state_key);
        Integer valueOf2 = Integer.valueOf(R.string.should_show_google_tos_prompt_key);
        Integer valueOf3 = Integer.valueOf(R.string.send_sound_pref_key);
        Integer valueOf4 = Integer.valueOf(R.string.notifications_enabled_pref_key);
        Integer valueOf5 = Integer.valueOf(R.string.notification_vibration_pref_key);
        Integer valueOf6 = Integer.valueOf(R.string.bnr_gaia_account_user_id_pref_key);
        a = enip.v(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, Integer.valueOf(R.string.cms_d2d_timestamp_pref_key), Integer.valueOf(R.string.prior_to_d2d_device_id_pref_key), Integer.valueOf(R.string.cms_d2d_flag_pref_key));
        b = enip.v(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, Integer.valueOf(R.string.bnr_enabled_status_pref_key), Integer.valueOf(R.string.multi_device_enabled_status_pref_key), valueOf6);
        Integer valueOf7 = Integer.valueOf(R.string.notifications_group_children_key);
        Integer valueOf8 = Integer.valueOf(R.string.lgaayl_already_prompted_pref_key);
        Integer valueOf9 = Integer.valueOf(R.string.link_preview_tombstone_seen_pref_key);
        Integer valueOf10 = Integer.valueOf(R.string.link_preview_tombstone_first_shown_millis_pref_key);
        Integer valueOf11 = Integer.valueOf(R.string.rich_cards_opt_in_banner_dismissed);
        Integer valueOf12 = Integer.valueOf(R.string.reminder_rich_cards_opt_in_banner_dismissed);
        Integer valueOf13 = Integer.valueOf(R.string.rich_cards_opt_in_dialog_dismissed_pref_key);
        Integer valueOf14 = Integer.valueOf(R.string.notification_sound_pref_key);
        Integer valueOf15 = Integer.valueOf(R.string.current_country_pref_key);
        Integer valueOf16 = Integer.valueOf(R.string.dump_sms_pref_key);
        Integer valueOf17 = Integer.valueOf(R.string.dump_mms_pref_key);
        Integer valueOf18 = Integer.valueOf(R.string.assistant_enabled_pref_key);
        Integer valueOf19 = Integer.valueOf(R.string.smart_actions_enabled_pref_key);
        Integer valueOf20 = Integer.valueOf(R.string.smart_compose_enabled_pref_key);
        Integer valueOf21 = Integer.valueOf(R.string.suggested_stickers_enabled_pref_key);
        Integer valueOf22 = Integer.valueOf(R.string.p2p_conversation_suggestions_enabled_pref_key);
        Integer valueOf23 = Integer.valueOf(R.string.p2p_conversation_suggestions_training_enabled_pref_key);
        Integer valueOf24 = Integer.valueOf(R.string.link_preview_enabled_pref_key);
        Integer valueOf25 = Integer.valueOf(R.string.link_preview_wifi_only_pref_key);
        Integer valueOf26 = Integer.valueOf(R.string.rich_cards_settings_enable_all_pref_key);
        Integer valueOf27 = Integer.valueOf(R.string.enable_rcs_pref_key);
        Integer valueOf28 = Integer.valueOf(R.string.send_seen_report_rcs_pref_key);
        Integer valueOf29 = Integer.valueOf(R.string.share_typing_status_rcs_pref_key);
        Integer valueOf30 = Integer.valueOf(R.string.rcs_fallback_type_pref_key);
        Integer valueOf31 = Integer.valueOf(R.string.rcs_default_sharing_method_key);
        Integer valueOf32 = Integer.valueOf(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        enip v = enip.v(valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, Integer.valueOf(R.string.rcs_availability_key), Integer.valueOf(R.string.rcs_provisioning_flow_key), Integer.valueOf(R.string.rcs_acs_url_override_key), Integer.valueOf(R.string.spam_detection_pref_key), Integer.valueOf(R.string.spam_settings_pref_key), Integer.valueOf(R.string.vsms_enabled_pref_key));
        c = v;
        enin eninVar = new enin();
        eninVar.j(v);
        d = eninVar.g();
        e = enip.v("delivery_reports", "auto_retrieve_mms", "auto_retrieve_mms_when_roaming", "group_messaging", "mms_phone_number", "is_expressive_stickers_setup_done", "has_try_expressive_stickers_setup", "apns_version", "app_already_migrated_blocked_contacts", "app_already_prompted_for_dogfood", "app_install_time_millis", "assistant_request_id", "bugle_full_sync_in_progress", "bugle_twinned_status", "bugle_twinning_activation_help_text", "bugle_twinning_prompt_text", "bugle_twinning_primary_number", "c2o_category_order", "conversation_list_last_popup_show_timestamp_ms", "debugging_features_enabled", "device_reboot_timestamp_ms", "ditto_active_desktop_id", "ditto_active_desktop_request_id", "ditto_desktop_settings", "ditto_has_seen_pairing_screen", "ditto_persistent_notification_channel_enabled", "ditto_persistent_notification_channel_pre_o_enabled", "ditto_prompt_dismissed_count", "ditto_prompt_is_showing", "ditto_last_dismissed_timestamp_ms", "ditto_silenced_notifications", "ditto_while_connected_notification_channel_enabled", "recent_emoji", "fast_track_onboarding_progress", "p2p_conversation_training_popup_dismissed", "federated_learning_popup_is_showing", "p2p_conversation_training_popup_seen_timestamp", "federated_learning_feature_consent", "fast_track_prompt_dismissed", "firebase_instance_id", "first_analytics_upload_time_in_millis", "first_opened_bugle_time_millis", "has_dismissed_hats", "has_sent_a_message", "has_shown_assistant_tooltip", "has_shown_sms_link_warning", "has_user_dismissed_assistant_suggestions_tooltip", "has_user_dismissed_p2p_conversation_suggestions_tooltip", "has_user_seen_assistant_c2o_onboarding", "imessage_banner_interaced_with", "is_at_least_o", "is_eligible_for_wallet", "is_eligible_for_maestro", "last_app_update_time_millis", "last_block_status_refresh_participant_id", "last_full_sync_time_millis", "last_ime_height_landscape", "last_ime_height", "last_opened_media_picker_time_millis", "last_rbm_active_event_time_millis", "last_rbm_interactive_event_time_millis", "last_saw_survey_time", "last_sync_time_millis", "last_video_call_button_click_time_millis", "latest_notification_message_timestamp", "max_conversation_count", "pending_tasks_after_reboot", "provisioning_session_id", "rating_prompt_last_time_millis", "rating_prompt_shown_version", "rcs_msisdn", "rcs_onboarding_progress", "bugle_allow_rcs_overrides", "boew_promo_complete", "rcs_provisioning_status", "rcs_provisioning_status_pev2", "buglesub_rcs_provision_info_state", "rcs_sub_id", "rcs_terms_and_conditions_message", "rcs_terms_and_conditions_title", "rcs_welcome_message_accept", "rcs_welcome_message_dismissed", "rcs_welcome_message_message", "rcs_welcome_message_reject", "rcs_welcome_message_settings", "rcs_welcome_message_title", "seamless_provisioning_progress", "sent_message_counter_for_dismissing_assistant_suggestion_tooltip", "sent_message_counter_for_dismissing_p2p_suggestion_tooltip", "shared_preferences_version", "should_reverse_sync_telephony", "sticker_most_recently_downloaded_set_id", "sticker_set_downloads", "telephony_provider_sms_count", "usage_stats_hash_salt", "total_millis_spent", "did_show_google_tos_prompt", "spam_popup_dismissed", "spam_popup_seen_timestamp", "spam_protection_feature_consent", "expressive_camera_effects_tooltip_counter", "save_original_media_toast_msg_showed", "provisioning_ui_type", "manual_msisdn_entered_country_code", "manual_msisdn_entered_phone_number", "is_manual_msisdn_shown_or_dismissed", "gboard_conversation_id_prefix", "gboard_conversation_id_postfix", "first_default_sms_set", "first_message_sent", "first_smart_reply", "first_multi_media_shared", "first_rcs_provisioned", "first_rcs_message_sent", "PROMPT_COUNT", "LAST_UPSELL_PROMPT_TIME", "USER_ACCEPTED_UPSELL", "UPSELL_PROMPT_SIM_ID", "first_rcs_eligibility_time", "first_rcs_provisioning_ui_event_time", "first_time_rcs_declined_millis", "first_time_rcs_accepted_millis", "first_time_rcs_provisioned_millis", "first_provisioning_ui_event_ui_type", "ditto_oldest_conversation_needing_update_timestamp_ms", "ditto_oldest_message_needing_update_timestamp_ms", "ditto_oldest_participant_needing_update_timestamp_ms", "ditto_settings_need_update", "ditto_user_alert_needs_update", "ditto_browser_inactive_needs_update", "ditto_messages_need_revoke_timestamp", "message_status_cleaup_time_millis", "message_status_cleaup_rows_deleted", "events_cleaup_rows_deleted", "app_contains_verified_sms_data");
        g = enip.v(Integer.valueOf(R.string.group_mms_pref_key), Integer.valueOf(R.string.auto_retrieve_mms_pref_key), Integer.valueOf(R.string.delivery_reports_pref_key), Integer.valueOf(R.string.sms_encoding_pref_key), Integer.valueOf(R.string.wap_push_si_pref_key), valueOf28, valueOf29, valueOf30, valueOf31, valueOf32);
        enip t = enip.t(Integer.valueOf(R.string.auto_retrieve_mms_when_roaming_pref_key), Integer.valueOf(R.string.mms_phone_number_pref_key), Integer.valueOf(R.string.sms_7bit_confirmed_pref_key), Integer.valueOf(R.string.stop_asking_sim_number_pref_key));
        h = t;
        enin eninVar2 = new enin();
        eninVar2.j(t);
        i = eninVar2.g();
        j = enip.v("buglesub_enable_rcs", "buglesub_send_seen_report_rcs", "buglesub_share_typing_status_rcs", "buglesub_rcs_fallback_type", "buglesub_rcs_default_sharing_method", "buglesub_rcs_mobile_data_auto_download_limit", "buglesub_rcs_provision_info_state");
    }

    public static ctzc a(Context context, Collection collection) {
        ctzc ctzcVar;
        enip enipVar = a;
        synchronized (enipVar) {
            if (f == null) {
                enip enipVar2 = ersy.a("bugle.enable_device_to_device_transfer_for_messages_settings", "bugle") ? b : enipVar;
                enip enipVar3 = d;
                enip<String> enipVar4 = e;
                emxf.a(Collections.disjoint(enipVar2, enipVar3));
                dloz a2 = dlpb.a(context, enipVar2);
                dloz a3 = dlpb.a(context, enipVar3);
                for (String str : enipVar4) {
                    emxf.f(!a2.b(str), "%s key exists in allowlist IDs. Remove the key from legacyKeys", str);
                    emxf.f(!a3.b(str), "%s key exists in denylist IDs. Remove the key from legacyKeys", str);
                }
                f = new ctzb(a2, a3, enipVar4, collection);
            }
            ctzcVar = f;
        }
        return ctzcVar;
    }

    public static ctzc b(Context context) {
        if (k == null) {
            enip enipVar = g;
            synchronized (enipVar) {
                if (k == null) {
                    enip enipVar2 = i;
                    enip<String> enipVar3 = j;
                    emxf.a(Collections.disjoint(enipVar, enipVar2));
                    dloz a2 = dlpb.a(context, enipVar);
                    dloz a3 = dlpb.a(context, enipVar2);
                    for (String str : enipVar3) {
                        emxf.b(!a2.b(str), str);
                        emxf.b(!a3.b(str), str);
                    }
                    k = new ctza(a2, a3, enipVar3);
                }
            }
        }
        return k;
    }
}
