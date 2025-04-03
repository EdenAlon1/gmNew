package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbs extends dtup {
    public static final String[] a = {"conversation_classifications_table._id", "conversation_classifications_table.conversation_id", "conversation_classifications_table.classification_type", "conversation_classifications_table.classification_state", "conversation_classifications_table.date", "conversation_classifications_table.impression_count", "conversation_classifications_table.generated_timestamp"};
    public static final enhk b;
    public static final brax c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_classifications_table.classification_state", 58690);
        enhdVar.k("conversation_classifications_table.impression_count", 58840);
        enhdVar.k("conversation_classifications_table.generated_timestamp", 58840);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_conversation_classifications_table_conversation_id");
        enhdVar2.k("classification_type", "index_conversation_classifications_table_classification_type");
        enhdVar2.k("date", "index_conversation_classifications_table_date");
        enhdVar2.c();
        c = new brax();
        d = new int[]{58670, 58690, 58790, 58840, 59350};
    }

    public static final brbn a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_classifications_table._id");
            engrVar.h("conversation_classifications_table.conversation_id");
            engrVar.h("conversation_classifications_table.classification_type");
            if (c2.intValue() >= 58690) {
                engrVar.h("conversation_classifications_table.classification_state");
            }
            engrVar.h("conversation_classifications_table.date");
            if (c2.intValue() >= 58840) {
                engrVar.h("conversation_classifications_table.impression_count");
            }
            if (c2.intValue() >= 58840) {
                engrVar.h("conversation_classifications_table.generated_timestamp");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new brbn(strArr);
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
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58690) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_state INTEGER DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date TEXT");
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("impression_count INTEGER DEFAULT(0)");
        }
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("generated_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE conversation_classifications_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_classifications_table_conversation_id ON conversation_classifications_table(conversation_id);");
        if (i >= 58790) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
        }
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
