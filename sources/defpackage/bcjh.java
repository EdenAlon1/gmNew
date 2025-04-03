package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcjh extends dtup {
    public static final String[] a = {"participants_backup._id", "participants_backup.my_identity_token_foreign_key", "participants_backup.normalized_destination", "participants_backup.send_destination", "participants_backup.display_destination", "participants_backup.first_name", "participants_backup.full_name", "participants_backup.is_self", "participants_backup.blocked", "participants_backup.participant_type", "participants_backup.is_spam", "participants_backup.is_spam_source", "participants_backup.country_code", "participants_backup.color_palette_index", "participants_backup.color_type", "participants_backup.extended_color", "participants_backup.cms_id", "participants_backup.cms_life_cycle"};
    public static final enhk b;
    public static final bcib c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("participants_backup.my_identity_token_foreign_key", 110);
        enhdVar.k("participants_backup.normalized_destination", 0);
        enhdVar.k("participants_backup.send_destination", 0);
        enhdVar.k("participants_backup.display_destination", 0);
        enhdVar.k("participants_backup.first_name", 0);
        enhdVar.k("participants_backup.full_name", 0);
        enhdVar.k("participants_backup.is_self", 0);
        enhdVar.k("participants_backup.blocked", 0);
        enhdVar.k("participants_backup.participant_type", 0);
        enhdVar.k("participants_backup.is_spam", 0);
        enhdVar.k("participants_backup.is_spam_source", 0);
        enhdVar.k("participants_backup.country_code", 0);
        enhdVar.k("participants_backup.color_palette_index", 0);
        enhdVar.k("participants_backup.color_type", 0);
        enhdVar.k("participants_backup.extended_color", 0);
        enhdVar.k("participants_backup.cms_id", 0);
        enhdVar.k("participants_backup.cms_life_cycle", 0);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("my_identity_token_foreign_key", "index_participants_backup_my_identity_token_foreign_key");
        enhdVar2.k("normalized_destination", "index_participants_backup_normalized_destination");
        enhdVar2.k("cms_id", "index_participants_backup_cms_id");
        enhdVar2.c();
        c = new bcib();
        d = new int[]{0};
        e = new int[]{110};
    }

    public static final bcje a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("participants_backup._id");
            if (c2.intValue() >= 110) {
                engrVar.h("participants_backup.my_identity_token_foreign_key");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.normalized_destination");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.send_destination");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.display_destination");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.first_name");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.full_name");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.is_self");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.blocked");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.participant_type");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.is_spam");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.is_spam_source");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.country_code");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.color_palette_index");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.color_type");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.extended_color");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.cms_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("participants_backup.cms_life_cycle");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bcje(strArr);
    }

    public static dtve b() {
        return dtub.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dtzf d() {
        return b().P();
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
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
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_self INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT");
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
        sb.append("country_code TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_normalized_destination");
        arrayList.add("CREATE INDEX index_participants_backup_normalized_destination ON participants_backup(normalized_destination);");
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_cms_id");
        arrayList.add("CREATE INDEX index_participants_backup_cms_id ON participants_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_my_identity_token_foreign_key");
        arrayList.add("CREATE INDEX index_participants_backup_my_identity_token_foreign_key ON participants_backup(my_identity_token_foreign_key);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
