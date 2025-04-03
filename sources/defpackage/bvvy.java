package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvy implements fbba {
    public static dtux a() {
        return new dtuf(ParticipantsTable.d, "participants", new dtue() { // from class: bvvg
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ParticipantsTable.a;
                valueOf.getClass();
                switch (i) {
                    case 1000:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN color_type INT DEFAULT(0);");
                        return;
                    case 2000:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN sim_slot_id INT DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN subscription_name TEXT;");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN subscription_color INT DEFAULT(0);");
                        return;
                    case 4000:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN contact_destination TEXT;");
                        return;
                    case 10027:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN extended_color INT DEFAULT(0);");
                        return;
                    case 12001:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN participant_type INT DEFAULT(0);");
                        return;
                    case 13050:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN video_reachability INT DEFAULT(0);");
                        return;
                    case 20060:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN alias TEXT;");
                        return;
                    case 24060:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_spam INT DEFAULT(0);");
                        return;
                    case 29030:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_rcs_available INT DEFAULT(0);");
                        return;
                    case 30000:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_spam_source INT DEFAULT(0);");
                        return;
                    case 31020:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN cms_id TEXT;");
                        dtveVar.y("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
                        return;
                    case 31030:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN latest_verification_status INT DEFAULT(0);");
                        return;
                    case 33000:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN profile_photo_blob_id TEXT;");
                        return;
                    case 33060:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN profile_photo_encryption_key BLOB;");
                        return;
                    case 35010:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN directory_id INT DEFAULT(-1);");
                        return;
                    case 54040:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN comparable_destination TEXT;");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN country_code TEXT;");
                        return;
                    case 55010:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_check_constraint_enabled_via_phenotype INT;");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_valid_phone_number_data INT DEFAULT(1);");
                        return;
                    case 58090:
                        if (dtub.a(ParticipantsTable.g()) < 58090) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dtveVar.y("DROP INDEX IF EXISTS index_participants_comparable_destination");
                        dtveVar.y("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN recipient_id INTEGER;");
                        dtveVar.y("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN recipient_canonical_address TEXT;");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN duplicate_of INTEGER REFERENCES participants(_id)  ;");
                        return;
                    case 58190:
                        dtveVar.y("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
                        dtveVar.y("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
                        return;
                    case 58200:
                        dtveVar.y("DROP INDEX IF EXISTS index_participants_blocked_is_one");
                        dtveVar.y("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
                        return;
                    case 58210:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58620:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN norm_ui_status INT DEFAULT(1);");
                        return;
                    case 59160:
                        dtveVar.y("DROP INDEX IF EXISTS index_participants_duplicate_of");
                        dtveVar.y("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
                        return;
                    case 59300:
                        dtveVar.y("DROP INDEX IF EXISTS index_participants_sub_id");
                        dtveVar.y("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
                        return;
                    case 59440:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN last_modified_by_key TEXT;");
                        return;
                    case 59550:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN name_source INT DEFAULT(1);");
                        dtveVar.y("ALTER TABLE participants ADD COLUMN photo_source INT DEFAULT(1);");
                        return;
                    case 59850:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN contact_photo_uri TEXT;");
                        return;
                    case 59930:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN my_identity_token TEXT;");
                        dtveVar.y("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
                        return;
                    case 60060:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN profile_photo_user_preference INT DEFAULT(1);");
                        return;
                    case 60070:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN contact_metadata BLOB;");
                        return;
                    case 60160:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
                        return;
                    case 60640:
                        dtveVar.y("ALTER TABLE participants ADD COLUMN is_enterprise_contact INT;");
                        dtveVar.y("CREATE INDEX index_participants_is_enterprise_contact ON participants(is_enterprise_contact);");
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
