package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsx {
    public static int a(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        try {
            return contentResolver.delete(uri, str, strArr);
        } catch (SQLiteException | IllegalArgumentException e) {
            csjy.h("Bugle", e, "SqliteWrapper: catch an exception when delete");
            return -1;
        }
    }

    public static int b(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return contentResolver.update(uri, contentValues, str, strArr);
        } catch (SQLiteException | IllegalArgumentException e) {
            csjy.h("Bugle", e, "SqliteWrapper: catch an exception when update");
            return -1;
        }
    }

    public static Cursor c(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (SQLiteException | IllegalArgumentException e) {
            csjy.h("Bugle", e, "SqliteWrapper: catch an exception when query");
            return null;
        }
    }

    public static Uri d(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        try {
            return contentResolver.insert(uri, contentValues);
        } catch (SQLiteException | IllegalArgumentException e) {
            csjy.h("Bugle", e, "SqliteWrapper: catch an exception when insert");
            return null;
        }
    }
}
