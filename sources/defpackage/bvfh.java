package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfh extends dtup {
    public static final String[] a = {"p2p_conversation_suggestion_event.id", "p2p_conversation_suggestion_event.message_id", "p2p_conversation_suggestion_event.timestamp", "p2p_conversation_suggestion_event.event_type", "p2p_conversation_suggestion_event.reply_mode", "p2p_conversation_suggestion_event.rejection_reason", "p2p_conversation_suggestion_event.action_source", "p2p_conversation_suggestion_event.num_of_items", "p2p_conversation_suggestion_event.click_index", "p2p_conversation_suggestion_event.impression_id", "p2p_conversation_suggestion_event.suggestion_types", "p2p_conversation_suggestion_event.model_output_label"};
    public static final bvei b;
    public static final int[] c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("p2p_conversation_suggestion_event.message_id", 51030);
        enhdVar.k("p2p_conversation_suggestion_event.model_output_label", 42030);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_p2p_conversation_suggestion_event_message_id");
        enhdVar2.c();
        b = new bvei();
        c = new int[]{37000, 42030, 51030, 58940};
        d = new int[]{57010};
    }

    public static final bvfe a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("p2p_conversation_suggestion_event.id");
            if (c2.intValue() >= 51030) {
                engrVar.h("p2p_conversation_suggestion_event.message_id");
            }
            engrVar.h("p2p_conversation_suggestion_event.timestamp");
            engrVar.h("p2p_conversation_suggestion_event.event_type");
            engrVar.h("p2p_conversation_suggestion_event.reply_mode");
            engrVar.h("p2p_conversation_suggestion_event.rejection_reason");
            engrVar.h("p2p_conversation_suggestion_event.action_source");
            engrVar.h("p2p_conversation_suggestion_event.num_of_items");
            engrVar.h("p2p_conversation_suggestion_event.click_index");
            engrVar.h("p2p_conversation_suggestion_event.impression_id");
            engrVar.h("p2p_conversation_suggestion_event.suggestion_types");
            if (c2.intValue() >= 42030) {
                engrVar.h("p2p_conversation_suggestion_event.model_output_label");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bvfe(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 51030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event_type INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reply_mode INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rejection_reason INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("action_source INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("num_of_items INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("click_index INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("impression_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_types TEXT");
        if (i >= 42030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("model_output_label TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "p2p_conversation_suggestion_event"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58940) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
            arrayList.add("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
