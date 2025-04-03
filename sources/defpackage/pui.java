package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pui {
    public final ptc a;
    private final pqj b;
    private final long c;
    private final Object d;
    private final Map e;

    public pui(pqj pqjVar, ptc ptcVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.b = pqjVar;
        this.a = ptcVar;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(psb psbVar) {
        Runnable runnable;
        psbVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(psbVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(final psb psbVar) {
        Runnable runnable = new Runnable() { // from class: puh
            @Override // java.lang.Runnable
            public final void run() {
                pui.this.a.c(psbVar, 3);
            }
        };
        synchronized (this.d) {
        }
        this.b.b(this.c, runnable);
    }
}
