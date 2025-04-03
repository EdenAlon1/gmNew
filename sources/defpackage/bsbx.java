package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbx extends dtup {
    public static final String[] a = {"conversation_to_participants_audit_log._id", "conversation_to_participants_audit_log.operation_datetime", "conversation_to_participants_audit_log.operation_type", "conversation_to_participants_audit_log.conversation_id", "conversation_to_participants_audit_log.participant_id", "conversation_to_participants_audit_log.rcs_group_join_status", "conversation_to_participants_audit_log.last_modified_by_key"};
    public static final bsbi b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bsbi();
        c = new int[]{59640};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
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
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_by_key TEXT");
        sb.insert(0, "CREATE TABLE conversation_to_participants_audit_log (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
