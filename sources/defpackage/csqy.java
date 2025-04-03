package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class csqy {
    public static final csqy a;
    public static final String[] b;

    static {
        csqk csqkVar = new csqk();
        csqkVar.b(0L);
        a = csqkVar.a();
        b = new String[]{"_id", "displayName"};
    }

    public static csqy c(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("displayName"));
        csqk csqkVar = new csqk();
        csqkVar.b(j);
        csqkVar.a = string;
        return csqkVar.a();
    }

    public static csqy d() {
        csqk csqkVar = new csqk();
        csqkVar.b(1000000000L);
        return csqkVar.a();
    }

    public static engw e() {
        return engw.u(0L, 1L, 1000000000L, 1000000001L);
    }

    public abstract long a();

    public abstract String b();
}
