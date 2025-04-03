package defpackage;

import android.database.Cursor;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewwu {
    public static final String[] a = {"sourceid", "account_type", "account_name", "contact_id", "mimetype", "is_primary", "is_super_primary", "display_name", "data1", "data2", "data3", "data1", "data1", "data1"};

    public static final void a(String str, int i, ewwt ewwtVar, Map map) {
        ewvo ewvoVar = new ewvo(str, i);
        if (map.containsKey(ewvoVar)) {
            ewwtVar.a((String) map.get(ewvoVar));
        }
    }

    public static final void b(String str, int i, Cursor cursor, Map map, Map map2, Set set) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return;
        }
        String string = cursor.getString(cursor.getColumnIndex("contact_id"));
        ewws ewwsVar = cursor.getInt(cursor.getColumnIndex("is_super_primary")) == 1 ? ewws.SUPER_PRIMARY : cursor.getInt(cursor.getColumnIndex("is_primary")) == 1 ? ewws.PRIMARY : ewws.REGULAR;
        ewvo ewvoVar = new ewvo(string, i);
        if (!map.containsKey(ewvoVar) || ewwsVar.compareTo((ewws) map2.get(ewvoVar)) > 0) {
            map.put(ewvoVar, cursor.getString(columnIndex));
            map2.put(ewvoVar, ewwsVar);
            set.add(string);
        }
    }
}
