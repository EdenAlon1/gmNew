package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkp {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_count", "conversations.notification_enabled", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.rcs_session_allows_revocation", "conversations.marked_as_unread", "conversations.mms_group_upgrade_status", "conversations.unread_count", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "conversation_to_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.content_type", "reminders.trigger_time", "conversation_pin.pin_status"};
    public static final agkg b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations.source_type", 8500);
        enhdVar.k("conversations.rcs_session_id", 10000);
        enhdVar.k("conversations.join_state", 10006);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.IS_ENTERPRISE", 10018);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.participant_display_destination", 15010);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.marked_as_unread", 59220);
        enhdVar.k("conversations.mms_group_upgrade_status", 60050);
        enhdVar.k("conversations.unread_count", 60740);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("archive_status", "index_null_archive_status");
        enhdVar2.k("sort_timestamp", "index_null_sort_timestamp");
        enhdVar2.k("participant_normalized_destination", "index_null_participant_normalized_destination");
        enhdVar2.k("rcs_session_id", "index_null_rcs_session_id");
        enhdVar2.k("marked_as_unread", "index_null_marked_as_unread");
        enhdVar2.c();
        b = new agkg();
    }

    public static final agkm a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            engrVar.h("conversations.name");
            engrVar.h("conversations.snippet_text");
            engrVar.h("conversations.subject_text");
            engrVar.h("conversations.preview_uri");
            engrVar.h("conversations.preview_content_type");
            engrVar.h("conversations.show_draft");
            engrVar.h("conversations.draft_snippet_text");
            engrVar.h("conversations.draft_subject_text");
            engrVar.h("conversations.draft_preview_uri");
            engrVar.h("conversations.draft_preview_content_type");
            engrVar.h("conversations.archive_status");
            engrVar.h("conversations.sort_timestamp");
            engrVar.h("conversations.icon");
            engrVar.h("conversations.participant_lookup_key");
            engrVar.h("conversations.participant_normalized_destination");
            engrVar.h("conversations.participant_count");
            engrVar.h("conversations.notification_enabled");
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
            if (c.intValue() >= 10018) {
                engrVar.h("conversations.IS_ENTERPRISE");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c.intValue() >= 15010) {
                engrVar.h("conversations.participant_display_destination");
            }
            if (c.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c.intValue() >= 59220) {
                engrVar.h("conversations.marked_as_unread");
            }
            if (c.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_status");
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
            engrVar.h("conversation_to_participants.participant_id");
            engrVar.h("one_on_one_participant.full_name");
            engrVar.h("one_on_one_participant.first_name");
            engrVar.h("profiles_table.display_name");
            engrVar.h("parts.content_type");
            engrVar.h("reminders.trigger_time");
            engrVar.h("conversation_pin.pin_status");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new agkm(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
