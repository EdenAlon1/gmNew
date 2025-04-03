package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqws extends dtup {
    public static final String[] a = {"cms.key_index", "cms.encryption_key", "cms.key_type", "cms.cms_correlation_id", "cms.cms_id"};
    public static final enhk b;
    public static final bqvx c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("cms.cms_correlation_id", 42060);
        enhdVar.k("cms.cms_id", 35020);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("cms_correlation_id", "index_cms_cms_correlation_id");
        enhdVar2.k("cms_id", "index_cms_cms_id");
        enhdVar2.c();
        c = new bqvx();
        d = new int[]{32030, 35020, 42060};
    }

    public static final bqwn a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("cms.key_index");
            engrVar.h("cms.encryption_key");
            engrVar.h("cms.key_type");
            if (c2.intValue() >= 42060) {
                engrVar.h("cms.cms_correlation_id");
            }
            if (c2.intValue() >= 35020) {
                engrVar.h("cms.cms_id");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqwn(strArr);
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
        sb.append("key_index INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_type INT DEFAULT(0)");
        if (i >= 42060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        if (i >= 35020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_id TEXT");
        }
        sb.insert(0, "CREATE TABLE cms (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 35020) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
        }
        if (i >= 42060) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
