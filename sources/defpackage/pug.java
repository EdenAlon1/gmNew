package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pug implements prx, pvi, prh {
    private static final String b = ppt.d("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final pue e;
    private boolean f;
    private final prv i;
    private final pod j;
    private final pvn l;
    private final pui m;
    private final ptc n;
    private final qbc o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final pse h = psc.b();
    private final Map k = new HashMap();

    public pug(Context context, pod podVar, pws pwsVar, prv prvVar, ptc ptcVar, qbc qbcVar) {
        this.c = context;
        pqj pqjVar = podVar.e;
        this.e = new pue(this, pqjVar);
        this.m = new pui(pqjVar, ptcVar);
        this.o = qbcVar;
        this.l = new pvn(pwsVar);
        this.j = podVar;
        this.i = prvVar;
        this.n = ptcVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(qag.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // defpackage.prh
    public final void a(pxs pxsVar, boolean z) {
        ffud ffudVar;
        psb a = this.h.a(pxsVar);
        if (a != null) {
            this.m.a(a);
        }
        synchronized (this.g) {
            ffudVar = (ffud) this.d.remove(pxsVar);
        }
        if (ffudVar != null) {
            ppt c = ppt.c();
            String str = b;
            Objects.toString(pxsVar);
            c.a(str, "Stopping tracking for ".concat(pxsVar.toString()));
            ffudVar.t(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(pxsVar);
        }
    }

    @Override // defpackage.prx
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            ppt.c();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        ppt.c().a(b, "Cancelling work ID ".concat(String.valueOf(str)));
        pue pueVar = this.e;
        if (pueVar != null && (runnable = (Runnable) pueVar.d.remove(str)) != null) {
            pueVar.c.a(runnable);
        }
        for (psb psbVar : this.h.d(str)) {
            this.m.a(psbVar);
            pta.a(this.n, psbVar);
        }
    }

    @Override // defpackage.prx
    public final void c(pyj... pyjVarArr) {
        long max;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            ppt.c();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<pyj> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (pyj pyjVar : pyjVarArr) {
            if (!this.h.e(pzh.a(pyjVar))) {
                synchronized (this.g) {
                    pxs a = pzh.a(pyjVar);
                    puf pufVar = (puf) this.k.get(a);
                    if (pufVar == null) {
                        int i = pyjVar.m;
                        pqk pqkVar = this.j.l;
                        pufVar = new puf(i, System.currentTimeMillis());
                        this.k.put(a, pufVar);
                    }
                    max = pufVar.b + (Math.max((pyjVar.m - pufVar.a) - 5, 0) * 30000);
                }
                long max2 = Math.max(pyjVar.a(), max);
                pqk pqkVar2 = this.j.l;
                long currentTimeMillis = System.currentTimeMillis();
                if (pyjVar.d == pqp.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        pue pueVar = this.e;
                        if (pueVar != null) {
                            Runnable runnable = (Runnable) pueVar.d.remove(pyjVar.c);
                            if (runnable != null) {
                                pueVar.c.a(runnable);
                            }
                            pud pudVar = new pud(pueVar, pyjVar);
                            pueVar.d.put(pyjVar.c, pudVar);
                            pueVar.c.b(max2 - System.currentTimeMillis(), pudVar);
                        }
                    } else if (pyjVar.d()) {
                        poj pojVar = pyjVar.l;
                        if (pojVar.d) {
                            ppt.c().a(b, a.i(pyjVar, "Ignoring ", ". Requires device idle."));
                        } else if (pojVar.b()) {
                            ppt.c().a(b, a.i(pyjVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(pyjVar);
                            hashSet2.add(pyjVar.c);
                        }
                    } else if (!this.h.e(pzh.a(pyjVar))) {
                        ppt.c().a(b, "Starting work for ".concat(pyjVar.c));
                        psb c = this.h.c(pyjVar);
                        this.m.b(c);
                        this.n.a(c);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                ppt.c().a(b, a.t(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (pyj pyjVar2 : hashSet) {
                    pxs a2 = pzh.a(pyjVar2);
                    if (!this.d.containsKey(a2)) {
                        this.d.put(a2, pvq.a(this.l, pyjVar2, this.o.b, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.prx
    public final boolean d() {
        return false;
    }

    @Override // defpackage.pvi
    public final void e(pyj pyjVar, pva pvaVar) {
        boolean z = pvaVar instanceof puy;
        pxs a = pzh.a(pyjVar);
        if (z) {
            if (this.h.e(a)) {
                return;
            }
            ppt c = ppt.c();
            String str = b;
            Objects.toString(a);
            c.a(str, "Constraints met: Scheduling work ID ".concat(a.toString()));
            psb b2 = this.h.b(a);
            this.m.b(b2);
            this.n.a(b2);
            return;
        }
        ppt c2 = ppt.c();
        String str2 = b;
        Objects.toString(a);
        c2.a(str2, "Constraints not met: Cancelling work ID ".concat(a.toString()));
        psb a2 = this.h.a(a);
        if (a2 != null) {
            this.m.a(a2);
            this.n.c(a2, ((puz) pvaVar).a);
        }
    }
}
