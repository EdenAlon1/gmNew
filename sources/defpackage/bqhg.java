package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhg extends dtup {
    public static final String[] a = {"cms_backup_dependency_cache_table._id", "cms_backup_dependency_cache_table.dependent_id", "cms_backup_dependency_cache_table.dependency_id", "cms_backup_dependency_cache_table.inserted_at_timestamp"};
    public static final bqgq b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("dependent_id", "index_cms_backup_dependency_cache_table_dependent_id");
        enhdVar.k("dependency_id", "index_cms_backup_dependency_cache_table_dependency_id");
        enhdVar.k("inserted_at_timestamp", "index_cms_backup_dependency_cache_table_inserted_at_timestamp");
        enhdVar.c();
        b = new bqgq();
        c = new int[]{59580, 59620};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
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
        sb.append("dependency_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("inserted_at_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE cms_backup_dependency_cache_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_dependency_id");
        arrayList.add("CREATE INDEX index_cms_backup_dependency_cache_table_dependency_id ON cms_backup_dependency_cache_table(dependency_id);");
        if (i >= 59620) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_dependent_id");
            arrayList.add("CREATE INDEX index_cms_backup_dependency_cache_table_dependent_id ON cms_backup_dependency_cache_table(dependent_id);");
        }
        if (i >= 59620) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_inserted_at_timestamp");
            arrayList.add("CREATE INDEX index_cms_backup_dependency_cache_table_inserted_at_timestamp ON cms_backup_dependency_cache_table(inserted_at_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
