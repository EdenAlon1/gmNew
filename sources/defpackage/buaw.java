package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buaw extends dtup {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id"};
    public static final enhk b;
    public static final buab c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_labels.confidence", 53060);
        enhdVar.k("message_labels.intent", 58590);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("intent", "index_message_labels_intent");
        enhdVar2.c();
        c = new buab();
        d = new int[]{53050, 53060, 58550, 58590, 59240};
    }

    public static final buar a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_labels._id");
            engrVar.h("message_labels.message_id");
            engrVar.h("message_labels.label");
            if (c2.intValue() >= 53060) {
                engrVar.h("message_labels.confidence");
            }
            engrVar.h("message_labels.source");
            if (c2.intValue() >= 58590) {
                engrVar.h("message_labels.intent");
            }
            engrVar.h("message_labels.model_id");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new buar(strArr);
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
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("confidence INTEGER");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INTEGER");
        if (i >= 58590) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("intent TEXT DEFAULT('')");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("model_id TEXT DEFAULT('')");
        sb.insert(0, "CREATE TABLE message_labels (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS unique_idx_message_label");
        arrayList.add("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
        if (i >= 58550) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_label");
            arrayList.add("CREATE INDEX index_message_labels_label ON message_labels(label);");
        }
        if (i >= 59240) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_intent");
            arrayList.add("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
