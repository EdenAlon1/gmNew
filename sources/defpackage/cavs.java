package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavs implements cavm {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    @Override // defpackage.cavm
    public final Cursor a(Cursor cursor, dtwd dtwdVar) {
        boolean test;
        Object apply;
        for (cavq cavqVar : this.c) {
            test = cavqVar.b().test(dtwdVar);
            if (test) {
                apply = cavqVar.a().apply(cursor);
                return (Cursor) apply;
            }
        }
        return cursor;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        boolean test;
        boolean test2;
        boolean test3;
        Object apply;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            afg$$ExternalSyntheticApiModelOutline0.m104m(it.next()).accept(dtwdVar);
        }
        for (cavr cavrVar : this.a) {
            test3 = cavrVar.b().test(dtwdVar);
            if (test3) {
                apply = cavrVar.a().apply(dtwdVar);
                throw new cavn(apply);
            }
        }
        for (cavp cavpVar : this.d) {
            test2 = cavpVar.b().test(dtwdVar);
            if (test2) {
                throw cavpVar.a();
            }
        }
        for (cavo cavoVar : this.e) {
            test = cavoVar.b().test(dtwdVar);
            if (test) {
                throw cavoVar.a();
            }
        }
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return cavl.a();
    }

    @Override // defpackage.cavm
    public final void m(SQLiteDatabase sQLiteDatabase) {
    }
}
