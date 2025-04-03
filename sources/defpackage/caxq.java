package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxq implements cavm {
    public static final cfup a = cfvl.q(172569191);

    @Override // defpackage.cavm
    public final Cursor a(Cursor cursor, dtwd dtwdVar) {
        return new caxp(cursor);
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        dtrg dtrgVar = (dtrg) dtwdVar;
        if (((Boolean) dtrgVar.a.b(new dtuh() { // from class: caxn
            @Override // defpackage.dtuh
            public final Object a(String str) {
                cfup cfupVar = caxq.a;
                boolean z = true;
                if (str != null && !str.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue()) {
            return null;
        }
        dtui dtuiVar = dtrgVar.a;
        if (dtuiVar.c()) {
            return null;
        }
        return (ekzz) dtuiVar.b(new dtwb());
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
