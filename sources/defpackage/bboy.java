package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bboy implements fbba {
    public static dtux a() {
        return new dtuf(bbov.d, "conversations_backup", new dtue() { // from class: bbon
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bbov.a;
                valueOf.getClass();
                if (i != 0) {
                    if (i != 110) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    dtveVar.y("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
                    return;
                }
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN snippet_text TEXT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN archive_status INT DEFAULT(0);");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN most_recent_timestamp_ms INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN subject TEXT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN name TEXT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN name_is_automatic INTEGER DEFAULT(1);");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN has_rbm_participant INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN rcs_group_self_msisdn TEXT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN rcs_group_id TEXT;");
                dtveVar.y("CREATE INDEX index_conversations_backup_rcs_group_id ON conversations_backup(rcs_group_id);");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN rcs_conference_uri TEXT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN rcs_group_capabilities INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN error_state INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN rcs_subject_change_timestamp_ms INTEGER;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN join_state INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN conversation_type INT;");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN send_mode INT DEFAULT(0);");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN cms_id TEXT;");
                dtveVar.y("CREATE INDEX index_conversations_backup_cms_id ON conversations_backup(cms_id);");
                dtveVar.y("ALTER TABLE conversations_backup ADD COLUMN cms_life_cycle INT;");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
