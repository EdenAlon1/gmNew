package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dguy extends dgwm {
    private final Context a;
    private final String b;
    private final engw c;
    private final int d;
    private boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dguy(android.content.Context r3, defpackage.engw r4) {
        /*
            r2 = this;
            r0 = r4
            enou r0 = (defpackage.enou) r0
            int r1 = r0.c
            r2.<init>(r3, r1)
            r2.a = r3
            java.lang.String r3 = "primes_example_store"
            r2.b = r3
            r2.c = r4
            int r3 = r0.c
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dguy.<init>(android.content.Context, engw):void");
    }

    private static SQLiteException a(SQLiteException sQLiteException) {
        return sQLiteException instanceof SQLiteCantOpenDatabaseException ? new dgux(sQLiteException) : sQLiteException;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("brella.SqliteOpenHelper", "Error opening database, deleting the database and trying again", e);
            if (!SQLiteDatabase.deleteDatabase(this.a.getDatabasePath(this.b))) {
                Log.e("brella.SqliteOpenHelper", "Deletion of " + this.b + " failed", e);
                throw a(e);
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                Log.e("brella.SqliteOpenHelper", "failed to get the database after recreating", e2);
                throw a(e2);
            }
        }
        if (!this.e) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.e = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            Log.e("brella.SqliteOpenHelper", "Error getting database after downgrading", e3);
            throw a(e3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        emxf.a(i >= 0);
        emxf.a(i < i2);
        emxf.a(i2 == this.d);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.c.get(i));
                i++;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
    }
}
