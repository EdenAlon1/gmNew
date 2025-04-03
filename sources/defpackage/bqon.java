package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqon extends dtup {
    public static final String[] a = {"cms_incremental_events._id", "cms_incremental_events.table_type", "cms_incremental_events.operation", "cms_incremental_events.bugle_id", "cms_incremental_events.attempt_count", "cms_incremental_events.create_timestamp", "cms_incremental_events.last_attempt_timestamp"};
    public static final bqnp b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        new enhd().c();
        b = new bqnp();
        c = new int[]{60580};
        d = new int[]{60600};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("table_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bugle_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempt_count INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("create_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_attempt_timestamp INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_incremental_event");
        arrayList.add("CREATE INDEX index_incremental_event ON cms_incremental_events(table_type, operation, bugle_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("cms_incremental_events"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
