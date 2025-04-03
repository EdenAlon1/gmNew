package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgw extends dtup {
    public static final String[] a = {"pending_incoming_message_rcs_table.rcs_message_id", "pending_incoming_message_rcs_table.remote_user_id", "pending_incoming_message_rcs_table.self_identity", "pending_incoming_message_rcs_table.raw_text", "pending_incoming_message_rcs_table.content_type", "pending_incoming_message_rcs_table.remote_instance", "pending_incoming_message_rcs_table.sent_timestamp", "pending_incoming_message_rcs_table.received_timestamp", "pending_incoming_message_rcs_table.sip_alias", "pending_incoming_message_rcs_table.spam_verdict", "pending_incoming_message_rcs_table.session_id", "pending_incoming_message_rcs_table.message_status", "pending_incoming_message_rcs_table.custom_headers", "pending_incoming_message_rcs_table.is_group", "pending_incoming_message_rcs_table.conversation_id", "pending_incoming_message_rcs_table.conference_uri", "pending_incoming_message_rcs_table.is_delivery_report_requested", "pending_incoming_message_rcs_table.is_display_report_requested", "pending_incoming_message_rcs_table.is_negative_delivery_report_requested"};
    public static final enhk b;
    public static final bwfn c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("pending_incoming_message_rcs_table.self_identity", 59410);
        enhdVar.k("pending_incoming_message_rcs_table.custom_headers", 44020);
        enhdVar.k("pending_incoming_message_rcs_table.is_group", 58820);
        enhdVar.k("pending_incoming_message_rcs_table.conversation_id", 58820);
        enhdVar.k("pending_incoming_message_rcs_table.conference_uri", 58820);
        enhdVar.k("pending_incoming_message_rcs_table.is_delivery_report_requested", 58870);
        enhdVar.k("pending_incoming_message_rcs_table.is_display_report_requested", 58870);
        enhdVar.k("pending_incoming_message_rcs_table.is_negative_delivery_report_requested", 60560);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("remote_user_id", "index_pending_incoming_message_rcs_table_remote_user_id");
        enhdVar2.k("received_timestamp", "index_pending_incoming_message_rcs_table_received_timestamp");
        enhdVar2.c();
        c = new bwfn();
        d = new int[]{39050, 44020, 58820, 58870, 59270, 59410, 60560};
    }

    public static final bwgr a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("pending_incoming_message_rcs_table.rcs_message_id");
            engrVar.h("pending_incoming_message_rcs_table.remote_user_id");
            if (c2.intValue() >= 59410) {
                engrVar.h("pending_incoming_message_rcs_table.self_identity");
            }
            engrVar.h("pending_incoming_message_rcs_table.raw_text");
            engrVar.h("pending_incoming_message_rcs_table.content_type");
            engrVar.h("pending_incoming_message_rcs_table.remote_instance");
            engrVar.h("pending_incoming_message_rcs_table.sent_timestamp");
            engrVar.h("pending_incoming_message_rcs_table.received_timestamp");
            engrVar.h("pending_incoming_message_rcs_table.sip_alias");
            engrVar.h("pending_incoming_message_rcs_table.spam_verdict");
            engrVar.h("pending_incoming_message_rcs_table.session_id");
            engrVar.h("pending_incoming_message_rcs_table.message_status");
            if (c2.intValue() >= 44020) {
                engrVar.h("pending_incoming_message_rcs_table.custom_headers");
            }
            if (c2.intValue() >= 58820) {
                engrVar.h("pending_incoming_message_rcs_table.is_group");
            }
            if (c2.intValue() >= 58820) {
                engrVar.h("pending_incoming_message_rcs_table.conversation_id");
            }
            if (c2.intValue() >= 58820) {
                engrVar.h("pending_incoming_message_rcs_table.conference_uri");
            }
            if (c2.intValue() >= 58870) {
                engrVar.h("pending_incoming_message_rcs_table.is_delivery_report_requested");
            }
            if (c2.intValue() >= 58870) {
                engrVar.h("pending_incoming_message_rcs_table.is_display_report_requested");
            }
            if (c2.intValue() >= 60560) {
                engrVar.h("pending_incoming_message_rcs_table.is_negative_delivery_report_requested");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwgr(strArr);
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
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT");
        if (i >= 59410) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("self_identity TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("raw_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_instance TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sip_alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("spam_verdict INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("session_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INTEGER");
        if (i >= 44020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_headers BLOB");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_group INTEGER");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id TEXT");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conference_uri TEXT");
        }
        if (i >= 58870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_delivery_report_requested INTEGER DEFAULT(0) NOT NULL");
        }
        if (i >= 58870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_display_report_requested INTEGER DEFAULT(0) NOT NULL");
        }
        if (i >= 60560) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_negative_delivery_report_requested INTEGER DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE pending_incoming_message_rcs_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_remote_user_id");
        arrayList.add("CREATE INDEX index_pending_incoming_message_rcs_table_remote_user_id ON pending_incoming_message_rcs_table(remote_user_id);");
        if (i >= 59270) {
            arrayList.add("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_received_timestamp");
            arrayList.add("CREATE INDEX IF NOT EXISTS index_pending_incoming_message_rcs_table_received_timestamp ON pending_incoming_message_rcs_table(received_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
