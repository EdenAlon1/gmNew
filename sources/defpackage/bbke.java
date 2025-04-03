package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbke extends dtup {
    public static final String[] a = {"conversation_participants_backup._id", "conversation_participants_backup.conversation_id", "conversation_participants_backup.participant_id", "conversation_participants_backup.is_normalized", "conversation_participants_backup.rcs_group_join_status", "conversation_participants_backup.is_c2p_only"};
    public static final enhk b;
    public static final bbjk c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_participants_backup.is_normalized", 0);
        enhdVar.k("conversation_participants_backup.rcs_group_join_status", 0);
        enhdVar.k("conversation_participants_backup.is_c2p_only", 70);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_conversation_participants_backup_conversation_id");
        enhdVar2.k("participant_id", "index_conversation_participants_backup_participant_id");
        enhdVar2.k("is_c2p_only", "index_conversation_participants_backup_is_c2p_only");
        enhdVar2.c();
        c = new bbjk();
        d = new int[]{0, 70};
        e = new int[]{90};
    }

    public static final bbkb a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_participants_backup._id");
            engrVar.h("conversation_participants_backup.conversation_id");
            engrVar.h("conversation_participants_backup.participant_id");
            if (c2.intValue() >= 0) {
                engrVar.h("conversation_participants_backup.is_normalized");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("conversation_participants_backup.rcs_group_join_status");
            }
            if (c2.intValue() >= 70) {
                engrVar.h("conversation_participants_backup.is_c2p_only");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bbkb(strArr);
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
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_c2p_only INT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_conversation_id ON conversation_participants_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_participant_id ON conversation_participants_backup(participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_is_c2p_only");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
