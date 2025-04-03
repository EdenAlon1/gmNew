package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsd extends dtup {
    public static final String[] a = {"conversation_labels._id", "conversation_labels.conversation_id", "conversation_labels.label", "conversation_labels.message_id", "conversation_labels.snippet_text", "conversation_labels.preview_uri", "conversation_labels.preview_content_type", "conversation_labels.message_status", "conversation_labels.read", "conversation_labels.received_timestamp", "conversation_labels.message_protocol", "conversation_labels.raw_telephony_status"};
    public static final enhk b;
    public static final brrd c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_labels.label", 53020);
        enhdVar.k("conversation_labels.snippet_text", 53010);
        enhdVar.k("conversation_labels.preview_uri", 55040);
        enhdVar.k("conversation_labels.preview_content_type", 55040);
        enhdVar.k("conversation_labels.message_status", 57050);
        enhdVar.k("conversation_labels.read", 57050);
        enhdVar.k("conversation_labels.received_timestamp", 57050);
        enhdVar.k("conversation_labels.message_protocol", 57050);
        enhdVar.k("conversation_labels.raw_telephony_status", 57050);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_conversation_labels_message_id");
        enhdVar2.c();
        c = new brrd();
        d = new int[]{51000, 53010, 53020, 55040, 57050, 58430, 58920};
    }

    public static final brry a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_labels._id");
            engrVar.h("conversation_labels.conversation_id");
            if (c2.intValue() >= 53020) {
                engrVar.h("conversation_labels.label");
            }
            engrVar.h("conversation_labels.message_id");
            if (c2.intValue() >= 53010) {
                engrVar.h("conversation_labels.snippet_text");
            }
            if (c2.intValue() >= 55040) {
                engrVar.h("conversation_labels.preview_uri");
            }
            if (c2.intValue() >= 55040) {
                engrVar.h("conversation_labels.preview_content_type");
            }
            if (c2.intValue() >= 57050) {
                engrVar.h("conversation_labels.message_status");
            }
            if (c2.intValue() >= 57050) {
                engrVar.h("conversation_labels.read");
            }
            if (c2.intValue() >= 57050) {
                engrVar.h("conversation_labels.received_timestamp");
            }
            if (c2.intValue() >= 57050) {
                engrVar.h("conversation_labels.message_protocol");
            }
            if (c2.intValue() >= 57050) {
                engrVar.h("conversation_labels.raw_telephony_status");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new brry(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("snippet_text TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_uri TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_content_type TEXT");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_status INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("received_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("raw_telephony_status INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "conversation_labels"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    public static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 53020) {
            arrayList.add("DROP INDEX IF EXISTS unique_idx_conversation_label");
            arrayList.add("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
        }
        if (i >= 58430) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_label");
            arrayList.add("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
        }
        if (i >= 58920) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_message_id");
            arrayList.add("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
