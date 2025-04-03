package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caut {
    public kfb b;
    public Thread d;
    public SQLiteDatabase e;
    public final AtomicReference a = new AtomicReference();
    public final elfl c = elfl.g(kfg.a(new kfd() { // from class: caus
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            caut.this.b = kfbVar;
            return null;
        }
    }));

    public static final SQLiteDatabase b(Exception exc) {
        throw new cauo("Unhandled exception during database initialization", exc);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
        this.d = sQLiteDatabase != null ? Thread.currentThread() : null;
    }
}
