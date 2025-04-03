package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgmn {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.awaiting_reverse_sync", "conversations.error_state", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.encryption_protocol", "conversations.unread_count", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.directory_id", "conversation_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.text", "parts.uri", "parts.content_type", "vmt.vmt_status", "vmt.text", "reminders.trigger_time", "messages_annotations.annotation_type", "messages_annotations.annotation_details", "message_star._id", "parent_disallowed_conversations.conversation_id"};
    public static final bgme b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations.name_is_automatic", 10012);
        enhdVar.k("conversations.etouffee_default", 29060);
        enhdVar.k("conversations.current_my_identity_foreign_key", 60160);
        enhdVar.k("conversations.source_type", 8500);
        enhdVar.k("conversations.rcs_session_id", 10000);
        enhdVar.k("conversations.join_state", 10006);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.send_mode", 10016);
        enhdVar.k("conversations.IS_ENTERPRISE", 10018);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.participant_display_destination", 15010);
        enhdVar.k("conversations.delete_timestamp", 29020);
        enhdVar.k("conversations.cms_id", 32000);
        enhdVar.k("conversations.rcs_group_id", 40050);
        enhdVar.k("conversations.rcs_conference_uri", 40050);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.awaiting_reverse_sync", 49060);
        enhdVar.k("conversations.error_state", 58140);
        enhdVar.k("conversations.rcs_group_last_sync_timestamp", 58910);
        enhdVar.k("conversations.has_been_e2ee", 59210);
        enhdVar.k("conversations.marked_as_unread", 59220);
        enhdVar.k("conversations.encryption_protocol", 60180);
        enhdVar.k("conversations.unread_count", 60740);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.k("participants.directory_id", 35010);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("sms_thread_id", "index_null_sms_thread_id");
        enhdVar2.k("archive_status", "index_null_archive_status");
        enhdVar2.k("sort_timestamp", "index_null_sort_timestamp");
        enhdVar2.k("participant_normalized_destination", "index_null_participant_normalized_destination");
        enhdVar2.k("current_my_identity_foreign_key", "index_null_current_my_identity_foreign_key");
        enhdVar2.k("rcs_session_id", "index_null_rcs_session_id");
        enhdVar2.k("delete_timestamp", "index_null_delete_timestamp");
        enhdVar2.k("cms_id", "index_null_cms_id");
        enhdVar2.k("rcs_group_id", "index_null_rcs_group_id");
        enhdVar2.k("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        enhdVar2.k("marked_as_unread", "index_null_marked_as_unread");
        enhdVar2.c();
        b = new bgme();
    }

    public static final bgmk a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            engrVar.h("conversations.sms_thread_id");
            engrVar.h("conversations.name");
            if (c.intValue() >= 10012) {
                engrVar.h("conversations.name_is_automatic");
            }
            engrVar.h("conversations.snippet_text");
            engrVar.h("conversations.subject_text");
            engrVar.h("conversations.preview_uri");
            engrVar.h("conversations.preview_content_type");
            engrVar.h("conversations.show_draft");
            engrVar.h("conversations.draft_snippet_text");
            engrVar.h("conversations.draft_subject_text");
            engrVar.h("conversations.draft_preview_uri");
            engrVar.h("conversations.draft_preview_content_type");
            if (c.intValue() >= 29060) {
                engrVar.h("conversations.etouffee_default");
            }
            engrVar.h("conversations.archive_status");
            engrVar.h("conversations.sort_timestamp");
            engrVar.h("conversations.icon");
            engrVar.h("conversations.participant_contact_id");
            engrVar.h("conversations.participant_lookup_key");
            engrVar.h("conversations.participant_normalized_destination");
            engrVar.h("conversations.current_self_id");
            if (c.intValue() >= 60160) {
                engrVar.h("conversations.current_my_identity_foreign_key");
            }
            engrVar.h("conversations.participant_count");
            engrVar.h("conversations.notification_enabled");
            engrVar.h("conversations.notification_sound_uri");
            engrVar.h("conversations.notification_vibration");
            engrVar.h("conversations.include_email_addr");
            if (c.intValue() >= 8500) {
                engrVar.h("conversations.source_type");
            }
            if (c.intValue() >= 10000) {
                engrVar.h("conversations.rcs_session_id");
            }
            if (c.intValue() >= 10006) {
                engrVar.h("conversations.join_state");
            }
            if (c.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c.intValue() >= 10016) {
                engrVar.h("conversations.send_mode");
            }
            if (c.intValue() >= 10018) {
                engrVar.h("conversations.IS_ENTERPRISE");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c.intValue() >= 15010) {
                engrVar.h("conversations.participant_display_destination");
            }
            if (c.intValue() >= 29020) {
                engrVar.h("conversations.delete_timestamp");
            }
            if (c.intValue() >= 32000) {
                engrVar.h("conversations.cms_id");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (c.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("conversations.awaiting_reverse_sync");
            }
            if (c.intValue() >= 58140) {
                engrVar.h("conversations.error_state");
            }
            if (c.intValue() >= 58910) {
                engrVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (c.intValue() >= 59210) {
                engrVar.h("conversations.has_been_e2ee");
            }
            if (c.intValue() >= 59220) {
                engrVar.h("conversations.marked_as_unread");
            }
            if (c.intValue() >= 60180) {
                engrVar.h("conversations.encryption_protocol");
            }
            if (c.intValue() >= 60740) {
                engrVar.h("conversations.unread_count");
            }
            engrVar.h("messages._id");
            engrVar.h("messages.sent_timestamp");
            engrVar.h("messages.received_timestamp");
            engrVar.h("messages.message_protocol");
            engrVar.h("messages.message_status");
            engrVar.h("messages.read");
            engrVar.h("messages.sms_priority");
            engrVar.h("messages.raw_status");
            if (c.intValue() >= 9000) {
                engrVar.h("messages.sms_error_code");
            }
            if (c.intValue() >= 9000) {
                engrVar.h("messages.sms_error_desc_map_name");
            }
            engrVar.h("participants.sub_id");
            engrVar.h("participants.display_destination");
            engrVar.h("participants.full_name");
            engrVar.h("participants.first_name");
            if (c.intValue() >= 35010) {
                engrVar.h("participants.directory_id");
            }
            engrVar.h("conversation_participants.participant_id");
            engrVar.h("one_on_one_participant.full_name");
            engrVar.h("one_on_one_participant.first_name");
            engrVar.h("profiles_table.display_name");
            engrVar.h("parts.text");
            engrVar.h("parts.uri");
            engrVar.h("parts.content_type");
            engrVar.h("vmt.vmt_status");
            engrVar.h("vmt.text");
            engrVar.h("reminders.trigger_time");
            engrVar.h("messages_annotations.annotation_type");
            engrVar.h("messages_annotations.annotation_details");
            engrVar.h("message_star._id");
            engrVar.h("parent_disallowed_conversations.conversation_id");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bgmk(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dtzf d() {
        return b().P();
    }
}
