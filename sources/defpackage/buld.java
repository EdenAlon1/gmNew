package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buld extends dtup {
    public static final String[] a = {"message_spam._id", "message_spam.message_id", "message_spam.conversation_id", "message_spam.source", "message_spam.score", "message_spam.outcome", "message_spam.ares_initiated_by", "message_spam.classification_timestamp", "message_spam.trigger", "message_spam.action_type", "message_spam.action_contributors", "message_spam.error_code", "message_spam.reclassification_index"};
    public static final bujy b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_spam.conversation_id", 59460);
        enhdVar.k("message_spam.score", 45040);
        enhdVar.k("message_spam.outcome", 58030);
        enhdVar.k("message_spam.ares_initiated_by", 58100);
        enhdVar.k("message_spam.classification_timestamp", 59190);
        enhdVar.k("message_spam.trigger", 59460);
        enhdVar.k("message_spam.action_type", 59460);
        enhdVar.k("message_spam.action_contributors", 59460);
        enhdVar.k("message_spam.error_code", 59460);
        enhdVar.k("message_spam.reclassification_index", 59460);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_message_spam_message_id");
        enhdVar2.k("conversation_id", "index_message_spam_conversation_id");
        enhdVar2.k("classification_timestamp", "index_message_spam_classification_timestamp");
        enhdVar2.c();
        b = new bujy();
        c = new int[]{30000, 45040, 58030, 58100, 58350, 59190, 59200, 59460};
    }

    public static final bukw a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_spam._id");
            engrVar.h("message_spam.message_id");
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.conversation_id");
            }
            engrVar.h("message_spam.source");
            if (c2.intValue() >= 45040) {
                engrVar.h("message_spam.score");
            }
            if (c2.intValue() >= 58030) {
                engrVar.h("message_spam.outcome");
            }
            if (c2.intValue() >= 58100) {
                engrVar.h("message_spam.ares_initiated_by");
            }
            if (c2.intValue() >= 59190) {
                engrVar.h("message_spam.classification_timestamp");
            }
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.trigger");
            }
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.action_type");
            }
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.action_contributors");
            }
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.error_code");
            }
            if (c2.intValue() >= 59460) {
                engrVar.h("message_spam.reclassification_index");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bukw(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(0)");
        if (i >= 45040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("score REAL DEFAULT(0.0)");
        }
        if (i >= 58030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("outcome INT DEFAULT(1)");
        }
        if (i >= 58100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ares_initiated_by TEXT DEFAULT('')");
        }
        if (i >= 59190) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("trigger INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_type INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_contributors INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_code INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reclassification_index INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "message_spam"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    public static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_message_id");
            arrayList.add("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
        }
        if (i >= 59200) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
            arrayList.add("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
        }
        if (i >= 59460) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_conversation_id");
            arrayList.add("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
