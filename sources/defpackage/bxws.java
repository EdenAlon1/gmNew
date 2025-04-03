package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxws extends dtup {
    public static final String[] a = {"settings._id", "settings.key", "settings.sub_key", "settings.data", "settings.last_modified_timestamp"};
    public static final enhk b = new enhd().c();
    public static final bxvz c;
    public static final int[] d;

    static {
        new enhd().c();
        c = new bxvz();
        d = new int[]{41000};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE settings (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_settings_keys");
        arrayList.add("CREATE UNIQUE INDEX index_settings_keys ON settings(key, sub_key);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
