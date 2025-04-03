package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsoo implements fbba {
    public static dtux a() {
        return new dtuf(bsom.d, "conversations", new dtue() { // from class: bsnu
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bsom.a;
                valueOf.getClass();
                switch (i) {
                    case 8500:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN participant_id_list TEXT;");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN source_type INT DEFAULT(0);");
                        return;
                    case 10000:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_session_id INT DEFAULT(-1);");
                        dtveVar.y("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
                        return;
                    case 10006:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN join_state INT DEFAULT(0);");
                        return;
                    case 10007:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN conv_type INT DEFAULT(0);");
                        return;
                    case 10012:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN name_is_automatic INTEGER DEFAULT(1);");
                        return;
                    case 10016:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN send_mode INT DEFAULT(0);");
                        return;
                    case 10018:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN IS_ENTERPRISE INT DEFAULT(0);");
                        return;
                    case 12001:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN has_ea2p_bot_recipient INT DEFAULT(0);");
                        return;
                    case 15000:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN last_interactive_event_timestamp INT DEFAULT(0);");
                        return;
                    case 15010:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN participant_display_destination TEXT;");
                        return;
                    case 23000:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN spam_warning_dismiss_status INT DEFAULT(0);");
                        return;
                    case 26020:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN open_count INT DEFAULT(0);");
                        return;
                    case 28010:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN last_logged_scooby_metadata_timestamp INT DEFAULT(0);");
                        return;
                    case 29020:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN delete_timestamp INT DEFAULT(0);");
                        dtveVar.y("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
                        return;
                    case 29060:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN etouffee_default INT DEFAULT(0);");
                        return;
                    case 32000:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN cms_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
                        return;
                    case 40050:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_group_id TEXT;");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_conference_uri TEXT;");
                        return;
                    case 46050:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 48040:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_session_allows_revocation INT DEFAULT(1);");
                        return;
                    case 49020:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_group_capabilities INTEGER DEFAULT(0);");
                        return;
                    case 49060:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        return;
                    case 53030:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN cms_most_recent_read_message_timestamp_ms INT DEFAULT(0);");
                        return;
                    case 58090:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN normalized_participant_contact_id INT DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN normalized_participant_lookup_key TEXT;");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN participant_comparable_destination TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN normalized_participant_id_list TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN normalized_participant_display_destination TEXT;");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN duplicate_of INTEGER REFERENCES conversations(_id)  ;");
                        return;
                    case 58120:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
                        dtveVar.y("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN tachygram_group_routing_info_token BLOB;");
                        return;
                    case 58140:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN error_state INT;");
                        return;
                    case 58210:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58370:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
                        dtveVar.y("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58390:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
                        dtveVar.y("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
                        return;
                    case 58540:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_group_self_msisdn TEXT;");
                        return;
                    case 58750:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN recipient_offline_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 58910:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_group_last_sync_timestamp INTEGER DEFAULT(-1);");
                        return;
                    case 59130:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ;");
                        return;
                    case 59180:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_duplicate_of");
                        dtveVar.y("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
                        dtveVar.y("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
                        return;
                    case 59210:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN has_been_e2ee INT DEFAULT(0);");
                        return;
                    case 59220:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN marked_as_unread INT DEFAULT(0);");
                        return;
                    case 59260:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
                        dtveVar.y("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
                        return;
                    case 59760:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN subtitle TEXT;");
                        return;
                    case 59810:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN current_my_identity TEXT;");
                        return;
                    case 59820:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN custom_theme BLOB;");
                        return;
                    case 60050:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_status INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_retries INTEGER DEFAULT(0);");
                        return;
                    case 60160:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
                        return;
                    case 60180:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN encryption_protocol INTEGER DEFAULT(0);");
                        return;
                    case 60210:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN encryption_id TEXT;");
                        return;
                    case 60250:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN cms_correlation_id TEXT;");
                        return;
                    case 60310:
                        if (dtub.a(bsom.f()) < 60310) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dtveVar.y("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
                        dtveVar.y("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
                        return;
                    case 60360:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
                        return;
                    case 60590:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN rcs_group_icon_url TEXT;");
                        return;
                    case 60740:
                        dtveVar.y("ALTER TABLE conversations ADD COLUMN unread_count INTEGER;");
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
