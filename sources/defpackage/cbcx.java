package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class cbcx implements Closeable {
    private final Set a;
    private final entd b;
    private final List c = new ArrayList();

    public cbcx(Set set, entd entdVar) {
        this.a = set;
        this.b = entdVar;
    }

    public abstract int a();

    final void b() {
        if (this.c.isEmpty()) {
            return;
        }
        enqu listIterator = ((enpx) this.a).listIterator();
        while (listIterator.hasNext()) {
            cbcl cbclVar = (cbcl) listIterator.next();
            cbcm cbcmVar = (cbcm) cbcn.a.createBuilder();
            List list = this.c;
            cbcmVar.copyOnWrite();
            cbcn cbcnVar = (cbcn) cbcmVar.instance;
            eygr eygrVar = cbcnVar.c;
            if (!eygrVar.c()) {
                cbcnVar.c = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(list, cbcnVar.c);
            int a = a();
            cbcmVar.copyOnWrite();
            ((cbcn) cbcmVar.instance).b = a;
            cbclVar.a((cbcn) cbcmVar.build());
        }
        this.c.clear();
    }

    final void c(int i, String str) {
        ensk o = this.b.o();
        o.Y(new ensn("operation", String.class, false, false), i != 1 ? i != 2 ? "DELETE" : "UPDATE" : "INSERT");
        o.Y(new ensn("table_type", Integer.class, false, false), Integer.valueOf(a()));
        o.Y(new ensn("item_id", String.class, false, false), str);
        o.Y(csux.O, "cbcx");
        ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver$ClosableBatchScheduler", "queue", 446, "TableContentChangeObserver.java")).q("Change in transaction is observed. Queues work item.");
        this.c.add(str);
        if (this.c.size() >= ((Integer) cbcl.a.e()).intValue()) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }
}
