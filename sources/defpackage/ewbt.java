package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewbt implements Closeable {
    public static final eaee a = new eaed("SqliteDbAdapter");
    public final SQLiteOpenHelper b;
    public final eweg c;
    public final enip d;
    public final Map e;
    public final Map f;

    /* JADX WARN: Multi-variable type inference failed */
    public ewbt(Context context, ewdz ewdzVar, ewdr ewdrVar) {
        emxf.d(ewdzVar.b.size() == 1, "schema must contain a single table, found %s", ewdzVar.b.size());
        eweg ewegVar = (eweg) ewdzVar.b.get(0);
        this.c = ewegVar;
        HashSet g = enpw.g(ewegVar.c.size());
        this.e = new HashMap();
        this.f = new HashMap();
        for (ewdx ewdxVar : ewegVar.c) {
            String str = ewdxVar.b;
            if (str.toLowerCase(Locale.ROOT).startsWith("sensitive_")) {
                ewdn ewdnVar = ewdrVar.b;
                ewdnVar = ewdnVar == null ? ewdn.a : ewdnVar;
                if ((ewdnVar.b == 4 ? (ewdf) ewdnVar.c : ewdf.a).b == 7) {
                    Map map = this.e;
                    ewnz b = ewnz.b(ewdxVar.c);
                    map.put(str, b == null ? ewnz.UNRECOGNIZED : b);
                }
            } else {
                g.add(str);
            }
        }
        this.d = enip.o(g);
        this.b = new ewbs(this, context);
    }

    public final Cursor a(String str, String[] strArr) {
        eaee eaeeVar = a;
        eaeeVar.c("Executing SQL query: %s", str);
        Cursor rawQuery = this.b.getReadableDatabase().rawQuery(str, strArr);
        eaeeVar.c("SQL query returned %d rows", Integer.valueOf(rawQuery.getCount()));
        return rawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
