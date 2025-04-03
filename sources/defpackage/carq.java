package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carq implements cavm {
    static final cfup a = cfvl.q(173707567);
    public static final cskc b = cskc.g("BugleDatabase", "DatabaseCloseChecker");
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        dtrg dtrgVar = (dtrg) dtwdVar;
        emxf.p(!this.c.get(), "database is already closed %s", dtrgVar.b);
        if (dtrgVar.b.ordinal() != 15) {
            return new carp(new emwl() { // from class: carn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Boolean.valueOf(carq.this.c.get());
                }
            });
        }
        this.c.set(true);
        csjb e = b.e();
        e.I("Bugle database has started to close.  New database operations will fail.");
        e.r();
        return new caro();
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
