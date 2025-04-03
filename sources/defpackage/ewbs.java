package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewbs extends SQLiteOpenHelper {
    final /* synthetic */ ewbt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewbs(ewbt ewbtVar, Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = ewbtVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = this.a.c.e;
        ewbt.a.c("Creating SQLite table as:\n%s", str);
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("In-memory database will never call onUpgrade.");
    }
}
