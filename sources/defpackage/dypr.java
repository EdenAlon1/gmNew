package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypr implements dyiu {
    public final dypw a;
    public final dyqz b;
    public final Handler f = new Handler(Looper.getMainLooper());
    private final Map g = new HashMap();
    private final Map h = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final errl c = dyia.b().a;

    public dypr(dypw dypwVar, dyqz dyqzVar) {
        this.a = dypwVar;
        this.b = dyqzVar;
    }

    private final synchronized engw h(dzpt dzptVar) {
        if (!this.h.containsKey(dzptVar)) {
            int i = engw.d;
            return enou.a;
        }
        int i2 = engw.d;
        engr engrVar = new engr();
        for (Map.Entry entry : ((Map) this.h.get(dzptVar)).entrySet()) {
            if (((Boolean) ((Pair) entry.getValue()).first).booleanValue()) {
                engrVar.h((dzpg) entry.getKey());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dyiu
    public final synchronized dzwu a(dzpt dzptVar) {
        if (this.g.containsKey(dzptVar)) {
            return (dzwu) this.g.get(dzptVar);
        }
        dzxa dzxaVar = new dzxa(h(dzptVar));
        this.g.put(dzptVar, dzxaVar);
        return dzxaVar;
    }

    @Override // defpackage.dyiu
    public final synchronized void b(dzpt dzptVar, dzpg dzpgVar, long j) {
        if (!this.h.containsKey(dzptVar)) {
            this.h.put(dzptVar, new LinkedHashMap());
        }
        if (!((Map) this.h.get(dzptVar)).containsKey(dzpgVar) || ((Long) ((Pair) ((Map) this.h.get(dzptVar)).get(dzpgVar)).second).longValue() <= j) {
            ((Map) this.h.get(dzptVar)).put(dzpgVar, Pair.create(true, Long.valueOf(j)));
            if (this.g.containsKey(dzptVar)) {
                ((dzxa) this.g.get(dzptVar)).c(h(dzptVar));
            }
        }
    }

    @Override // defpackage.dyiu
    public final synchronized void c(dzpt dzptVar) {
        this.d.remove(dzptVar);
    }

    @Override // defpackage.dyiu
    public final synchronized void d(dzpt dzptVar, dzpg dzpgVar, long j) {
        if (!this.h.containsKey(dzptVar)) {
            this.h.put(dzptVar, new LinkedHashMap());
        }
        if (!((Map) this.h.get(dzptVar)).containsKey(dzpgVar) || ((Long) ((Pair) ((Map) this.h.get(dzptVar)).get(dzpgVar)).second).longValue() <= j) {
            ((Map) this.h.get(dzptVar)).put(dzpgVar, Pair.create(false, Long.valueOf(j)));
            if (this.g.containsKey(dzptVar)) {
                ((dzxa) this.g.get(dzptVar)).c(h(dzptVar));
            }
        }
    }

    @Override // defpackage.dyiu
    public final synchronized void e(final dzja dzjaVar, final dzpt dzptVar) {
        this.c.submit(new Runnable() { // from class: dypo
            @Override // java.lang.Runnable
            public final void run() {
                final dzja dzjaVar2;
                boolean z;
                final dypr dyprVar = dypr.this;
                final dzpt dzptVar2 = dzptVar;
                long b = fdqi.b();
                synchronized (dyprVar) {
                    boolean containsKey = dyprVar.d.containsKey(dzptVar2);
                    dzjaVar2 = dzjaVar;
                    if (containsKey) {
                        z = false;
                        if (dyprVar.e.containsKey(dzptVar2)) {
                            dyhj.a();
                            if (System.currentTimeMillis() - ((Long) dyprVar.e.get(dzptVar2)).longValue() > fdqi.a() - 2000) {
                            }
                        }
                        Map map = dyprVar.d;
                        dyhj.a();
                        map.put(dzptVar2, Long.valueOf(System.currentTimeMillis()));
                    } else {
                        dyprVar.f.postDelayed(new Runnable() { // from class: dypm
                            @Override // java.lang.Runnable
                            public final void run() {
                                dypr.this.g(dzjaVar2, dzptVar2);
                            }
                        }, b);
                    }
                    z = true;
                    Map map2 = dyprVar.d;
                    dyhj.a();
                    map2.put(dzptVar2, Long.valueOf(System.currentTimeMillis()));
                }
                if (z) {
                    dyprVar.f(dzjaVar2, dzptVar2, true, 342);
                }
            }
        });
    }

    public final void f(final dzja dzjaVar, final dzpt dzptVar, final boolean z, final int i) {
        final long micros = TimeUnit.MILLISECONDS.toMicros(fdqi.a());
        this.b.b(dzjaVar).q(dzptVar).k(new dzwt() { // from class: dypn
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                if (((emxc) obj).g()) {
                    final int i2 = i;
                    final long j = micros;
                    final boolean z2 = z;
                    final dzpt dzptVar2 = dzptVar;
                    final dzja dzjaVar2 = dzjaVar;
                    final dypr dyprVar = dypr.this;
                    dyprVar.c.submit(new Runnable() { // from class: dypk
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dypr dyprVar2 = dypr.this;
                            final dzpt dzptVar3 = dzptVar2;
                            synchronized (dyprVar2) {
                                Map map = dyprVar2.e;
                                dyhj.a();
                                map.put(dzptVar3, Long.valueOf(System.currentTimeMillis()));
                            }
                            final int i3 = i2;
                            final long j2 = j;
                            final boolean z3 = z2;
                            final dzja dzjaVar3 = dzjaVar2;
                            dyxa c = dyxb.c();
                            ((dyww) c).a = "send typing indicator";
                            c.b(dyxf.g);
                            final dyxb a = c.a();
                            dyqz dyqzVar = dyprVar2.b;
                            final SettableFuture create = SettableFuture.create();
                            dyqzVar.b(dzjaVar3).q(dzptVar3).k(new dzwt() { // from class: dypl
                                @Override // defpackage.dzwt
                                public final void a(Object obj2) {
                                    SettableFuture.this.set((emxc) obj2);
                                }
                            });
                            erny.g(create, new eroh() { // from class: dypp
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    emxc emxcVar = (emxc) obj2;
                                    eyee n = emxcVar.g() ? ((dzpk) emxcVar.c()).n() : eyee.b;
                                    dypr dyprVar3 = dypr.this;
                                    int i4 = i3;
                                    dyxb dyxbVar = a;
                                    long j3 = j2;
                                    boolean z4 = z3;
                                    dzpt dzptVar4 = dzptVar3;
                                    dzja dzjaVar4 = dzjaVar3;
                                    dzdk dzdkVar = (dzdk) dyprVar3.a;
                                    dzgf dzgfVar = new dzgf(dzdkVar.b, dzjaVar4, dzptVar4, n, z4, j3, dzdk.d(dzptVar4));
                                    dzhl r = dzhm.r();
                                    r.g(18);
                                    r.n(dzjaVar4.c().f());
                                    r.o(dzjaVar4.d().E());
                                    r.p(dzgfVar.a);
                                    r.d(dzptVar4);
                                    dzdkVar.c.b(r.a());
                                    dzhl r2 = dzhm.r();
                                    r2.g(46);
                                    r2.f(i4);
                                    r2.n(dzjaVar4.c().f());
                                    r2.o(dzjaVar4.d().E());
                                    r2.p(dzgfVar.a);
                                    r2.d(dzptVar4);
                                    dzdkVar.c.b(r2.a());
                                    ListenableFuture b = dzdkVar.a.b(UUID.randomUUID(), dzgfVar, dzdkVar.a.d.b(), dzjaVar4, dyxbVar, true);
                                    erqt.r(b, new dzdh(dzdkVar, dzjaVar4, dzgfVar, dzptVar4), erpp.a);
                                    return b;
                                }
                            }, dyprVar2.c);
                        }
                    });
                }
            }
        });
    }

    public final void g(final dzja dzjaVar, final dzpt dzptVar) {
        long j;
        boolean z;
        long b = fdqi.b();
        synchronized (this) {
            if (this.d.containsKey(dzptVar)) {
                long longValue = ((Long) this.d.get(dzptVar)).longValue();
                dyhj.a();
                if (longValue <= System.currentTimeMillis() - b) {
                    this.d.remove(dzptVar);
                    z = true;
                } else {
                    z = false;
                }
                dyhj.a();
                j = (longValue + b) - System.currentTimeMillis();
            } else {
                j = -1;
                z = false;
            }
        }
        if (z) {
            f(dzjaVar, dzptVar, false, 344);
        } else if (j > 0) {
            this.f.postDelayed(new Runnable() { // from class: dypq
                @Override // java.lang.Runnable
                public final void run() {
                    dypr.this.g(dzjaVar, dzptVar);
                }
            }, j);
        }
    }
}
