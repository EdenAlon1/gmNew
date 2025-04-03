package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lml {
    private final lok a = new lok();

    public final void fA(AutoCloseable autoCloseable) {
        lok lokVar = this.a;
        if (lokVar.d) {
            lok.a(autoCloseable);
            return;
        }
        synchronized (lokVar.a) {
            lokVar.c.add(autoCloseable);
        }
    }

    public final void fB(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        lok lokVar = this.a;
        if (lokVar.d) {
            lok.a(autoCloseable);
            return;
        }
        synchronized (lokVar.a) {
            autoCloseable2 = (AutoCloseable) lokVar.b.put(str, autoCloseable);
        }
        lok.a(autoCloseable2);
    }

    public final void fC() {
        lok lokVar = this.a;
        if (!lokVar.d) {
            lokVar.d = true;
            synchronized (lokVar.a) {
                Iterator it = lokVar.b.values().iterator();
                while (it.hasNext()) {
                    lok.a((AutoCloseable) it.next());
                }
                Iterator it2 = lokVar.c.iterator();
                while (it2.hasNext()) {
                    lok.a((AutoCloseable) it2.next());
                }
                lokVar.c.clear();
            }
        }
        fD();
    }

    public final AutoCloseable fz(String str) {
        AutoCloseable autoCloseable;
        lok lokVar = this.a;
        synchronized (lokVar.a) {
            autoCloseable = (AutoCloseable) lokVar.b.get(str);
        }
        return autoCloseable;
    }

    protected void fD() {
    }
}
