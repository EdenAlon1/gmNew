package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxl implements cavm {
    public static final cskc a = cskc.g("BugleDatabase", "DatabaseWrapperCursorHandler");
    public static final emyl b = emys.a(new emyl() { // from class: cawz
        @Override // defpackage.emyl
        public final Object get() {
            cskc cskcVar = caxl.a;
            return cfvl.e(cfvl.b, "DatabaseWrapperCursorHandlerRetryIterations", 20);
        }
    });
    public static final emyl c = emys.a(new emyl() { // from class: caxa
        @Override // defpackage.emyl
        public final Object get() {
            cskc cskcVar = caxl.a;
            return cfvl.f(cfvl.b, "DatabaseWrapperCursorHandlerBackoffMillis", 50L);
        }
    });
    public static final cfup d = cfvl.q(150089955);
    public final ffbr e;

    public caxl(ffbr ffbrVar) {
        this.e = ffbrVar;
    }

    @Override // defpackage.cavm
    public final Cursor a(Cursor cursor, dtwd dtwdVar) {
        return new caxk(this, cursor);
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Closeable l(dtwd dtwdVar) {
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((Boolean) d.e()).booleanValue();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
