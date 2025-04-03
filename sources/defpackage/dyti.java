package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyti {
    private final SQLiteOpenHelper a;

    public dyti(SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = sQLiteOpenHelper;
    }

    private static final String i(Uri uri) {
        return uri.getPathSegments().get(1);
    }

    public final int a(Uri uri, String str, String[] strArr) {
        return this.a.getWritableDatabase().delete(i(uri), str, strArr);
    }

    public final int b(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.getWritableDatabase().update(i(uri), contentValues, str, strArr);
    }

    public final long c(Uri uri, ContentValues contentValues, int i) {
        return this.a.getWritableDatabase().insertWithOnConflict(i(uri), null, contentValues, i);
    }

    public final void d() {
        this.a.getWritableDatabase().beginTransaction();
    }

    public final void e() {
        this.a.getWritableDatabase().endTransaction();
    }

    public final void f() {
        this.a.getWritableDatabase().setTransactionSuccessful();
    }

    public final boolean g() {
        return this.a.getWritableDatabase().inTransaction();
    }

    public final Cursor h(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        return this.a.getReadableDatabase().query(i(uri), strArr, str, strArr2, null, null, str2, str3);
    }
}
