package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efks {
    final CancellationSignal a = new CancellationSignal();
    final SQLiteDatabase b;

    public efks(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    static String e(Cursor cursor) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            String[] columnNames = cursor.getColumnNames();
            sb.append(Arrays.toString(columnNames));
            sb.append('\n');
            while (cursor.moveToNext()) {
                for (int i = 0; i < columnNames.length; i++) {
                    try {
                        str = cursor.getString(i);
                    } catch (Exception unused) {
                        str = cursor.getType(i) != 4 ? "Unknown" : "Blob, length " + cursor.getBlob(i).length;
                    }
                    sb.append("|");
                    sb.append(str);
                }
                sb.append('\n');
            }
            String sb2 = sb.toString();
            if (cursor != null) {
                cursor.close();
            }
            return sb2;
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static void f() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final int a(efkl efklVar) {
        f();
        ekzz f = eleg.f("DELETE FROM " + efklVar.a + " WHERE " + efklVar.b);
        try {
            int delete = this.b.delete(efklVar.a, efklVar.b, efklVar.c);
            f.close();
            return delete;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SafeVarargs
    public final int b(String str, String str2, String... strArr) {
        f();
        ekzz f = eleg.f(a.m(str2, str, "DELETE FROM ", " WHERE "));
        try {
            int delete = this.b.delete(str, str2, strArr);
            f.close();
            return delete;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long c(String str, ContentValues contentValues, int i) {
        f();
        ekzz f = eleg.f("INSERT WITH ON CONFLICT ".concat(str));
        try {
            long insertWithOnConflict = this.b.insertWithOnConflict(str, null, contentValues, i);
            f.close();
            return insertWithOnConflict;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Cursor d(efkn efknVar) {
        f();
        if (Log.isLoggable("ASQLDB", 2)) {
            Log.v("ASQLDB", e(this.b.rawQueryWithFactory(new efkp(efknVar), "EXPLAIN QUERY PLAN ".concat(efknVar.a), null, null)));
        }
        ekzz f = eleg.f("Query: ".concat(efknVar.a));
        try {
            Cursor rawQueryWithFactory = this.b.rawQueryWithFactory(new efkp(efknVar), efknVar.a, null, null, this.a);
            f.close();
            return rawQueryWithFactory;
        } finally {
        }
    }

    public final void g(efkn efknVar) {
        f();
        ekzz f = eleg.f("execSQL: ".concat(efknVar.a));
        try {
            this.b.execSQL(efknVar.a, efknVar.b);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(String str) {
        f();
        ekzz f = eleg.f("execSQL: ".concat(str));
        try {
            this.b.execSQL(str);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
