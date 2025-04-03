package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.Closeable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxu implements cavm {
    static final cfva a = cfvl.q(157142040);
    public static final /* synthetic */ int b = 0;
    private final ffbr c;
    private final Optional d;

    public caxu(ffbr ffbrVar, Optional optional) {
        this.c = ffbrVar;
        this.d = optional;
    }

    @Override // defpackage.cavm
    public final int e(Exception exc, int i, dtwd dtwdVar) {
        if (!((Boolean) a.e()).booleanValue() || !(exc instanceof SQLiteFullException)) {
            return 1;
        }
        ((akzt) this.c.b()).c("Bugle.Datamodel.DatabaseStorageExhausted.Counts");
        ((akzt) this.c.b()).a();
        this.d.ifPresent(new Consumer() { // from class: caxt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = caxu.b;
                ((cpei) ((ffbr) obj).b()).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ctzh.a();
        throw new IllegalStateException("exit returned");
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Closeable l(dtwd dtwdVar) {
        return null;
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
