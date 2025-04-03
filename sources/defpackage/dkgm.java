package defpackage;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkgm {
    public final djjr a;
    public final CopyOnWriteArrayList b;
    public final dkhc c;
    public final dkhj d;
    public final dkhr e;
    public dkur f;
    private int g = 1;

    protected dkgm(djjr djjrVar, dkhc dkhcVar, dkur dkurVar) {
        new ArrayList();
        this.b = new CopyOnWriteArrayList();
        this.a = djjrVar;
        this.c = dkhcVar;
        this.d = new dkhj(((djji) djjrVar).k);
        this.e = new dkhr();
        this.f = dkurVar;
    }

    private final boolean p() {
        return this.g == 2;
    }

    public final String a() {
        return this.a.e();
    }

    public final void b() {
        if (!l()) {
            throw new IllegalStateException("Service not started!");
        }
    }

    public final void c(dkha dkhaVar) {
        TimerTask timerTask = (TimerTask) this.c.d.remove(dkhaVar);
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public final void d(dilc dilcVar) {
        for (dkha dkhaVar : this.c.b(this)) {
            m(dkhaVar, dilcVar);
            dkty.c("Stopped session: %s", dkhaVar.k);
        }
    }

    public final void h(dkha dkhaVar, int i, boolean z) {
        dkty.c("Starting task for session refresh: %s interval: %s", dktx.URI.c(dkhaVar.y()), Integer.valueOf(i));
        dkhc dkhcVar = this.c;
        dkhb dkhbVar = new dkhb(dkhcVar, dkhaVar, z);
        dkhcVar.d.put(dkhaVar, dkhbVar);
        int i2 = i * 1000;
        if (z) {
            i2 -= i2 / 10;
        }
        dkhcVar.c.schedule(dkhbVar, i2);
    }

    public final void i(dkha dkhaVar) {
        dkhc dkhcVar = this.c;
        synchronized (dkhcVar.a) {
            dkty.c("Remove session %s", dkhaVar.k);
            dkha dkhaVar2 = (dkha) dkhcVar.a.remove(dkhaVar.k);
            if (dkhaVar2 != dkhaVar) {
                dkty.q("Removed session is not the expected session. Removed: %s \n ---- \n Expected: %s", dkhaVar2, dkhaVar);
                if (dkhaVar2 != null) {
                    dkhcVar.c(dkhaVar2);
                }
            }
            dkhcVar.c(dkhaVar);
        }
    }

    public final synchronized void j() {
        if (l()) {
            dkty.k("Service already started", new Object[0]);
            return;
        }
        if (p()) {
            dkty.q("Service starting", new Object[0]);
            return;
        }
        this.g = 2;
        dkty.c("Starting service: %s", getClass().getName());
        try {
            f();
            if (this.g != 2) {
                return;
            }
            this.g = 3;
            try {
                e();
            } catch (Exception e) {
                dkty.i(e, "Error while starting service: %s", e.getMessage());
            }
        } catch (Exception e2) {
            dkty.i(e2, "Error while starting service: %s", e2.getMessage());
            this.g = 1;
        }
    }

    public final synchronized void k(dilc dilcVar) {
        if (!l() && !p()) {
            dkty.q("Service not started or starting", new Object[0]);
            return;
        }
        this.g = 4;
        dkty.c("Stopping service: %s", getClass().getName());
        try {
            g(dilcVar);
        } catch (Exception e) {
            dkty.g("Error while stopping service: %s", e.getMessage());
        }
        d(dilcVar);
        this.g = 1;
    }

    public final boolean l() {
        return this.g == 3;
    }

    protected void m(dkha dkhaVar, dilc dilcVar) {
        try {
            dkty.c("Stopping session: %s", dkhaVar.k);
            dkhaVar.n(2, dkgd.a(dilcVar));
        } catch (Exception e) {
            dkty.i(e, "Error while stopping session: %s", e.getMessage());
        }
    }

    public abstract void n();

    public abstract void o();

    protected void e() {
    }

    protected void f() {
    }

    protected void g(dilc dilcVar) {
    }
}
