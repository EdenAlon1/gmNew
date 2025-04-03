package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxs implements cavm {
    private final ffbr d;
    private static final cskc c = cskc.g("BugleDatabase", "DatabaseWrapperBusyHandler");
    public static final cfva a = cfvl.e(cfvl.b, "SqliteLockedHandlerRetryIterations", 20);
    public static final cfva b = cfvl.f(cfvl.b, "SqliteLockedHandlerBackoffMillis", 50);

    public caxs(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    @Override // defpackage.cavm
    public final int e(Exception exc, int i, dtwd dtwdVar) {
        if (!(exc instanceof SQLiteDatabaseLockedException)) {
            return 1;
        }
        if (i >= ((Integer) a.e()).intValue()) {
            return 3;
        }
        c.r("got SQLiteDatabaseLockedException");
        if (i == 0) {
            ((akzt) this.d.b()).c("Bugle.Datamodel.DatabaseLocked.Counts");
        }
        ersn.c(((Long) b.e()).longValue(), TimeUnit.MILLISECONDS);
        return 2;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Closeable l(dtwd dtwdVar) {
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return true;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
