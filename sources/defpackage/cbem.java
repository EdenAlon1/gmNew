package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbem {
    public static final dtzj a;

    static {
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        d.h(new Function() { // from class: cbel
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                dtzj dtzjVar = cbem.a;
                buxzVar.n(bsom.c.a);
                buxzVar.P(false);
                buxzVar.B(false);
                buxzVar.ai(byzm.a);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a = d.b().u();
    }

    public static int a() {
        String[] strArr;
        ekzz f = eleg.f("UnreadMessagesCountQuery#getUnreadMessagesCount");
        try {
            String[] strArr2 = bpgu.a;
            bpgt bpgtVar = new bpgt();
            bpgtVar.aq(new dtwe("messages.read", 1, 0));
            bpgtVar.aq(new dtwe("participants.blocked", 1, 0));
            byyt byytVar = byyt.UNARCHIVED;
            bpgtVar.aq(new dtwe("conversations.archive_status", 1, Integer.valueOf(byytVar == null ? 0 : byytVar.h)));
            bpgtVar.aq(new dtwe("conversations.notification_enabled", 1, 1));
            int intValue = bpgu.b().intValue();
            if (intValue < 30010) {
                dtub.w("is_hidden", intValue);
            }
            bpgtVar.aq(new dtwe("messages.is_hidden", 1, 0));
            bpgtVar.aq(new dtrw("messages.message_status", 3, bpgt.at(byzm.a), true));
            Integer b = bpgu.b();
            if (b.intValue() == Integer.MAX_VALUE) {
                strArr = bpgu.a;
            } else {
                int i = engw.d;
                engr engrVar = new engr();
                engrVar.h("messages._id");
                engrVar.h("messages.conversation_id");
                engrVar.h("messages.sender_id");
                if (b.intValue() >= 54040) {
                    engrVar.h("messages.sender_send_destination");
                }
                if (b.intValue() >= 59340) {
                    engrVar.h("messages.msisdn_receiving_rcs_message");
                }
                if (b.intValue() >= 54040) {
                    engrVar.h("messages.receiving_network_country");
                }
                engrVar.h("messages.sent_timestamp");
                if (b.intValue() >= 17030) {
                    engrVar.h("messages.queue_insert_timestamp");
                }
                engrVar.h("messages.received_timestamp");
                engrVar.h("messages.message_protocol");
                engrVar.h("messages.message_status");
                if (b.intValue() >= 13020) {
                    engrVar.h("messages.message_report_status");
                }
                engrVar.h("messages.seen");
                engrVar.h("messages.read");
                engrVar.h("messages.sms_message_uri");
                engrVar.h("messages.sms_priority");
                engrVar.h("messages.sms_message_size");
                engrVar.h("messages.mms_subject");
                engrVar.h("messages.mms_transaction_id");
                engrVar.h("messages.mms_content_location");
                engrVar.h("messages.mms_expiry");
                if (b.intValue() >= 59890) {
                    engrVar.h("messages.rcs_expiry");
                }
                if (b.intValue() >= 9030) {
                    engrVar.h("messages.mms_retrieve_text");
                }
                engrVar.h("messages.raw_status");
                engrVar.h("messages.self_id");
                if (b.intValue() >= 60160) {
                    engrVar.h("messages.my_identity_foreign_key");
                }
                engrVar.h("messages.retry_start_timestamp");
                if (b.intValue() >= 8500) {
                    engrVar.h("messages.cloud_sync_id");
                }
                if (b.intValue() >= 41040) {
                    engrVar.h("messages.rcs_message_id_with_text_type");
                }
                if (b.intValue() >= 29060) {
                    engrVar.h("messages.etouffee_status");
                }
                if (b.intValue() >= 29090) {
                    engrVar.h("messages.verification_status");
                }
                if (b.intValue() >= 39000) {
                    engrVar.h("messages.rcs_ui_status");
                }
                if (b.intValue() >= 30010) {
                    engrVar.h("messages.is_hidden");
                }
                if (b.intValue() >= 10002) {
                    engrVar.h("messages.rcs_remote_instance");
                }
                if (b.intValue() >= 10004) {
                    engrVar.h("messages.rcs_file_transfer_session_id");
                }
                if (b.intValue() >= 9000) {
                    engrVar.h("messages.sms_error_code");
                }
                if (b.intValue() >= 9000) {
                    engrVar.h("messages.sms_error_desc_map_name");
                }
                if (b.intValue() >= 9010) {
                    engrVar.h("messages.correlation_id");
                }
                if (b.intValue() >= 31010) {
                    engrVar.h("messages.cms_id");
                }
                if (b.intValue() >= 37040) {
                    engrVar.h("messages.cms_last_mod_seq");
                }
                if (b.intValue() >= 19020) {
                    engrVar.h("messages.web_id");
                }
                if (b.intValue() >= 29100) {
                    engrVar.h("messages.usage_stats_logging_id");
                }
                if (b.intValue() >= 35030) {
                    engrVar.h("messages.send_counter");
                }
                if (b.intValue() >= 35030) {
                    engrVar.h("messages.original_rcs_message_id");
                }
                if (b.intValue() >= 37020) {
                    engrVar.h("messages.custom_delivery_receipt_mime_type");
                }
                if (b.intValue() >= 37020) {
                    engrVar.h("messages.custom_delivery_receipt_content");
                }
                if (b.intValue() >= 37030) {
                    engrVar.h("messages.report_attempt_acounter");
                }
                if (b.intValue() >= 45020) {
                    engrVar.h("messages.custom_headers");
                }
                if (b.intValue() >= 46010) {
                    engrVar.h("messages.cms_correlation_id");
                }
                if (b.intValue() >= 48030) {
                    engrVar.h("messages.group_private_participant");
                }
                if (b.intValue() >= 48030) {
                    engrVar.h("messages.original_message_id");
                }
                if (b.intValue() >= 49060) {
                    engrVar.h("messages.awaiting_reverse_sync");
                }
                if (b.intValue() >= 49060) {
                    engrVar.h("messages.old_sms_message_uri");
                }
                if (b.intValue() >= 56000) {
                    engrVar.h("messages.draft_id");
                }
                if (b.intValue() >= 58040) {
                    engrVar.h("messages.result_code");
                }
                if (b.intValue() >= 58210) {
                    engrVar.h("messages.cms_life_cycle");
                }
                if (b.intValue() >= 60750) {
                    engrVar.h("messages.mute_priority");
                }
                if (b.intValue() >= 58710) {
                    engrVar.h("messages.fallback_reason");
                }
                if (b.intValue() >= 58230) {
                    engrVar.h("messages.auto_retry_counter");
                }
                if (b.intValue() >= 58280) {
                    engrVar.h("messages.can_revoke_before_delivered_with_rcs");
                }
                if (b.intValue() >= 58680) {
                    engrVar.h("messages.trace_id");
                }
                if (b.intValue() >= 58720) {
                    engrVar.h("messages.outgoing_delivery_report_status");
                }
                if (b.intValue() >= 58720) {
                    engrVar.h("messages.outgoing_read_report_status");
                }
                if (b.intValue() >= 59310) {
                    engrVar.h("messages.xms_transport");
                }
                if (b.intValue() >= 59430) {
                    engrVar.h("messages.message_original_protocol");
                }
                if (b.intValue() >= 59490) {
                    engrVar.h("messages.satellite_datagram_id");
                }
                if (b.intValue() >= 60190) {
                    engrVar.h("messages.encryption_protocol");
                }
                if (b.intValue() >= 60370) {
                    engrVar.h("messages.message_persistence_id");
                }
                engrVar.h("participants._id");
                if (b.intValue() >= 59930) {
                    engrVar.h("participants.my_identity_token");
                }
                if (b.intValue() >= 60160) {
                    engrVar.h("participants.my_identity_token_foreign_key");
                }
                engrVar.h("participants.sub_id");
                if (b.intValue() >= 2000) {
                    engrVar.h("participants.sim_slot_id");
                }
                engrVar.h("participants.normalized_destination");
                engrVar.h("participants.send_destination");
                engrVar.h("participants.display_destination");
                if (b.intValue() >= 54040) {
                    engrVar.h("participants.comparable_destination");
                }
                if (b.intValue() >= 54040) {
                    engrVar.h("participants.country_code");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("participants.recipient_id");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("participants.recipient_canonical_address");
                }
                engrVar.h("participants.full_name");
                engrVar.h("participants.first_name");
                engrVar.h("participants.profile_photo_uri");
                if (b.intValue() >= 59850) {
                    engrVar.h("participants.contact_photo_uri");
                }
                engrVar.h("participants.contact_id");
                engrVar.h("participants.lookup_key");
                engrVar.h("participants.color_palette_index");
                if (b.intValue() >= 1000) {
                    engrVar.h("participants.color_type");
                }
                if (b.intValue() >= 10027) {
                    engrVar.h("participants.extended_color");
                }
                engrVar.h("participants.blocked");
                if (b.intValue() >= 2000) {
                    engrVar.h("participants.subscription_name");
                }
                if (b.intValue() >= 2000) {
                    engrVar.h("participants.subscription_color");
                }
                if (b.intValue() >= 4000) {
                    engrVar.h("participants.contact_destination");
                }
                if (b.intValue() >= 12001) {
                    engrVar.h("participants.participant_type");
                }
                if (b.intValue() >= 13050) {
                    engrVar.h("participants.video_reachability");
                }
                if (b.intValue() >= 20060) {
                    engrVar.h("participants.alias");
                }
                if (b.intValue() >= 24060) {
                    engrVar.h("participants.is_spam");
                }
                if (b.intValue() >= 30000) {
                    engrVar.h("participants.is_spam_source");
                }
                if (b.intValue() >= 31020) {
                    engrVar.h("participants.cms_id");
                }
                if (b.intValue() >= 31030) {
                    engrVar.h("participants.latest_verification_status");
                }
                if (b.intValue() >= 33000) {
                    engrVar.h("participants.profile_photo_blob_id");
                }
                if (b.intValue() >= 33060) {
                    engrVar.h("participants.profile_photo_encryption_key");
                }
                if (b.intValue() >= 35010) {
                    engrVar.h("participants.directory_id");
                }
                if (b.intValue() >= 55010) {
                    engrVar.h("participants.is_check_constraint_enabled_via_phenotype");
                }
                if (b.intValue() >= 55010) {
                    engrVar.h("participants.is_valid_phone_number_data");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("participants.duplicate_of");
                }
                if (b.intValue() >= 58210) {
                    engrVar.h("participants.cms_life_cycle");
                }
                if (b.intValue() >= 58620) {
                    engrVar.h("participants.norm_ui_status");
                }
                if (b.intValue() >= 59440) {
                    engrVar.h("participants.last_modified_by_key");
                }
                if (b.intValue() >= 59550) {
                    engrVar.h("participants.name_source");
                }
                if (b.intValue() >= 59550) {
                    engrVar.h("participants.photo_source");
                }
                if (b.intValue() >= 60060) {
                    engrVar.h("participants.profile_photo_user_preference");
                }
                if (b.intValue() >= 60070) {
                    engrVar.h("participants.contact_metadata");
                }
                if (b.intValue() >= 60640) {
                    engrVar.h("participants.is_enterprise_contact");
                }
                engrVar.h("conversations._id");
                engrVar.h("conversations.sms_thread_id");
                engrVar.h("conversations.name");
                if (b.intValue() >= 10012) {
                    engrVar.h("conversations.name_is_automatic");
                }
                if (b.intValue() >= 59760) {
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
                if (b.intValue() >= 29060) {
                    engrVar.h("conversations.etouffee_default");
                }
                engrVar.h("conversations.archive_status");
                engrVar.h("conversations.sort_timestamp");
                engrVar.h("conversations.last_read_timestamp");
                engrVar.h("conversations.icon");
                engrVar.h("conversations.participant_contact_id");
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.normalized_participant_contact_id");
                }
                engrVar.h("conversations.participant_lookup_key");
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.normalized_participant_lookup_key");
                }
                engrVar.h("conversations.participant_normalized_destination");
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.participant_comparable_destination");
                }
                engrVar.h("conversations.current_self_id");
                if (b.intValue() >= 60160) {
                    engrVar.h("conversations.current_my_identity_foreign_key");
                }
                if (b.intValue() >= 60360) {
                    engrVar.h("conversations.destination_token");
                }
                engrVar.h("conversations.participant_count");
                engrVar.h("conversations.notification_enabled");
                engrVar.h("conversations.notification_sound_uri");
                engrVar.h("conversations.notification_vibration");
                engrVar.h("conversations.include_email_addr");
                engrVar.h("conversations.sms_service_center");
                if (b.intValue() >= 8500) {
                    engrVar.h("conversations.participant_id_list");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.normalized_participant_id_list");
                }
                if (b.intValue() >= 8500) {
                    engrVar.h("conversations.source_type");
                }
                if (b.intValue() >= 10000) {
                    engrVar.h("conversations.rcs_session_id");
                }
                if (b.intValue() >= 10006) {
                    engrVar.h("conversations.join_state");
                }
                if (b.intValue() >= 10007) {
                    engrVar.h("conversations.conv_type");
                }
                if (b.intValue() >= 10016) {
                    engrVar.h("conversations.send_mode");
                }
                if (b.intValue() >= 10018) {
                    engrVar.h("conversations.IS_ENTERPRISE");
                }
                if (b.intValue() >= 12001) {
                    engrVar.h("conversations.has_ea2p_bot_recipient");
                }
                if (b.intValue() >= 15000) {
                    engrVar.h("conversations.last_interactive_event_timestamp");
                }
                if (b.intValue() >= 15010) {
                    engrVar.h("conversations.participant_display_destination");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.normalized_participant_display_destination");
                }
                if (b.intValue() >= 23000) {
                    engrVar.h("conversations.spam_warning_dismiss_status");
                }
                if (b.intValue() >= 26020) {
                    engrVar.h("conversations.open_count");
                }
                if (b.intValue() >= 28010) {
                    engrVar.h("conversations.last_logged_scooby_metadata_timestamp");
                }
                if (b.intValue() >= 29020) {
                    engrVar.h("conversations.delete_timestamp");
                }
                if (b.intValue() >= 32000) {
                    engrVar.h("conversations.cms_id");
                }
                if (b.intValue() >= 40050) {
                    engrVar.h("conversations.rcs_group_id");
                }
                if (b.intValue() >= 40050) {
                    engrVar.h("conversations.rcs_conference_uri");
                }
                if (b.intValue() >= 58120) {
                    engrVar.h("conversations.tachygram_group_routing_info_token");
                }
                if (b.intValue() >= 53030) {
                    engrVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
                }
                if (b.intValue() >= 46050) {
                    engrVar.h("conversations.rcs_subject_change_timestamp_ms");
                }
                if (b.intValue() >= 48040) {
                    engrVar.h("conversations.rcs_session_allows_revocation");
                }
                if (b.intValue() >= 49020) {
                    engrVar.h("conversations.rcs_group_capabilities");
                }
                if (b.intValue() >= 49060) {
                    engrVar.h("conversations.awaiting_reverse_sync");
                }
                if (b.intValue() >= 58090) {
                    engrVar.h("conversations.duplicate_of");
                }
                if (b.intValue() >= 59130) {
                    engrVar.h("conversations.new_duplicate_of");
                }
                if (b.intValue() >= 58140) {
                    engrVar.h("conversations.error_state");
                }
                if (b.intValue() >= 58210) {
                    engrVar.h("conversations.cms_life_cycle");
                }
                if (b.intValue() >= 58540) {
                    engrVar.h("conversations.rcs_group_self_msisdn");
                }
                if (b.intValue() >= 58750) {
                    engrVar.h("conversations.recipient_offline_timestamp_ms");
                }
                if (b.intValue() >= 58910) {
                    engrVar.h("conversations.rcs_group_last_sync_timestamp");
                }
                if (b.intValue() >= 59210) {
                    engrVar.h("conversations.has_been_e2ee");
                }
                if (b.intValue() >= 59220) {
                    engrVar.h("conversations.marked_as_unread");
                }
                if (b.intValue() >= 59820) {
                    engrVar.h("conversations.custom_theme");
                }
                if (b.intValue() >= 60050) {
                    engrVar.h("conversations.mms_group_upgrade_status");
                }
                if (b.intValue() >= 60050) {
                    engrVar.h("conversations.mms_group_upgrade_retries");
                }
                if (b.intValue() >= 60180) {
                    engrVar.h("conversations.encryption_protocol");
                }
                if (b.intValue() >= 60210) {
                    engrVar.h("conversations.encryption_id");
                }
                if (b.intValue() >= 60250) {
                    engrVar.h("conversations.cms_correlation_id");
                }
                if (b.intValue() >= 60590) {
                    engrVar.h("conversations.rcs_group_icon_url");
                }
                if (b.intValue() >= 60740) {
                    engrVar.h("conversations.unread_count");
                }
                strArr = (String[]) engrVar.g().toArray(new String[0]);
            }
            bpgr bpgrVar = new bpgr(strArr);
            bpgrVar.z("UnreadMessagesCountQuery#createQueryBuilder");
            bpgrVar.k(new bpgs(bpgtVar));
            int i2 = bpgrVar.b().i();
            f.close();
            return i2;
        } finally {
        }
    }

    public static buxo b(ConversationIdType conversationIdType) {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.P(false);
        buxzVar.ai(byzm.a);
        buxzVar.m(conversationIdType);
        buxzVar.B(false);
        buxo d = MessagesTable.d();
        d.z("UnreadMessagesCountQuery#createConversationQueryBuilder");
        d.k(new buxs(buxzVar));
        return d;
    }
}
