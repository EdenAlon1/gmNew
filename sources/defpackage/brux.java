package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brux extends dtup {
    public static final String[] a = {"conversation_participants_audit_log._id", "conversation_participants_audit_log.operation_datetime", "conversation_participants_audit_log.operation_type", "conversation_participants_audit_log.conversation_participants_id", "conversation_participants_audit_log.conversation_id", "conversation_participants_audit_log.participant_id", "conversation_participants_audit_log.is_normalized", "conversation_participants_audit_log.rcs_group_join_status", "conversation_participants_audit_log.last_modified_by_key"};
    public static final brue b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_participants_audit_log.last_modified_by_key", 59440);
        enhdVar.c();
        new enhd().c();
        b = new brue();
        c = new int[]{59370, 59440};
    }

    public static final bruu a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_participants_audit_log._id");
            engrVar.h("conversation_participants_audit_log.operation_datetime");
            engrVar.h("conversation_participants_audit_log.operation_type");
            engrVar.h("conversation_participants_audit_log.conversation_participants_id");
            engrVar.h("conversation_participants_audit_log.conversation_id");
            engrVar.h("conversation_participants_audit_log.participant_id");
            engrVar.h("conversation_participants_audit_log.is_normalized");
            engrVar.h("conversation_participants_audit_log.rcs_group_join_status");
            if (c2.intValue() >= 59440) {
                engrVar.h("conversation_participants_audit_log.last_modified_by_key");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bruu(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
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
        sb.append("conversation_participants_id INTEGER NOT NULL");
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
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, "CREATE TABLE conversation_participants_audit_log (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
