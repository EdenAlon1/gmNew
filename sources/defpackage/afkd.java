package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkd {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count", "conversation_labels._id", "conversation_labels.label"};
    public static final enhk b;
    public static final afjy c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations.name_is_automatic", 10012);
        enhdVar.k("conversations.subtitle", 59760);
        enhdVar.k("conversations.etouffee_default", 29060);
        enhdVar.k("conversations.normalized_participant_contact_id", 58090);
        enhdVar.k("conversations.normalized_participant_lookup_key", 58090);
        enhdVar.k("conversations.participant_comparable_destination", 58090);
        enhdVar.k("conversations.current_my_identity_foreign_key", 60160);
        enhdVar.k("conversations.destination_token", 60360);
        enhdVar.k("conversations.participant_id_list", 8500);
        enhdVar.k("conversations.normalized_participant_id_list", 58090);
        enhdVar.k("conversations.source_type", 8500);
        enhdVar.k("conversations.rcs_session_id", 10000);
        enhdVar.k("conversations.join_state", 10006);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.send_mode", 10016);
        enhdVar.k("conversations.IS_ENTERPRISE", 10018);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.last_interactive_event_timestamp", 15000);
        enhdVar.k("conversations.participant_display_destination", 15010);
        enhdVar.k("conversations.normalized_participant_display_destination", 58090);
        enhdVar.k("conversations.spam_warning_dismiss_status", 23000);
        enhdVar.k("conversations.open_count", 26020);
        enhdVar.k("conversations.last_logged_scooby_metadata_timestamp", 28010);
        enhdVar.k("conversations.delete_timestamp", 29020);
        enhdVar.k("conversations.cms_id", 32000);
        enhdVar.k("conversations.rcs_group_id", 40050);
        enhdVar.k("conversations.rcs_conference_uri", 40050);
        enhdVar.k("conversations.tachygram_group_routing_info_token", 58120);
        enhdVar.k("conversations.cms_most_recent_read_message_timestamp_ms", 53030);
        enhdVar.k("conversations.rcs_subject_change_timestamp_ms", 46050);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.rcs_group_capabilities", 49020);
        enhdVar.k("conversations.awaiting_reverse_sync", 49060);
        enhdVar.k("conversations.duplicate_of", 58090);
        enhdVar.k("conversations.new_duplicate_of", 59130);
        enhdVar.k("conversations.error_state", 58140);
        enhdVar.k("conversations.cms_life_cycle", 58210);
        enhdVar.k("conversations.rcs_group_self_msisdn", 58540);
        enhdVar.k("conversations.recipient_offline_timestamp_ms", 58750);
        enhdVar.k("conversations.rcs_group_last_sync_timestamp", 58910);
        enhdVar.k("conversations.has_been_e2ee", 59210);
        enhdVar.k("conversations.marked_as_unread", 59220);
        enhdVar.k("conversations.custom_theme", 59820);
        enhdVar.k("conversations.mms_group_upgrade_status", 60050);
        enhdVar.k("conversations.mms_group_upgrade_retries", 60050);
        enhdVar.k("conversations.encryption_protocol", 60180);
        enhdVar.k("conversations.encryption_id", 60210);
        enhdVar.k("conversations.cms_correlation_id", 60250);
        enhdVar.k("conversations.rcs_group_icon_url", 60590);
        enhdVar.k("conversations.unread_count", 60740);
        enhdVar.k("conversation_labels.label", 53020);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("sms_thread_id", "index_null_sms_thread_id");
        enhdVar2.k("archive_status", "index_null_archive_status");
        enhdVar2.k("sort_timestamp", "index_null_sort_timestamp");
        enhdVar2.k("participant_normalized_destination", "index_null_participant_normalized_destination");
        enhdVar2.k("participant_comparable_destination", "index_null_participant_comparable_destination");
        enhdVar2.k("current_my_identity_foreign_key", "index_null_current_my_identity_foreign_key");
        enhdVar2.k("destination_token", "index_null_destination_token");
        enhdVar2.k("normalized_participant_id_list", "index_null_normalized_participant_id_list");
        enhdVar2.k("rcs_session_id", "index_null_rcs_session_id");
        enhdVar2.k("delete_timestamp", "index_null_delete_timestamp");
        enhdVar2.k("cms_id", "index_null_cms_id");
        enhdVar2.k("rcs_group_id", "index_null_rcs_group_id");
        enhdVar2.k("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        enhdVar2.k("duplicate_of", "index_null_duplicate_of");
        enhdVar2.k("new_duplicate_of", "index_null_new_duplicate_of");
        enhdVar2.k("marked_as_unread", "index_null_marked_as_unread");
        enhdVar2.k("cms_correlation_id", "index_null_cms_correlation_id");
        enhdVar2.c();
        c = new afjy();
    }

    public static final afkc a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            engrVar.h("conversations.sms_thread_id");
            engrVar.h("conversations.name");
            if (c2.intValue() >= 10012) {
                engrVar.h("conversations.name_is_automatic");
            }
            if (c2.intValue() >= 59760) {
                engrVar.h("conversations.subtitle");
            }
            engrVar.h("conversations.latest_message_id");
            engrVar.h("conversations.snippet_text");
            engrVar.h("conversations.subject_text");
            engrVar.h("conversations.preview_uri");
            engrVar.h("conversations.preview_content_type");
            engrVar.h("conversations.show_draft");
            engrVar.h("conversations.draft_snippet_text");
            engrVar.h("conversations.draft_subject_text");
            engrVar.h("conversations.draft_preview_uri");
            engrVar.h("conversations.draft_preview_content_type");
            if (c2.intValue() >= 29060) {
                engrVar.h("conversations.etouffee_default");
            }
            engrVar.h("conversations.archive_status");
            engrVar.h("conversations.sort_timestamp");
            engrVar.h("conversations.last_read_timestamp");
            engrVar.h("conversations.icon");
            engrVar.h("conversations.participant_contact_id");
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_contact_id");
            }
            engrVar.h("conversations.participant_lookup_key");
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_lookup_key");
            }
            engrVar.h("conversations.participant_normalized_destination");
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.participant_comparable_destination");
            }
            engrVar.h("conversations.current_self_id");
            if (c2.intValue() >= 60160) {
                engrVar.h("conversations.current_my_identity_foreign_key");
            }
            if (c2.intValue() >= 60360) {
                engrVar.h("conversations.destination_token");
            }
            engrVar.h("conversations.participant_count");
            engrVar.h("conversations.notification_enabled");
            engrVar.h("conversations.notification_sound_uri");
            engrVar.h("conversations.notification_vibration");
            engrVar.h("conversations.include_email_addr");
            engrVar.h("conversations.sms_service_center");
            if (c2.intValue() >= 8500) {
                engrVar.h("conversations.participant_id_list");
            }
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_id_list");
            }
            if (c2.intValue() >= 8500) {
                engrVar.h("conversations.source_type");
            }
            if (c2.intValue() >= 10000) {
                engrVar.h("conversations.rcs_session_id");
            }
            if (c2.intValue() >= 10006) {
                engrVar.h("conversations.join_state");
            }
            if (c2.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c2.intValue() >= 10016) {
                engrVar.h("conversations.send_mode");
            }
            if (c2.intValue() >= 10018) {
                engrVar.h("conversations.IS_ENTERPRISE");
            }
            if (c2.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c2.intValue() >= 15000) {
                engrVar.h("conversations.last_interactive_event_timestamp");
            }
            if (c2.intValue() >= 15010) {
                engrVar.h("conversations.participant_display_destination");
            }
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_display_destination");
            }
            if (c2.intValue() >= 23000) {
                engrVar.h("conversations.spam_warning_dismiss_status");
            }
            if (c2.intValue() >= 26020) {
                engrVar.h("conversations.open_count");
            }
            if (c2.intValue() >= 28010) {
                engrVar.h("conversations.last_logged_scooby_metadata_timestamp");
            }
            if (c2.intValue() >= 29020) {
                engrVar.h("conversations.delete_timestamp");
            }
            if (c2.intValue() >= 32000) {
                engrVar.h("conversations.cms_id");
            }
            if (c2.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (c2.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (c2.intValue() >= 58120) {
                engrVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (c2.intValue() >= 53030) {
                engrVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (c2.intValue() >= 46050) {
                engrVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (c2.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c2.intValue() >= 49020) {
                engrVar.h("conversations.rcs_group_capabilities");
            }
            if (c2.intValue() >= 49060) {
                engrVar.h("conversations.awaiting_reverse_sync");
            }
            if (c2.intValue() >= 58090) {
                engrVar.h("conversations.duplicate_of");
            }
            if (c2.intValue() >= 59130) {
                engrVar.h("conversations.new_duplicate_of");
            }
            if (c2.intValue() >= 58140) {
                engrVar.h("conversations.error_state");
            }
            if (c2.intValue() >= 58210) {
                engrVar.h("conversations.cms_life_cycle");
            }
            if (c2.intValue() >= 58540) {
                engrVar.h("conversations.rcs_group_self_msisdn");
            }
            if (c2.intValue() >= 58750) {
                engrVar.h("conversations.recipient_offline_timestamp_ms");
            }
            if (c2.intValue() >= 58910) {
                engrVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (c2.intValue() >= 59210) {
                engrVar.h("conversations.has_been_e2ee");
            }
            if (c2.intValue() >= 59220) {
                engrVar.h("conversations.marked_as_unread");
            }
            if (c2.intValue() >= 59820) {
                engrVar.h("conversations.custom_theme");
            }
            if (c2.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_status");
            }
            if (c2.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_retries");
            }
            if (c2.intValue() >= 60180) {
                engrVar.h("conversations.encryption_protocol");
            }
            if (c2.intValue() >= 60210) {
                engrVar.h("conversations.encryption_id");
            }
            if (c2.intValue() >= 60250) {
                engrVar.h("conversations.cms_correlation_id");
            }
            if (c2.intValue() >= 60590) {
                engrVar.h("conversations.rcs_group_icon_url");
            }
            if (c2.intValue() >= 60740) {
                engrVar.h("conversations.unread_count");
            }
            engrVar.h("conversation_labels._id");
            if (c2.intValue() >= 53020) {
                engrVar.h("conversation_labels.label");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new afkc(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
