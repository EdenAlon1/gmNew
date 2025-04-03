package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzby implements bzef, coxh, ceeu {
    public static final cskc a = cskc.g("BugleNetworkRetry", "DittoRegistrationManagerImpl");
    private final Optional A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private eqwf H;
    private elfl I;
    private bzbx J;
    private ctbx M;
    public final ffbr b;
    public final bbfn c;
    public final csjk d;
    public final errl e;
    public final bzgd f;
    public final ffbr g;
    public final bbfs h;
    public final ffbr i;
    public fcek k;
    public String l;
    public final banb m;
    private final fazb n;
    private final Optional o;
    private final bzaf p;
    private final fazb q;
    private final bznw r;
    private final Optional s;
    private final fazb t;
    private final ctyx u;
    private final ffbr v;
    private final bbfl w;
    private final bbem x;
    private final ffbr y;
    private final ffbr z;
    public boolean j = false;
    private volatile boolean K = false;
    private boolean L = false;

    public bzby(bzaf bzafVar, fazb fazbVar, fazb fazbVar2, Optional optional, errl errlVar, ctyx ctyxVar, bzgd bzgdVar, ffbr ffbrVar, bznw bznwVar, bbfl bbflVar, banb banbVar, fazb fazbVar3, Optional optional2, csjk csjkVar, ffbr ffbrVar2, ffbr ffbrVar3, bbfn bbfnVar, bbem bbemVar, bbfs bbfsVar, ffbr ffbrVar4, ffbr ffbrVar5, Optional optional3, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.p = bzafVar;
        this.q = fazbVar;
        this.e = errlVar;
        this.u = ctyxVar;
        this.f = bzgdVar;
        this.v = ffbrVar;
        this.w = bbflVar;
        this.m = banbVar;
        this.s = optional;
        this.t = fazbVar2;
        this.r = bznwVar;
        this.n = fazbVar3;
        this.o = optional2;
        this.d = csjkVar;
        this.b = ffbrVar2;
        this.g = ffbrVar3;
        this.c = bbfnVar;
        this.x = bbemVar;
        this.h = bbfsVar;
        this.y = ffbrVar4;
        this.z = ffbrVar5;
        this.A = optional3;
        this.i = ffbrVar6;
        this.B = ffbrVar7;
        this.C = ffbrVar11;
        this.D = ffbrVar8;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.G = ffbrVar12;
    }

    private final void t() {
        ((bzoq) this.t.b()).a();
    }

    private final void u(final fcek fcekVar, engw engwVar, final byyv byyvVar, int i) {
        if (((enou) engwVar).c <= i) {
            return;
        }
        long count = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bzbt
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
            Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bzbu
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
                    if (bzejVar.d().c.equals(fcek.this.c)) {
                        return false;
                    }
                    return bzejVar.b() == byyvVar;
                }
            }).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: bzaz
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((bzej) obj).a();
                }
            })).limit(count).forEach(new Consumer() { // from class: bzba
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    csjb c = bzby.a.c();
                    c.I("Deactivating desktop");
                    c.M("desktopId", bzejVar.d().c);
                    c.A("desktopType", bzejVar.b());
                    c.r();
                    fcek d = bzejVar.d();
                    String e = bzejVar.e();
                    bzby bzbyVar = bzby.this;
                    bzbyVar.f.C(d, e);
                    bzbyVar.h.e(bzejVar.d(), bzejVar.e()).k(axnw.b(), erpp.a);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    private final synchronized void v(fcek fcekVar, bzee bzeeVar, fcek fcekVar2, String str, boolean z) {
        if (str != null && !z) {
            int ordinal = bzeeVar.ordinal();
            if (ordinal == 0) {
                this.h.l(fcekVar, str);
            } else if (ordinal == 2) {
                this.h.e(fcekVar, str);
            }
        }
        engw l = this.f.l();
        if (!l.isEmpty() && w(fcekVar, l, fcekVar2)) {
            a.m("Skip unregistering due to the existing active desktops.");
            return;
        }
        this.K = false;
        this.u.n("ditto_active_desktop_id");
        this.u.n("ditto_active_desktop_request_id");
        this.p.h();
        ((bzao) this.q.b()).c();
        this.s.ifPresent(new Consumer() { // from class: bzbh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cthm) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        t();
        this.r.g();
        this.k = null;
        this.l = null;
        this.H = null;
        this.j = false;
        this.I = null;
        this.L = false;
        ctbx ctbxVar = this.M;
        if (ctbxVar != null) {
            ctbxVar.a();
            this.M = null;
        }
        cslq.f(new Runnable() { // from class: bzbi
            @Override // java.lang.Runnable
            public final void run() {
                bzby bzbyVar = bzby.this;
                ((ckge) bzbyVar.d.a()).l(bzbyVar);
            }
        });
        bzbx bzbxVar = this.J;
        if (bzbxVar != null) {
            ((eere) this.n.b()).l(bzbxVar);
            this.J = null;
        }
        ((cgzv) this.v.b()).C(bdgq.a);
        this.u.n("ditto_oldest_conversation_needing_update_timestamp_ms");
        this.u.n("ditto_oldest_message_needing_update_timestamp_ms");
        this.u.n("ditto_oldest_participant_needing_update_timestamp_ms");
        this.u.n("ditto_settings_need_update");
        this.u.n("ditto_user_alert_needs_update");
        this.u.n("ditto_browser_inactive_needs_update");
        this.u.n("ditto_messages_need_revoke_timestamp");
        this.o.ifPresent(new Consumer() { // from class: bzbk
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
    private final synchronized boolean w(fcek fcekVar, engw engwVar, fcek fcekVar2) {
        if (fcekVar2 != null) {
            if (fcekVar2.equals(fcekVar)) {
                int i = ((enou) engwVar).c;
                long j = 0;
                bzej bzejVar = null;
                for (int i2 = 0; i2 < i; i2++) {
                    bzej bzejVar2 = (bzej) engwVar.get(i2);
                    if (bzejVar2.a() >= j && !TextUtils.isEmpty(bzejVar2.e())) {
                        j = bzejVar2.a();
                        bzejVar = bzejVar2;
                    }
                }
                String e = bzejVar != null ? bzejVar.e() : null;
                if (bzejVar == null) {
                    return false;
                }
                this.k = bzejVar.d();
                this.l = e;
                this.u.i("ditto_active_desktop_id", bzejVar.d().toByteArray());
                this.u.l("ditto_active_desktop_request_id", e);
                this.p.g(bzejVar.d(), e);
                ((bzao) this.q.b()).b(bzejVar.d(), e);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.ckgc
    public final synchronized void al(ckgd ckgdVar) {
        eqwf b = ckgdVar.b();
        eqwf eqwfVar = this.H;
        if (eqwfVar != null && eqwfVar == b) {
            a.m("Skip updating rcs availability");
        } else {
            this.H = b;
            csvs.c(d(), "BugleNetworkRetry", "Failed to process settings update after RCS availability update");
        }
    }

    @Override // defpackage.coxh
    public final synchronized void b(boolean z) {
        fcek fcekVar = this.k;
        String str = this.l;
        if (!this.L || fcekVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync started, unregister DittoContentObserver.");
        ((bzao) this.q.b()).c();
        this.h.i(fcekVar, str);
    }

    @Override // defpackage.cijh
    public final elfl c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            fcek fcekVar = this.k;
            String str = this.l;
            if (this.K && fcekVar != null && str != null) {
                if (this.u.q("ditto_settings_need_update", false)) {
                    a.p("Retrying settings update.");
                    this.u.n("ditto_settings_need_update");
                    arrayList.add(d());
                }
                if (this.u.q("ditto_user_alert_needs_update", false)) {
                    a.p("Retrying network and battery level update.");
                    this.u.n("ditto_user_alert_needs_update");
                    arrayList.add(this.p.c());
                    arrayList.add(this.p.b());
                }
                long e = this.u.e("ditto_oldest_message_needing_update_timestamp_ms", Long.MAX_VALUE);
                if (e != Long.MAX_VALUE) {
                    a.p("Retrying message update.");
                    this.u.n("ditto_oldest_message_needing_update_timestamp_ms");
                    arrayList.add(((banr) this.c).b(fcekVar, str, e).s());
                }
                long e2 = this.u.e("ditto_oldest_conversation_needing_update_timestamp_ms", Long.MAX_VALUE);
                if (e2 != Long.MAX_VALUE) {
                    a.p("Retrying conversation update.");
                    this.u.n("ditto_oldest_conversation_needing_update_timestamp_ms");
                    arrayList.add(this.w.a(fcekVar, str, e2).s());
                }
                return elfo.a(arrayList);
            }
            csjb a2 = a.a();
            a2.I("Skip retry");
            a2.B("registered", this.K);
            a2.B("Empty desktop id", fcekVar == null);
            a2.B("Empty request id", str == null);
            a2.r();
            return elfo.e(null);
        }
    }

    public final synchronized elfl d() {
        elfl e;
        elfl elflVar = this.I;
        if (elflVar != null && !elflVar.isDone()) {
            this.j = true;
            a.m("Using the existing future.");
            return elflVar;
        }
        this.j = false;
        this.I = null;
        fcek fcekVar = this.k;
        String str = this.l;
        if (!this.K || fcekVar == null || str == null) {
            e = elfo.e(fbzx.a);
            this.I = e;
        } else {
            this.x.a(fcekVar, str).A();
            e = this.f.j(new Function() { // from class: bzay
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    return ((bzdz) bzby.this.b.b()).a(bzejVar.d(), Optional.empty(), bzejVar.e());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new emwl() { // from class: bzbj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return fbzx.a;
                }
            }, erpp.a);
            this.I = e;
            e.k(new bzbw(this), erpp.a);
        }
        return e;
    }

    @Override // defpackage.bzef
    public final elfl e(String str, boolean z) {
        return elfo.e(null);
    }

    @Override // defpackage.bzef
    public final elfl f() {
        return this.A.isPresent() ? ((cilk) this.A.get()).d() : elfo.e(null);
    }

    @Override // defpackage.coxh
    public final synchronized void fE(boolean z) {
        fcek fcekVar = this.k;
        String str = this.l;
        if (!this.L || fcekVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync is completed, register DittoContentObserver.");
        ((bzao) this.q.b()).a(fcekVar, str);
        this.h.h(fcekVar, str);
    }

    @Override // defpackage.ceeu
    public final synchronized void g() {
        fcek fcekVar = this.k;
        String str = this.l;
        if (fcekVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.h.f(21, fcekVar, str).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.bzef
    public final void h(long j) {
        final long micros = TimeUnit.DAYS.toMicros(TimeUnit.MILLISECONDS.toDays(j));
        ((chnf) this.g.b()).a().i(new eroh() { // from class: bzbb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long j2 = micros;
                Long l = (Long) obj;
                if (l != null && l.longValue() > 0 && l.longValue() == j2) {
                    csjb a2 = bzby.a.a();
                    a2.z("Firebase message priority downgraded day", j2);
                    a2.I("is skipped.");
                    a2.r();
                    return elfo.e(fbzx.a);
                }
                bzby bzbyVar = bzby.this;
                csjb a3 = bzby.a.a();
                a3.z("Storing Firebase message priority downgraded day", j2);
                a3.I("and sending settings update");
                a3.r();
                return elfr.d(((chnf) bzbyVar.g.b()).b(Long.valueOf(j2)), bzbyVar.d().e(fedn.class, new emwl() { // from class: bzbn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        bzby.a.s("processSettingsUpdate failed and will be retried later", (fedn) obj2);
                        return fbzx.a;
                    }
                }, bzbyVar.e)).a(new Callable() { // from class: bzbm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fbzx.a;
                    }
                }, erpp.a);
            }
        }, erpp.a).k(axou.a(new bzbv()), erpp.a);
    }

    @Override // defpackage.bzef
    public final synchronized void i() {
        csvs.c(d(), "BugleNetworkRetry", "Failed to process settings update after SIM loaded");
    }

    @Override // defpackage.bzef
    public final synchronized void j(fcek fcekVar, String str) {
        k(fcekVar, str, false);
    }

    public final synchronized void k(final fcek fcekVar, final String str, boolean z) {
        cskc cskcVar = a;
        cskcVar.m("Registering with a desktop ID");
        if (!this.f.A(fcekVar, str)) {
            cskcVar.r("Cannot set the Desktop active.");
            return;
        }
        engw l = this.f.l();
        u(fcekVar, l, byyv.WEB, ((Integer) bzgd.d.e()).intValue());
        u(fcekVar, l, byyv.PWA, ((Integer) bzgd.b.e()).intValue());
        u(fcekVar, l, byyv.SATELLITE, ((Integer) bzgd.c.e()).intValue());
        this.h.k(fcekVar, str);
        this.k = fcekVar;
        this.l = str;
        this.u.i("ditto_active_desktop_id", fcekVar.toByteArray());
        this.u.l("ditto_active_desktop_request_id", str);
        if (((coxg) this.z.b()).u()) {
            cskcVar.r("Bugle database is syncing, notify ditto.");
            this.h.j(fcekVar, str);
        }
        try {
            if (axmm.m(((axkm) this.C.b()).c())) {
                cskcVar.r("CMS Restore is in progress, notify ditto.");
                this.h.f(19, fcekVar, str).k(axnw.b(), erpp.a);
            }
            if (((aswh) this.D.b()).a() && ((bzlh) this.F.b()).a()) {
                cskcVar.r("Bugle is in Throttle State, notify ditto.");
                this.h.g().k(axnw.b(), erpp.a);
            }
            if (this.K) {
                this.p.f(fcekVar, str);
                ((bzao) this.q.b()).b(fcekVar, str);
                return;
            }
            this.p.e(fcekVar, str);
            this.L = true;
            if (!((coxg) this.z.b()).u()) {
                csjb c = cskcVar.c();
                c.I("Bugle database is not syncing, register DittoContentObserver");
                c.r();
                ((bzao) this.q.b()).a(fcekVar, str);
                if (z) {
                    ((bzaw) this.i.b()).a(fcekVar).i(new eroh() { // from class: bzbr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            Long l2 = (Long) obj;
                            ArrayList arrayList = new ArrayList();
                            long longValue = l2.longValue();
                            long longValue2 = ((Long) bzaq.b.e()).longValue();
                            bzby bzbyVar = bzby.this;
                            if (longValue > longValue2) {
                                String str2 = str;
                                fcek fcekVar2 = fcekVar;
                                long longValue3 = l2.longValue() - ((Long) bzaq.b.e()).longValue();
                                csjb c2 = bzby.a.c();
                                c2.z("Sending message update starting from", longValue3);
                                c2.r();
                                arrayList.add(bzbyVar.c.e(fcekVar2, str2, longValue3).s());
                                arrayList.add(((bzaw) bzbyVar.i.b()).b(fcekVar2).e(Exception.class, new emwl() { // from class: bzbf
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        csjb e = bzby.a.e();
                                        e.I("setDittoLastPushTimeMillis did not complete successfully");
                                        e.s((Exception) obj2);
                                        return null;
                                    }
                                }, bzbyVar.e));
                            }
                            return elfo.j(arrayList).a(new Callable() { // from class: bzbg
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return fbzx.a;
                                }
                            }, bzbyVar.e);
                        }
                    }, this.e).k(axnw.b(), this.e);
                }
            }
            this.s.ifPresent(new Consumer() { // from class: bzbo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((cthm) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((bzoq) this.t.b()).b();
            if (this.M == null) {
                this.M = ((alzc) this.y.b()).a(new alzb() { // from class: bzbp
                    @Override // defpackage.ctbf
                    public final elfl a(Object obj) {
                        bzby bzbyVar = bzby.this;
                        return bzbyVar.d().e(Exception.class, new emwl() { // from class: bzbd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                bzby.a.r("Failed to process settings update after configuration change");
                                return fbzx.a;
                            }
                        }, bzbyVar.e).h(new emwl() { // from class: bzbe
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        }, erpp.a);
                    }
                }, "DittoRegistrationManagerImpl.configurationUpdated");
            }
            cslq.f(new Runnable() { // from class: bzbq
                @Override // java.lang.Runnable
                public final void run() {
                    bzby bzbyVar = bzby.this;
                    ((ckge) bzbyVar.d.a()).h(bzbyVar);
                }
            });
            if (this.J == null) {
                bzbx bzbxVar = new bzbx(this);
                this.J = bzbxVar;
                ((eere) this.n.b()).j(bzbxVar);
            }
            this.K = true;
        } catch (eygu e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.bzef
    public final void l() {
        this.A.ifPresent(new Consumer() { // from class: bzbl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cilk) obj).g();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.bzef
    public final synchronized void m(fcek fcekVar, String str, bzee bzeeVar) {
        Throwable th;
        boolean z;
        try {
            try {
                if (this.K) {
                    cskc cskcVar = a;
                    csjb a2 = cskcVar.a();
                    a2.I("Unregister desktop");
                    a2.A("desktopId", fcekVar);
                    a2.A("requestId", str);
                    a2.A("reason", bzeeVar);
                    a2.r();
                    if (this.f.C(fcekVar, str)) {
                        z = false;
                    } else {
                        try {
                            if (this.f.z(fcekVar)) {
                                cskcVar.m("Skip unregistering because the desktopId and the requestId are not matched.");
                                return;
                            }
                            z = true;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    v(fcekVar, bzeeVar, this.k, this.l, z);
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

    @Override // defpackage.bzef
    public final synchronized void n(fcek fcekVar, bzee bzeeVar) {
        try {
            try {
                if (this.K) {
                    csjb a2 = a.a();
                    a2.I("Unregister desktop");
                    a2.A("desktopId", fcekVar);
                    a2.A("reason", bzeeVar);
                    a2.r();
                    v(fcekVar, bzeeVar, this.k, this.l, !this.f.B(fcekVar));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.bzef
    public final synchronized boolean o() {
        return this.K;
    }

    @Override // defpackage.bzef
    public final elfl p(int i) {
        fcek fcekVar;
        String str;
        synchronized (this) {
            fcekVar = this.k;
            str = this.l;
        }
        if (fcekVar == null || TextUtils.isEmpty(str) || i != 1) {
            return elfo.e(false);
        }
        ((bzao) this.q.b()).c();
        return this.h.d(fcekVar, str).h(new emwl() { // from class: bzbc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a);
    }

    @Override // defpackage.bzef
    public final elfl q(int i) {
        fcek fcekVar;
        String str;
        synchronized (this) {
            fcekVar = this.k;
            str = this.l;
        }
        if (fcekVar == null || TextUtils.isEmpty(str) || i != 1) {
            return elfo.e(false);
        }
        ((bzao) this.q.b()).a(fcekVar, str);
        return this.h.b(fcekVar, str).h(new emwl() { // from class: bzbs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a);
    }

    @Override // defpackage.ceeu
    public final synchronized void r() {
        fcek fcekVar = this.k;
        String str = this.l;
        if (fcekVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.h.f(20, fcekVar, str).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.bzef
    public final synchronized void s() {
        if (!o()) {
            cskc cskcVar = a;
            cskcVar.m("Trying to register with last active desktop.");
            byte[] r = this.u.r("ditto_active_desktop_id");
            if (r == null) {
                cskcVar.m("No active desktop ID. Cleaning up attachment upload task.");
                t();
                return;
            }
            try {
                fcek fcekVar = (fcek) eyfy.parseFrom(fcek.a, r);
                String f = this.u.f("ditto_active_desktop_request_id", null);
                if (f != null) {
                    cskcVar.r("Registering managers...");
                    k(fcekVar, f, true);
                    if (!((asvi) this.G.b()).a()) {
                        this.r.c();
                    }
                }
            } catch (eygu e) {
                a.s("Invalid active ditto ID when registering with last active desktop.", e);
            }
        }
    }
}
