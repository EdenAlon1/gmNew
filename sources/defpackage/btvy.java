package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvy extends dtup {
    public static final String[] a = {"message_classifications_table._id", "message_classifications_table.message_id", "message_classifications_table.classification_type", "message_classifications_table.classification_details"};
    public static final enhk b;
    public static final btvf c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_classifications_table.classification_details", 58480);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_message_classifications_table_message_id");
        enhdVar2.k("classification_type", "index_message_classifications_table_classification_type");
        enhdVar2.c();
        c = new btvf();
        d = new int[]{58400, 58480, 59350};
    }

    public static final btvs a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_classifications_table._id");
            engrVar.h("message_classifications_table.message_id");
            engrVar.h("message_classifications_table.classification_type");
            if (c2.intValue() >= 58480) {
                engrVar.h("message_classifications_table.classification_details");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btvs(strArr);
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
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58480) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_details BLOB");
        }
        sb.insert(0, "CREATE TABLE message_classifications_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_message_id");
        arrayList.add("CREATE INDEX index_message_classifications_table_message_id ON message_classifications_table(message_id);");
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
