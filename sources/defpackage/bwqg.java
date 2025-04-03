package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqg extends dtup {
    public static final String[] a = {"rbm_business_info_properties._id", "rbm_business_info_properties.rbm_bot_id", "rbm_business_info_properties.type", "rbm_business_info_properties.header", "rbm_business_info_properties.subheader", "rbm_business_info_properties.property_value"};
    public static final bwpo b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("rbm_business_info_properties.rbm_bot_id", 51020);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("rbm_bot_id", "index_rbm_business_info_properties_rbm_bot_id");
        enhdVar2.c();
        b = new bwpo();
        c = new int[]{51020, 58410, 59830};
    }

    public static final bwqd a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("rbm_business_info_properties._id");
            if (c2.intValue() >= 51020) {
                engrVar.h("rbm_business_info_properties.rbm_bot_id");
            }
            engrVar.h("rbm_business_info_properties.type");
            engrVar.h("rbm_business_info_properties.header");
            engrVar.h("rbm_business_info_properties.subheader");
            engrVar.h("rbm_business_info_properties.property_value");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwqd(strArr);
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
        sb.append("rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("header TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subheader TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("property_value TEXT");
        sb.insert(0, "CREATE TABLE rbm_business_info_properties (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58410) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
        }
        if (i >= 59830) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
