package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgkc implements cgjp {
    public static final cskc a = cskc.g("Lighter", "LighterAccountsImpl");
    public final Context b;
    public final ffbr c;
    public final errl d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cgkc(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar) {
        this.b = context;
        this.e = ffbrVar;
        this.c = ffbrVar3;
        this.d = errlVar;
        this.f = ffbrVar2;
        this.g = ffbrVar4;
    }

    public static Optional g(String str) {
        if (str == null || !cuxe.a(str)) {
            a.m("This TikTok account doesn't have valid email address");
            return Optional.empty();
        }
        dzil dzilVar = new dzil();
        dzilVar.c(str);
        dzilVar.d("GMM");
        dzilVar.e(dzpf.EMAIL);
        return Optional.of(dzilVar.a());
    }

    @Override // defpackage.cgjp
    public final elfl a(final String str) {
        a.m("Attempting to get AccountContext by email");
        elfl g = elfl.g(((ejar) this.e.b()).c(str));
        final eixo eixoVar = (eixo) this.f.b();
        eixoVar.getClass();
        return g.i(new eroh() { // from class: cgjq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return eixo.this.h((eisx) obj);
            }
        }, this.d).e(eizq.class, new emwl() { // from class: cgjw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, erpp.a).i(new eroh() { // from class: cgjs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(Optional.empty());
                }
                String str2 = str;
                final cgkc cgkcVar = cgkc.this;
                dyis d = ((dygx) cgkcVar.c.b()).d();
                final String a2 = csji.a(cgkcVar.b, str2);
                final emwl emwlVar = new emwl() { // from class: cgjx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return csji.a(cgkc.this.b, (String) obj2);
                    }
                };
                final dypg dypgVar = (dypg) d;
                return elfl.g(dypgVar.l.submit(new Callable() { // from class: dyoo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dypg dypgVar2 = dypg.this;
                        engw h = dypgVar2.a.h();
                        int size = h.size();
                        int i = 0;
                        while (i < size) {
                            dzja dzjaVar = (dzja) h.get(i);
                            if (dzjaVar.b() == dziz.INVALID) {
                                dypgVar2.e(dzjaVar.c().f());
                            }
                            i++;
                            if (((String) emwlVar.apply(((dzim) dzjaVar.c().f()).a)).equals(a2)) {
                                dypgVar2.h.a(dzjaVar);
                                return emxc.j(dzjaVar);
                            }
                        }
                        return emux.a;
                    }
                })).i(new eroh() { // from class: cgjy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        emxc emxcVar = (emxc) obj2;
                        if (!emxcVar.g()) {
                            cgkc.a.r("No account found");
                            return elfo.e(Optional.empty());
                        }
                        dzja dzjaVar = (dzja) emxcVar.c();
                        if (dzjaVar.b() == dziz.VALID) {
                            cgkc.a.m("Found valid corresponding AccountContext");
                            return elfo.e(Optional.of(dzjaVar));
                        }
                        cgkc.a.m("Corresponding AccountContext is invalid");
                        return elfo.e(Optional.empty());
                    }
                }, cgkcVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.cgjp
    public final elfl b(eisx eisxVar) {
        return ((adkp) this.g.b()).a(eisxVar, evsg.a.a).h(new emwl() { // from class: cgjr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((adko) obj).equals(adko.YES));
            }
        }, erpp.a);
    }

    @Override // defpackage.cgjp
    public final elfl c(final dzpg dzpgVar) {
        final dypg dypgVar = (dypg) ((dygx) this.c.b()).d();
        return elfl.g(erqt.n(new erog() { // from class: dyov
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final dypg dypgVar2 = dypg.this;
                dzwz dzwzVar = dypgVar2.a;
                final dzpg dzpgVar2 = dzpgVar;
                emxc e = dzwzVar.e(dzpgVar2);
                if (e.g() && ((dzja) e.c()).b() == dziz.VALID) {
                    dyio b = dyip.b();
                    ((dyid) b).a = 2;
                    return erqt.i(b.a());
                }
                dyyt dyytVar = dypgVar2.b;
                dzhl r = dzhm.r();
                r.g(7);
                r.n(dzpgVar2);
                dyytVar.b(r.a());
                dyxa c = dyxb.c();
                ((dyww) c).a = "register";
                c.b(dyxf.g);
                final dyxb a2 = c.a();
                final ListenableFuture n = erqt.n(new erog() { // from class: dyow
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        dzpg dzpgVar3 = dzpgVar2;
                        dyxb dyxbVar = a2;
                        dypg dypgVar3 = dypg.this;
                        cgji cgjiVar = dypgVar3.n;
                        cgjg cgjgVar = dypgVar3.m;
                        dzdo dzdoVar = dypgVar3.o;
                        if (dzpgVar3.b() == dzpf.EMAIL) {
                            return dzdoVar.b.d(UUID.randomUUID(), new dzgd(dzpgVar3, dzdoVar.c, cgjgVar, dzdoVar.a.getPackageName(), cgjiVar, dzdo.a()), dzdoVar.b.d.d(), dzpgVar3, dyxbVar, true);
                        }
                        return dzdoVar.b.d(UUID.randomUUID(), new dzfv(dzpgVar3, dzdoVar.c, cgjgVar, dzdoVar.a.getPackageName(), cgjiVar, dzdo.a()), dzdoVar.b.d.d(), dzpgVar3, dyxbVar, false);
                    }
                }, dypgVar2.l);
                final ListenableFuture f = erny.f(n, new emwl() { // from class: dyox
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dyqu dyquVar = (dyqu) obj;
                        if (!dyquVar.c().g() || !dyquVar.b().g()) {
                            return null;
                        }
                        dypg dypgVar3 = dypg.this;
                        if (dyquVar.a() != 0) {
                            if (dyquVar.a() != 2) {
                                return null;
                            }
                            dypgVar3.f((dzja) dyquVar.c().c(), (dzjq) dyquVar.b().c());
                            return null;
                        }
                        Object c2 = dyquVar.c().c();
                        dypgVar3.f((dzja) c2, (dzjq) dyquVar.b().c());
                        for (cgjj cgjjVar : dypgVar3.c) {
                        }
                        dyyt dyytVar2 = dypgVar3.b;
                        dzhl r2 = dzhm.r();
                        r2.g(1);
                        dzii dziiVar = (dzii) c2;
                        r2.n(dziiVar.b.f());
                        r2.o(dziiVar.c.E());
                        dyytVar2.b(r2.a());
                        return null;
                    }
                }, erpp.a);
                return erqt.b(f).a(new Callable() { // from class: dyoy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dyid dyidVar;
                        int i;
                        ListenableFuture listenableFuture = f;
                        dzpg dzpgVar3 = dzpgVar2;
                        ListenableFuture listenableFuture2 = n;
                        dypg dypgVar3 = dypg.this;
                        try {
                            erqt.q(listenableFuture2);
                            try {
                                erqt.q(listenableFuture);
                                dyqu dyquVar = (dyqu) listenableFuture2.get();
                                dyio b2 = dyip.b();
                                int a3 = dyquVar.a();
                                if (a3 == 0) {
                                    dyidVar = (dyid) b2;
                                    i = 2;
                                } else {
                                    if (a3 == 1) {
                                        ((dyid) b2).a = 3;
                                        return b2.a();
                                    }
                                    dyidVar = (dyid) b2;
                                    i = 4;
                                }
                                dyidVar.a = i;
                                return b2.a();
                            } catch (ExecutionException e2) {
                                dyhr.g("TyRegController", "Failed to store registration into registration store", e2);
                                dyyt dyytVar2 = dypgVar3.b;
                                dzhl r2 = dzhm.r();
                                r2.g(8);
                                r2.n(dzpgVar3);
                                dyytVar2.b(r2.a());
                                dyio b3 = dyip.b();
                                ((dyid) b3).a = 3;
                                return b3.a();
                            }
                        } catch (ExecutionException e3) {
                            dyhr.g("TyRegController", "Failed to register", e3);
                            dyyt dyytVar3 = dypgVar3.b;
                            dzhl r3 = dzhm.r();
                            r3.g(8);
                            r3.n(dzpgVar3);
                            dyytVar3.b(r3.a());
                            dyio b4 = dyip.b();
                            ((dyid) b4).a = 3;
                            return b4.a();
                        }
                    }
                }, erpp.a);
            }
        }, dypgVar.l)).i(new eroh() { // from class: cgjz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((dyip) obj).a() == 2) {
                    return cgkc.this.f(Optional.of(dzpgVar));
                }
                cgkc.a.m("Unable to register user.");
                return elfo.e(Optional.empty());
            }
        }, this.d);
    }

    @Override // defpackage.cgjp
    public final elfl d(eisx eisxVar) {
        return elfl.g(((ejar) this.e.b()).b(eisxVar)).h(new emwl() { // from class: cgjv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cgkc.g((String) obj);
            }
        }, this.d).i(new eroh() { // from class: cgjt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                return optional.isPresent() ? cgkc.this.c((dzpg) optional.get()) : elfo.e(Optional.empty());
            }
        }, this.d);
    }

    @Override // defpackage.cgjp
    public final elfl e(eixz eixzVar) {
        return f(g(((ejar) this.e.b()).e(eixzVar))).i(new eroh() { // from class: cgkb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    cgkc.a.m("This account can't be unregistered since it is not registered to Lighter.");
                    return elfo.e(false);
                }
                cgkc cgkcVar = cgkc.this;
                final dzja dzjaVar = (dzja) optional.get();
                dyis d = ((dygx) cgkcVar.c.b()).d();
                dyxa c = dyxb.c();
                ((dyww) c).a = "unregister";
                c.b(dyxf.g);
                final dyxb a2 = c.a();
                final dypg dypgVar = (dypg) d;
                Iterator it = dypgVar.k.values().iterator();
                while (it.hasNext()) {
                    ((dzdv) it.next()).e();
                }
                return elfl.g(erny.f(dypgVar.l.submit(new Callable() { // from class: dypf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final dzja dzjaVar2 = dzjaVar;
                        dypg dypgVar2 = dypg.this;
                        synchronized (dypgVar2.f) {
                            dypgVar2.i.put(Long.valueOf(dzjaVar2.a()), dypgVar2.a.g(dzjaVar2));
                        }
                        if (!dypgVar2.a.j(dzjaVar2)) {
                            return false;
                        }
                        final dyol dyolVar = (dyol) dypgVar2.e;
                        dyolVar.c.submit(new Runnable() { // from class: dyob
                            @Override // java.lang.Runnable
                            public final void run() {
                                dyol.this.l(dzjaVar2).G();
                            }
                        });
                        for (cgjj cgjjVar : dypgVar2.c) {
                            engw g = dzjaVar2.c().g();
                            int i = ((enou) g).c;
                            for (int i2 = 0; i2 < i; i2++) {
                            }
                        }
                        return true;
                    }
                }), new emwl() { // from class: dyop
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        if (!Boolean.TRUE.equals((Boolean) obj2)) {
                            dyif dyifVar = new dyif();
                            dyifVar.a = 2;
                            return dyifVar.a();
                        }
                        dyxb dyxbVar = a2;
                        final dzja dzjaVar2 = dzjaVar;
                        final dypg dypgVar2 = dypg.this;
                        UUID randomUUID = UUID.randomUUID();
                        dzgi dzgiVar = new dzgi(dzjaVar2);
                        dzdo dzdoVar = dypgVar2.o;
                        dzdoVar.b.b(randomUUID, dzgiVar, dzdoVar.b.d.d(), dzjaVar2, dyxbVar, false).b(new Runnable() { // from class: dyos
                            @Override // java.lang.Runnable
                            public final void run() {
                                dypg dypgVar3 = dypg.this;
                                Object obj3 = dypgVar3.f;
                                dzja dzjaVar3 = dzjaVar2;
                                synchronized (obj3) {
                                    dypgVar3.i.remove(Long.valueOf(dzjaVar3.a()));
                                }
                            }
                        }, erpp.a);
                        dyif dyifVar2 = new dyif();
                        dyifVar2.a = 1;
                        return dyifVar2.a();
                    }
                }, erpp.a)).i(new eroh() { // from class: cgju
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (((dyir) obj2).a() != 2) {
                            return elfo.e(true);
                        }
                        cgkc.a.m("Fail to unregister user");
                        return elfo.e(false);
                    }
                }, cgkcVar.d);
            }
        }, this.d);
    }

    public final elfl f(Optional optional) {
        if (optional.isEmpty()) {
            a.m("No contact Id is given. Return Optional.empty()");
            return elfo.e(Optional.empty());
        }
        dyis d = ((dygx) this.c.b()).d();
        final dzpg dzpgVar = (dzpg) optional.get();
        final dypg dypgVar = (dypg) d;
        return elfl.g(erqt.n(new erog() { // from class: dyoz
            /* JADX WARN: Code restructure failed: missing block: B:32:0x01ae, code lost:
            
                if (r6.containsAll(r5) != false) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x01b8, code lost:
            
                if (r11 <= (r4.a() + r9)) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
            
                if (r5 != null) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
            
                r4 = (defpackage.dytg) r4;
                r4.a.f();
                r4.a.e();
                r4 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
            
                if (r5 != null) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
            
                if (r5 != null) goto L34;
             */
            @Override // defpackage.erog
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 513
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dyoz.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, dypgVar.l)).h(new emwl() { // from class: cgka
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emxc emxcVar = (emxc) obj;
                return emxcVar.g() ? Optional.of((dzja) emxcVar.c()) : Optional.empty();
            }
        }, this.d);
    }
}
