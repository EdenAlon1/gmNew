package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cavm {
    Cursor a(Cursor cursor, dtwd dtwdVar);

    int e(Exception exc, int i, dtwd dtwdVar);

    Closeable l(dtwd dtwdVar);

    void m(SQLiteDatabase sQLiteDatabase);

    boolean n();
}
