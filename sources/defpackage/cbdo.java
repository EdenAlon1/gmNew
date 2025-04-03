package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbdo implements Closeable {
    public final entd a = entd.c("BugleJobs");
    public final List b = new ArrayList();
    private final ffbr c;

    public cbdo(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    final void a() {
        if (this.b.isEmpty()) {
            return;
        }
        cbuf cbufVar = (cbuf) this.c.b();
        cbug cbugVar = (cbug) cbuh.a.createBuilder();
        List list = this.b;
        cbugVar.copyOnWrite();
        cbuh cbuhVar = (cbuh) cbugVar.instance;
        eygr eygrVar = cbuhVar.c;
        if (!eygrVar.c()) {
            cbuhVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(list, cbuhVar.c);
        cbugVar.copyOnWrite();
        ((cbuh) cbugVar.instance).b = 11;
        ((cevh) cbufVar.a.b()).a(ceyr.g("icing_index_update_handler", (cbuh) cbugVar.build()));
        this.b.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }
}
