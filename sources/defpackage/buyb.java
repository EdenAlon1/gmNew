package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buyb implements fbba {
    public static dtux a() {
        return new dtuf(MessagesTable.d, "messages", new dtue() { // from class: buxi
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = MessagesTable.a;
                valueOf.getClass();
                switch (i) {
                    case 8500:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN cloud_sync_id TEXT;");
                        return;
                    case 9000:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN sms_error_code INT DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN sms_error_desc_map_name TEXT;");
                        return;
                    case 9010:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN correlation_id TEXT;");
                        return;
                    case 9030:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN mms_retrieve_text TEXT;");
                        return;
                    case 10000:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_message_id STRING;");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_rcs_message_id");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_rcs_message_id ON messages(rcs_message_id, seen);");
                        return;
                    case 10002:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_remote_instance STRING;");
                        return;
                    case 10004:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_file_transfer_session_id INT DEFAULT(-1);");
                        return;
                    case 13020:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN message_report_status INT DEFAULT(0);");
                        return;
                    case 17030:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN queue_insert_timestamp INT DEFAULT(0);");
                        return;
                    case 19020:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN web_id TEXT DEFAULT('');");
                        return;
                    case 22080:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_ui_sort");
                        dtveVar.y("CREATE INDEX index_messages_ui_sort ON messages(conversation_id, received_timestamp);");
                        return;
                    case 24090:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_read_0");
                        dtveVar.y("CREATE INDEX IF NOT EXISTS index_messages_read_0 ON messages(read) WHERE read == 0;");
                        return;
                    case 25010:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_web_id");
                        dtveVar.y("CREATE INDEX IF NOT EXISTS index_messages_web_id ON messages(web_id);");
                        return;
                    case 29060:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN etouffee_status INT DEFAULT(0);");
                        return;
                    case 29090:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN verification_status INT DEFAULT(0);");
                        return;
                    case 29100:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN usage_stats_logging_id INT DEFAULT(0);");
                        return;
                    case 30010:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN is_hidden INT DEFAULT(0);");
                        return;
                    case 31010:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN cms_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
                        return;
                    case 32050:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_verification_status");
                        dtveVar.y("CREATE INDEX index_messages_verification_status ON messages(verification_status) WHERE verification_status <> 0;");
                        return;
                    case 35030:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN send_counter INT DEFAULT(1);");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN original_rcs_message_id TEXT;");
                        return;
                    case 36000:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_seen_0");
                        dtveVar.y("CREATE INDEX IF NOT EXISTS index_messages_seen_0 ON messages(seen) WHERE seen == 0;");
                        return;
                    case 37020:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_mime_type TEXT;");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_content BLOB;");
                        return;
                    case 37030:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN report_attempt_acounter INT DEFAULT(0);");
                        return;
                    case 37040:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN cms_last_mod_seq INTEGER;");
                        return;
                    case 39000:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_ui_status INT DEFAULT(0);");
                        return;
                    case 41040:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_message_id_with_text_type TEXT;");
                        dtveVar.y("DROP INDEX IF EXISTS rcs_message_id_and_seen_index");
                        dtveVar.y("CREATE UNIQUE INDEX rcs_message_id_and_seen_index ON messages(rcs_message_id_with_text_type, seen);");
                        return;
                    case 45020:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN custom_headers BLOB;");
                        return;
                    case 46010:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN cms_correlation_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_cms_correlation_id ON messages(cms_correlation_id);");
                        return;
                    case 48030:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN group_private_participant INT REFERENCES participants(_id) ON DELETE CASCADE ;");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN original_message_id INT REFERENCES messages(_id) ON DELETE CASCADE ;");
                        return;
                    case 49060:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN old_sms_message_uri TEXT;");
                        return;
                    case 54040:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN sender_send_destination TEXT;");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN receiving_network_country TEXT;");
                        return;
                    case 54070:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        dtveVar.y("CREATE INDEX index_messages_is_hidden_0 ON messages(is_hidden) WHERE is_hidden = 0;");
                        return;
                    case 56000:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN draft_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_draft_id ON messages(draft_id) WHERE draft_id NOT NULL;");
                        return;
                    case 58040:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN result_code INT DEFAULT(-2);");
                        return;
                    case 58060:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_sms_message_uri");
                        dtveVar.y("CREATE INDEX index_messages_sms_message_uri ON messages(sms_message_uri);");
                        return;
                    case 58210:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58230:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN auto_retry_counter INT DEFAULT(0);");
                        return;
                    case 58280:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN can_revoke_before_delivered_with_rcs INTEGER DEFAULT(0);");
                        return;
                    case 58360:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_sender_id");
                        dtveVar.y("CREATE INDEX index_messages_sender_id ON messages(sender_id);");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_sent_timestamp");
                        dtveVar.y("CREATE INDEX index_messages_sent_timestamp ON messages(sent_timestamp);");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_received_timestamp");
                        dtveVar.y("CREATE INDEX index_messages_received_timestamp ON messages(received_timestamp);");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_cloud_sync_id");
                        dtveVar.y("CREATE INDEX index_messages_cloud_sync_id ON messages(cloud_sync_id);");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_is_hidden");
                        dtveVar.y("CREATE INDEX index_messages_is_hidden ON messages(is_hidden);");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_awaiting_reverse_sync");
                        dtveVar.y("CREATE INDEX index_messages_awaiting_reverse_sync ON messages(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58680:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN trace_id BLOB;");
                        return;
                    case 58710:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN fallback_reason INT DEFAULT(0);");
                        return;
                    case 58720:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN outgoing_delivery_report_status INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE messages ADD COLUMN outgoing_read_report_status INT DEFAULT(0);");
                        return;
                    case 58740:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_original_message_id");
                        dtveVar.y("CREATE INDEX index_messages_original_message_id ON messages(original_message_id);");
                        return;
                    case 59160:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_self_id");
                        dtveVar.y("CREATE INDEX index_messages_self_id ON messages(self_id) WHERE self_id NOT NULL;");
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_group_private_participant");
                        dtveVar.y("CREATE INDEX index_messages_group_private_participant ON messages(group_private_participant) WHERE group_private_participant NOT NULL;");
                        return;
                    case 59310:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN xms_transport INT DEFAULT(0);");
                        return;
                    case 59340:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                        return;
                    case 59430:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN message_original_protocol INT DEFAULT(-1);");
                        return;
                    case 59490:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN satellite_datagram_id TEXT;");
                        return;
                    case 59510:
                        if (dtub.a(MessagesTable.f()) < 59510) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_satellite_datagram_id");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_satellite_datagram_id ON messages(satellite_datagram_id);");
                        return;
                    case 59530:
                        dtveVar.y("DROP INDEX IF EXISTS index_messages_original_rcs_message_id");
                        dtveVar.y("CREATE INDEX index_messages_original_rcs_message_id ON messages(original_rcs_message_id) WHERE original_rcs_message_id NOT NULL;");
                        return;
                    case 59810:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN my_identity TEXT;");
                        dtveVar.y("CREATE INDEX index_messages_my_identity ON messages(my_identity);");
                        return;
                    case 59890:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN rcs_expiry INT DEFAULT(0);");
                        dtveVar.y("CREATE INDEX index_messages_rcs_expiry ON messages(rcs_expiry) WHERE rcs_expiry NOT NULL;");
                        return;
                    case 60160:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_messages_my_identity_foreign_key ON messages(my_identity_foreign_key);");
                        return;
                    case 60190:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN encryption_protocol INT DEFAULT(0);");
                        return;
                    case 60370:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN message_persistence_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_message_persistence_id ON messages(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                        return;
                    case 60550:
                        dtveVar.y("DROP INDEX IF EXISTS index_unread_unhidden_messages_with_conversation_and_status");
                        dtveVar.y("CREATE INDEX index_unread_unhidden_messages_with_conversation_and_status ON messages(conversation_id, message_status) WHERE read == 0 AND is_hidden == 0;");
                        return;
                    case 60650:
                        dtveVar.y("DROP INDEX IF EXISTS index_unsent_rcs_report");
                        dtveVar.y("CREATE INDEX index_unsent_rcs_report ON messages(_id) WHERE messages.message_protocol = 3 AND ((messages.outgoing_delivery_report_status = 0 AND messages.message_report_status = 1) OR (messages.outgoing_read_report_status = 0 AND messages.message_report_status = 2) OR messages.outgoing_delivery_report_status = 2 OR messages.outgoing_read_report_status = 2) AND messages.report_attempt_acounter <= 10;");
                        return;
                    case 60750:
                        dtveVar.y("ALTER TABLE messages ADD COLUMN mute_priority INT DEFAULT(2);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
