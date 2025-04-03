package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbov extends dtup {
    public static final String[] a = {"conversations_backup._id", "conversations_backup.current_my_identity", "conversations_backup.snippet_text", "conversations_backup.archive_status", "conversations_backup.most_recent_timestamp_ms", "conversations_backup.subject", "conversations_backup.name", "conversations_backup.name_is_automatic", "conversations_backup.has_rbm_participant", "conversations_backup.rcs_group_self_msisdn", "conversations_backup.rcs_group_id", "conversations_backup.rcs_conference_uri", "conversations_backup.rcs_group_capabilities", "conversations_backup.error_state", "conversations_backup.rcs_subject_change_timestamp_ms", "conversations_backup.join_state", "conversations_backup.conversation_type", "conversations_backup.send_mode", "conversations_backup.cms_id", "conversations_backup.cms_life_cycle"};
    public static final enhk b;
    public static final bbnn c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations_backup.current_my_identity", 110);
        enhdVar.k("conversations_backup.snippet_text", 0);
        enhdVar.k("conversations_backup.archive_status", 0);
        enhdVar.k("conversations_backup.most_recent_timestamp_ms", 0);
        enhdVar.k("conversations_backup.subject", 0);
        enhdVar.k("conversations_backup.name", 0);
        enhdVar.k("conversations_backup.name_is_automatic", 0);
        enhdVar.k("conversations_backup.has_rbm_participant", 0);
        enhdVar.k("conversations_backup.rcs_group_self_msisdn", 0);
        enhdVar.k("conversations_backup.rcs_group_id", 0);
        enhdVar.k("conversations_backup.rcs_conference_uri", 0);
        enhdVar.k("conversations_backup.rcs_group_capabilities", 0);
        enhdVar.k("conversations_backup.error_state", 0);
        enhdVar.k("conversations_backup.rcs_subject_change_timestamp_ms", 0);
        enhdVar.k("conversations_backup.join_state", 0);
        enhdVar.k("conversations_backup.conversation_type", 0);
        enhdVar.k("conversations_backup.send_mode", 0);
        enhdVar.k("conversations_backup.cms_id", 0);
        enhdVar.k("conversations_backup.cms_life_cycle", 0);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("current_my_identity", "index_conversations_backup_current_my_identity");
        enhdVar2.k("rcs_group_id", "index_conversations_backup_rcs_group_id");
        enhdVar2.k("cms_id", "index_conversations_backup_cms_id");
        enhdVar2.c();
        c = new bbnn();
        d = new int[]{0};
        e = new int[]{110};
    }

    public static final bbos a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations_backup._id");
            if (c2.intValue() >= 110) {
                engrVar.h("conversations_backup.current_my_identity");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.snippet_text");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.archive_status");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.most_recent_timestamp_ms");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.subject");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.name");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.name_is_automatic");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.has_rbm_participant");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.rcs_group_self_msisdn");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.rcs_group_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.rcs_conference_uri");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.rcs_group_capabilities");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.error_state");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.rcs_subject_change_timestamp_ms");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.join_state");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.conversation_type");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.send_mode");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.cms_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversations_backup.cms_life_cycle");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bbos(strArr);
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
        sb.append("current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("most_recent_timestamp_ms INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_rbm_participant INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_self_msisdn TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("error_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
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
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_rcs_group_id");
        arrayList.add("CREATE INDEX index_conversations_backup_rcs_group_id ON conversations_backup(rcs_group_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_cms_id");
        arrayList.add("CREATE INDEX index_conversations_backup_cms_id ON conversations_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_current_my_identity");
        arrayList.add("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
