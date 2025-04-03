package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqea extends dtup {
    public static final String[] a = {"backup_id_map._id", "backup_id_map.table_name", "backup_id_map.backup_id", "backup_id_map.bugle_id", "backup_id_map.status"};
    public static final enhk b = new enhd().c();
    public static final bqdh c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("table_name", "index_backup_id_map_table_name");
        enhdVar.k("backup_id", "index_backup_id_map_backup_id");
        enhdVar.k("bugle_id", "index_backup_id_map_bugle_id");
        enhdVar.k("status", "index_backup_id_map_status");
        enhdVar.c();
        c = new bqdh();
        d = new int[]{60020, 60040};
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
        sb.append("table_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bugle_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER");
        sb.insert(0, "CREATE TABLE backup_id_map (");
        sb.append(", UNIQUE(table_name,backup_id) ON CONFLICT FAIL);");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_backup_id_map_table_name");
        arrayList.add("CREATE INDEX index_backup_id_map_table_name ON backup_id_map(table_name);");
        arrayList.add("DROP INDEX IF EXISTS index_backup_id_map_backup_id");
        arrayList.add("CREATE INDEX index_backup_id_map_backup_id ON backup_id_map(backup_id);");
        arrayList.add("DROP INDEX IF EXISTS index_backup_id_map_status");
        arrayList.add("CREATE INDEX index_backup_id_map_status ON backup_id_map(status);");
        if (i >= 60040) {
            arrayList.add("DROP INDEX IF EXISTS index_backup_id_map_bugle_id");
            arrayList.add("CREATE INDEX index_backup_id_map_bugle_id ON backup_id_map(bugle_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf c() {
        return a().P();
    }
}
