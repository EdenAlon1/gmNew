package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazi implements cavm {
    static final cfva a = cfvl.q(172089041);
    public final cqoh b;
    public final akzt c;

    public cazi(cqoh cqohVar, akzt akztVar) {
        this.b = cqohVar;
        this.c = akztVar;
    }

    @Override // defpackage.cavm
    public final int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        return new cazh(this, dtwdVar);
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
