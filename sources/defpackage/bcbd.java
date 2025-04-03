package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcbd implements fbba {
    public static dtux a() {
        return new dtuf(bcba.d, "messages_backup", new dtue() { // from class: bcaq
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bcba.a;
                valueOf.getClass();
                if (i != 0) {
                    if (i == 50) {
                        dtveVar.y("ALTER TABLE messages_backup ADD COLUMN custom_headers BLOB;");
                        dtveVar.y("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
                        return;
                    }
                    if (i == 80) {
                        dtveVar.y("ALTER TABLE messages_backup ADD COLUMN sender_send_destination TEXT;");
                        dtveVar.y("ALTER TABLE messages_backup ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                        return;
                    } else if (i == 110) {
                        dtveVar.y("ALTER TABLE messages_backup ADD COLUMN my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
                        return;
                    } else {
                        if (i != 120) {
                            return;
                        }
                        dtveVar.y("ALTER TABLE messages_backup ADD COLUMN message_persistence_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                        return;
                    }
                }
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN message_status INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN seen INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN read INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ;");
                dtveVar.y("CREATE INDEX index_messages_backup_conversation_id ON messages_backup(conversation_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN sender_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ;");
                dtveVar.y("CREATE INDEX index_messages_backup_sender_participant_id ON messages_backup(sender_participant_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN self_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ;");
                dtveVar.y("CREATE INDEX index_messages_backup_self_participant_id ON messages_backup(self_participant_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN mms_subject TEXT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN received_timestamp INT;");
                dtveVar.y("CREATE INDEX index_messages_backup_received_timestamp ON messages_backup(received_timestamp);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN sent_timestamp INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN protocol INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN message_priority INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN rcs_encryption_status INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN cloud_sync_id TEXT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN correlation_id TEXT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN sms_error_code INT DEFAULT(-1);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN sms_error_desc_map_name TEXT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN is_hidden INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN rcs_message_id TEXT;");
                dtveVar.y("CREATE INDEX index_messages_backup_rcs_message_id ON messages_backup(rcs_message_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN cms_id TEXT;");
                dtveVar.y("CREATE INDEX index_messages_backup_cms_id ON messages_backup(cms_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN cms_life_cycle INT;");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN cms_correlation_id TEXT;");
                dtveVar.y("CREATE INDEX index_messages_backup_cms_correlation_id ON messages_backup(cms_correlation_id);");
                dtveVar.y("ALTER TABLE messages_backup ADD COLUMN cms_last_mod_seq INTEGER;");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
