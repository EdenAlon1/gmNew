package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxv implements oxi {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final ffbz b = ffca.b(3, new ffix() { // from class: oxs
        @Override // defpackage.ffix
        public final Object invoke() {
            String[] strArr = oxv.a;
            try {
                Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public static final ffbz c = ffca.b(3, new ffix() { // from class: oxt
        @Override // defpackage.ffix
        public final Object invoke() {
            Class<?> returnType;
            String[] strArr = oxv.a;
            try {
                Method b2 = oxu.b();
                if (b2 == null || (returnType = b2.getReturnType()) == null) {
                    return null;
                }
                Class<?> cls = Integer.TYPE;
                return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    });

    public oxv(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.oxi
    public final Cursor a(final oxp oxpVar) {
        final ffjo ffjoVar = new ffjo() { // from class: oxq
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                String[] strArr = oxv.a;
                sQLiteQuery.getClass();
                oxp.this.h(new oye(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            }
        };
        Cursor rawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: oxr
            /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = oxv.a;
                return ffjo.this.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, oxpVar.b(), e, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.oxi
    public final Cursor b(String str) {
        return a(new oxh(str));
    }

    @Override // defpackage.oxi
    public final String c() {
        return this.d.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.oxi
    public final void d() {
        this.d.beginTransaction();
    }

    @Override // defpackage.oxi
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.oxi
    public final void f() {
        this.d.endTransaction();
    }

    @Override // defpackage.oxi
    public final void g(String str) {
        this.d.execSQL(str);
    }

    @Override // defpackage.oxi
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.oxi
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override // defpackage.oxi
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override // defpackage.oxi
    public final oyf k(String str) {
        SQLiteStatement compileStatement = this.d.compileStatement(str);
        compileStatement.getClass();
        return new oyf(compileStatement);
    }

    @Override // defpackage.oxi
    public final void l(Object[] objArr) {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
