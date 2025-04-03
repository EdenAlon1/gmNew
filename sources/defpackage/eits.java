package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eits extends eito {
    public static final elab a = new elab();
    public static final enru b = enru.c("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");
    public static final eiub c;
    public final eitw d;
    public final emxc e;
    public final eiwl f;
    public final ejlq g;
    public final eixi h;
    public final eiwj i;
    public final eivc j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final ejlr n = new ejlr<eyjv<eiub>, eitn>() { // from class: eits.1
        /* JADX WARN: Multi-variable type inference failed */
        private final void d(eiub eiubVar, eiup eiupVar) {
            eits eitsVar = eits.this;
            if (!eitsVar.m) {
                if (eiubVar.i) {
                    eitsVar.h.h(eiupVar);
                    return;
                } else {
                    eitsVar.f.l(eiupVar);
                    return;
                }
            }
            elaa b2 = eleg.b(eits.a);
            int intValue = (b2.b() ? ((Integer) b2.a()).intValue() : 0) + 1;
            if (intValue > 10) {
                ((enrr) ((enrr) eits.b.i()).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "fallbackOrSetErrorDetectingInfiniteLoop", 377, "AccountControllerImpl.java")).t("A highly probable infinite loop detected in host: %s", new evhq(evhp.NO_USER_DATA, eits.this.e.g() ? ((Activity) eits.this.e.c()).getClass().getName() : eits.this.t.getClass().getName()));
                throw new IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", eldx.c());
            }
            elac b3 = elae.b();
            b3.a(eits.a, Integer.valueOf(intValue));
            ekzz g = eleg.g("AccountController account error", ((elae) b3).f());
            try {
                if (eiubVar.i) {
                    eits.this.h.h(eiupVar);
                    g.close();
                } else {
                    eits.this.f.l(eiupVar);
                    g.close();
                }
            } catch (Throwable th) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void c(Object obj, Object obj2) {
            eisx eisxVar;
            eitn eitnVar = (eitn) obj2;
            eiub eiubVar = (eiub) ((eyjv) obj).a(eiub.a, eyfc.a());
            eits.t(eiubVar);
            if (eiubVar.equals(eits.this.p)) {
                if ((eiubVar.b & 2) != 0) {
                    emxf.l(eitnVar.a.a() == eiubVar.d);
                    eisxVar = eisx.b(eiubVar.d);
                } else {
                    if (eitnVar.d != null) {
                        if (!eits.this.f.i()) {
                            eits.this.f.m();
                        }
                        Intent intent = eitnVar.d;
                        if (eits.this.f.i()) {
                            eiuy.c(intent, eisx.b(eits.this.f.g()));
                        }
                        eits.this.d.c().c(intent);
                        eits.this.h.g();
                        return;
                    }
                    if (eitnVar.c == null) {
                        d(eiubVar, new eiuv());
                        eits.this.n();
                        eits.this.p();
                        return;
                    }
                    eisxVar = eitnVar.a;
                }
                eixm eixmVar = eitnVar.c;
                eixmVar.getClass();
                eitk eitkVar = eitnVar.e;
                if (eixmVar.c()) {
                    eits.this.f.n(eitnVar.a, eitnVar.b, eitkVar);
                    eits.this.n();
                } else {
                    if (!eits.this.d.e()) {
                        eits.this.n();
                        eixmVar.a();
                        eiut eiutVar = new eiut();
                        d(eiubVar, eiutVar);
                        ((enrr) ((enrr) ((enrr) eits.b.h()).g(eiutVar)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onSuccess", 198, "AccountControllerImpl.java")).t("Account with id %s does not fulfill all the requirements.", eisxVar);
                        eits.this.p();
                        return;
                    }
                    if (eixmVar.b()) {
                        eits.this.f.m();
                    }
                    Intent a2 = eixmVar.a();
                    eiuy.c(a2, eisxVar);
                    eiuy.b(a2);
                    eixk.b(a2, ((eiww) eits.this.o).a);
                    a2.addFlags(65536);
                    eits.this.d.b().c(a2);
                }
                eits.this.p();
            }
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void m(Object obj, Throwable th) {
            ekzz f;
            eiub eiubVar = (eiub) ((eyjv) obj).a(eiub.a, eyfc.a());
            eits.t(eiubVar);
            if (eiubVar.equals(eits.this.p)) {
                eits.this.n();
                if (th instanceof ejmg) {
                    int i = eiubVar.h;
                    if (i < 4) {
                        evhp evhpVar = evhp.NO_USER_DATA;
                        int a2 = eiua.a(eiubVar.e);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        ((enrr) ((enrr) ((enrr) eits.b.j()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 246, "AccountControllerImpl.java")).J("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new evhq(evhpVar, Integer.valueOf(a2 - 1)), new evhq(evhp.NO_USER_DATA, Integer.valueOf(i)), new evhq(evhp.NO_USER_DATA, ((ejmg) th).a.f()));
                        int a3 = eiua.a(eiubVar.e);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        if (a3 == 2 || a3 == 3 || a3 == 6) {
                            Iterator<E> it = eiubVar.f.iterator();
                            while (it.hasNext()) {
                                try {
                                    engrVar.h(Class.forName((String) it.next()).asSubclass(eivs.class));
                                } catch (ClassNotFoundException e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        }
                        emxc emxcVar = emux.a;
                        if (a3 == 6) {
                            emxf.l((eiubVar.b & 64) != 0);
                            emxcVar = emxc.j(Integer.valueOf(eiubVar.j));
                        }
                        int i3 = eiubVar.h;
                        int i4 = a3 - 1;
                        if (i4 == 1) {
                            eits.this.s(engrVar.g(), i3);
                            return;
                        }
                        if (i4 == 2) {
                            eits eitsVar = eits.this;
                            engw g = engrVar.g();
                            eitsVar.m();
                            eitsVar.l();
                            f = eleg.f("Retry Switch Account Interactive with Specified Selectors");
                            try {
                                eitsVar.q(g, i3);
                                f.close();
                                return;
                            } finally {
                            }
                        } else {
                            if (i4 == 3) {
                                int i5 = eiubVar.d;
                                emxf.l(i5 >= 0);
                                eits.this.r(eisx.b(i5), eiubVar.g, i3);
                                return;
                            }
                            if (i4 == 4) {
                                eits eitsVar2 = eits.this;
                                eitsVar2.r = true;
                                eitsVar2.k(i3);
                                return;
                            }
                            if (i4 != 5) {
                                throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                            }
                            eits eitsVar3 = eits.this;
                            engw g2 = engrVar.g();
                            adjn k = eits.this.h.k(((Integer) emxcVar.c()).intValue());
                            eitsVar3.m();
                            g2.getClass();
                            emxf.l(!g2.isEmpty());
                            eitsVar3.r = eitsVar3.q;
                            eitsVar3.h.m(k);
                            f = eleg.f("Switch Account With Custom Selectors Keep State");
                            try {
                                ListenableFuture i6 = eitsVar3.i(g2, new eitk(), true);
                                if (i6.isDone()) {
                                    ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse(null, eitsVar3.u(6, null, emxc.j(g2), emux.a, true, emxc.j(k), i3));
                                    try {
                                        eitsVar3.n.c(internalDontUse, (eitn) erqt.q(i6));
                                    } catch (ExecutionException e2) {
                                        eitsVar3.n.m(internalDontUse, e2.getCause());
                                    }
                                } else {
                                    eitsVar3.h.i();
                                    eitsVar3.v(6, null, emxc.j(g2), emux.a, true, emxc.j(k), i6, i3);
                                }
                                f.close();
                                return;
                            } finally {
                            }
                        }
                    } else {
                        d(eiubVar, new eiur(th));
                    }
                } else {
                    d(eiubVar, eiux.a(th));
                }
                if ((eiubVar.b & 2) != 0) {
                    eisx b2 = eisx.b(eiubVar.d);
                    if (th instanceof eiup) {
                        ((enrr) ((enrr) ((enrr) eits.b.h()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 268, "AccountControllerImpl.java")).t("Failed to use %s.", b2);
                    } else {
                        ((enrr) ((enrr) ((enrr) eits.b.i()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 271, "AccountControllerImpl.java")).t("Failed to use %s.", b2);
                    }
                }
                eits.this.p();
            }
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public eiwz o;
    public eiub p;
    public boolean q;
    public boolean r;
    public ListenableFuture s;
    public final ekki t;
    private final eivw u;
    private final boolean v;

    static {
        eity createBuilder = eiub.a.createBuilder();
        createBuilder.copyOnWrite();
        eiub eiubVar = (eiub) createBuilder.instance;
        eiubVar.b |= 1;
        eiubVar.c = -1;
        c = createBuilder.build();
    }

    public eits(ekki ekkiVar, final eitw eitwVar, emxc emxcVar, eiwl eiwlVar, ejlq ejlqVar, eivw eivwVar, eixi eixiVar, eiwj eiwjVar, eivc eivcVar, emxc emxcVar2, emxc emxcVar3) {
        this.t = ekkiVar;
        this.d = eitwVar;
        this.e = emxcVar;
        this.f = eiwlVar;
        this.g = ejlqVar;
        this.u = eivwVar;
        this.h = eixiVar;
        this.i = eiwjVar;
        this.j = eivcVar;
        Boolean bool = false;
        this.k = ((Boolean) emxcVar2.e(bool)).booleanValue();
        this.l = ((Boolean) emxcVar3.e(bool)).booleanValue();
        bool.getClass();
        this.m = true;
        bool.getClass();
        this.v = true;
        bool.getClass();
        eiwlVar.k(this);
        ekkiVar.P().c(new eleu(new eitv(this)));
        ekkiVar.U().b("tiktok_account_controller_saved_instance_state", new owu() { // from class: eitp
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle = new Bundle();
                eits eitsVar = eits.this;
                bundle.putBoolean("state_pending_op", eitsVar.q);
                ProtoParsers.k(bundle, "state_latest_operation", eitsVar.p);
                boolean z = true;
                if (!eitsVar.r && eitwVar.f()) {
                    z = false;
                }
                bundle.putBoolean("state_do_not_revalidate", z);
                bundle.putBoolean("tiktok_accounts_disabled", eitsVar.k);
                return bundle;
            }
        });
        eitwVar.d(new adf() { // from class: eitq
            @Override // defpackage.adf
            public final void a(Object obj) {
                ade adeVar = (ade) obj;
                int i = adeVar.a;
                Intent intent = adeVar.b;
                eits eitsVar = eits.this;
                if (i == -1) {
                    eitsVar.w(eisx.b(intent.getIntExtra("new_account_id", -1)), false);
                } else {
                    if (!eitsVar.f.i()) {
                        eiup eiupVar = intent != null ? (eiup) intent.getSerializableExtra("account_error") : null;
                        eiwl eiwlVar2 = eitsVar.f;
                        if (eiupVar == null) {
                            eiupVar = new eiuw();
                        }
                        eiwlVar2.l(eiupVar);
                    }
                    eitsVar.n();
                }
                eitsVar.p();
            }
        }, new adf() { // from class: eitr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.adf
            public final void a(Object obj) {
                ade adeVar = (ade) obj;
                int i = adeVar.a;
                Intent intent = adeVar.b;
                eits eitsVar = eits.this;
                if (i == -1) {
                    eitsVar.w(eisx.b(intent.getIntExtra("new_account_id", -1)), false);
                } else {
                    Class cls = null;
                    if (intent == null || !intent.getBooleanExtra("restart_account_selector", false)) {
                        eiup eiupVar = intent != null ? (eiup) intent.getSerializableExtra("account_error") : null;
                        eiwl eiwlVar2 = eitsVar.f;
                        if (eiupVar == null) {
                            eiupVar = new eiuw();
                        }
                        eiwlVar2.l(eiupVar);
                    } else {
                        eitsVar.m();
                        eitsVar.l();
                        ekzz f = eleg.f("Switch Account Interactive");
                        try {
                            engw engwVar = ((eiww) eitsVar.o).b;
                            int i2 = ((enou) engwVar).c - 1;
                            while (true) {
                                if (i2 < 0) {
                                    break;
                                }
                                if (eivq.class.isAssignableFrom((Class) engwVar.get(i2))) {
                                    cls = (Class) engwVar.get(i2);
                                    break;
                                }
                                i2--;
                            }
                            emxf.m(cls != null, "No interactive selector found.");
                            eitsVar.q(engw.r(cls), 0);
                            f.close();
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    eitsVar.n();
                }
                eitsVar.p();
            }
        });
    }

    public static final void t(eiub eiubVar) {
        emxf.l((eiubVar.b & 32) != 0);
        emxf.l(eiubVar.h > 0);
        int a2 = eiua.a(eiubVar.e);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1 || i == 2) {
            emxf.l(!((eiubVar.b & 2) != 0));
            emxf.l(eiubVar.f.size() > 0);
            emxf.l(!((eiubVar.b & 8) != 0));
            emxf.l(!eiubVar.i);
            emxf.l(!((eiubVar.b & 64) != 0));
            return;
        }
        if (i == 3) {
            emxf.l((eiubVar.b & 2) != 0);
            emxf.l(eiubVar.f.size() == 0);
            emxf.l((eiubVar.b & 8) != 0);
            emxf.l(!eiubVar.i);
            emxf.l(!((eiubVar.b & 64) != 0));
            return;
        }
        if (i == 4) {
            emxf.l((eiubVar.b & 2) != 0);
            emxf.l(eiubVar.f.size() == 0);
            emxf.l(!((eiubVar.b & 8) != 0));
            emxf.l(!eiubVar.i);
            emxf.l(!((eiubVar.b & 64) != 0));
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
        emxf.l(!((eiubVar.b & 2) != 0));
        emxf.l(eiubVar.f.size() > 0);
        emxf.l(!((eiubVar.b & 8) != 0));
        emxf.l(eiubVar.i);
        emxf.l((eiubVar.b & 64) != 0);
    }

    private final ListenableFuture x(engw engwVar, eitk eitkVar) {
        return i(engwVar, eitkVar, false);
    }

    @Override // defpackage.eito
    public final void a() {
        m();
        l();
        o(((eiww) this.o).b, h(), 0);
    }

    @Override // defpackage.eito
    public final void b(eisx eisxVar) {
        m();
        l();
        w(eisxVar, true);
    }

    @Override // defpackage.eito
    public final void c(engw engwVar) {
        m();
        l();
        ekzz f = eleg.f("Switch Account Interactive with Specified Selectors");
        try {
            q(engwVar, 0);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eito
    public final void d(engw engwVar) {
        s(engwVar, 0);
    }

    @Override // defpackage.eito
    public final void e(eivv eivvVar) {
        m();
        this.u.a(eivvVar);
    }

    @Override // defpackage.eito
    public final void f(adjn adjnVar) {
        m();
        this.h.l(adjnVar);
    }

    @Override // defpackage.eito
    public final void g(eiwz eiwzVar) {
        m();
        emxf.m(this.o == null, "Config can be set once, in the constructor only.");
        this.o = eiwzVar;
    }

    public final ListenableFuture h() {
        return x(((eiww) this.o).b, new eitk());
    }

    public final ListenableFuture i(engw engwVar, eitk eitkVar, boolean z) {
        eiwu eiwuVar = new eiwu(this.d.a());
        if (!z) {
            this.r = false;
        }
        eiwj eiwjVar = this.i;
        return eiwjVar.c(eiwjVar.d(eiwuVar, engwVar, eitkVar), ((eiww) this.o).c, this.d.a());
    }

    public final ListenableFuture j() {
        return k(0);
    }

    public final ListenableFuture k(int i) {
        ListenableFuture listenableFuture;
        if (!this.r) {
            return erqt.i(null);
        }
        this.r = false;
        ekzz f = eleg.f("Revalidate Account");
        try {
            int g = this.f.g();
            if (g == -1) {
                listenableFuture = erqt.i(null);
            } else {
                eisx b2 = eisx.b(g);
                ListenableFuture e = this.i.e(b2, ((eiww) this.o).c, this.d.a(), new eitk());
                emux emuxVar = emux.a;
                f.b(e);
                v(5, b2, emuxVar, emuxVar, false, emuxVar, e, i);
                listenableFuture = e;
            }
            f.close();
            return listenableFuture;
        } finally {
        }
    }

    public final void l() {
        emxf.m(((eiww) this.o).a, "Activity not configured for account selection.");
    }

    public final void m() {
        emxf.m(!this.k, "Attempted to use the account controller when accounts are disabled");
    }

    public final void n() {
        this.q = false;
        if (this.f.i()) {
            return;
        }
        this.r = false;
    }

    public final void o(engw engwVar, ListenableFuture listenableFuture, int i) {
        if (!listenableFuture.isDone()) {
            this.f.m();
            emxc j = emxc.j(engwVar);
            emux emuxVar = emux.a;
            v(2, null, j, emuxVar, false, emuxVar, listenableFuture, i);
            return;
        }
        this.f.j();
        emxc j2 = emxc.j(engwVar);
        emux emuxVar2 = emux.a;
        eiub u = u(2, null, j2, emuxVar2, false, emuxVar2, i);
        try {
            this.n.c(new ProtoParsers.InternalDontUse(null, u), (eitn) erqt.q(listenableFuture));
        } catch (ExecutionException e) {
            this.n.m(new ProtoParsers.InternalDontUse(null, u), e.getCause());
        }
    }

    public final void p() {
        if (this.q) {
            return;
        }
        this.h.g();
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(engw engwVar, int i) {
        engwVar.getClass();
        emxf.l(!engwVar.isEmpty());
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            Class cls = (Class) engwVar.get(i2);
            emxf.f(eivq.class.isAssignableFrom(cls), "selector %s is not an interactive selector", cls);
        }
        ListenableFuture d = this.i.d(new eiwu(this.d.a()), engwVar, new eitk());
        emxc j = emxc.j(engwVar);
        emux emuxVar = emux.a;
        v(3, null, j, emuxVar, false, emuxVar, d, i);
    }

    public final void r(eisx eisxVar, boolean z, int i) {
        ekzz f = eleg.f("Switch Account");
        try {
            this.r = false;
            ListenableFuture b2 = z ? this.i.b(eisxVar, ((eiww) this.o).c, this.d.a(), new eitk()) : this.i.e(eisxVar, ((eiww) this.o).c, this.d.a(), new eitk());
            if (!b2.isDone() && eisxVar.a() != this.f.g()) {
                this.f.m();
            }
            emux emuxVar = emux.a;
            emxc j = emxc.j(Boolean.valueOf(z));
            emux emuxVar2 = emux.a;
            f.b(b2);
            v(4, eisxVar, emuxVar, j, false, emuxVar2, b2, i);
            f.close();
        } finally {
        }
    }

    public final void s(engw engwVar, int i) {
        engwVar.getClass();
        emxf.l(!engwVar.isEmpty());
        ekzz f = eleg.f("Switch Account With Custom Selectors");
        try {
            o(engwVar, x(engwVar, new eitk()), i);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.List] */
    public final eiub u(int i, eisx eisxVar, emxc emxcVar, emxc emxcVar2, boolean z, emxc emxcVar3, int i2) {
        if (this.v) {
            efbd.c();
        }
        int i3 = this.p.c;
        int i4 = i3 == Integer.MAX_VALUE ? 0 : i3 + 1;
        eity createBuilder = eiub.a.createBuilder();
        createBuilder.copyOnWrite();
        eiub eiubVar = (eiub) createBuilder.instance;
        eiubVar.b |= 1;
        eiubVar.c = i4;
        if (eisxVar != null) {
            int a2 = eisxVar.a();
            createBuilder.copyOnWrite();
            eiub eiubVar2 = (eiub) createBuilder.instance;
            eiubVar2.b |= 2;
            eiubVar2.d = a2;
        }
        createBuilder.copyOnWrite();
        eiub eiubVar3 = (eiub) createBuilder.instance;
        eiubVar3.e = i - 1;
        eiubVar3.b |= 4;
        if (emxcVar.g()) {
            ?? c2 = emxcVar.c();
            emxf.l(!((engw) c2).isEmpty());
            enou enouVar = (enou) c2;
            ArrayList arrayList = new ArrayList(enouVar.c);
            int i5 = enouVar.c;
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(((Class) c2.get(i6)).getName());
            }
            createBuilder.a(arrayList);
        }
        if (emxcVar2.g()) {
            boolean booleanValue = ((Boolean) emxcVar2.c()).booleanValue();
            createBuilder.copyOnWrite();
            eiub eiubVar4 = (eiub) createBuilder.instance;
            eiubVar4.b |= 8;
            eiubVar4.g = booleanValue;
        }
        createBuilder.copyOnWrite();
        eiub eiubVar5 = (eiub) createBuilder.instance;
        eiubVar5.b |= 32;
        eiubVar5.i = z;
        if (emxcVar3.g()) {
            int j = this.h.j((adjn) emxcVar3.c());
            createBuilder.copyOnWrite();
            eiub eiubVar6 = (eiub) createBuilder.instance;
            eiubVar6.b |= 64;
            eiubVar6.j = j;
        }
        createBuilder.copyOnWrite();
        eiub eiubVar7 = (eiub) createBuilder.instance;
        eiubVar7.b |= 16;
        eiubVar7.h = i2 + 1;
        eiub eiubVar8 = (eiub) createBuilder.build();
        this.p = eiubVar8;
        t(eiubVar8);
        return this.p;
    }

    public final void v(int i, eisx eisxVar, emxc emxcVar, emxc emxcVar2, boolean z, emxc emxcVar3, ListenableFuture listenableFuture, int i2) {
        eiub u = u(i, eisxVar, emxcVar, emxcVar2, z, emxcVar3, i2);
        this.q = true;
        try {
            this.g.l(new ejlp(listenableFuture), ejlm.a(u), this.n);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void w(eisx eisxVar, boolean z) {
        r(eisxVar, z, 0);
    }
}
