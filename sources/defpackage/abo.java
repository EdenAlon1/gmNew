package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abo {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;
    public ffix c;

    public abo(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(aal aalVar) {
        this.a.add(aalVar);
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aal) it.next()).b();
        }
    }

    public final void g(aal aalVar) {
        this.a.remove(aalVar);
    }

    public final void h(boolean z) {
        this.b = z;
        ffix ffixVar = this.c;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(aak aakVar) {
    }
}
