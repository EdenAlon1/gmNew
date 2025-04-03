package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsam extends dtup {
    public static final String[] a = {"conversation_suggestions._id", "conversation_suggestions.message_id", "conversation_suggestions.conversation_suggestion_type", "conversation_suggestions.properties", "conversation_suggestions.post_back_data", "conversation_suggestions.post_back_encoding", "conversation_suggestions.rcs_message_id", "conversation_suggestions.target_rcs_message_id", "conversation_suggestions.read", "conversation_suggestions.received_timestamp"};
    public static final brzn b;
    public static final int[] c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_suggestions.rcs_message_id", 11001);
        enhdVar.k("conversation_suggestions.target_rcs_message_id", 12000);
        enhdVar.k("conversation_suggestions.read", 12000);
        enhdVar.k("conversation_suggestions.received_timestamp", 12000);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_conversation_suggestions_message_id");
        enhdVar2.k("target_rcs_message_id", "index_conversation_suggestions_target_rcs_message_id");
        enhdVar2.c();
        b = new brzn();
        c = new int[]{11001, 12000, 17000};
        d = new int[]{55020, 56010};
    }

    public static final bsah a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_suggestions._id");
            engrVar.h("conversation_suggestions.message_id");
            engrVar.h("conversation_suggestions.conversation_suggestion_type");
            engrVar.h("conversation_suggestions.properties");
            engrVar.h("conversation_suggestions.post_back_data");
            engrVar.h("conversation_suggestions.post_back_encoding");
            if (c2.intValue() >= 11001) {
                engrVar.h("conversation_suggestions.rcs_message_id");
            }
            if (c2.intValue() >= 12000) {
                engrVar.h("conversation_suggestions.target_rcs_message_id");
            }
            if (c2.intValue() >= 12000) {
                engrVar.h("conversation_suggestions.read");
            }
            if (c2.intValue() >= 12000) {
                engrVar.h("conversation_suggestions.received_timestamp");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bsah(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_suggestion_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("properties TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_data TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_encoding TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("target_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void g(dtve dtveVar) {
        dtub.J(dtveVar, "conversation_suggestions", e("TEMP___conversation_suggestions"), a, f());
    }
}
