package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcjl implements fbba {
    public static dtux a() {
        return new dtuf(bcjh.d, "participants_backup", new dtue() { // from class: bcja
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bcjh.a;
                valueOf.getClass();
                if (i != 0) {
                    if (i != 110) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE participants_backup ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    dtveVar.y("CREATE INDEX index_participants_backup_my_identity_token_foreign_key ON participants_backup(my_identity_token_foreign_key);");
                    return;
                }
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN normalized_destination TEXT;");
                dtveVar.y("CREATE INDEX index_participants_backup_normalized_destination ON participants_backup(normalized_destination);");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN send_destination TEXT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN display_destination TEXT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN first_name TEXT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN full_name TEXT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN is_self INT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN blocked INT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN participant_type INT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN is_spam INT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN is_spam_source INT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN country_code TEXT;");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN color_palette_index INT DEFAULT(-1);");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN color_type INT DEFAULT(0);");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN extended_color INT DEFAULT(0);");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN cms_id TEXT;");
                dtveVar.y("CREATE INDEX index_participants_backup_cms_id ON participants_backup(cms_id);");
                dtveVar.y("ALTER TABLE participants_backup ADD COLUMN cms_life_cycle INT;");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
