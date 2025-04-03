package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqth extends dtup {
    public static final String[] a = {"cms_restore_dependency_cache_table._id", "cms_restore_dependency_cache_table.dependent_id", "cms_restore_dependency_cache_table.dependent_cms_id", "cms_restore_dependency_cache_table.dependency_cms_id", "cms_restore_dependency_cache_table.cms_data_provider_type", "cms_restore_dependency_cache_table.payload", "cms_restore_dependency_cache_table.inserted_at_timestamp"};
    public static final bqso b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("cms_restore_dependency_cache_table.cms_data_provider_type", 59660);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("dependent_cms_id", "index_cms_restore_dependency_cache_table_dependent_cms_id");
        enhdVar2.k("dependency_cms_id", "index_cms_restore_dependency_cache_table_dependency_cms_id");
        enhdVar2.k("inserted_at_timestamp", "index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        enhdVar2.c();
        b = new bqso();
        c = new int[]{59650, 59660};
    }

    public static final bqte a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("cms_restore_dependency_cache_table._id");
            engrVar.h("cms_restore_dependency_cache_table.dependent_id");
            engrVar.h("cms_restore_dependency_cache_table.dependent_cms_id");
            engrVar.h("cms_restore_dependency_cache_table.dependency_cms_id");
            if (c2.intValue() >= 59660) {
                engrVar.h("cms_restore_dependency_cache_table.cms_data_provider_type");
            }
            engrVar.h("cms_restore_dependency_cache_table.payload");
            engrVar.h("cms_restore_dependency_cache_table.inserted_at_timestamp");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqte(strArr);
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
        sb.append("dependent_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependent_cms_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependency_cms_id TEXT NOT NULL");
        if (i >= 59660) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_data_provider_type INT DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("payload BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("inserted_at_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE cms_restore_dependency_cache_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependent_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependent_cms_id ON cms_restore_dependency_cache_table(dependent_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependency_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependency_cms_id ON cms_restore_dependency_cache_table(dependency_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_inserted_at_timestamp ON cms_restore_dependency_cache_table(inserted_at_timestamp);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
