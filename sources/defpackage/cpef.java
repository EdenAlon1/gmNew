package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cpef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpef implements cpdr {
    public static final cskc a = cskc.g("BugleStartup", "StartupHandler");
    public final AtomicBoolean b;
    public final erqa c;
    public final Context d;
    public final ScheduledExecutorService e;
    public final ScheduledExecutorService f;
    public final elbx g;
    public final ffbr h;
    final cfup i;
    final cfva j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final Executor n;
    private final ffbr o;
    private final ffbr p;

    /* compiled from: PG */
    interface a {
        ffbr gX();
    }

    public cpef(Context context, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, ffbr ffbrVar, elbx elbxVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.c = new erqa();
        this.i = cfvl.e(cfvl.b, "startup_interactive_wait_seconds", 15);
        this.j = cfvl.o(161420308);
        this.d = context;
        this.e = scheduledExecutorService;
        this.f = scheduledExecutorService2;
        this.o = ffbrVar;
        this.g = elbxVar;
        this.p = ffbrVar2;
        this.h = ffbrVar3;
        this.n = new ersb(scheduledExecutorService2);
    }

    private final elfl f(final cpdp cpdpVar, String str) {
        ekzz f = eleg.f(str);
        try {
            elfl f2 = elfo.f(new Runnable() { // from class: cpdu
                @Override // java.lang.Runnable
                public final void run() {
                    final cpef cpefVar = cpef.this;
                    Map map = (Map) cpefVar.h.b();
                    final cpdp cpdpVar2 = cpdpVar;
                    final ffbr ffbrVar = (ffbr) map.get(cpdpVar2);
                    ffbrVar.getClass();
                    axnw.h(cpefVar.c.a(eldl.m(new Callable() { // from class: cpds
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cpef.this.e((Set) ffbrVar.b(), cpdpVar2);
                            return null;
                        }
                    }), cpefVar.f));
                }
            }, this.n);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final elfl g() {
        return this.k.getAndSet(true) ? elfo.e(new cpeg(false)) : f(cpdp.APP_CREATED, "StartupHandlerImpl#onApplicationCreatedInternal").i(new eroh() { // from class: cpeb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cpef cpefVar = cpef.this;
                return cpefVar.i.b().h(new emwl() { // from class: cpdv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cpef.a.m("Starting timer for onAppInteractive tasks");
                        final cpef cpefVar2 = cpef.this;
                        return cpefVar2.e.schedule(new Callable() { // from class: cpdt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cpef cpefVar3 = cpef.this;
                                ekzm b = cpefVar3.g.b("StartupHandlerImpl App Interactive Delay Timer Fired");
                                try {
                                    elfl d = cpefVar3.d(true);
                                    b.close();
                                    return d;
                                } catch (Throwable th) {
                                    try {
                                        b.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, ((Integer) obj2).intValue(), TimeUnit.SECONDS);
                    }
                }, cpefVar.e);
            }
        }, this.e).h(new emwl() { // from class: cpec
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new cpeg(true);
            }
        }, erpp.a);
    }

    private final void h(elfl elflVar) {
        if (((Boolean) this.j.e()).booleanValue()) {
            axnw.h(elflVar);
        } else {
            elflVar.k(axou.a(new cped()), erpp.a);
        }
    }

    private final boolean i() {
        if (!ctid.g(this.d)) {
            Context context = this.d;
            int i = ctid.k.get();
            if (i == 0) {
                boolean equals = ctid.a(context).equals(context.getPackageName().concat(":rcs"));
                ctid.k.set(true != equals ? 2 : 1);
                if (!equals) {
                    return false;
                }
            } else if (i != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cpdr
    public final elfl a(final eisx eisxVar) {
        ekzz f = eleg.f("StartupHandlerImpl#onAppInteractiveAccount");
        try {
            elfl e = !i() ? elfo.e(null) : d(false).h(new emwl() { // from class: cpdw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cpef cpefVar = cpef.this;
                    AtomicBoolean atomicBoolean = cpefVar.b;
                    eisx eisxVar2 = eisxVar;
                    if (atomicBoolean.getAndSet(true)) {
                        return obj;
                    }
                    ekzz f2 = eleg.f("StartupHandlerImpl#onAppInteractiveAccountInternal");
                    try {
                        cpef.a aVar = (cpef.a) ekhv.a(cpefVar.d, cpef.a.class, eisxVar2);
                        cpef.a.m("Starting onAppInteractiveAccount tasks");
                        cpefVar.e((Set) aVar.gX().b(), cpdp.APP_INTERACTIVE);
                        f2.close();
                        return obj;
                    } catch (Throwable th) {
                        try {
                            f2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.n);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpdr
    public final elfl b() {
        ekzz f = eleg.f("StartupHandlerImpl#onApplicationCreated");
        try {
            elfl e = !i() ? elfo.e(null) : g();
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpdr
    public final elfl c() {
        ekzz f = eleg.f("StartupHandlerImpl#onRequiredPermissionsAcquired");
        try {
            elfl e = !i() ? elfo.e(null) : this.l.getAndSet(true) ? elfo.e(null) : f(cpdp.PERMISSIONS_ACQUIRED, "StartupTask#PermissionsAcquired");
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl d(boolean z) {
        elfl e;
        if (this.m.getAndSet(true)) {
            return elfo.e(null);
        }
        elfl h = g().h(new emwl() { // from class: cpdx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((cpeg) obj).a) {
                    return null;
                }
                csjb e2 = cpef.a.e();
                e2.I("onApplicationCreated startup tasks were not enqueued before onAppInteractive, executed in onAppInteractive().");
                e2.r();
                return null;
            }
        }, erpp.a);
        if (((ctud) this.o.b()).k()) {
            a.m("Starting onRequiredPermissionsAcquired tasks in onAppInteractive");
            e = c();
        } else {
            e = elfo.e(null);
        }
        csjb a2 = a.a();
        a2.I("Starting onAppInteractive tasks");
        a2.B("From timer", z);
        a2.r();
        return elfo.k(h, e, f(cpdp.APP_INTERACTIVE, "StartupHandlerImpl#onAppInteractiveInternal")).c(new Runnable() { // from class: cpdy
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, erpp.a);
    }

    public final void e(Set set, cpdp cpdpVar) {
        csjb a2 = a.a();
        a2.y("BG thread startup tasks count", set.size());
        a2.A("BG stage", cpdpVar);
        a2.r();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final cpdo cpdoVar = (cpdo) it.next();
            Context context = this.d;
            int i = cpdoVar.k;
            if (ctid.g(context) && (!cpdoVar.c() || ((ctvs) this.p.b()).e())) {
                elfl g = elfl.g(this.c.b(eldl.c(new erog() { // from class: cpdz
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        efbd.b();
                        cpdo cpdoVar2 = cpdo.this;
                        String cls = cpdoVar2.getClass().toString();
                        ekzz a3 = cpdoVar2.a();
                        try {
                            csjb d = cpef.a.d();
                            d.I("Beginning background startup task:");
                            d.I(cls);
                            d.r();
                            elfl b = cpdoVar2.b();
                            b.k(eldl.i(new cpee(cls)), erpp.a);
                            a3.close();
                            return b;
                        } catch (Throwable th) {
                            try {
                                a3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), this.f));
                arrayList.add(g);
                h(g);
            }
        }
        h(elfo.j(arrayList).c(new Runnable() { // from class: cpea
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, erpp.a));
    }
}
