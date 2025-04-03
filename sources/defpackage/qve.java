package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qve {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile qvc d;

    public qve() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new qva());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        newSingleThreadExecutor.execute(new qvb(this));
    }

    public final synchronized qwn a(qtp qtpVar) {
        qvd qvdVar = (qvd) this.a.get(qtpVar);
        if (qvdVar == null) {
            return null;
        }
        qwn qwnVar = (qwn) qvdVar.get();
        if (qwnVar == null) {
            c(qvdVar);
        }
        return qwnVar;
    }

    public final synchronized void b(qtp qtpVar, qwn qwnVar) {
        qvd qvdVar = (qvd) this.a.put(qtpVar, new qvd(qtpVar, qwnVar, this.b));
        if (qvdVar != null) {
            qvdVar.a();
        }
    }

    final void c(qvd qvdVar) {
        synchronized (this) {
            this.a.remove(qvdVar.a);
            if (qvdVar.b) {
                qwv qwvVar = qvdVar.c;
            }
        }
    }

    final synchronized void d(qtp qtpVar) {
        qvd qvdVar = (qvd) this.a.remove(qtpVar);
        if (qvdVar != null) {
            qvdVar.a();
        }
    }
}
