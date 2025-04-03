package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyme {
    public final dzja b;
    public final Context c;
    public final dypw d;
    public final dzwo e;
    public final dyij f;
    public final dyiu g;
    public final dylf h;
    public final dyjx i;
    public final dyin k;
    public final dyit l;
    public final dyyt m;
    public final dyjy n;
    public final dyka o;
    public final Map p;
    public dymd w;
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final Map B = new HashMap();
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public final Handler x = new Handler(Looper.getMainLooper());
    public final Object y = new Object();
    public final errl j = dyia.b().a;
    public final ConcurrentMap q = new ConcurrentHashMap();
    public final Timer A = new Timer("TypingIndicatorTimer", true);
    final Map z = new HashMap();
    public final Set r = new HashSet();
    public final Map s = new HashMap();

    public dyme(Context context, dzja dzjaVar, dypw dypwVar, dyin dyinVar, dyit dyitVar, dzwo dzwoVar, dyij dyijVar, dyiu dyiuVar, dylf dylfVar, dyjy dyjyVar, dyjx dyjxVar, dyka dykaVar, Map map) {
        this.c = context;
        this.b = dzjaVar;
        this.d = dypwVar;
        this.e = dzwoVar;
        this.f = dyijVar;
        this.g = dyiuVar;
        this.h = dylfVar;
        this.n = dyjyVar;
        this.i = dyjxVar;
        this.p = map;
        this.o = dykaVar;
        this.k = dyinVar;
        this.l = dyitVar;
        this.m = dyyt.a(context);
    }

    public static synchronized dyme a(Context context, dzja dzjaVar, dypw dypwVar, dyin dyinVar, dyit dyitVar, dzwo dzwoVar, dyij dyijVar, dyiu dyiuVar, dylf dylfVar, dyjy dyjyVar, dyjx dyjxVar, Map map) {
        dyme dymeVar;
        synchronized (dyme.class) {
            Map map2 = B;
            if (!map2.containsKey(dzjaVar)) {
                map2.put(dzjaVar, new dyme(context, dzjaVar, dypwVar, dyinVar, dyitVar, dzwoVar, dyijVar, dyiuVar, dylfVar, dyjyVar, dyjxVar, new dyka(), map));
            }
            dymeVar = (dyme) map2.get(dzjaVar);
        }
        return dymeVar;
    }

    public final synchronized ListenableFuture b() {
        if (!this.v && !this.t) {
            this.v = true;
            this.u = false;
            this.l.h(1);
            final dymd dymdVar = new dymd(this);
            dyxa c = dyxb.c();
            ((dyww) c).a = "stream open";
            c.b(dyxf.g);
            final dyxb a2 = c.a();
            return erqt.b(erqt.d(erqt.n(new erog() { // from class: dylk
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dyme dymeVar = dyme.this;
                    dzdk dzdkVar = (dzdk) dymeVar.d;
                    final dzci dzciVar = dzdkVar.a;
                    final UUID randomUUID = UUID.randomUUID();
                    final dzja dzjaVar = dymeVar.b;
                    final dzfp dzfpVar = new dzfp(dzjaVar, dzdkVar.b, dzdkVar.e);
                    final ListenableFuture i = erqt.i(new dzcj(fbov.b(dzdkVar.a.d.c)));
                    final dzpg f = dzjaVar.c().f();
                    final dymd dymdVar2 = dymdVar;
                    return dzciVar.c(dzjaVar, f, new eroh() { // from class: dzbs
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final dzci dzciVar2 = dzci.this;
                            final ListenableFuture a3 = dzciVar2.a(i, f);
                            dyhw.b();
                            final dzja dzjaVar2 = dzjaVar;
                            if (dzjaVar2 == null) {
                                return erqt.h(new RuntimeException("Invalid RequestType: 0"));
                            }
                            final dzfp dzfpVar2 = dzfpVar;
                            final dyqv dyqvVar = dymdVar2;
                            final UUID uuid = randomUUID;
                            ListenableFuture e = dzciVar2.e(uuid, new emwl() { // from class: dzcb
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    fcfo fcfoVar = (fcfo) obj2;
                                    fcas fcasVar = (fcas) fcat.a.createBuilder();
                                    fcasVar.copyOnWrite();
                                    fcat fcatVar = (fcat) fcasVar.instance;
                                    fcfoVar.getClass();
                                    fcatVar.c = fcfoVar;
                                    fcatVar.b |= 1;
                                    return erqt.i((fcat) fcasVar.build());
                                }
                            }, dzjaVar2);
                            final SettableFuture create = SettableFuture.create();
                            final ListenableFuture g = erny.g(e, new eroh() { // from class: dzcc
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    ListenableFuture f2 = erny.f(a3, new emwl() { // from class: dzbr
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            return ((dzcj) obj3).a;
                                        }
                                    }, erpp.a);
                                    dyqv dyqvVar2 = dyqvVar;
                                    dzfp dzfpVar3 = dzfpVar2;
                                    final dzch dzchVar = new dzch(dzci.this, create, dyqvVar2, dzfpVar3, uuid, dzjaVar2);
                                    final fcat fcatVar = (fcat) ((eyhs) obj2);
                                    return erny.f(f2, new emwl() { // from class: dzfo
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            ((fbou) obj3).b(fcat.this, dzchVar);
                                            return null;
                                        }
                                    }, erpp.a);
                                }
                            }, erpp.a);
                            return erqt.b(g).b(new erog() { // from class: dzcd
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    dzci dzciVar3 = dzci.this;
                                    ListenableFuture listenableFuture = g;
                                    dzfp dzfpVar3 = dzfpVar2;
                                    UUID uuid2 = uuid;
                                    SettableFuture settableFuture = create;
                                    long micros = settableFuture.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) settableFuture.get()).longValue()) : 0L;
                                    try {
                                        dyyt dyytVar = dzciVar3.c;
                                        dzhl r = dzhm.r();
                                        r.g(10003);
                                        r.n(dzfpVar3.a.c().f());
                                        r.o(dzfpVar3.a.d().E());
                                        r.p(uuid2.toString());
                                        r.j(11);
                                        r.f(1);
                                        r.e(micros);
                                        dyytVar.b(r.a());
                                        return listenableFuture;
                                    } catch (Exception e2) {
                                        int a4 = dzcw.b().a(dzciVar3.a, e2.getCause());
                                        int value = Status.c(e2.getCause()).getCode().value();
                                        dyyt dyytVar2 = dzciVar3.c;
                                        dzhl r2 = dzhm.r();
                                        r2.g(10003);
                                        r2.n(dzfpVar3.a.c().f());
                                        r2.o(dzfpVar3.a.d().E());
                                        r2.p(uuid2.toString());
                                        r2.j(11);
                                        r2.m(Integer.valueOf(value));
                                        r2.f(a4);
                                        r2.e(micros);
                                        dyytVar2.b(r2.a());
                                        return listenableFuture;
                                    }
                                }
                            }, erpp.a);
                        }
                    }, 0, a2, true);
                }
            }, this.j)).a(new Callable() { // from class: dyll
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dyme dymeVar = dyme.this;
                    dymd dymdVar2 = dymdVar;
                    synchronized (dymeVar) {
                        if (dymeVar.u) {
                            dyhr.a("MsgReceiver", "BindV2 stream had an error. Not marking as open.");
                            return null;
                        }
                        dymeVar.w = dymdVar2;
                        dymeVar.t = true;
                        dymeVar.u = false;
                        dymeVar.l.h(2);
                        dyhr.a("MsgReceiver", a.t(((dzim) dymeVar.b.c().f()).a, "BindV2 stream opened for "));
                        return null;
                    }
                }
            }, erpp.a)).a(new Callable() { // from class: dylm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dyme dymeVar = dyme.this;
                    synchronized (dymeVar) {
                        dymeVar.v = false;
                    }
                    return null;
                }
            }, erpp.a);
        }
        return erqt.i(null);
    }

    public final synchronized void c() {
        dzcg dzcgVar;
        ffam ffamVar;
        if (this.t) {
            dymd dymdVar = this.w;
            if (dymdVar != null && (dzcgVar = dymdVar.b) != null && (ffamVar = dzcgVar.a.a) != null) {
                ffamVar.d("", Status.c.asException());
            }
            f();
        }
    }

    public final synchronized void d() {
        l(engw.n(this.r));
        this.r.clear();
    }

    public final synchronized void e() {
        i(enhk.j(this.s));
        this.s.clear();
    }

    public final synchronized void f() {
        this.w = null;
        this.t = false;
        this.u = true;
        dyhr.a("MsgReceiver", "BindV2 stream closed for ".concat(((dzim) this.b.c().f()).a));
    }

    public final void g(dzpt dzptVar, dzpg dzpgVar) {
        if (this.z.containsKey(dzptVar)) {
            ((Map) this.z.get(dzptVar)).remove(dzpgVar);
            if (((Map) this.z.get(dzptVar)).isEmpty()) {
                this.z.remove(dzptVar);
            }
        }
    }

    public final void h(dzsc dzscVar) {
        if (((Boolean) this.e.l(dzscVar).second).booleanValue()) {
            this.q.remove(dzscVar.e());
            dyyt dyytVar = this.m;
            dzhl r = dzhm.r();
            r.g(10021);
            r.n(this.b.c().f());
            r.o(this.b.d().E());
            r.p(dzscVar.e());
            dyytVar.b(r.a());
        }
    }

    public final void i(final Map map) {
        dyxa c = dyxb.c();
        ((dyww) c).a = "delivery receipt";
        c.b(dyxf.g);
        final dyxb a2 = c.a();
        for (final dzpt dzptVar : map.keySet()) {
            this.e.o(dzxe.a(dzptVar)).k(new dzwt() { // from class: dylx
                @Override // defpackage.dzwt
                public final void a(Object obj) {
                    if (((dzor) obj).a()) {
                        return;
                    }
                    final dyxb dyxbVar = a2;
                    final Map map2 = map;
                    final dzpt dzptVar2 = dzptVar;
                    final dyme dymeVar = dyme.this;
                    dymeVar.j.submit(new Runnable() { // from class: dylo
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dyme dymeVar2 = dyme.this;
                            dzwo dzwoVar = dymeVar2.e;
                            final dzpt dzptVar3 = dzptVar2;
                            dzwoVar.q(dzptVar3);
                            dzwo dzwoVar2 = dymeVar2.e;
                            final SettableFuture create = SettableFuture.create();
                            dzwoVar2.q(dzptVar3).k(new dzwt() { // from class: dylt
                                @Override // defpackage.dzwt
                                public final void a(Object obj2) {
                                    SettableFuture.this.set((emxc) obj2);
                                }
                            });
                            final Map map3 = map2;
                            final dyxb dyxbVar2 = dyxbVar;
                            erqt.d(erny.g(create, new eroh() { // from class: dylv
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    emxc emxcVar = (emxc) obj2;
                                    eyee n = emxcVar.g() ? ((dzpk) emxcVar.c()).n() : eyee.b;
                                    dyme dymeVar3 = dyme.this;
                                    dyxb dyxbVar3 = dyxbVar2;
                                    Map map4 = map3;
                                    dzpt dzptVar4 = dzptVar3;
                                    return dymeVar3.d.b(dymeVar3.b, dzptVar4, n, engw.n((Collection) map4.get(dzptVar4)), dyxbVar3);
                                }
                            }, dymeVar2.j)).a(new Callable() { // from class: dylw
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    dyme.this.e.I(engw.n((Collection) map3.get(dzptVar3)));
                                    return null;
                                }
                            }, dymeVar2.j);
                        }
                    });
                }
            });
        }
    }

    public final boolean j(dzbb dzbbVar) {
        dzac dzacVar = (dzac) dzbbVar;
        dzpt dzptVar = dzacVar.e;
        final SettableFuture create = SettableFuture.create();
        this.e.q(dzptVar).k(new dzwt() { // from class: dylu
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                long j = dyme.a;
                SettableFuture.this.set((emxc) obj);
            }
        });
        try {
            emxc emxcVar = (emxc) create.get();
            if (!emxcVar.g()) {
                dyhr.a("MsgReceiver", "Received receipt for unknown conversation ".concat(dzacVar.e.toString()));
                return false;
            }
            dzpk dzpkVar = (dzpk) emxcVar.c();
            if (dzpkVar.h().e().equals(dzpq.ONE_TO_ONE)) {
                return true;
            }
            emxc a2 = dzdw.a(dzpkVar.o());
            return !a2.g() || ((dyzw) a2.c()).a.contains(dzacVar.d);
        } catch (Exception e) {
            dyhr.d("MsgReceiver", "Unexpected exception", e);
            return false;
        }
    }

    public final boolean k(dzpt dzptVar, final long j) {
        dzwo dzwoVar = this.e;
        final SettableFuture create = SettableFuture.create();
        dzwoVar.q(dzptVar).k(new dzwt() { // from class: dyma
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                emxc emxcVar = (emxc) obj;
                long j2 = dyme.a;
                boolean z = false;
                if (emxcVar.g()) {
                    if (((dzpk) emxcVar.c()).c() >= j) {
                        z = true;
                    }
                }
                create.set(Boolean.valueOf(z));
            }
        });
        try {
            return ((Boolean) create.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            dyhr.d("MsgReceiver", "Error determining if message should be dropped, won't drop", e);
            return false;
        }
    }

    public final void l(final List list) {
        if (list.isEmpty()) {
            erqt.i(null);
            return;
        }
        dyxa c = dyxb.c();
        ((dyww) c).a = "ack messages";
        c.b(dyxf.g);
        final dyxb a2 = c.a();
        erqt.n(new erog() { // from class: dylz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dyme dymeVar = dyme.this;
                dzdk dzdkVar = (dzdk) dymeVar.d;
                dzci dzciVar = dzdkVar.a;
                UUID randomUUID = UUID.randomUUID();
                dzja dzjaVar = dymeVar.b;
                return dzciVar.b(randomUUID, new dzew(dzjaVar, list), erqt.i(new dzcj(fbov.a(dzdkVar.a.d.c))), dzjaVar, a2, true);
            }
        }, this.j);
    }

    public final synchronized void m() {
        this.o.a();
        b();
    }
}
