package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxm implements cavm {
    public final ffbr a;
    private final AudioManager b;

    public caxm(Context context, ffbr ffbrVar) {
        this.b = (AudioManager) context.getSystemService("audio");
        this.a = ffbrVar;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        if (!((ctyx) this.a.b()).q("sound_for_debug_plugin_enabled_key", false) || this.b == null) {
            return null;
        }
        switch (((dtrg) dtwdVar).b) {
            case QUERY:
            case READ:
                this.b.playSoundEffect(1);
                break;
            case WRITE:
            case INSERT:
            case DELETE:
            case UPDATE:
                this.b.playSoundEffect(2);
                break;
            case BEGIN_TRANSACTION:
                this.b.playSoundEffect(9);
                break;
        }
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return csjc.c();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
