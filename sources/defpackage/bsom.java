package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsom extends dtup {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count"};
    public static final enhk b;
    public static final bskp c;
    public static final int[] d;
    public static final int[] e;

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
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("sms_thread_id", "index_conversations_sms_thread_id");
        enhdVar2.k("archive_status", "index_conversations_archive_status");
        enhdVar2.k("sort_timestamp", "index_conversations_sort_timestamp");
        enhdVar2.k("participant_normalized_destination", "index_conversations_participant_normalized_destination");
        enhdVar2.k("participant_comparable_destination", "index_conversations_participant_comparable_destination");
        enhdVar2.k("current_my_identity_foreign_key", "index_conversations_current_my_identity_foreign_key");
        enhdVar2.k("destination_token", "index_conversations_destination_token");
        enhdVar2.k("normalized_participant_id_list", "index_conversations_normalized_participant_id_list");
        enhdVar2.k("rcs_session_id", "index_conversations_rcs_session_id");
        enhdVar2.k("delete_timestamp", "index_conversations_delete_timestamp");
        enhdVar2.k("cms_id", "index_conversations_cms_id");
        enhdVar2.k("rcs_group_id", "index_conversations_rcs_group_id");
        enhdVar2.k("awaiting_reverse_sync", "index_conversations_awaiting_reverse_sync");
        enhdVar2.k("duplicate_of", "index_conversations_duplicate_of");
        enhdVar2.k("new_duplicate_of", "index_conversations_new_duplicate_of");
        enhdVar2.k("marked_as_unread", "index_conversations_marked_as_unread");
        enhdVar2.k("cms_correlation_id", "index_conversations_cms_correlation_id");
        enhdVar2.c();
        c = new bskp();
        d = new int[]{8500, 10000, 10006, 10007, 10012, 10016, 10018, 12001, 15000, 15010, 23000, 26020, 28010, 29020, 29060, 32000, 40050, 46050, 48040, 49020, 49060, 53030, 58090, 58120, 58140, 58210, 58370, 58390, 58540, 58750, 58910, 59130, 59180, 59210, 59220, 59260, 59760, 59810, 59820, 60050, 60160, 60180, 60210, 60250, 60310, 60360, 60590, 60740};
        e = new int[]{57040};
    }

    public static bseh a(String str) {
        bsob e2 = e();
        e2.z("conversations.queryOnCmsId");
        e2.q();
        bsol bsolVar = new bsol();
        bsolVar.e(str);
        e2.h(bsolVar);
        return (bseh) dtub.c(e2.b());
    }

    public static bseh b(ConversationIdType conversationIdType) {
        bsob e2 = e();
        e2.z("conversations.queryOnId");
        e2.q();
        bsol bsolVar = new bsol();
        bsolVar.q(conversationIdType);
        e2.h(bsolVar);
        return (bseh) dtub.c(e2.b());
    }

    public static bseh c(ConversationIdType conversationIdType) {
        return (bseh) k(conversationIdType, new Function() { // from class: bsdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bseh bsehVar = (bseh) obj;
                String[] strArr = bsom.a;
                return bsehVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static bsel d() {
        bsem bsemVar = new bsem();
        bsemVar.aF();
        return bsemVar;
    }

    public static final bsob e() {
        String[] strArr;
        Integer g = g();
        if (g.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            engrVar.h("conversations.sms_thread_id");
            engrVar.h("conversations.name");
            if (g.intValue() >= 10012) {
                engrVar.h("conversations.name_is_automatic");
            }
            if (g.intValue() >= 59760) {
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
            if (g.intValue() >= 29060) {
                engrVar.h("conversations.etouffee_default");
            }
            engrVar.h("conversations.archive_status");
            engrVar.h("conversations.sort_timestamp");
            engrVar.h("conversations.last_read_timestamp");
            engrVar.h("conversations.icon");
            engrVar.h("conversations.participant_contact_id");
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_contact_id");
            }
            engrVar.h("conversations.participant_lookup_key");
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_lookup_key");
            }
            engrVar.h("conversations.participant_normalized_destination");
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.participant_comparable_destination");
            }
            engrVar.h("conversations.current_self_id");
            if (g.intValue() >= 60160) {
                engrVar.h("conversations.current_my_identity_foreign_key");
            }
            if (g.intValue() >= 60360) {
                engrVar.h("conversations.destination_token");
            }
            engrVar.h("conversations.participant_count");
            engrVar.h("conversations.notification_enabled");
            engrVar.h("conversations.notification_sound_uri");
            engrVar.h("conversations.notification_vibration");
            engrVar.h("conversations.include_email_addr");
            engrVar.h("conversations.sms_service_center");
            if (g.intValue() >= 8500) {
                engrVar.h("conversations.participant_id_list");
            }
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_id_list");
            }
            if (g.intValue() >= 8500) {
                engrVar.h("conversations.source_type");
            }
            if (g.intValue() >= 10000) {
                engrVar.h("conversations.rcs_session_id");
            }
            if (g.intValue() >= 10006) {
                engrVar.h("conversations.join_state");
            }
            if (g.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (g.intValue() >= 10016) {
                engrVar.h("conversations.send_mode");
            }
            if (g.intValue() >= 10018) {
                engrVar.h("conversations.IS_ENTERPRISE");
            }
            if (g.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (g.intValue() >= 15000) {
                engrVar.h("conversations.last_interactive_event_timestamp");
            }
            if (g.intValue() >= 15010) {
                engrVar.h("conversations.participant_display_destination");
            }
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_display_destination");
            }
            if (g.intValue() >= 23000) {
                engrVar.h("conversations.spam_warning_dismiss_status");
            }
            if (g.intValue() >= 26020) {
                engrVar.h("conversations.open_count");
            }
            if (g.intValue() >= 28010) {
                engrVar.h("conversations.last_logged_scooby_metadata_timestamp");
            }
            if (g.intValue() >= 29020) {
                engrVar.h("conversations.delete_timestamp");
            }
            if (g.intValue() >= 32000) {
                engrVar.h("conversations.cms_id");
            }
            if (g.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (g.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (g.intValue() >= 58120) {
                engrVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (g.intValue() >= 53030) {
                engrVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (g.intValue() >= 46050) {
                engrVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (g.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (g.intValue() >= 49020) {
                engrVar.h("conversations.rcs_group_capabilities");
            }
            if (g.intValue() >= 49060) {
                engrVar.h("conversations.awaiting_reverse_sync");
            }
            if (g.intValue() >= 58090) {
                engrVar.h("conversations.duplicate_of");
            }
            if (g.intValue() >= 59130) {
                engrVar.h("conversations.new_duplicate_of");
            }
            if (g.intValue() >= 58140) {
                engrVar.h("conversations.error_state");
            }
            if (g.intValue() >= 58210) {
                engrVar.h("conversations.cms_life_cycle");
            }
            if (g.intValue() >= 58540) {
                engrVar.h("conversations.rcs_group_self_msisdn");
            }
            if (g.intValue() >= 58750) {
                engrVar.h("conversations.recipient_offline_timestamp_ms");
            }
            if (g.intValue() >= 58910) {
                engrVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (g.intValue() >= 59210) {
                engrVar.h("conversations.has_been_e2ee");
            }
            if (g.intValue() >= 59220) {
                engrVar.h("conversations.marked_as_unread");
            }
            if (g.intValue() >= 59820) {
                engrVar.h("conversations.custom_theme");
            }
            if (g.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_status");
            }
            if (g.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_retries");
            }
            if (g.intValue() >= 60180) {
                engrVar.h("conversations.encryption_protocol");
            }
            if (g.intValue() >= 60210) {
                engrVar.h("conversations.encryption_id");
            }
            if (g.intValue() >= 60250) {
                engrVar.h("conversations.cms_correlation_id");
            }
            if (g.intValue() >= 60590) {
                engrVar.h("conversations.rcs_group_icon_url");
            }
            if (g.intValue() >= 60740) {
                engrVar.h("conversations.unread_count");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bsob(strArr);
    }

    public static dtve f() {
        return dtub.e("$primary");
    }

    public static Integer g() {
        return Integer.valueOf(o().a());
    }

    public static Object h(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        bseh a2 = a(str);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object i(ConversationIdType conversationIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        bseh b2 = b(conversationIdType);
        if (b2 != null) {
            apply = function.apply(b2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object j(ConversationIdType conversationIdType, Function function) {
        Object apply;
        bseh b2 = b(conversationIdType);
        if (b2 == null) {
            return null;
        }
        apply = function.apply(b2);
        return apply;
    }

    public static Object k(ConversationIdType conversationIdType, Function function) {
        Object apply;
        bseh b2 = b(conversationIdType);
        if (b2 == null) {
            throw new IllegalStateException("row not found");
        }
        apply = function.apply(b2);
        return apply;
    }

    public static String l(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_thread_id INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (i >= 59760) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subtitle TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("show_draft INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee_default INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sort_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_read_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("icon TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_contact_id INT DEFAULT(-1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_contact_id INT DEFAULT(-1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_lookup_key TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_lookup_key TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_normalized_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("participant_comparable_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_self_id TEXT");
        if (i >= 59810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (i >= 60360) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_enabled INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_sound_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_vibration INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("include_email_addr INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_service_center TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id_list TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_id_list TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conv_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("IS_ENTERPRISE INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_ea2p_bot_recipient INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_interactive_event_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_display_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_display_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("spam_warning_dismiss_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("open_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_logged_scooby_metadata_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("delete_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (i >= 58120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("tachygram_group_routing_info_token BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_most_recent_read_message_timestamp_ms INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_allows_revocation INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("awaiting_reverse_sync INT DEFAULT(0)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES conversations(_id)  ");
        }
        if (i >= 59130) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ");
        }
        if (i >= 58140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_state INT");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_self_msisdn TEXT");
        }
        if (i >= 58750) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_offline_timestamp_ms INTEGER DEFAULT(-1)");
        }
        if (i >= 58910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(-1)");
        }
        if (i >= 59210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_been_e2ee INT DEFAULT(0)");
        }
        if (i >= 59220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("marked_as_unread INT DEFAULT(0)");
        }
        if (i >= 59820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_theme BLOB");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_status INTEGER DEFAULT(0)");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_retries INTEGER DEFAULT(0)");
        }
        if (i >= 60180) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 60210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_id TEXT");
        }
        if (i >= 60250) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        if (i >= 60590) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_icon_url TEXT");
        }
        if (i >= 60740) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("unread_count INTEGER");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void m(ConversationIdType conversationIdType, Consumer consumer) {
        bseh b2 = b(conversationIdType);
        if (b2 != null) {
            consumer.accept(b2);
        }
    }

    static String[] n(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sms_thread_id");
        arrayList.add("CREATE INDEX index_conversations_sms_thread_id ON conversations(sms_thread_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_archive_status");
        arrayList.add("CREATE INDEX index_conversations_archive_status ON conversations(archive_status);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sort_timestamp");
        arrayList.add("CREATE INDEX index_conversations_sort_timestamp ON conversations(sort_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_session_id");
        arrayList.add("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_delete_timestamp");
        arrayList.add("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_normalized_participant_id_list");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
        }
        if (i >= 58120) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
            arrayList.add("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
        }
        if (i >= 58370) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
            arrayList.add("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
        }
        if (i >= 58390) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
            arrayList.add("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
        }
        if (i >= 59260) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
            arrayList.add("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_current_my_identity_foreign_key");
            arrayList.add("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
        }
        if (i >= 60310) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
        }
        if (i >= 60360) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_destination_token");
            arrayList.add("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf o() {
        return f().P();
    }
}
