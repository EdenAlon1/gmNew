package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpgu {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "participants._id", "participants.my_identity_token", "participants.my_identity_token_foreign_key", "participants.sub_id", "participants.sim_slot_id", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.comparable_destination", "participants.country_code", "participants.recipient_id", "participants.recipient_canonical_address", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.subscription_name", "participants.subscription_color", "participants.contact_destination", "participants.participant_type", "participants.video_reachability", "participants.alias", "participants.is_spam", "participants.is_spam_source", "participants.cms_id", "participants.latest_verification_status", "participants.profile_photo_blob_id", "participants.profile_photo_encryption_key", "participants.directory_id", "participants.is_check_constraint_enabled_via_phenotype", "participants.is_valid_phone_number_data", "participants.duplicate_of", "participants.cms_life_cycle", "participants.norm_ui_status", "participants.last_modified_by_key", "participants.name_source", "participants.photo_source", "participants.profile_photo_user_preference", "participants.contact_metadata", "participants.is_enterprise_contact", "conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages.sender_send_destination", 54040);
        enhdVar.k("messages.msisdn_receiving_rcs_message", 59340);
        enhdVar.k("messages.receiving_network_country", 54040);
        enhdVar.k("messages.queue_insert_timestamp", 17030);
        enhdVar.k("messages.message_report_status", 13020);
        enhdVar.k("messages.rcs_expiry", 59890);
        enhdVar.k("messages.mms_retrieve_text", 9030);
        enhdVar.k("messages.my_identity_foreign_key", 60160);
        enhdVar.k("messages.cloud_sync_id", 8500);
        enhdVar.k("messages.rcs_message_id_with_text_type", 41040);
        enhdVar.k("messages.etouffee_status", 29060);
        enhdVar.k("messages.verification_status", 29090);
        enhdVar.k("messages.rcs_ui_status", 39000);
        enhdVar.k("messages.is_hidden", 30010);
        enhdVar.k("messages.rcs_remote_instance", 10002);
        enhdVar.k("messages.rcs_file_transfer_session_id", 10004);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.k("messages.correlation_id", 9010);
        enhdVar.k("messages.cms_id", 31010);
        enhdVar.k("messages.cms_last_mod_seq", 37040);
        enhdVar.k("messages.web_id", 19020);
        enhdVar.k("messages.usage_stats_logging_id", 29100);
        enhdVar.k("messages.send_counter", 35030);
        enhdVar.k("messages.original_rcs_message_id", 35030);
        enhdVar.k("messages.custom_delivery_receipt_mime_type", 37020);
        enhdVar.k("messages.custom_delivery_receipt_content", 37020);
        enhdVar.k("messages.report_attempt_acounter", 37030);
        enhdVar.k("messages.custom_headers", 45020);
        enhdVar.k("messages.cms_correlation_id", 46010);
        enhdVar.k("messages.group_private_participant", 48030);
        enhdVar.k("messages.original_message_id", 48030);
        enhdVar.k("messages.awaiting_reverse_sync", 49060);
        enhdVar.k("messages.old_sms_message_uri", 49060);
        enhdVar.k("messages.draft_id", 56000);
        enhdVar.k("messages.result_code", 58040);
        enhdVar.k("messages.cms_life_cycle", 58210);
        enhdVar.k("messages.mute_priority", 60750);
        enhdVar.k("messages.fallback_reason", 58710);
        enhdVar.k("messages.auto_retry_counter", 58230);
        enhdVar.k("messages.can_revoke_before_delivered_with_rcs", 58280);
        enhdVar.k("messages.trace_id", 58680);
        enhdVar.k("messages.outgoing_delivery_report_status", 58720);
        enhdVar.k("messages.outgoing_read_report_status", 58720);
        enhdVar.k("messages.xms_transport", 59310);
        enhdVar.k("messages.message_original_protocol", 59430);
        enhdVar.k("messages.satellite_datagram_id", 59490);
        enhdVar.k("messages.encryption_protocol", 60190);
        enhdVar.k("messages.message_persistence_id", 60370);
        enhdVar.k("participants.my_identity_token", 59930);
        enhdVar.k("participants.my_identity_token_foreign_key", 60160);
        enhdVar.k("participants.sim_slot_id", 2000);
        enhdVar.k("participants.comparable_destination", 54040);
        enhdVar.k("participants.country_code", 54040);
        enhdVar.k("participants.recipient_id", 58090);
        enhdVar.k("participants.recipient_canonical_address", 58090);
        enhdVar.k("participants.contact_photo_uri", 59850);
        enhdVar.k("participants.color_type", 1000);
        enhdVar.k("participants.extended_color", 10027);
        enhdVar.k("participants.subscription_name", 2000);
        enhdVar.k("participants.subscription_color", 2000);
        enhdVar.k("participants.contact_destination", 4000);
        enhdVar.k("participants.participant_type", 12001);
        enhdVar.k("participants.video_reachability", 13050);
        enhdVar.k("participants.alias", 20060);
        enhdVar.k("participants.is_spam", 24060);
        enhdVar.k("participants.is_spam_source", 30000);
        enhdVar.k("participants.cms_id", 31020);
        enhdVar.k("participants.latest_verification_status", 31030);
        enhdVar.k("participants.profile_photo_blob_id", 33000);
        enhdVar.k("participants.profile_photo_encryption_key", 33060);
        enhdVar.k("participants.directory_id", 35010);
        enhdVar.k("participants.is_check_constraint_enabled_via_phenotype", 55010);
        enhdVar.k("participants.is_valid_phone_number_data", 55010);
        enhdVar.k("participants.duplicate_of", 58090);
        enhdVar.k("participants.cms_life_cycle", 58210);
        enhdVar.k("participants.norm_ui_status", 58620);
        enhdVar.k("participants.last_modified_by_key", 59440);
        enhdVar.k("participants.name_source", 59550);
        enhdVar.k("participants.photo_source", 59550);
        enhdVar.k("participants.profile_photo_user_preference", 60060);
        enhdVar.k("participants.contact_metadata", 60070);
        enhdVar.k("participants.is_enterprise_contact", 60640);
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
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("_id", "index_unsent_rcs_report");
        enhdVar2.k("sender_id", "index_null_sender_id");
        enhdVar2.k("sent_timestamp", "index_null_sent_timestamp");
        enhdVar2.k("read", "index_messages_read_0");
        enhdVar2.k("sms_message_uri", "index_null_sms_message_uri");
        enhdVar2.k("rcs_expiry", "index_null_rcs_expiry");
        enhdVar2.k("self_id", "index_null_self_id");
        enhdVar2.k("my_identity", "index_null_my_identity");
        enhdVar2.k("my_identity_foreign_key", "index_null_my_identity_foreign_key");
        enhdVar2.k("cloud_sync_id", "index_null_cloud_sync_id");
        enhdVar2.k(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        enhdVar2.k("cms_id", "index_null_cms_id");
        enhdVar2.k("web_id", "index_null_web_id");
        enhdVar2.k("original_rcs_message_id", "index_null_original_rcs_message_id");
        enhdVar2.k("cms_correlation_id", "index_null_cms_correlation_id");
        enhdVar2.k("group_private_participant", "index_null_group_private_participant");
        enhdVar2.k("original_message_id", "index_null_original_message_id");
        enhdVar2.k("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        enhdVar2.k("draft_id", "index_null_draft_id");
        enhdVar2.k("satellite_datagram_id", "index_null_satellite_datagram_id");
        enhdVar2.k("message_persistence_id", "index_null_message_persistence_id");
        enhdVar2.c();
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("messages._id");
        m.i(-1);
        m.c(new Supplier() { // from class: bork
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m.j(new dtsc() { // from class: borx
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: bowq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m2.b("messages.conversation_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bpbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m2.j(new dtsc() { // from class: bpbo
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bpca
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m3.b("messages.sender_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bpcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m3.j(new dtsc() { // from class: bpcz
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(4);
        m4.b("messages.sender_send_destination");
        m4.i(54040);
        m4.c(new Supplier() { // from class: bpdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m4.j(new dtsc() { // from class: bpdx
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("messages.msisdn_receiving_rcs_message");
        m5.i(59340);
        m5.c(new Supplier() { // from class: bosg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m5.j(new dtsc() { // from class: bowy
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("messages.receiving_network_country");
        m6.i(54040);
        m6.c(new Supplier() { // from class: bpbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m6.j(new dtsc() { // from class: bpee
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        m7.b("messages.sent_timestamp");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bpeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m7.j(new dtsc() { // from class: bpfc
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.b("messages.queue_insert_timestamp");
        m8.i(17030);
        m8.c(new Supplier() { // from class: bpfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m8.j(new dtsc() { // from class: bpga
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.b("messages.received_timestamp");
        m9.i(-1);
        m9.c(new Supplier() { // from class: bpgm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m9.j(new dtsc() { // from class: borw
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.b("messages.message_protocol");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bosj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m10.j(new dtsc() { // from class: bosv
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        m11.d(true);
        m11.b("messages.message_status");
        m11.i(-1);
        m11.c(new Supplier() { // from class: both
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m11.j(new dtsc() { // from class: bott
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("messages.message_report_status");
        m12.i(13020);
        m12.c(new Supplier() { // from class: bouf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m12.j(new dtsc() { // from class: bour
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("messages.seen");
        m13.f(true);
        m13.i(-1);
        m13.c(new Supplier() { // from class: bovd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m13.j(new dtsc() { // from class: bovp
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.d(true);
        m14.b("messages.read");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bowd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m14.j(new dtsc() { // from class: bowp
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.d(true);
        m15.b("messages.sms_message_uri");
        m15.i(-1);
        m15.c(new Supplier() { // from class: boxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m15.j(new dtsc() { // from class: boxo
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.b("messages.sms_priority");
        m16.i(-1);
        m16.c(new Supplier() { // from class: boya
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m16.j(new dtsc() { // from class: boym
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.b("messages.sms_message_size");
        m17.i(-1);
        m17.c(new Supplier() { // from class: boyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m17.j(new dtsc() { // from class: bozk
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        m18.b("messages.mms_subject");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bozw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m18.j(new dtsc() { // from class: bpak
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("messages.mms_transaction_id");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bpaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m19.j(new dtsc() { // from class: bpbb
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.b("messages.mms_content_location");
        m20.i(-1);
        m20.c(new Supplier() { // from class: bpbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m20.j(new dtsc() { // from class: bpbe
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("messages.mms_expiry");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bpbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m21.j(new dtsc() { // from class: bpbh
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        m22.b("messages.rcs_expiry");
        m22.i(59890);
        m22.c(new Supplier() { // from class: bpbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m22.j(new dtsc() { // from class: bpbj
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(4);
        m23.b("messages.mms_retrieve_text");
        m23.i(9030);
        m23.c(new Supplier() { // from class: bpbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m23.j(new dtsc() { // from class: bpbl
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("messages.raw_status");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bpbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m24.j(new dtsc() { // from class: bpbn
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.d(true);
        m25.e(true);
        m25.h(new Supplier() { // from class: bpbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m25.b("messages.self_id");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bpbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m25.j(new dtsc() { // from class: bpbs
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.d(true);
        m26.e(true);
        m26.h(new Supplier() { // from class: bpbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m26.b("messages.my_identity_foreign_key");
        m26.i(60160);
        m26.c(new Supplier() { // from class: bpbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m26.j(new dtsc() { // from class: bpbv
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("messages.retry_start_timestamp");
        m27.i(-1);
        m27.c(new Supplier() { // from class: bpbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m27.j(new dtsc() { // from class: bpbx
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        m28.d(true);
        m28.b("messages.cloud_sync_id");
        m28.i(8500);
        m28.c(new Supplier() { // from class: bpby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m28.j(new dtsc() { // from class: bpbz
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.d(true);
        m29.b("messages.rcs_message_id_with_text_type");
        m29.f(true);
        m29.i(41040);
        m29.c(new Supplier() { // from class: bpcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m29.j(new dtsc() { // from class: bpcd
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        m30.b("messages.etouffee_status");
        m30.i(29060);
        m30.c(new Supplier() { // from class: bpce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m30.j(new dtsc() { // from class: bpcf
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("messages.verification_status");
        m31.i(29090);
        m31.c(new Supplier() { // from class: bpcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m31.j(new dtsc() { // from class: bpch
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("messages.rcs_ui_status");
        m32.i(39000);
        m32.c(new Supplier() { // from class: bpci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m32.j(new dtsc() { // from class: bpcj
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.d(true);
        m33.b("messages.is_hidden");
        m33.i(30010);
        m33.c(new Supplier() { // from class: bpck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m33.j(new dtsc() { // from class: bpcl
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(7);
        m34.b("messages.rcs_remote_instance");
        m34.i(10002);
        m34.c(new Supplier() { // from class: bpco
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m34.j(new dtsc() { // from class: bpcp
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.b("messages.rcs_file_transfer_session_id");
        m35.i(10004);
        m35.c(new Supplier() { // from class: bpcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m35.j(new dtsc() { // from class: bpcr
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.b("messages.sms_error_code");
        m36.i(9000);
        m36.c(new Supplier() { // from class: bpcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m36.j(new dtsc() { // from class: bpct
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.b("messages.sms_error_desc_map_name");
        m37.i(9000);
        m37.c(new Supplier() { // from class: bpcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m37.j(new dtsc() { // from class: bpcv
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.b("messages.correlation_id");
        m38.i(9010);
        m38.c(new Supplier() { // from class: bpcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m38.j(new dtsc() { // from class: bpcy
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.l(true);
        m39.d(true);
        m39.b("messages.cms_id");
        m39.f(true);
        m39.i(31010);
        m39.c(new Supplier() { // from class: bpda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m39.j(new dtsc() { // from class: bpdb
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(2);
        m40.b("messages.cms_last_mod_seq");
        m40.i(37040);
        m40.c(new Supplier() { // from class: bpdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m40.j(new dtsc() { // from class: bpdd
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.d(true);
        m41.b("messages.web_id");
        m41.i(19020);
        m41.c(new Supplier() { // from class: bpde
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m41.j(new dtsc() { // from class: bpdf
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        m42.b("messages.usage_stats_logging_id");
        m42.i(29100);
        m42.c(new Supplier() { // from class: bpdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m42.j(new dtsc() { // from class: bpdh
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(1);
        m43.b("messages.send_counter");
        m43.i(35030);
        m43.c(new Supplier() { // from class: bpdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m43.j(new dtsc() { // from class: bpdk
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(4);
        m44.d(true);
        m44.b("messages.original_rcs_message_id");
        m44.i(35030);
        m44.c(new Supplier() { // from class: bpdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m44.j(new dtsc() { // from class: bpdn
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.b("messages.custom_delivery_receipt_mime_type");
        m45.i(37020);
        m45.c(new Supplier() { // from class: bpdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m45.j(new dtsc() { // from class: bpdp
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(5);
        m46.b("messages.custom_delivery_receipt_content");
        m46.i(37020);
        m46.c(new Supplier() { // from class: bpdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m46.j(new dtsc() { // from class: bpdr
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        m47.b("messages.report_attempt_acounter");
        m47.i(37030);
        m47.c(new Supplier() { // from class: bpds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m47.j(new dtsc() { // from class: bpdu
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(5);
        m48.b("messages.custom_headers");
        m48.i(45020);
        m48.c(new Supplier() { // from class: bpdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m48.j(new dtsc() { // from class: bpdw
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.l(true);
        m49.d(true);
        m49.b("messages.cms_correlation_id");
        m49.f(true);
        m49.i(46010);
        m49.c(new Supplier() { // from class: bovr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m49.j(new dtsc() { // from class: bozy
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.d(true);
        m50.e(true);
        m50.h(new Supplier() { // from class: bpdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m50.b("messages.group_private_participant");
        m50.i(48030);
        m50.c(new Supplier() { // from class: bpek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m50.j(new dtsc() { // from class: bpev
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.d(true);
        m51.e(true);
        m51.h(new Supplier() { // from class: bpfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m51.b("messages.original_message_id");
        m51.i(48030);
        m51.c(new Supplier() { // from class: bpfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m51.j(new dtsc() { // from class: bpgc
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(1);
        m52.b("messages.awaiting_reverse_sync");
        m52.i(49060);
        m52.c(new Supplier() { // from class: bpgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m52.j(new dtsc() { // from class: borv
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(4);
        m53.b("messages.old_sms_message_uri");
        m53.i(49060);
        m53.c(new Supplier() { // from class: bosr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m53.j(new dtsc() { // from class: botc
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(4);
        m54.l(true);
        m54.d(true);
        m54.b("messages.draft_id");
        m54.f(true);
        m54.i(56000);
        m54.c(new Supplier() { // from class: botn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m54.j(new dtsc() { // from class: boty
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(1);
        m55.b("messages.result_code");
        m55.i(58040);
        m55.c(new Supplier() { // from class: bouj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m55.j(new dtsc() { // from class: bouu
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        m56.b("messages.cms_life_cycle");
        m56.i(58210);
        m56.c(new Supplier() { // from class: bovf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m56.j(new dtsc() { // from class: bovq
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.b("messages.mute_priority");
        m57.i(60750);
        m57.c(new Supplier() { // from class: bowc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m57.j(new dtsc() { // from class: bown
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.b("messages.fallback_reason");
        m58.i(58710);
        m58.c(new Supplier() { // from class: boxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m58.j(new dtsc() { // from class: boxu
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("messages.auto_retry_counter");
        m59.i(58230);
        m59.c(new Supplier() { // from class: boyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m59.j(new dtsc() { // from class: boyq
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(2);
        m60.b("messages.can_revoke_before_delivered_with_rcs");
        m60.i(58280);
        m60.c(new Supplier() { // from class: bozb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m60.j(new dtsc() { // from class: bozm
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(5);
        m61.b("messages.trace_id");
        m61.i(58680);
        m61.c(new Supplier() { // from class: bozx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m61.j(new dtsc() { // from class: bpaj
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("messages.outgoing_delivery_report_status");
        m62.i(58720);
        m62.c(new Supplier() { // from class: bpau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m62.j(new dtsc() { // from class: bpbf
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("messages.outgoing_read_report_status");
        m63.i(58720);
        m63.c(new Supplier() { // from class: bpcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m63.j(new dtsc() { // from class: bpcm
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("messages.xms_transport");
        m64.i(59310);
        m64.c(new Supplier() { // from class: bpcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m64.j(new dtsc() { // from class: bpdi
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.message_original_protocol");
        m65.i(59430);
        m65.c(new Supplier() { // from class: bpdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m65.j(new dtsc() { // from class: bpdy
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(4);
        m66.l(true);
        m66.d(true);
        m66.b("messages.satellite_datagram_id");
        m66.f(true);
        m66.i(59490);
        m66.c(new Supplier() { // from class: bpea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m66.j(new dtsc() { // from class: bpeb
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("messages.encryption_protocol");
        m67.i(60190);
        m67.c(new Supplier() { // from class: bpec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m67.j(new dtsc() { // from class: bped
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("messages.message_persistence_id");
        m68.f(true);
        m68.i(60370);
        m68.c(new Supplier() { // from class: bpef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m68.j(new dtsc() { // from class: bpeg
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(2);
        m69.l(true);
        m69.g(true);
        m69.d(true);
        m69.b("participants._id");
        m69.i(-1);
        m69.c(new Supplier() { // from class: bpeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m69.j(new dtsc() { // from class: bpei
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        m70.d(true);
        m70.b("participants.my_identity_token");
        m70.i(59930);
        m70.c(new Supplier() { // from class: bpej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m70.j(new dtsc() { // from class: bpel
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(4);
        m71.d(true);
        m71.e(true);
        m71.h(new Supplier() { // from class: bpem
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m71.b("participants.my_identity_token_foreign_key");
        m71.i(60160);
        m71.c(new Supplier() { // from class: bpen
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m71.j(new dtsc() { // from class: bpeo
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(1);
        m72.d(true);
        m72.b("participants.sub_id");
        m72.f(true);
        m72.i(-1);
        m72.c(new Supplier() { // from class: bpep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m72.j(new dtsc() { // from class: bper
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        m73.b("participants.sim_slot_id");
        m73.i(2000);
        m73.c(new Supplier() { // from class: bpes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m73.j(new dtsc() { // from class: bpet
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.d(true);
        m74.b("participants.normalized_destination");
        m74.f(true);
        m74.i(-1);
        m74.c(new Supplier() { // from class: bpeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m74.j(new dtsc() { // from class: bpew
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        m75.b("participants.send_destination");
        m75.i(-1);
        m75.c(new Supplier() { // from class: bpex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m75.j(new dtsc() { // from class: bpey
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("participants.display_destination");
        m76.i(-1);
        m76.c(new Supplier() { // from class: bpez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m76.j(new dtsc() { // from class: bpfa
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.l(true);
        m77.d(true);
        m77.b("participants.comparable_destination");
        m77.f(true);
        m77.i(54040);
        m77.c(new Supplier() { // from class: bpfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m77.j(new dtsc() { // from class: bpfd
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("participants.country_code");
        m78.i(54040);
        m78.c(new Supplier() { // from class: bpfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m78.j(new dtsc() { // from class: bpff
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(2);
        m79.l(true);
        m79.d(true);
        m79.b("participants.recipient_id");
        m79.f(true);
        m79.i(58090);
        m79.c(new Supplier() { // from class: bpfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m79.j(new dtsc() { // from class: bpfi
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        m80.b("participants.recipient_canonical_address");
        m80.i(58090);
        m80.c(new Supplier() { // from class: bpfj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m80.j(new dtsc() { // from class: bpfk
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        m81.b("participants.full_name");
        m81.i(-1);
        m81.c(new Supplier() { // from class: bpfl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m81.j(new dtsc() { // from class: bpfm
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(4);
        m82.b("participants.first_name");
        m82.i(-1);
        m82.c(new Supplier() { // from class: bpfn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m82.j(new dtsc() { // from class: bpfp
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(4);
        m83.b("participants.profile_photo_uri");
        m83.i(-1);
        m83.c(new Supplier() { // from class: bpfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m83.j(new dtsc() { // from class: bpfs
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(4);
        m84.b("participants.contact_photo_uri");
        m84.i(59850);
        m84.c(new Supplier() { // from class: bpft
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m84.j(new dtsc() { // from class: bpfu
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("participants.contact_id");
        m85.i(-1);
        m85.c(new Supplier() { // from class: bpfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m85.j(new dtsc() { // from class: bpfw
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(4);
        m86.b("participants.lookup_key");
        m86.i(-1);
        m86.c(new Supplier() { // from class: bpfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m86.j(new dtsc() { // from class: bpfy
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("participants.color_palette_index");
        m87.i(-1);
        m87.c(new Supplier() { // from class: bpfz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m87.j(new dtsc() { // from class: bpgb
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(1);
        m88.b("participants.color_type");
        m88.i(1000);
        m88.c(new Supplier() { // from class: bpgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m88.j(new dtsc() { // from class: bpge
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.b("participants.extended_color");
        m89.i(10027);
        m89.c(new Supplier() { // from class: bpgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m89.j(new dtsc() { // from class: bpgg
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.b("participants.blocked");
        m90.i(-1);
        m90.c(new Supplier() { // from class: bpgh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m90.j(new dtsc() { // from class: bpgi
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(4);
        m91.b("participants.subscription_name");
        m91.i(2000);
        m91.c(new Supplier() { // from class: bpgj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m91.j(new dtsc() { // from class: bpgk
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.b("participants.subscription_color");
        m92.i(2000);
        m92.c(new Supplier() { // from class: bpgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m92.j(new dtsc() { // from class: borl
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("participants.contact_destination");
        m93.i(4000);
        m93.c(new Supplier() { // from class: borm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m93.j(new dtsc() { // from class: born
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("participants.participant_type");
        m94.i(12001);
        m94.c(new Supplier() { // from class: boro
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m94.j(new dtsc() { // from class: borp
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.b("participants.video_reachability");
        m95.i(13050);
        m95.c(new Supplier() { // from class: borq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m95.j(new dtsc() { // from class: borr
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(4);
        m96.b("participants.alias");
        m96.i(20060);
        m96.c(new Supplier() { // from class: bors
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m96.j(new dtsc() { // from class: bort
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(1);
        m97.b("participants.is_spam");
        m97.i(24060);
        m97.c(new Supplier() { // from class: boru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m97.j(new dtsc() { // from class: bory
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("participants.is_spam_source");
        m98.i(30000);
        m98.c(new Supplier() { // from class: borz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m98.j(new dtsc() { // from class: bosa
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.l(true);
        m99.d(true);
        m99.b("participants.cms_id");
        m99.f(true);
        m99.i(31020);
        m99.c(new Supplier() { // from class: bosb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m99.j(new dtsc() { // from class: bosc
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(1);
        m100.b("participants.latest_verification_status");
        m100.i(31030);
        m100.c(new Supplier() { // from class: bosd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m100.j(new dtsc() { // from class: bose
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("participants.profile_photo_blob_id");
        m101.i(33000);
        m101.c(new Supplier() { // from class: bosf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m101.j(new dtsc() { // from class: bosh
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(5);
        m102.b("participants.profile_photo_encryption_key");
        m102.i(33060);
        m102.c(new Supplier() { // from class: bosi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m102.j(new dtsc() { // from class: bosk
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.b("participants.directory_id");
        m103.i(35010);
        m103.c(new Supplier() { // from class: bosl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m103.j(new dtsc() { // from class: bosm
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(1);
        m104.b("participants.is_check_constraint_enabled_via_phenotype");
        m104.i(55010);
        m104.c(new Supplier() { // from class: bosn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m104.j(new dtsc() { // from class: boso
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.b("participants.is_valid_phone_number_data");
        m105.i(55010);
        m105.c(new Supplier() { // from class: bosp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m105.j(new dtsc() { // from class: bosq
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(2);
        m106.d(true);
        m106.e(true);
        m106.h(new Supplier() { // from class: boss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m106.b("participants.duplicate_of");
        m106.i(58090);
        m106.c(new Supplier() { // from class: bost
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m106.j(new dtsc() { // from class: bosu
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(1);
        m107.b("participants.cms_life_cycle");
        m107.i(58210);
        m107.c(new Supplier() { // from class: bosw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m107.j(new dtsc() { // from class: bosx
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("participants.norm_ui_status");
        m108.i(58620);
        m108.c(new Supplier() { // from class: bosy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m108.j(new dtsc() { // from class: bosz
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.b("participants.last_modified_by_key");
        m109.i(59440);
        m109.c(new Supplier() { // from class: bota
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m109.j(new dtsc() { // from class: botb
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(1);
        m110.b("participants.name_source");
        m110.i(59550);
        m110.c(new Supplier() { // from class: botd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m110.j(new dtsc() { // from class: bote
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(1);
        m111.b("participants.photo_source");
        m111.i(59550);
        m111.c(new Supplier() { // from class: botf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m111.j(new dtsc() { // from class: botg
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("participants.profile_photo_user_preference");
        m112.i(60060);
        m112.c(new Supplier() { // from class: boti
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m112.j(new dtsc() { // from class: botj
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(5);
        m113.b("participants.contact_metadata");
        m113.i(60070);
        m113.c(new Supplier() { // from class: botk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m113.j(new dtsc() { // from class: botl
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.d(true);
        m114.b("participants.is_enterprise_contact");
        m114.i(60640);
        m114.c(new Supplier() { // from class: botm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m114.j(new dtsc() { // from class: boto
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(2);
        m115.l(true);
        m115.g(true);
        m115.d(true);
        m115.b("conversations._id");
        m115.i(-1);
        m115.c(new Supplier() { // from class: botp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m115.j(new dtsc() { // from class: botq
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(1);
        m116.d(true);
        m116.b("conversations.sms_thread_id");
        m116.i(-1);
        m116.c(new Supplier() { // from class: botr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m116.j(new dtsc() { // from class: bots
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(4);
        m117.b("conversations.name");
        m117.i(-1);
        m117.c(new Supplier() { // from class: botu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m117.j(new dtsc() { // from class: botv
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(2);
        m118.b("conversations.name_is_automatic");
        m118.i(10012);
        m118.c(new Supplier() { // from class: botw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m118.j(new dtsc() { // from class: botx
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.b("conversations.subtitle");
        m119.i(59760);
        m119.c(new Supplier() { // from class: botz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m119.j(new dtsc() { // from class: boua
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(1);
        m120.b("conversations.latest_message_id");
        m120.i(-1);
        m120.c(new Supplier() { // from class: boub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m120.j(new dtsc() { // from class: bouc
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.b("conversations.snippet_text");
        m121.i(-1);
        m121.c(new Supplier() { // from class: boud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m121.j(new dtsc() { // from class: boue
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(4);
        m122.b("conversations.subject_text");
        m122.i(-1);
        m122.c(new Supplier() { // from class: boug
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m122.j(new dtsc() { // from class: bouh
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(4);
        m123.b("conversations.preview_uri");
        m123.i(-1);
        m123.c(new Supplier() { // from class: boui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m123.j(new dtsc() { // from class: bouk
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(4);
        m124.b("conversations.preview_content_type");
        m124.i(-1);
        m124.c(new Supplier() { // from class: boul
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m124.j(new dtsc() { // from class: boum
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(1);
        m125.b("conversations.show_draft");
        m125.i(-1);
        m125.c(new Supplier() { // from class: boun
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m125.j(new dtsc() { // from class: bouo
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(4);
        m126.b("conversations.draft_snippet_text");
        m126.i(-1);
        m126.c(new Supplier() { // from class: boup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m126.j(new dtsc() { // from class: bouq
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(4);
        m127.b("conversations.draft_subject_text");
        m127.i(-1);
        m127.c(new Supplier() { // from class: bous
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m127.j(new dtsc() { // from class: bout
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(4);
        m128.b("conversations.draft_preview_uri");
        m128.i(-1);
        m128.c(new Supplier() { // from class: bouv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m128.j(new dtsc() { // from class: bouw
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.b("conversations.draft_preview_content_type");
        m129.i(-1);
        m129.c(new Supplier() { // from class: boux
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m129.j(new dtsc() { // from class: bouy
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.b("conversations.etouffee_default");
        m130.i(29060);
        m130.c(new Supplier() { // from class: bouz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m130.j(new dtsc() { // from class: bova
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.d(true);
        m131.b("conversations.archive_status");
        m131.i(-1);
        m131.c(new Supplier() { // from class: bovb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m131.j(new dtsc() { // from class: bovc
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(1);
        m132.d(true);
        m132.b("conversations.sort_timestamp");
        m132.i(-1);
        m132.c(new Supplier() { // from class: bove
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m132.j(new dtsc() { // from class: bovg
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(1);
        m133.b("conversations.last_read_timestamp");
        m133.i(-1);
        m133.c(new Supplier() { // from class: bovh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m133.j(new dtsc() { // from class: bovi
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(4);
        m134.b("conversations.icon");
        m134.i(-1);
        m134.c(new Supplier() { // from class: bovj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m134.j(new dtsc() { // from class: bovk
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("conversations.participant_contact_id");
        m135.i(-1);
        m135.c(new Supplier() { // from class: bovl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m135.j(new dtsc() { // from class: bovm
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("conversations.normalized_participant_contact_id");
        m136.i(58090);
        m136.c(new Supplier() { // from class: bovn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m136.j(new dtsc() { // from class: bovo
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(4);
        m137.b("conversations.participant_lookup_key");
        m137.i(-1);
        m137.c(new Supplier() { // from class: bovs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m137.j(new dtsc() { // from class: bovt
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(4);
        m138.b("conversations.normalized_participant_lookup_key");
        m138.i(58090);
        m138.c(new Supplier() { // from class: bovu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m138.j(new dtsc() { // from class: bovv
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(4);
        m139.d(true);
        m139.b("conversations.participant_normalized_destination");
        m139.i(-1);
        m139.c(new Supplier() { // from class: bovw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m139.j(new dtsc() { // from class: bovx
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(4);
        m140.l(true);
        m140.d(true);
        m140.b("conversations.participant_comparable_destination");
        m140.f(true);
        m140.i(58090);
        m140.c(new Supplier() { // from class: bovy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m140.j(new dtsc() { // from class: bovz
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(4);
        m141.b("conversations.current_self_id");
        m141.i(-1);
        m141.c(new Supplier() { // from class: bowa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m141.j(new dtsc() { // from class: bowb
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(4);
        m142.d(true);
        m142.e(true);
        m142.h(new Supplier() { // from class: bowe
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m142.b("conversations.current_my_identity_foreign_key");
        m142.i(60160);
        m142.c(new Supplier() { // from class: bowf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m142.j(new dtsc() { // from class: bowg
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(4);
        m143.d(true);
        m143.e(true);
        m143.h(new Supplier() { // from class: bowh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m143.b("conversations.destination_token");
        m143.i(60360);
        m143.c(new Supplier() { // from class: bowi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m143.j(new dtsc() { // from class: bowj
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("conversations.participant_count");
        m144.i(-1);
        m144.c(new Supplier() { // from class: bowk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m144.j(new dtsc() { // from class: bowl
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("conversations.notification_enabled");
        m145.i(-1);
        m145.c(new Supplier() { // from class: bowm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m145.j(new dtsc() { // from class: bowo
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(4);
        m146.b("conversations.notification_sound_uri");
        m146.i(-1);
        m146.c(new Supplier() { // from class: bowr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m146.j(new dtsc() { // from class: bows
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(1);
        m147.b("conversations.notification_vibration");
        m147.i(-1);
        m147.c(new Supplier() { // from class: bowt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m147.j(new dtsc() { // from class: bowu
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(1);
        m148.b("conversations.include_email_addr");
        m148.i(-1);
        m148.c(new Supplier() { // from class: bowv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m148.j(new dtsc() { // from class: boww
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(4);
        m149.b("conversations.sms_service_center");
        m149.i(-1);
        m149.c(new Supplier() { // from class: bowx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m149.j(new dtsc() { // from class: bowz
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(4);
        m150.b("conversations.participant_id_list");
        m150.i(8500);
        m150.c(new Supplier() { // from class: boxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m150.j(new dtsc() { // from class: boxb
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(4);
        m151.l(true);
        m151.d(true);
        m151.b("conversations.normalized_participant_id_list");
        m151.f(true);
        m151.i(58090);
        m151.c(new Supplier() { // from class: boxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m151.j(new dtsc() { // from class: boxe
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(1);
        m152.b("conversations.source_type");
        m152.i(8500);
        m152.c(new Supplier() { // from class: boxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m152.j(new dtsc() { // from class: boxg
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(1);
        m153.d(true);
        m153.b("conversations.rcs_session_id");
        m153.i(10000);
        m153.c(new Supplier() { // from class: boxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m153.j(new dtsc() { // from class: boxi
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(1);
        m154.b("conversations.join_state");
        m154.i(10006);
        m154.c(new Supplier() { // from class: boxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m154.j(new dtsc() { // from class: boxl
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(1);
        m155.b("conversations.conv_type");
        m155.i(10007);
        m155.c(new Supplier() { // from class: boxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m155.j(new dtsc() { // from class: boxn
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(1);
        m156.b("conversations.send_mode");
        m156.i(10016);
        m156.c(new Supplier() { // from class: boxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m156.j(new dtsc() { // from class: boxq
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(1);
        m157.b("conversations.IS_ENTERPRISE");
        m157.i(10018);
        m157.c(new Supplier() { // from class: boxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m157.j(new dtsc() { // from class: boxs
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(1);
        m158.b("conversations.has_ea2p_bot_recipient");
        m158.i(12001);
        m158.c(new Supplier() { // from class: boxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m158.j(new dtsc() { // from class: boxv
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(1);
        m159.b("conversations.last_interactive_event_timestamp");
        m159.i(15000);
        m159.c(new Supplier() { // from class: boxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m159.j(new dtsc() { // from class: boxx
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(4);
        m160.b("conversations.participant_display_destination");
        m160.i(15010);
        m160.c(new Supplier() { // from class: boxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m160.j(new dtsc() { // from class: boxz
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(4);
        m161.b("conversations.normalized_participant_display_destination");
        m161.i(58090);
        m161.c(new Supplier() { // from class: boyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m161.j(new dtsc() { // from class: boyc
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(1);
        m162.b("conversations.spam_warning_dismiss_status");
        m162.i(23000);
        m162.c(new Supplier() { // from class: boyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m162.j(new dtsc() { // from class: boye
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(1);
        m163.b("conversations.open_count");
        m163.i(26020);
        m163.c(new Supplier() { // from class: boyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m163.j(new dtsc() { // from class: boyh
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(1);
        m164.b("conversations.last_logged_scooby_metadata_timestamp");
        m164.i(28010);
        m164.c(new Supplier() { // from class: boyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m164.j(new dtsc() { // from class: boyj
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(1);
        m165.d(true);
        m165.b("conversations.delete_timestamp");
        m165.i(29020);
        m165.c(new Supplier() { // from class: boyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m165.j(new dtsc() { // from class: boyl
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(4);
        m166.l(true);
        m166.d(true);
        m166.b("conversations.cms_id");
        m166.f(true);
        m166.i(32000);
        m166.c(new Supplier() { // from class: boyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m166.j(new dtsc() { // from class: boyo
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(4);
        m167.d(true);
        m167.b("conversations.rcs_group_id");
        m167.i(40050);
        m167.c(new Supplier() { // from class: boyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m167.j(new dtsc() { // from class: boyr
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(4);
        m168.b("conversations.rcs_conference_uri");
        m168.i(40050);
        m168.c(new Supplier() { // from class: boys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m168.j(new dtsc() { // from class: boyt
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(5);
        m169.b("conversations.tachygram_group_routing_info_token");
        m169.i(58120);
        m169.c(new Supplier() { // from class: boyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m169.j(new dtsc() { // from class: boyv
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m170.i(53030);
        m170.c(new Supplier() { // from class: boyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m170.j(new dtsc() { // from class: boyx
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(2);
        m171.b("conversations.rcs_subject_change_timestamp_ms");
        m171.i(46050);
        m171.c(new Supplier() { // from class: boyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m171.j(new dtsc() { // from class: boza
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(1);
        m172.b("conversations.rcs_session_allows_revocation");
        m172.i(48040);
        m172.c(new Supplier() { // from class: bozc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m172.j(new dtsc() { // from class: bozd
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(2);
        m173.b("conversations.rcs_group_capabilities");
        m173.i(49020);
        m173.c(new Supplier() { // from class: boze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m173.j(new dtsc() { // from class: bozf
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(1);
        m174.b("conversations.awaiting_reverse_sync");
        m174.i(49060);
        m174.c(new Supplier() { // from class: bozg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m174.j(new dtsc() { // from class: bozh
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(2);
        m175.d(true);
        m175.e(true);
        m175.h(new Supplier() { // from class: bozi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m175.b("conversations.duplicate_of");
        m175.i(58090);
        m175.c(new Supplier() { // from class: bozj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m175.j(new dtsc() { // from class: bozl
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(2);
        m176.d(true);
        m176.e(true);
        m176.h(new Supplier() { // from class: bozn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m176.b("conversations.new_duplicate_of");
        m176.i(59130);
        m176.c(new Supplier() { // from class: bozo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m176.j(new dtsc() { // from class: bozp
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(1);
        m177.b("conversations.error_state");
        m177.i(58140);
        m177.c(new Supplier() { // from class: bozq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m177.j(new dtsc() { // from class: bozr
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(1);
        m178.b("conversations.cms_life_cycle");
        m178.i(58210);
        m178.c(new Supplier() { // from class: bozs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m178.j(new dtsc() { // from class: bozt
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(4);
        m179.b("conversations.rcs_group_self_msisdn");
        m179.i(58540);
        m179.c(new Supplier() { // from class: bozu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m179.j(new dtsc() { // from class: bozv
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(2);
        m180.b("conversations.recipient_offline_timestamp_ms");
        m180.i(58750);
        m180.c(new Supplier() { // from class: bozz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m180.j(new dtsc() { // from class: bpaa
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(2);
        m181.b("conversations.rcs_group_last_sync_timestamp");
        m181.i(58910);
        m181.c(new Supplier() { // from class: bpab
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m181.j(new dtsc() { // from class: bpac
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(1);
        m182.b("conversations.has_been_e2ee");
        m182.i(59210);
        m182.c(new Supplier() { // from class: bpad
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m182.j(new dtsc() { // from class: bpae
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(1);
        m183.b("conversations.marked_as_unread");
        m183.i(59220);
        m183.c(new Supplier() { // from class: bpaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m183.j(new dtsc() { // from class: bpag
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(5);
        m184.b("conversations.custom_theme");
        m184.i(59820);
        m184.c(new Supplier() { // from class: bpah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m184.j(new dtsc() { // from class: bpai
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(2);
        m185.b("conversations.mms_group_upgrade_status");
        m185.i(60050);
        m185.c(new Supplier() { // from class: bpal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m185.j(new dtsc() { // from class: bpam
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(2);
        m186.b("conversations.mms_group_upgrade_retries");
        m186.i(60050);
        m186.c(new Supplier() { // from class: bpan
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m186.j(new dtsc() { // from class: bpao
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(2);
        m187.b("conversations.encryption_protocol");
        m187.i(60180);
        m187.c(new Supplier() { // from class: bpap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m187.j(new dtsc() { // from class: bpaq
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(4);
        m188.b("conversations.encryption_id");
        m188.i(60210);
        m188.c(new Supplier() { // from class: bpar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m188.j(new dtsc() { // from class: bpas
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(4);
        m189.l(true);
        m189.d(true);
        m189.b("conversations.cms_correlation_id");
        m189.f(true);
        m189.i(60250);
        m189.c(new Supplier() { // from class: bpat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m189.j(new dtsc() { // from class: bpav
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(4);
        m190.b("conversations.rcs_group_icon_url");
        m190.i(60590);
        m190.c(new Supplier() { // from class: bpax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m190.j(new dtsc() { // from class: bpay
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(2);
        m191.b("conversations.unread_count");
        m191.i(60740);
        m191.c(new Supplier() { // from class: bpaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpgu.a();
            }
        });
        m191.j(new dtsc() { // from class: bpba
        });
        m191.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().P().a());
    }
}
