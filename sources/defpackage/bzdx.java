package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdx implements ckgc {
    public static final cskc a = cskc.g("BugleNetworkRetry", "ScopedDittoUpdatesHandler");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler");
    private final fazb A;
    private final fazb B;
    private final fazb C;
    private final ffbr D;
    private final bbem E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    private eqwf K;
    private elfl L;
    private caqm M;
    private ctbx O;
    public final ffbr c;
    public final bbfn d;
    public final csjk e;
    public final bzaf f;
    public final fazb g;
    public final errl h;
    public final ctyx i;
    public final bzgd j;
    public final bbfl k;
    public final ffbr l;
    public final bbfs m;
    public final ffbr n;
    public final ffbr o;
    public final Optional p;
    public final Map q;
    public fcek t;
    public String u;
    public final String v;
    private final Optional w;
    private final Optional x;
    private final bznw y;
    private final Optional z;
    public boolean r = false;
    public volatile boolean s = false;
    private boolean N = false;

    public bzdx(Optional optional, bzaf bzafVar, fazb fazbVar, fazb fazbVar2, Optional optional2, errl errlVar, ctyx ctyxVar, bzgd bzgdVar, ffbr ffbrVar, bznw bznwVar, bbfl bbflVar, Optional optional3, csjk csjkVar, ffbr ffbrVar2, ffbr ffbrVar3, bbfn bbfnVar, fazb fazbVar3, fazb fazbVar4, bbem bbemVar, bbfs bbfsVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Optional optional4, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, Map map) {
        this.x = optional;
        this.v = true != optional.isPresent() ? "Bugle" : "GDitto";
        this.f = bzafVar;
        this.g = fazbVar;
        this.h = errlVar;
        this.i = ctyxVar;
        this.j = bzgdVar;
        this.D = ffbrVar;
        this.k = bbflVar;
        this.z = optional2;
        this.A = fazbVar2;
        this.y = bznwVar;
        this.w = optional3;
        this.e = csjkVar;
        this.c = ffbrVar2;
        this.l = ffbrVar3;
        this.d = bbfnVar;
        this.B = fazbVar3;
        this.C = fazbVar4;
        this.E = bbemVar;
        this.m = bbfsVar;
        this.F = ffbrVar4;
        this.G = ffbrVar5;
        this.n = ffbrVar6;
        this.o = ffbrVar7;
        this.p = optional4;
        this.q = map;
        this.H = ffbrVar8;
        this.I = ffbrVar9;
        this.J = ffbrVar10;
    }

    private final void k(final fcek fcekVar, engw engwVar, final byyv byyvVar, int i) {
        if (((enou) engwVar).c <= i) {
            return;
        }
        long count = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bzdp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bzej) obj).b() == byyv.this;
            }
        }).count() - i;
        if (count > 0) {
            Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bzdq
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    if (bzejVar.c().d.c.equals(fcek.this.c)) {
                        return false;
                    }
                    return bzejVar.b() == byyvVar;
                }
            }).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: bzdr
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((bzej) obj).a();
                }
            })).limit(count).forEach(new Consumer() { // from class: bzds
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    fcek fcekVar2 = bzejVar.c().d;
                    csjb c = bzdx.a.c();
                    c.I("Deactivating desktop");
                    c.M("desktopId", fcekVar2.c);
                    c.A("desktopType", bzejVar.b());
                    c.r();
                    String e = bzejVar.e();
                    bzdx bzdxVar = bzdx.this;
                    bzdxVar.j.C(fcekVar2, e);
                    bzdxVar.m.e(fcekVar2, bzejVar.e()).k(axnw.b(), erpp.a);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    private final synchronized void l(fcek fcekVar, bzee bzeeVar, fcek fcekVar2, String str, boolean z) {
        if (str != null && !z) {
            int ordinal = bzeeVar.ordinal();
            if (ordinal == 0) {
                this.m.l(fcekVar, str);
            } else if (ordinal == 2) {
                this.m.e(fcekVar, str);
            }
        }
        Stream filter = Collection.EL.stream(this.j.l()).filter(new Predicate() { // from class: bzcz
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bzej) obj).c().a.d.equals(bzdx.this.v);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) filter.collect(endq.a);
        if (!engwVar.isEmpty() && m(fcekVar, engwVar, fcekVar2)) {
            a.m("Skip unregistering due to the existing active desktops.");
            return;
        }
        this.s = false;
        this.i.n("ditto_active_desktop_id");
        this.i.n("ditto_active_desktop_request_id");
        this.f.h();
        ((bzcf) this.g.b()).c();
        this.z.ifPresent(new Consumer() { // from class: bzda
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cthm) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((bzoq) this.A.b()).a();
        this.y.g();
        this.t = null;
        this.u = null;
        this.K = null;
        this.r = false;
        this.L = null;
        this.N = false;
        ctbx ctbxVar = this.O;
        if (ctbxVar != null) {
            ctbxVar.a();
            this.O = null;
        }
        cslq.f(new Runnable() { // from class: bzdb
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzdx.this;
                ((ckge) bzdxVar.e.a()).l(bzdxVar);
            }
        });
        caqm caqmVar = this.M;
        if (caqmVar != null) {
            ((eere) this.B.b()).l(caqmVar);
            this.M = null;
        }
        ((cgzv) this.D.b()).C(bdgq.a);
        this.i.n("ditto_oldest_conversation_needing_update_timestamp_ms");
        this.i.n("ditto_oldest_message_needing_update_timestamp_ms");
        this.i.n("ditto_oldest_participant_needing_update_timestamp_ms");
        this.i.n("ditto_settings_need_update");
        this.i.n("ditto_user_alert_needs_update");
        this.i.n("ditto_browser_inactive_needs_update");
        this.i.n("ditto_messages_need_revoke_timestamp");
        this.w.ifPresent(new Consumer() { // from class: bzdc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((chhm) obj).d();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.p("Unregister is complete.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized boolean m(fcek fcekVar, engw engwVar, fcek fcekVar2) {
        if (fcekVar2 != null) {
            if (fcekVar2.equals(fcekVar)) {
                int size = engwVar.size();
                long j = 0;
                bzej bzejVar = null;
                for (int i = 0; i < size; i++) {
                    bzej bzejVar2 = (bzej) engwVar.get(i);
                    if (bzejVar2.a() >= j && !TextUtils.isEmpty(bzejVar2.e())) {
                        j = bzejVar2.a();
                        bzejVar = bzejVar2;
                    }
                }
                String e = bzejVar != null ? bzejVar.e() : null;
                if (bzejVar == null) {
                    return false;
                }
                fcek fcekVar3 = bzejVar.c().d;
                this.t = fcekVar3;
                this.u = e;
                this.i.i("ditto_active_desktop_id", fcekVar3.toByteArray());
                this.i.l("ditto_active_desktop_request_id", e);
                this.f.g(fcekVar3, e);
                ((bzcf) this.g.b()).b(fcekVar3, e);
                ensk e2 = b.e();
                e2.Y(ente.a, "BugleNetworkRetry");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "updateCurrentActiveDesktopIfNeeded", 649, "ScopedDittoUpdatesHandler.java")).t("Switching active desktop to [%s]", bzejVar.c().b);
                return true;
            }
        }
        return true;
    }

    public final synchronized elfl a() {
        elfl e;
        elfl elflVar = this.L;
        if (elflVar != null && !elflVar.isDone()) {
            this.r = true;
            a.m("Using the existing future.");
            return elflVar;
        }
        this.r = false;
        this.L = null;
        fcek fcekVar = this.t;
        String str = this.u;
        if (!this.s || fcekVar == null || str == null) {
            e = elfo.e(fbzx.a);
            this.L = e;
        } else {
            this.E.a(fcekVar, str).A();
            e = this.j.j(new Function() { // from class: bzdn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    return ((bzdz) bzdx.this.c.b()).a(bzejVar.d(), Optional.of(bzejVar.c()), bzejVar.e());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new emwl() { // from class: bzdo
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return fbzx.a;
                }
            }, erpp.a);
            this.L = e;
            e.k(new bzdw(this), erpp.a);
        }
        return e;
    }

    @Override // defpackage.ckgc
    public final synchronized void al(ckgd ckgdVar) {
        eqwf b2 = ckgdVar.b();
        eqwf eqwfVar = this.K;
        if (eqwfVar != null && eqwfVar == b2) {
            a.m("Skip updating rcs availability");
        } else {
            this.K = b2;
            csvs.c(a(), "BugleNetworkRetry", "Failed to process settings update after RCS availability update");
        }
    }

    public final synchronized void b() {
        csvs.c(a(), "BugleNetworkRetry", "Failed to process settings update after SIM loaded");
    }

    public final synchronized void c(boolean z) {
        fcek fcekVar = this.t;
        String str = this.u;
        if (!this.N || fcekVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        ((bzcf) this.g.b()).a(fcekVar, str);
        this.m.h(fcekVar, str);
    }

    public final synchronized void d(boolean z) {
        fcek fcekVar = this.t;
        String str = this.u;
        if (!this.N || fcekVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync started, unregister DittoContentObserver.");
        ((bzcf) this.g.b()).c();
        this.m.i(fcekVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fazb, java.lang.Object] */
    public final synchronized void e(final fcek fcekVar, final String str, boolean z) {
        if (!fcekVar.d.equals(this.v)) {
            ensk e = b.e();
            e.Y(ente.a, "BugleNetworkRetry");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "register", 267, "ScopedDittoUpdatesHandler.java")).D("Skipping registration in this updatesHandler instance. This instance supports app [%s], but found app [%s]", this.v, fcekVar.d);
            return;
        }
        cskc cskcVar = a;
        cskcVar.m("Registering with a desktop ID");
        if (!this.j.A(fcekVar, str)) {
            cskcVar.r("Cannot set the Desktop active.");
            return;
        }
        engw l = this.j.l();
        k(fcekVar, l, byyv.WEB, ((Integer) bzgd.d.e()).intValue());
        k(fcekVar, l, byyv.PWA, ((Integer) bzgd.b.e()).intValue());
        k(fcekVar, l, byyv.SATELLITE, ((Integer) bzgd.c.e()).intValue());
        this.m.k(fcekVar, str);
        this.t = fcekVar;
        this.u = str;
        this.i.i("ditto_active_desktop_id", fcekVar.toByteArray());
        this.i.l("ditto_active_desktop_request_id", str);
        if (((coxg) this.G.b()).u()) {
            cskcVar.r("Bugle database is syncing, notify ditto.");
            this.m.j(fcekVar, str);
        }
        if (((aswh) this.H.b()).a() && ((bzlh) this.J.b()).a()) {
            cskcVar.r("Bugle is in Throttle State, notify ditto.");
            this.m.g().k(axnw.b(), erpp.a);
        }
        if (this.s) {
            this.f.f(fcekVar, str);
            ((bzcf) this.g.b()).b(fcekVar, str);
            return;
        }
        this.f.e(fcekVar, str);
        this.N = true;
        if (!((coxg) this.G.b()).u()) {
            csjb c = cskcVar.c();
            c.I("Bugle database is not syncing, register DittoContentObserver");
            c.r();
            ((bzcf) this.g.b()).a(fcekVar, str);
            if (z) {
                ((bzaw) this.n.b()).a(fcekVar).i(new eroh() { // from class: bzdh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Long l2 = (Long) obj;
                        ArrayList arrayList = new ArrayList();
                        long longValue = l2.longValue();
                        long longValue2 = ((Long) bzaq.b.e()).longValue();
                        bzdx bzdxVar = bzdx.this;
                        if (longValue > longValue2) {
                            String str2 = str;
                            fcek fcekVar2 = fcekVar;
                            long longValue3 = l2.longValue() - ((Long) bzaq.b.e()).longValue();
                            csjb c2 = bzdx.a.c();
                            c2.z("Sending message update starting from", longValue3);
                            c2.r();
                            arrayList.add(bzdxVar.d.e(fcekVar2, str2, longValue3).s());
                            arrayList.add(((bzaw) bzdxVar.n.b()).b(fcekVar2).e(Exception.class, new emwl() { // from class: bzdj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    csjb e2 = bzdx.a.e();
                                    e2.I("setDittoLastPushTimeMillis did not complete successfully");
                                    e2.s((Exception) obj2);
                                    return null;
                                }
                            }, bzdxVar.h));
                        }
                        return elfo.j(arrayList).a(new Callable() { // from class: bzdk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return fbzx.a;
                            }
                        }, bzdxVar.h);
                    }
                }, this.h).k(axnw.b(), this.h);
            }
        }
        this.z.ifPresent(new Consumer() { // from class: bzde
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cthm) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((bzoq) this.A.b()).b();
        if (this.O == null) {
            this.O = ((alzc) this.F.b()).a(new alzb() { // from class: bzdf
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    bzdx bzdxVar = bzdx.this;
                    return bzdxVar.a().e(Exception.class, new emwl() { // from class: bzdl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            bzdx.a.r("Failed to process settings update after configuration change");
                            return fbzx.a;
                        }
                    }, bzdxVar.h).h(new emwl() { // from class: bzdm
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, erpp.a);
                }
            }, "ScopedDittoUpdatesHandler.configurationUpdated");
        }
        cslq.f(new Runnable() { // from class: bzdg
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzdx.this;
                ((ckge) bzdxVar.e.a()).i(bzdxVar, bzdxVar.h);
            }
        });
        if (this.M == null) {
            caqn caqnVar = (caqn) this.C.b();
            ?? b2 = caqnVar.a.b();
            b2.getClass();
            ffbr ffbrVar = caqnVar.b;
            fcekVar.getClass();
            str.getClass();
            caqm caqmVar = new caqm(b2, ffbrVar, fcekVar, str);
            ((eere) this.B.b()).j(caqmVar);
            this.M = caqmVar;
        }
        this.s = true;
    }

    public final synchronized void f(bzee bzeeVar) {
        fcek fcekVar = this.t;
        if (fcekVar != null) {
            a.m("Forcing unregister of current desktop");
            h(fcekVar, bzeeVar);
        }
    }

    public final synchronized void g(fcek fcekVar, String str, bzee bzeeVar) {
        Throwable th;
        boolean z;
        try {
            try {
                if (this.s) {
                    cskc cskcVar = a;
                    csjb a2 = cskcVar.a();
                    a2.I("Unregister desktop");
                    a2.A("desktopId", fcekVar);
                    a2.A("requestId", str);
                    a2.A("reason", bzeeVar);
                    a2.r();
                    if (this.j.C(fcekVar, str)) {
                        z = false;
                    } else {
                        try {
                            if (this.j.z(fcekVar)) {
                                cskcVar.m("Skip unregistering because the desktopId and the requestId are not matched.");
                                return;
                            }
                            z = true;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    l(fcekVar, bzeeVar, this.t, this.u, z);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void h(fcek fcekVar, bzee bzeeVar) {
        try {
            try {
                if (this.s) {
                    csjb a2 = a.a();
                    a2.I("Unregister desktop");
                    a2.A("desktopId", fcekVar);
                    a2.A("reason", bzeeVar);
                    a2.r();
                    l(fcekVar, bzeeVar, this.t, this.u, !this.j.B(fcekVar));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean i() {
        return this.x.isPresent();
    }

    public final synchronized boolean j() {
        return this.s;
    }
}
