package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvpa implements fbba {
    public static dtux a() {
        return new dtuf(bvoy.d, "participants_audit_log", new dtue() { // from class: bvor
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bvoy.a;
                valueOf.getClass();
                switch (i) {
                    case 59440:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                        break;
                    case 59550:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN name_source INT;");
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN photo_source INT;");
                        break;
                    case 59850:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN contact_photo_uri TEXT;");
                        break;
                    case 59930:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token TEXT;");
                        break;
                    case 60060:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN profile_photo_user_preference INT;");
                        break;
                    case 60070:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN contact_metadata BLOB;");
                        break;
                    case 60160:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_participants_audit_log_my_identity_token_foreign_key ON participants_audit_log(my_identity_token_foreign_key);");
                        break;
                    case 60640:
                        dtveVar.y("ALTER TABLE participants_audit_log ADD COLUMN is_enterprise_contact INT;");
                        break;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
