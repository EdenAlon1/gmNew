package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyb extends SQLiteOpenHelper {
    private final Context a;
    private final oxx b;
    private final oxj c;
    private final boolean d;
    private boolean e;
    private final oyg f;
    private boolean g;

    public oyb(Context context, String str, final oxx oxxVar, oxj oxjVar, boolean z) {
        super(context, str, null, oxjVar.b, new DatabaseErrorHandler() { // from class: oxy
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                oxv a = oya.a(oxx.this, sQLiteDatabase);
                Log.e("SupportSQLite", a.i(a, "Corruption reported by sqlite on database: ", ".path"));
                if (!a.j()) {
                    String c = a.c();
                    if (c != null) {
                        oxj.f(c);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = a.d.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        a.close();
                    } catch (IOException unused2) {
                    }
                    if (list == null) {
                        String c2 = a.c();
                        if (c2 != null) {
                            oxj.f(c2);
                            return;
                        }
                        return;
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        oxj.f((String) obj);
                    }
                } catch (Throwable th) {
                    if (list != null) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            Object obj2 = ((Pair) it2.next()).second;
                            obj2.getClass();
                            oxj.f((String) obj2);
                        }
                    } else {
                        String c3 = a.c();
                        if (c3 != null) {
                            oxj.f(c3);
                        }
                    }
                    throw th;
                }
            }
        });
        String str2;
        this.a = context;
        this.b = oxxVar;
        this.c = oxjVar;
        this.d = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.f = new oyg(str2, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final oxv a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return oya.a(this.b, sQLiteDatabase);
    }

    public final oxi b() {
        SQLiteDatabase c;
        oxi a;
        File parentFile;
        try {
            this.f.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            String databaseName = getDatabaseName();
            boolean z = this.g;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                c = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    c = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof oxz) {
                        oxz oxzVar = (oxz) th;
                        Throwable th2 = oxzVar.a;
                        int i = oxzVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            throw th2;
                        }
                        if (i2 == 1) {
                            throw th2;
                        }
                        if (i2 == 2) {
                            throw th2;
                        }
                        if (i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new ffcd();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        c = c();
                    } catch (oxz e) {
                        throw e.a;
                    }
                }
            }
            if (this.e) {
                close();
                a = b();
            } else {
                a = a(c);
            }
            return a;
        } finally {
            this.f.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            oyg oygVar = this.f;
            Map map = oyg.a;
            boolean z = oygVar.b;
            oygVar.a(false);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            this.f.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e && this.c.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            oxj oxjVar = this.c;
            a(sQLiteDatabase);
            oxjVar.e();
        } catch (Throwable th) {
            throw new oxz(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.a(a(sQLiteDatabase));
        } catch (Throwable th) {
            throw new oxz(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new oxz(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.c(a(sQLiteDatabase));
            } catch (Throwable th) {
                throw new oxz(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.d(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new oxz(3, th);
        }
    }
}
