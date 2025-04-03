package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyol implements dyim, dyin, dyit, dyjy, dyjx {
    public final Context a;
    public final dypw b;
    public final errl c;
    public final Executor d;
    public final dyqz e;
    public final dyyt f;
    public final Random i;
    public final dypi j;
    public dyil n;
    public dyij o;
    public dyiu p;
    public final Map q;
    LruCache r;
    private final dylf u;
    private HashSet v;
    private final HashSet w;
    private BroadcastReceiver y;
    public final Object g = new Object();
    public final Object h = new Object();
    final Map k = new HashMap();
    final Map l = new HashMap();
    public final Handler m = new Handler(Looper.getMainLooper());
    private final HashMap x = new HashMap();
    final Map s = new HashMap();
    public final Runnable t = new dyok(this);

    public dyol(Context context, dypw dypwVar, dyqz dyqzVar, dylf dylfVar, Map map, dyyt dyytVar) {
        this.r = null;
        this.a = context;
        this.b = dypwVar;
        this.e = dyqzVar;
        this.u = dylfVar;
        errl errlVar = dyia.b().a;
        this.c = errlVar;
        this.f = dyytVar;
        new HashMap();
        this.w = new HashSet();
        this.q = map;
        this.d = new ersb(errlVar);
        this.i = new Random();
        this.j = new dypi();
        int a = (int) fdql.a.get().a();
        if (a > 0) {
            this.r = new LruCache(a);
        }
    }

    private final dyme A(dzja dzjaVar) {
        dzwo l = l(dzjaVar);
        dyij dyijVar = this.o;
        dyiu dyiuVar = this.p;
        Map map = this.q;
        dylf dylfVar = this.u;
        return dyme.a(this.a, dzjaVar, this.b, this, this, l, dyijVar, dyiuVar, dylfVar, this, this, map);
    }

    public static dzpk j(dzpk dzpkVar, dzav dzavVar, long j) {
        byte[] bArr;
        int length;
        dzpj g = dzpkVar.g();
        dyhj.a();
        g.h(System.currentTimeMillis() + j);
        g.c(true);
        if (!TextUtils.isEmpty(dzavVar.l())) {
            g.p(dzavVar.l());
        }
        if (z(dzpkVar.j(), dzavVar)) {
            g.j((String) dzavVar.d().c());
            g.k(true);
        } else if (dzavVar.g().g() && (length = (bArr = (byte[]) dzavVar.g().c()).length) > 0) {
            g.i(BitmapFactory.decodeByteArray(bArr, 0, length));
        }
        if (!dzavVar.j().isEmpty()) {
            g.b(dzavVar.j());
        }
        if (dzavVar.f().g()) {
            g.o(((Long) dzavVar.f().c()).longValue());
        }
        return g.a();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public static boolean z(emxc emxcVar, dzav dzavVar) {
        if (!dzavVar.d().g()) {
            return false;
        }
        if (!emxcVar.g()) {
            return true;
        }
        ?? c = dzavVar.d().c();
        return (TextUtils.isEmpty(c) || ((String) c).equals(emxcVar.c())) ? false : true;
    }

    @Override // defpackage.dyim
    public final dzwu a(dzja dzjaVar, dzpt dzptVar) {
        return m(dzjaVar, dzptVar, new emxg() { // from class: dyoc
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dyhj.a();
                return System.currentTimeMillis() > ((dzpk) obj).b();
            }
        }, new emxg() { // from class: dyod
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzpk) obj).e() == -1;
            }
        });
    }

    @Override // defpackage.dyim
    public final emxc b(dzja dzjaVar, emxc emxcVar) {
        if (fdpk.b() && emxcVar.g() && ((dzpk) emxcVar.c()).h().e() == dzpq.ONE_TO_ONE && !dyjq.b((dzpk) emxcVar.c())) {
            dyyt dyytVar = this.f;
            dzhl r = dzhm.r();
            r.g(92);
            r.f(701);
            r.n(dzjaVar.c().f());
            r.o(dzjaVar.d().E());
            r.d(((dzpk) emxcVar.c()).h());
            dyytVar.b(r.a());
            dyil dyilVar = this.n;
            dzpg c = ((dzpk) emxcVar.c()).h().c();
            dyle dyleVar = (dyle) dyilVar;
            emxc u = dyleVar.d(dzjaVar).u(c);
            if (u.g()) {
                dyleVar.c(dzjaVar, c, u, new emxg() { // from class: dykw
                    @Override // defpackage.emxg
                    public final boolean a(Object obj) {
                        dyhj.a();
                        return System.currentTimeMillis() > ((dzpb) obj).a();
                    }
                });
            }
            if (u.g()) {
                dzpj g = ((dzpk) emxcVar.c()).g();
                if (((dzpb) u.c()).i().g() && emxe.c((String) ((dzpk) emxcVar.c()).l().f())) {
                    g.p((String) ((dzpb) u.c()).i().c());
                }
                if (((dzpb) u.c()).g().g() && emxe.c((String) ((dzpk) emxcVar.c()).j().f())) {
                    g.j((String) ((dzpb) u.c()).g().c());
                }
                dzpk a = g.a();
                if (!dyjq.b(a)) {
                    dyyt dyytVar2 = this.f;
                    dzhl r2 = dzhm.r();
                    r2.g(92);
                    r2.f(702);
                    r2.n(dzjaVar.c().f());
                    r2.o(dzjaVar.d().E());
                    r2.d(((dzpk) emxcVar.c()).h());
                    dyytVar2.b(r2.a());
                }
                return emxc.j(a);
            }
            dyhr.c("LiMsgController", "conversation profile fallback failed because other participant is not found");
        }
        return emxcVar;
    }

    @Override // defpackage.dyim
    public final synchronized void c(List list) {
        HashSet hashSet = this.w;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.addAll(list);
        if (isEmpty) {
            this.m.post(new dynw(this));
        }
    }

    @Override // defpackage.dyim
    public final synchronized void d(dzja dzjaVar) {
        int intValue = (this.x.containsKey(dzjaVar) ? ((Integer) this.x.get(dzjaVar)).intValue() : 0) + 1;
        if (intValue == 1) {
            dyhr.a("LiMsgController", "BindV2 start for ".concat(((dzim) dzjaVar.c().f()).a));
            v(dzjaVar);
        } else {
            dyhr.a("LiMsgController", "BindV2 ignore start for ".concat(((dzim) dzjaVar.c().f()).a));
        }
        this.x.put(dzjaVar, Integer.valueOf(intValue));
    }

    @Override // defpackage.dyim
    public final synchronized void e(final dzja dzjaVar) {
        this.m.postDelayed(new Runnable() { // from class: dyoa
            @Override // java.lang.Runnable
            public final void run() {
                dyol.this.y(dzjaVar);
            }
        }, fdpe.a.get().a());
    }

    @Override // defpackage.dyim
    public final synchronized void f(List list) {
        HashSet hashSet = this.v;
        if (hashSet != null && !hashSet.isEmpty()) {
            this.v.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A((dzja) it.next()).c();
            }
            if (this.v.isEmpty()) {
                this.m.removeCallbacks(this.t);
                BroadcastReceiver broadcastReceiver = this.y;
                if (broadcastReceiver != null) {
                    this.a.unregisterReceiver(broadcastReceiver);
                    this.y = null;
                    return;
                }
            }
            return;
        }
        dyhr.a("LiMsgController", "No accounts with open bind channel");
    }

    @Override // defpackage.dyim
    public final dzqs g(dzpt dzptVar, dzqk dzqkVar, String str, emxc emxcVar, enhk enhkVar) {
        dzqg t = dzqs.t();
        String uuid = UUID.randomUUID().toString();
        dyhj.a();
        t.j(String.format("%s%s-%s", "", uuid, Long.valueOf(System.currentTimeMillis())));
        dznl dznlVar = (dznl) t;
        dznlVar.e = 2;
        t.k(dzqm.OUTGOING_PENDING_SEND);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dyhj.a();
        t.n(timeUnit.toMicros(System.currentTimeMillis()));
        t.e(dzptVar);
        dznlVar.b = dzqkVar;
        t.f(str);
        dznlVar.a = dzptVar.a();
        t.c(192);
        t.r();
        t.l(enhkVar);
        t.o((String) ((emxn) emxcVar).a);
        return t.a();
    }

    @Override // defpackage.dyit
    public final void h(int i) {
        dypi dypiVar = this.j;
        if (dypiVar.c == i) {
            return;
        }
        dypiVar.c = i;
        dypiVar.a();
    }

    @Override // defpackage.dyjy
    public final void i(final dzja dzjaVar, final dzpt dzptVar, final dzav dzavVar) {
        l(dzjaVar).q(dzptVar).k(new dzwt() { // from class: dymf
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (!emxcVar.g()) {
                    dyhr.c("LiMsgController", "Profile changes received for non-existent conversation.");
                    return;
                }
                final dzav dzavVar2 = dzavVar;
                final dzpk dzpkVar = (dzpk) emxcVar.c();
                if (dzavVar2.f().g() && dzpkVar.f() > ((Long) dzavVar2.f().c()).longValue()) {
                    dyhr.c("LiMsgController", "Profile changes received that were older than current conversation.");
                    return;
                }
                dzpt dzptVar2 = dzptVar;
                final dzja dzjaVar2 = dzjaVar;
                final dyol dyolVar = dyol.this;
                dyhr.a("LiMsgController", "Profile changes: " + dzavVar2.toString() + " for conversation: " + dzptVar2.toString());
                dyolVar.c.submit(new Runnable() { // from class: dynt
                    @Override // java.lang.Runnable
                    public final void run() {
                        int c = (int) fdql.c();
                        dyol dyolVar2 = dyol.this;
                        long nextInt = dyolVar2.i.nextInt(c) + fdql.b();
                        dzpk dzpkVar2 = dzpkVar;
                        dzav dzavVar3 = dzavVar2;
                        dzja dzjaVar3 = dzjaVar2;
                        dzpk j = dyol.j(dzpkVar2, dzavVar3, nextInt);
                        dyolVar2.l(dzjaVar3).ak(j);
                        dzmw dzmwVar = (dzmw) j;
                        if (dzpkVar2.j().equals(dzmwVar.c) && dzmwVar.d.g()) {
                            return;
                        }
                        dyolVar2.n(dzjaVar3, j);
                    }
                });
            }
        });
    }

    public final dzpk k(dzja dzjaVar, dzpt dzptVar, emxc emxcVar, emxg emxgVar, emxg emxgVar2) {
        dzpk dzpkVar;
        boolean a;
        if (emxcVar.g()) {
            dzpkVar = (dzpk) emxcVar.c();
            a = emxgVar.a((dzpk) emxcVar.c());
        } else {
            dzpj r = dzpk.r();
            r.f(dzptVar);
            r.h(-1L);
            r.b(new HashMap());
            r.c(dzptVar.e() == dzpq.ONE_TO_ONE);
            dzpkVar = r.a();
            a = false;
        }
        boolean a2 = emxgVar2.a(dzpkVar);
        ListenableFuture i = erqt.i(dzpkVar);
        if (a) {
            i = r(dzjaVar, dzpkVar, false);
        } else if (dzpkVar.q() && !dzpkVar.i().g()) {
            i = n(dzjaVar, dzpkVar);
        }
        if (a2) {
            erqt.b(i).b(new erog() { // from class: dynv
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return erqt.i(false);
                }
            }, this.c);
        }
        return dzpkVar;
    }

    public final dzwo l(dzja dzjaVar) {
        return this.e.b(dzjaVar);
    }

    public final dzwu m(final dzja dzjaVar, final dzpt dzptVar, final emxg emxgVar, final emxg emxgVar2) {
        return dzwn.d(l(dzjaVar).q(dzptVar), new emwl() { // from class: dymi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dyol.this.k(dzjaVar, dzptVar, (emxc) obj, emxgVar, emxgVar2);
            }
        });
    }

    public final ListenableFuture n(final dzja dzjaVar, final dzpk dzpkVar) {
        ListenableFuture listenableFuture;
        ListenableFuture f;
        if (!dzpkVar.j().g()) {
            return erqt.i(dzpkVar);
        }
        final Pair create = Pair.create(dzjaVar, Pair.create(dzpkVar.h(), dzpkVar.j().c()));
        synchronized (this.h) {
            listenableFuture = (ListenableFuture) this.l.get(create);
            if (listenableFuture == null) {
                dyyt dyytVar = this.f;
                dzhl r = dzhm.r();
                r.g(37);
                r.n(dzjaVar.c().f());
                r.o(dzjaVar.d().E());
                r.d(dzpkVar.h());
                dyytVar.b(r.a());
                if (dzpkVar.j().g()) {
                    ListenableFuture submit = this.c.submit(new dyjh(this.a, (String) dzpkVar.j().c()));
                    erqt.r(submit, new dyoj(this, dzjaVar, dzpkVar), erpp.a);
                    f = erny.f(submit, new emwl() { // from class: dymt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            dzpk a;
                            dyol dyolVar = dyol.this;
                            dzpk dzpkVar2 = dzpkVar;
                            dzja dzjaVar2 = dzjaVar;
                            Bitmap bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                                dzpj g = dzpkVar2.g();
                                g.k(false);
                                g.i(bitmap);
                                a = g.a();
                                dyyt dyytVar2 = dyolVar.f;
                                dzhl r2 = dzhm.r();
                                r2.g(38);
                                r2.n(dzjaVar2.c().f());
                                r2.o(dzjaVar2.d().E());
                                r2.d(dzpkVar2.h());
                                dyytVar2.b(r2.a());
                            } else {
                                dzpj g2 = dzpkVar2.g();
                                g2.k(true);
                                a = g2.a();
                                dyyt dyytVar3 = dyolVar.f;
                                dzhl r3 = dzhm.r();
                                r3.g(39);
                                r3.n(dzjaVar2.c().f());
                                r3.o(dzjaVar2.d().E());
                                r3.d(dzpkVar2.h());
                                dyytVar3.b(r3.a());
                            }
                            dyolVar.l(dzjaVar2).ak(a);
                            return a;
                        }
                    }, erpp.a);
                } else {
                    f = erqt.i(dzpkVar);
                }
                listenableFuture = f;
                this.l.put(create, listenableFuture);
                listenableFuture.b(new Runnable() { // from class: dynu
                    @Override // java.lang.Runnable
                    public final void run() {
                        dyol dyolVar = dyol.this;
                        Object obj = dyolVar.h;
                        Pair pair = create;
                        synchronized (obj) {
                            dyolVar.l.remove(pair);
                        }
                    }
                }, erpp.a);
            } else {
                dyhr.a("LiMsgController", "conversationSync or conversationImageFetch already pending for conversation");
            }
        }
        return listenableFuture;
    }

    public final ListenableFuture o(dzja dzjaVar, dzpt dzptVar) {
        dzwu dzwuVar;
        synchronized (this) {
            Pair create = Pair.create(dzjaVar, dzptVar);
            LruCache lruCache = this.r;
            dzwuVar = lruCache == null ? null : (dzwu) lruCache.get(create);
            if (dzwuVar == null) {
                emxl emxlVar = emxl.ALWAYS_FALSE;
                dzwuVar = m(dzjaVar, dzptVar, emxlVar, emxlVar);
                LruCache lruCache2 = this.r;
                if (lruCache2 != null) {
                    lruCache2.put(create, dzwuVar);
                }
            }
        }
        final SettableFuture create2 = SettableFuture.create();
        dzwuVar.k(new dzwt() { // from class: dyml
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                SettableFuture.this.set((dzpk) obj);
            }
        });
        return create2;
    }

    public final ListenableFuture p(dzja dzjaVar, dzpt dzptVar) {
        dyqz dyqzVar = this.e;
        final SettableFuture create = SettableFuture.create();
        dyqzVar.b(dzjaVar).an(dzptVar, dzqr.e).k(new dzwt() { // from class: dymq
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                SettableFuture.this.set(Boolean.valueOf(((engw) obj).isEmpty()));
            }
        });
        return create;
    }

    public final ListenableFuture q(final dzja dzjaVar, final dzqs dzqsVar, final boolean z) {
        final SettableFuture create = SettableFuture.create();
        this.d.execute(new Runnable() { // from class: dyny
            @Override // java.lang.Runnable
            public final void run() {
                dyol dyolVar = dyol.this;
                dzja dzjaVar2 = dzjaVar;
                dzqs dzqsVar2 = dzqsVar;
                dzqg g = dzqsVar2.g();
                boolean z2 = z;
                g.k(z2 ? dzqm.LOCAL : dzqm.OUTGOING_SENDING);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dyhj.a();
                g.n(timeUnit.toMicros(System.currentTimeMillis() + (z2 ? 0L : fdpk.a.get().c())));
                dzqs a = g.a();
                try {
                    dyolVar.l(dzjaVar2).V(a);
                    if (!z2) {
                        dyolVar.t(dzqsVar2, true);
                    }
                    create.set(a);
                } catch (Throwable th) {
                    if (!z2) {
                        dyolVar.t(dzqsVar2, false);
                    }
                    throw th;
                }
            }
        });
        return create;
    }

    public final ListenableFuture r(final dzja dzjaVar, final dzpk dzpkVar, final boolean z) {
        ListenableFuture listenableFuture;
        synchronized (this.g) {
            final Pair create = Pair.create(dzjaVar, dzpkVar.h());
            listenableFuture = (ListenableFuture) this.k.get(create);
            if (listenableFuture == null) {
                dyxa c = dyxb.c();
                ((dyww) c).a = "sync conversation profile";
                c.b(dyxf.g);
                final dyxb a = c.a();
                final ListenableFuture n = erqt.n(new erog() { // from class: dynr
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        dzpk dzpkVar2 = dzpkVar;
                        dzpt h = dzpkVar2.h();
                        eyee n2 = dzpkVar2.n();
                        if (h.e() != dzpq.GROUP) {
                            dypx dypxVar = new dypx();
                            dypxVar.b = 1;
                            return erqt.i(dypxVar.a());
                        }
                        dyol dyolVar = dyol.this;
                        dyxb dyxbVar = a;
                        dzja dzjaVar2 = dzjaVar;
                        dzdk dzdkVar = (dzdk) dyolVar.b;
                        return dzdkVar.a.b(UUID.randomUUID(), new dzff(dzdkVar.b, dzjaVar2, h, n2), dzdkVar.a.d.b(), dzjaVar2, dyxbVar, true);
                    }
                }, this.c);
                listenableFuture = erqt.b(n).a(new Callable() { // from class: dyns
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int c2 = (int) fdql.c();
                        ListenableFuture listenableFuture2 = n;
                        dyol dyolVar = dyol.this;
                        int nextInt = dyolVar.i.nextInt(c2);
                        long b = fdql.b();
                        dyql dyqlVar = (dyql) erqt.q(listenableFuture2);
                        long nextInt2 = dyolVar.i.nextInt(nextInt) + b;
                        int b2 = dyqlVar.b() - 1;
                        dzpk dzpkVar2 = dzpkVar;
                        if (b2 != 1) {
                            dyhr.e("LiMsgController", "Conversation profile is not supported.");
                            dzpj g = dzpkVar2.g();
                            dyhj.a();
                            g.h(System.currentTimeMillis() + nextInt2);
                            return g.a();
                        }
                        if (!dyqlVar.a().g()) {
                            dyhr.c("LiMsgController", "Got empty conversation profile.");
                            return dzpkVar2;
                        }
                        dzja dzjaVar2 = dzjaVar;
                        dzpk j = dyol.j(dzpkVar2, (dzav) dyqlVar.a().c(), nextInt2);
                        dyolVar.l(dzjaVar2).ak(j);
                        if (!((dyzy) dyqlVar.a().c()).e.g()) {
                            return j;
                        }
                        dyolVar.l(dzjaVar2).C(((dzmw) j).a, ((dyzv) ((dyzy) dyqlVar.a().c()).e.c()).a);
                        return j;
                    }
                }, erpp.a);
                this.k.put(create, listenableFuture);
                listenableFuture.b(new Runnable() { // from class: dymx
                    @Override // java.lang.Runnable
                    public final void run() {
                        dyol dyolVar = dyol.this;
                        Object obj = dyolVar.g;
                        Pair pair = create;
                        synchronized (obj) {
                            dyolVar.k.remove(pair);
                        }
                    }
                }, erpp.a);
            }
        }
        return erny.g(listenableFuture, new eroh() { // from class: dymy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dzpk dzpkVar2 = (dzpk) obj;
                if (!dzpkVar.j().equals(dzpkVar2.j()) || !dzpkVar2.i().g()) {
                    boolean z2 = z;
                    ListenableFuture n2 = dyol.this.n(dzjaVar, dzpkVar2);
                    if (z2) {
                        return n2;
                    }
                }
                return erqt.i(dzpkVar2);
            }
        }, erpp.a);
    }

    public final synchronized void s() {
        if (!this.v.isEmpty()) {
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                A((dzja) it.next()).m();
            }
        }
    }

    public final void t(dzqs dzqsVar, boolean z) {
        dzhl r = dzhm.r();
        r.g(true != z ? 60 : 59);
        r.p(dzqsVar.r());
        r.d(dzqsVar.f());
        this.f.b(r.a());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:? -> B:13:0x0085). Please report as a decompilation issue!!! */
    public final synchronized void u(long j) {
        try {
            dyhw.b();
            dyxa c = dyxb.c();
            ((dyww) c).a = "Resend Delivery Receipts";
            c.b(dyxf.g);
            final dyxb a = c.a();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                final dzja dzjaVar = (dzja) it.next();
                dzwo l = l(dzjaVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dyhj.a();
                final enhk B = l.B(timeUnit.toMicros(System.currentTimeMillis() - j));
                enqu listIterator = B.keySet().listIterator();
                while (listIterator.hasNext()) {
                    final dzpt dzptVar = (dzpt) listIterator.next();
                    try {
                        erqt.d(erny.g(o(dzjaVar, dzptVar), new eroh() { // from class: dynd
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                dzpk dzpkVar = (dzpk) obj;
                                eyee n = dzpkVar == null ? eyee.b : dzpkVar.n();
                                dyol dyolVar = dyol.this;
                                dyxb dyxbVar = a;
                                enhk enhkVar = B;
                                dzpt dzptVar2 = dzptVar;
                                return dyolVar.b.b(dzjaVar, dzptVar2, n, (List) enhkVar.get(dzptVar2), dyxbVar);
                            }
                        }, this.c)).a(new Callable() { // from class: dyne
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                enhk enhkVar = B;
                                dyol.this.l(dzjaVar).I((List) enhkVar.get(dzptVar));
                                return null;
                            }
                        }, this.c);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void v(dzja dzjaVar) {
        dyhr.a("LiMsgController", "BindV2 startMessaging() called manually for ".concat(((dzim) dzjaVar.c().f()).a));
        w(engw.r(dzjaVar));
    }

    public final synchronized void w(List list) {
        HashSet hashSet = this.v;
        if (hashSet == null) {
            this.v = new HashSet(list);
        } else {
            hashSet.addAll(list);
        }
        this.m.removeCallbacks(this.t);
        this.t.run();
        if (this.y == null) {
            this.y = new dyoi(this);
            this.a.registerReceiver(this.y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final synchronized void x(dzja dzjaVar) {
        dyhr.a("LiMsgController", "BindV2 stopMessaging() called manually for ".concat(((dzim) dzjaVar.c().f()).a));
        f(engw.r(dzjaVar));
    }

    public final synchronized void y(dzja dzjaVar) {
        int intValue = (this.x.containsKey(dzjaVar) ? ((Integer) this.x.get(dzjaVar)).intValue() : 0) - 1;
        if (intValue <= 0) {
            if (intValue < 0) {
                dyhr.c("LiMsgController", "unpaired call to stopMessagingCounted!");
            }
            dyhr.a("LiMsgController", "BindV2 stop for ".concat(((dzim) dzjaVar.c().f()).a));
            x(dzjaVar);
        } else {
            dyhr.a("LiMsgController", "BindV2 ignore stop for ".concat(((dzim) dzjaVar.c().f()).a));
        }
        this.x.put(dzjaVar, Integer.valueOf(intValue));
    }
}
