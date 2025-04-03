package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhn extends dtup {
    public static final String[] a = {"p2p_suggestions._id", "p2p_suggestions.target_message_id", "p2p_suggestions.generated_timestamp", "p2p_suggestions.suggestion", "p2p_suggestions.smart_suggestion_type", "p2p_suggestions.suggestion_status", "p2p_suggestions.consumption_state"};
    public static final enhk b;
    public static final bvgn c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("p2p_suggestions.consumption_state", 53080);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("target_message_id", "index_p2p_suggestions_target_message_id");
        enhdVar2.k("generated_timestamp", "index_p2p_suggestions_generated_timestamp");
        enhdVar2.c();
        c = new bvgn();
        d = new int[]{42020, 53080, 58510};
    }

    public static final bvhd a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("p2p_suggestions._id");
            engrVar.h("p2p_suggestions.target_message_id");
            engrVar.h("p2p_suggestions.generated_timestamp");
            engrVar.h("p2p_suggestions.suggestion");
            engrVar.h("p2p_suggestions.smart_suggestion_type");
            engrVar.h("p2p_suggestions.suggestion_status");
            if (c2.intValue() >= 53080) {
                engrVar.h("p2p_suggestions.consumption_state");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bvhd(strArr);
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
        sb.append("target_message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("generated_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("smart_suggestion_type INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_status INTEGER DEFAULT(0)");
        if (i >= 53080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("consumption_state INTEGER DEFAULT(1)");
        }
        sb.insert(0, "CREATE TABLE p2p_suggestions (");
        sb.append(", FOREIGN KEY (target_message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_target_message_id");
        arrayList.add("CREATE INDEX index_p2p_suggestions_target_message_id ON p2p_suggestions(target_message_id);");
        if (i >= 58510) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
            arrayList.add("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
