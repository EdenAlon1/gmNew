package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypg implements dyis, dypv {
    public final dzwz a;
    public final dyyt b;
    public final List c;
    public dyim e;
    public dyik h;
    public final Map k;
    public final cgjg m;
    public final cgji n;
    public final dzdo o;
    public final Object f = new Object();
    public final Object g = new Object();
    final Map i = new HashMap();
    final Map j = new HashMap();
    public final errl l = dyia.b().a;
    private final Map p = new HashMap();
    public final Random d = new Random();

    public dypg(Map map, dzdo dzdoVar, dzwz dzwzVar, cgjg cgjgVar, cgji cgjiVar, dyyt dyytVar, cgjj cgjjVar) {
        this.k = map;
        this.o = dzdoVar;
        this.a = dzwzVar;
        this.m = cgjgVar;
        this.n = cgjiVar;
        this.b = dyytVar;
        this.c = enkr.c(cgjjVar);
    }

    public static final boolean g(dzjq dzjqVar) {
        long longValue = dzjqVar.e().longValue();
        dyhj.a();
        return longValue <= System.currentTimeMillis() - fdqc.a.get().a();
    }

    @Override // defpackage.dyis
    public final ListenableFuture a() {
        return this.l.submit(new Callable() { // from class: dyor
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                engr engrVar = new engr();
                dypg dypgVar = dypg.this;
                engw h = dypgVar.a.h();
                engrVar.j(h);
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    dzja dzjaVar = (dzja) h.get(i);
                    if (dzjaVar.b() == dziz.INVALID) {
                        dypgVar.e(dzjaVar.c().f());
                    }
                }
                return engrVar.g();
            }
        });
    }

    public final ListenableFuture b(final dzja dzjaVar, final dzjq dzjqVar, final int i) {
        ListenableFuture listenableFuture;
        final ListenableFuture f;
        ListenableFuture a;
        final dzja dzjaVar2 = dzjaVar;
        synchronized (this.g) {
            listenableFuture = (ListenableFuture) this.j.get(dzjaVar2);
            if (listenableFuture != null && !listenableFuture.isDone()) {
                dyhr.a("TyRegController", "RegisterRefresh already pending");
            }
            dyyt dyytVar = this.b;
            dzhl r = dzhm.r();
            r.g(12);
            r.f(i);
            r.n(dzjaVar2.c().f());
            r.o(dzjaVar2.d().E());
            dyytVar.b(r.a());
            if (dzjqVar.g() == 1) {
                dyhr.a("TyRegController", "User has no key.");
                dyyt dyytVar2 = this.b;
                dzhl r2 = dzhm.r();
                r2.g(14);
                r2.f(i);
                r2.n(dzjaVar2.c().f());
                r2.o(dzjaVar2.d().E());
                dyytVar2.b(r2.a());
                dyyt dyytVar3 = this.b;
                dzhl r3 = dzhm.r();
                r3.g(10016);
                r3.n(dzjaVar2.c().f());
                r3.o(dzjaVar2.d().E());
                dyytVar3.b(r3.a());
                d(dzjaVar2.c().f());
                synchronized (this.f) {
                    this.i.remove(Long.valueOf(dzjaVar2.a()));
                }
                dyqr e = dyqs.e();
                ((dyqe) e).d = 3;
                a = erqt.i(e.a());
            } else {
                dyxa c = dyxb.c();
                ((dyww) c).a = "register refresh";
                c.b(dyxf.g);
                final dyxb a2 = c.a();
                final dzdo dzdoVar = this.o;
                final cgjg cgjgVar = this.m;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dyhj.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                dzpg f2 = dzjaVar2.c().f();
                if (dzjqVar.g() != 2) {
                    dyqr e2 = dyqs.e();
                    ((dyqe) e2).d = 3;
                    f = erqt.i(e2.a());
                } else {
                    final ListenableFuture h = dzdoVar.b.h(UUID.randomUUID(), new dzft(dzjaVar2, dzdoVar.c, cgjgVar, dzdoVar.a.getPackageName(), dzjqVar.f(), micros), dzdoVar.b.d.d(), dzjaVar, dzjqVar, a2);
                    dzjaVar2 = dzjaVar;
                    f = dzdoVar.b.f(erqt.d(h).b(new erog() { // from class: dzdm
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            ListenableFuture listenableFuture2 = h;
                            dyqs dyqsVar = (dyqs) erqt.q(listenableFuture2);
                            if (dyqsVar.d() != 4) {
                                return listenableFuture2;
                            }
                            dyxb dyxbVar = a2;
                            dzjq dzjqVar2 = dzjqVar;
                            cgjg cgjgVar2 = cgjgVar;
                            dzja dzjaVar3 = dzjaVar;
                            dzdo dzdoVar2 = dzdo.this;
                            final ListenableFuture h2 = dzdoVar2.b.h(UUID.randomUUID(), new dzft(dzjaVar3, dzdoVar2.c, cgjgVar2, dzdoVar2.a.getPackageName(), dzjqVar2.f(), ((Long) dyqsVar.c().c()).longValue()), dzdoVar2.b.d.d(), dzjaVar3, dzjqVar2, dyxbVar);
                            return erqt.d(h2).b(new erog() { // from class: dzdl
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    ListenableFuture listenableFuture3 = ListenableFuture.this;
                                    if (((dyqs) erqt.q(listenableFuture3)).d() != 4) {
                                        return listenableFuture3;
                                    }
                                    dyqr e3 = dyqs.e();
                                    ((dyqe) e3).d = 3;
                                    return erqt.i(e3.a());
                                }
                            }, erpp.a);
                        }
                    }, erpp.a), f2, fgtr.REGISTRATION_UNAUTHENTICATED);
                }
                final ListenableFuture f3 = erny.f(f, new emwl() { // from class: dypc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dyqs dyqsVar = (dyqs) obj;
                        if (dyqsVar.d() != 2 || !dyqsVar.a().g() || !dyqsVar.b().g()) {
                            return null;
                        }
                        dzja dzjaVar3 = dzjaVar2;
                        int i2 = i;
                        dypg dypgVar = dypg.this;
                        dypgVar.f((dzja) dyqsVar.a().c(), (dzjq) dyqsVar.b().c());
                        dzhl r4 = dzhm.r();
                        r4.g(13);
                        r4.f(i2);
                        r4.n(dzjaVar3.c().f());
                        r4.o(dzjaVar3.d().E());
                        dypgVar.b.b(r4.a());
                        return null;
                    }
                }, erpp.a);
                final dzja dzjaVar3 = dzjaVar2;
                dzjaVar2 = dzjaVar3;
                a = erqt.b(f3).a(new Callable() { // from class: dypd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ListenableFuture listenableFuture2 = f3;
                        dzja dzjaVar4 = dzjaVar3;
                        int i2 = i;
                        ListenableFuture listenableFuture3 = f;
                        dypg dypgVar = dypg.this;
                        try {
                            erqt.q(listenableFuture3);
                            try {
                                erqt.q(listenableFuture2);
                                return (dyqs) erqt.q(listenableFuture3);
                            } catch (ExecutionException e3) {
                                dyhr.g("TyRegController", "Failed to store registration into registration store", e3);
                                dyyt dyytVar4 = dypgVar.b;
                                dzhl r4 = dzhm.r();
                                r4.g(14);
                                r4.f(i2);
                                r4.n(dzjaVar4.c().f());
                                r4.o(dzjaVar4.d().E());
                                dyytVar4.b(r4.a());
                                dyqr e4 = dyqs.e();
                                ((dyqe) e4).d = 3;
                                return e4.a();
                            }
                        } catch (ExecutionException e5) {
                            dyhr.g("TyRegController", "Failed to register refresh", e5);
                            dyyt dyytVar5 = dypgVar.b;
                            dzhl r5 = dzhm.r();
                            r5.g(14);
                            r5.f(i2);
                            r5.n(dzjaVar4.c().f());
                            r5.o(dzjaVar4.d().E());
                            dyytVar5.b(r5.a());
                            dyqr e6 = dyqs.e();
                            ((dyqe) e6).d = 3;
                            return e6.a();
                        }
                    }
                }, erpp.a);
            }
            listenableFuture = a;
            this.j.put(dzjaVar2, listenableFuture);
        }
        return listenableFuture;
    }

    @Override // defpackage.dypv
    public final ListenableFuture c(final dzja dzjaVar, boolean z) {
        emxc emxcVar;
        synchronized (this.f) {
            emxcVar = (emxc) this.i.get(Long.valueOf(dzjaVar.a()));
            if (emxcVar == null || !emxcVar.g()) {
                emxcVar = this.a.g(dzjaVar);
                this.i.put(Long.valueOf(dzjaVar.a()), emxcVar);
            }
        }
        if (!emxcVar.g()) {
            return erqt.h(new RuntimeException("Missing Auth Token"));
        }
        final dzjq dzjqVar = (dzjq) emxcVar.c();
        if (!z && dzjqVar.g() != 1) {
            long longValue = dzjqVar.d().longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dyhj.a();
            if (longValue > timeUnit.toMicros(System.currentTimeMillis() + fdqc.a.get().b())) {
                if (!g(dzjqVar)) {
                    return erqt.i(dzjqVar);
                }
                erqt.n(new erog() { // from class: dypb
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return dypg.this.b(dzjaVar, dzjqVar, 109);
                    }
                }, this.l);
                return erqt.i(dzjqVar);
            }
        }
        return erny.f(b(dzjaVar, dzjqVar, 110), new emwl() { // from class: dypa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyqs dyqsVar = (dyqs) obj;
                int d = dyqsVar.d();
                dzja dzjaVar2 = dzjaVar;
                if (d == 2 && dyqsVar.b().g()) {
                    return dyqsVar.b().c();
                }
                dypg dypgVar = dypg.this;
                synchronized (dypgVar.g) {
                    dypgVar.j.remove(dzjaVar2);
                }
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.dypv
    public final void d(final dzpg dzpgVar) {
        this.l.submit(new Runnable() { // from class: dyoq
            @Override // java.lang.Runnable
            public final void run() {
                ContentValues contentValues = new ContentValues();
                contentValues.put("server_registration_status", Integer.valueOf(dziz.INVALID.c));
                dypg dypgVar = dypg.this;
                dytg dytgVar = (dytg) dypgVar.a;
                dzpg dzpgVar2 = dzpgVar;
                if (dytgVar.k(dzpgVar2, contentValues)) {
                    dypgVar.e(dzpgVar2);
                }
            }
        });
    }

    public final void e(dzpg dzpgVar) {
        if (!this.p.containsKey(dzpgVar)) {
            Map map = this.p;
            ersc erscVar = new ersc(new erru());
            emxf.b(true, "rate must be positive");
            synchronized (erscVar.b()) {
                erscVar.f(erscVar.a.a());
                double d = 0.01d;
                erscVar.d = TimeUnit.SECONDS.toMicros(1L) / 0.01d;
                double d2 = erscVar.c;
                erscVar.c = 0.01d;
                if (d2 != Double.POSITIVE_INFINITY) {
                    d = d2 == eobe.a ? 0.0d : (erscVar.b * 0.01d) / d2;
                }
                erscVar.b = d;
            }
            map.put(dzpgVar, erscVar);
        }
        errw errwVar = (errw) this.p.get(dzpgVar);
        long max = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        emxf.d(true, "Requested permits (%s) must be positive", 1);
        synchronized (errwVar.b()) {
            long a = errwVar.a.a();
            if (errwVar.c() - max <= a) {
                long max2 = Math.max(errwVar.d(a) - a, 0L);
                errv errvVar = errwVar.a;
                if (max2 > 0) {
                    ersn.c(max2, TimeUnit.MICROSECONDS);
                }
                for (cgjj cgjjVar : this.c) {
                    if (((Boolean) cgjjVar.a.b()).booleanValue()) {
                        cgjk.a.m("Lighter registration invalided");
                        if (cgjjVar.b.isPresent()) {
                            cgjk.a.m("Attempting to re-register invalided Lighter account");
                            axnw.h(((cgjp) cgjjVar.b.get()).c(dzpgVar));
                        } else {
                            cgjk.a.r("unable to access LighterAccounts to re-register invalidated account");
                        }
                    }
                }
            }
        }
    }

    public final void f(final dzja dzjaVar, final dzjq dzjqVar) {
        final dytg dytgVar = (dytg) this.a;
        Long l = (Long) dytm.a(dytgVar.a, new Callable() { // from class: dytf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long c;
                dzja dzjaVar2 = dzjaVar;
                dytg dytgVar2 = dytg.this;
                Cursor b = dytgVar2.b(((dzii) dzjaVar2).b);
                try {
                    boolean moveToFirst = b.moveToFirst();
                    dzjq dzjqVar2 = dzjqVar;
                    if (moveToFirst) {
                        c = b.getInt(dywu.a(1));
                        dyti dytiVar = dytgVar2.a;
                        emxf.l(dytiVar.g());
                        dytiVar.b(dytgVar2.d("registration"), dyut.a(dzjaVar2, dzjqVar2), "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(c), dzjaVar2.f()});
                        dytgVar2.i(c, ((dzii) dzjaVar2).b);
                    } else {
                        dyti dytiVar2 = dytgVar2.a;
                        emxf.l(dytiVar2.g());
                        c = dytiVar2.c(dytgVar2.d("registration"), dyut.a(dzjaVar2, dzjqVar2), 0);
                        dytgVar2.i(c, ((dzii) dzjaVar2).b);
                    }
                    if (b != null) {
                        b.close();
                    }
                    return Long.valueOf(c);
                } catch (Throwable th) {
                    if (b != null) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        });
        l.longValue();
        synchronized (this.f) {
            this.i.put(l, emxc.j(dzjqVar));
        }
    }
}
