package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dguw {
    private static final engw e = engw.r("CREATE TABLE collections(id INTEGER PRIMARY KEY, collection_name STRING NOT NULL,time INTEGER NOT NULL,selection_key INTEGER NOT NULL,value BLOB NOT NULL)");
    public final dguy a;
    public final dlpw b;
    public final Random c;
    public final ExecutorService d;

    public dguw(Context context, dlpw dlpwVar, Random random, ExecutorService executorService) {
        this.a = new dguy(context, e);
        this.b = dlpwVar;
        this.c = random;
        this.d = executorService;
    }

    public static void b(String str) {
        if (Log.isLoggable("SqliteExampleStore", 3)) {
            Log.d("SqliteExampleStore", str);
        }
    }

    public final ListenableFuture a(final emwl emwlVar) {
        return erqt.n(new erog() { // from class: dgus
            @Override // defpackage.erog
            public final ListenableFuture a() {
                emwl emwlVar2 = emwlVar;
                dguw dguwVar = dguw.this;
                SQLiteDatabase writableDatabase = dguwVar.a.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    try {
                        Object apply = emwlVar2.apply(new dguv(writableDatabase, dguwVar.b, dguwVar.c));
                        writableDatabase.setTransactionSuccessful();
                        ListenableFuture i = erqt.i(apply);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return i;
                    } finally {
                        writableDatabase.endTransaction();
                    }
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, this.d);
    }
}
