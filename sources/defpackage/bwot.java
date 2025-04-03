package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwot implements fbba {
    public static dtux a() {
        return new dtuf(ProfilesTable.d, "profiles_table", new dtue() { // from class: bwok
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ProfilesTable.a;
                valueOf.getClass();
                switch (i) {
                    case 59710:
                        ProfilesTable.e(dtveVar, 59710);
                        break;
                    case 59730:
                        dtveVar.y("DROP INDEX IF EXISTS index_profiles_table_participant_id");
                        dtveVar.y("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
                        break;
                    case 59940:
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN belongs_to_self_gaia INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN gaia_update_timestamp INT DEFAULT(0);");
                        break;
                    case 60170:
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN person_id TEXT;");
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN profile_access_token TEXT;");
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time TEXT;");
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN has_shared_access_token_with_user INTEGER DEFAULT(0);");
                        break;
                    case 60200:
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN sending_self_profile_interaction_state INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time_from_rcs TEXT;");
                        break;
                    case 60340:
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN self_profile_sharing_metadata BLOB;");
                        break;
                    case 60400:
                        dtveVar.y("ALTER TABLE profiles_table ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
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
