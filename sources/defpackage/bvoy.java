package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvoy extends dtup {
    public static final String[] a = {"participants_audit_log._id", "participants_audit_log.operation_datetime", "participants_audit_log.operation_type", "participants_audit_log.participant_id", "participants_audit_log.my_identity_token", "participants_audit_log.my_identity_token_foreign_key", "participants_audit_log.sub_id", "participants_audit_log.sim_slot_id", "participants_audit_log.normalized_destination", "participants_audit_log.send_destination", "participants_audit_log.display_destination", "participants_audit_log.comparable_destination", "participants_audit_log.country_code", "participants_audit_log.recipient_id", "participants_audit_log.recipient_canonical_address", "participants_audit_log.full_name", "participants_audit_log.first_name", "participants_audit_log.profile_photo_uri", "participants_audit_log.contact_photo_uri", "participants_audit_log.contact_id", "participants_audit_log.lookup_key", "participants_audit_log.color_palette_index", "participants_audit_log.color_type", "participants_audit_log.extended_color", "participants_audit_log.blocked", "participants_audit_log.subscription_name", "participants_audit_log.subscription_color", "participants_audit_log.contact_destination", "participants_audit_log.participant_type", "participants_audit_log.video_reachability", "participants_audit_log.alias", "participants_audit_log.is_spam", "participants_audit_log.is_spam_source", "participants_audit_log.cms_id", "participants_audit_log.latest_verification_status", "participants_audit_log.profile_photo_blob_id", "participants_audit_log.profile_photo_encryption_key", "participants_audit_log.directory_id", "participants_audit_log.is_check_constraint_enabled_via_phenotype", "participants_audit_log.is_valid_phone_number_data", "participants_audit_log.duplicate_of", "participants_audit_log.cms_life_cycle", "participants_audit_log.norm_ui_status", "participants_audit_log.last_modified_by_key", "participants_audit_log.name_source", "participants_audit_log.photo_source", "participants_audit_log.profile_photo_user_preference", "participants_audit_log.contact_metadata", "participants_audit_log.is_enterprise_contact"};
    public static final enhk b;
    public static final bvmq c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("participants_audit_log.my_identity_token", 59930);
        enhdVar.k("participants_audit_log.my_identity_token_foreign_key", 60160);
        enhdVar.k("participants_audit_log.contact_photo_uri", 59850);
        enhdVar.k("participants_audit_log.last_modified_by_key", 59440);
        enhdVar.k("participants_audit_log.name_source", 59550);
        enhdVar.k("participants_audit_log.photo_source", 59550);
        enhdVar.k("participants_audit_log.profile_photo_user_preference", 60060);
        enhdVar.k("participants_audit_log.contact_metadata", 60070);
        enhdVar.k("participants_audit_log.is_enterprise_contact", 60640);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("my_identity_token_foreign_key", "index_participants_audit_log_my_identity_token_foreign_key");
        enhdVar2.c();
        c = new bvmq();
        d = new int[]{59440, 59550, 59850, 59930, 60060, 60070, 60160, 60640};
        e = new int[]{59380};
    }

    public static final bvov a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("participants_audit_log._id");
            engrVar.h("participants_audit_log.operation_datetime");
            engrVar.h("participants_audit_log.operation_type");
            engrVar.h("participants_audit_log.participant_id");
            if (c2.intValue() >= 59930) {
                engrVar.h("participants_audit_log.my_identity_token");
            }
            if (c2.intValue() >= 60160) {
                engrVar.h("participants_audit_log.my_identity_token_foreign_key");
            }
            engrVar.h("participants_audit_log.sub_id");
            engrVar.h("participants_audit_log.sim_slot_id");
            engrVar.h("participants_audit_log.normalized_destination");
            engrVar.h("participants_audit_log.send_destination");
            engrVar.h("participants_audit_log.display_destination");
            engrVar.h("participants_audit_log.comparable_destination");
            engrVar.h("participants_audit_log.country_code");
            engrVar.h("participants_audit_log.recipient_id");
            engrVar.h("participants_audit_log.recipient_canonical_address");
            engrVar.h("participants_audit_log.full_name");
            engrVar.h("participants_audit_log.first_name");
            engrVar.h("participants_audit_log.profile_photo_uri");
            if (c2.intValue() >= 59850) {
                engrVar.h("participants_audit_log.contact_photo_uri");
            }
            engrVar.h("participants_audit_log.contact_id");
            engrVar.h("participants_audit_log.lookup_key");
            engrVar.h("participants_audit_log.color_palette_index");
            engrVar.h("participants_audit_log.color_type");
            engrVar.h("participants_audit_log.extended_color");
            engrVar.h("participants_audit_log.blocked");
            engrVar.h("participants_audit_log.subscription_name");
            engrVar.h("participants_audit_log.subscription_color");
            engrVar.h("participants_audit_log.contact_destination");
            engrVar.h("participants_audit_log.participant_type");
            engrVar.h("participants_audit_log.video_reachability");
            engrVar.h("participants_audit_log.alias");
            engrVar.h("participants_audit_log.is_spam");
            engrVar.h("participants_audit_log.is_spam_source");
            engrVar.h("participants_audit_log.cms_id");
            engrVar.h("participants_audit_log.latest_verification_status");
            engrVar.h("participants_audit_log.profile_photo_blob_id");
            engrVar.h("participants_audit_log.profile_photo_encryption_key");
            engrVar.h("participants_audit_log.directory_id");
            engrVar.h("participants_audit_log.is_check_constraint_enabled_via_phenotype");
            engrVar.h("participants_audit_log.is_valid_phone_number_data");
            engrVar.h("participants_audit_log.duplicate_of");
            engrVar.h("participants_audit_log.cms_life_cycle");
            engrVar.h("participants_audit_log.norm_ui_status");
            if (c2.intValue() >= 59440) {
                engrVar.h("participants_audit_log.last_modified_by_key");
            }
            if (c2.intValue() >= 59550) {
                engrVar.h("participants_audit_log.name_source");
            }
            if (c2.intValue() >= 59550) {
                engrVar.h("participants_audit_log.photo_source");
            }
            if (c2.intValue() >= 60060) {
                engrVar.h("participants_audit_log.profile_photo_user_preference");
            }
            if (c2.intValue() >= 60070) {
                engrVar.h("participants_audit_log.contact_metadata");
            }
            if (c2.intValue() >= 60640) {
                engrVar.h("participants_audit_log.is_enterprise_contact");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bvov(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(f().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation_datetime INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER NOT NULL");
        if (i >= 59930) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("comparable_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("country_code TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("recipient_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("recipient_canonical_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_uri TEXT");
        if (i >= 59850) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_photo_uri TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("video_reachability INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam_source INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_verification_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("directory_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_check_constraint_enabled_via_phenotype INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_valid_phone_number_data INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("duplicate_of INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("norm_ui_status INT");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("name_source INT");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("photo_source INT");
        }
        if (i >= 60060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_photo_user_preference INT");
        }
        if (i >= 60070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_metadata BLOB");
        }
        if (i >= 60640) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_enterprise_contact INT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] e(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_audit_log_my_identity_token_foreign_key");
            arrayList.add("CREATE INDEX index_participants_audit_log_my_identity_token_foreign_key ON participants_audit_log(my_identity_token_foreign_key);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf f() {
        return b().P();
    }
}
