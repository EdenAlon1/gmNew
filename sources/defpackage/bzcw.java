package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bzcw;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcw implements bzef, coxh {
    public static final cskc a = cskc.g("BugleNetworkRetry", "NewDittoRegistrationManagerImpl");
    public bzdx b;
    public final fazb c;
    public bzdx d = null;
    public String e = null;
    public final Context f;
    private final bznw g;
    private final fazb h;
    private final Executor i;
    private final ctyx j;
    private final ejar k;
    private final bzgd l;

    /* compiled from: PG */
    public interface a {
        bzdx aH();
    }

    public bzcw(bznw bznwVar, fazb fazbVar, errl errlVar, ctyx ctyxVar, fazb fazbVar2, ejar ejarVar, bzgd bzgdVar, Context context) {
        this.g = bznwVar;
        this.h = fazbVar;
        this.i = new ersb(errlVar);
        this.j = ctyxVar;
        this.c = fazbVar2;
        this.k = ejarVar;
        this.l = bzgdVar;
        this.f = context;
    }

    private final void d(final fcek fcekVar, final String str, final boolean z) {
        fgtg b = fgtg.b(fcekVar.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        if (!b.equals(fgtg.EMAIL)) {
            axnw.h(elfo.f(new Runnable() { // from class: bzcv
                @Override // java.lang.Runnable
                public final void run() {
                    bzcw bzcwVar = bzcw.this;
                    bzcwVar.b = (bzdx) bzcwVar.c.b();
                    bzcwVar.b.e(fcekVar, str, z);
                }
            }, this.i));
        } else {
            final String n = this.l.n(fcekVar.c);
            axnw.h(elfl.g(this.k.c(n)).i(new eroh() { // from class: bzct
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    bzcw bzcwVar = bzcw.this;
                    eisx eisxVar = (eisx) obj;
                    synchronized (bzcwVar) {
                        bzdx bzdxVar = bzcwVar.d;
                        String str2 = n;
                        if (bzdxVar == null || !str2.equals(bzcwVar.e)) {
                            bzcwVar.d = ((bzcw.a) ekhv.a(bzcwVar.f, bzcw.a.class, eisxVar)).aH();
                            bzcwVar.e = str2;
                        }
                        bzcwVar.b = bzcwVar.d;
                    }
                    boolean z2 = z;
                    String str3 = str;
                    bzcwVar.b.e(fcekVar, str3, z2);
                    return erqt.i(true);
                }
            }, this.i).e(Throwable.class, new emwl() { // from class: bzcu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    csjb e = bzcw.a.e();
                    e.I("Failed to get Gaia accountId when registering Ditto desktop.");
                    e.s((Throwable) obj);
                    return false;
                }
            }, this.i));
        }
    }

    private static boolean g(fcek fcekVar) {
        return fcekVar.d.equals("Bugle");
    }

    @Override // defpackage.ckgc
    public final void al(final ckgd ckgdVar) {
        axnw.h(elfo.f(new Runnable() { // from class: bzcl
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar != null) {
                    bzdxVar.al(ckgdVar);
                }
            }
        }, this.i));
    }

    @Override // defpackage.coxh
    public final void b(final boolean z) {
        axnw.h(elfo.f(new Runnable() { // from class: bzcp
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar != null) {
                    bzdxVar.d(z);
                }
            }
        }, this.i));
    }

    @Override // defpackage.cijh
    public final elfl c() {
        return elfo.h(new erog() { // from class: bzco
            @Override // defpackage.erog
            public final ListenableFuture a() {
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar == null) {
                    return elfo.c();
                }
                ArrayList arrayList = new ArrayList();
                synchronized (bzdxVar) {
                    fcek fcekVar = bzdxVar.t;
                    String str = bzdxVar.u;
                    if (bzdxVar.s && fcekVar != null && str != null) {
                        if (bzdxVar.i.q("ditto_settings_need_update", false)) {
                            bzdx.a.p("Retrying settings update.");
                            bzdxVar.i.n("ditto_settings_need_update");
                            arrayList.add(bzdxVar.a());
                        }
                        if (bzdxVar.i.q("ditto_user_alert_needs_update", false)) {
                            bzdx.a.p("Retrying network and battery level update.");
                            bzdxVar.i.n("ditto_user_alert_needs_update");
                            arrayList.add(bzdxVar.f.c());
                            arrayList.add(bzdxVar.f.b());
                        }
                        long e = bzdxVar.i.e("ditto_oldest_message_needing_update_timestamp_ms", Long.MAX_VALUE);
                        if (e != Long.MAX_VALUE) {
                            bzdx.a.p("Retrying message update.");
                            bzdxVar.i.n("ditto_oldest_message_needing_update_timestamp_ms");
                            arrayList.add(((banr) bzdxVar.d).b(fcekVar, str, e).s());
                        }
                        long e2 = bzdxVar.i.e("ditto_oldest_conversation_needing_update_timestamp_ms", Long.MAX_VALUE);
                        if (e2 != Long.MAX_VALUE) {
                            bzdx.a.p("Retrying conversation update.");
                            bzdxVar.i.n("ditto_oldest_conversation_needing_update_timestamp_ms");
                            arrayList.add(bzdxVar.k.a(fcekVar, str, e2).s());
                        }
                        return elfo.a(arrayList);
                    }
                    csjb a2 = bzdx.a.a();
                    a2.I("Skip retry");
                    a2.B("registered", bzdxVar.s);
                    a2.B("Empty desktop id", fcekVar == null);
                    a2.B("Empty request id", str == null);
                    a2.r();
                    return elfo.e(null);
                }
            }
        }, this.i);
    }

    @Override // defpackage.bzef
    public final elfl e(String str, boolean z) {
        elfl c;
        bzdx bzdxVar = this.b;
        if (bzdxVar == null) {
            bzdxVar = (bzdx) this.c.b();
            this.b = bzdxVar;
        } else if (bzdxVar.i()) {
            bzdxVar.f(bzee.SESSION_TERMINATED);
            bzdxVar = (bzdx) this.c.b();
            this.b = bzdxVar;
        }
        chvw chvwVar = (chvw) bzdxVar.o.b();
        str.getClass();
        c = axol.c(chvwVar.e, ffhe.a, ffsm.a, new chvv(chvwVar, z, str, null));
        return c.h(new emwl() { // from class: bzcm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.bzef
    public final elfl f() {
        bzdx bzdxVar = this.b;
        if (bzdxVar == null) {
            return elfo.e(null);
        }
        if (!bzdxVar.i()) {
            return bzdxVar.p.isPresent() ? ((cilk) bzdxVar.p.get()).d() : elfo.e(null);
        }
        ciap ciapVar = (ciap) bzdxVar.q.get(bzdxVar.v);
        if (ciapVar != null) {
            return ciapVar.d();
        }
        ensk f = bzdx.b.f();
        f.Y(ente.a, "BugleNetworkRetry");
        ((enrr) ((enrr) f).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "startBind", 865, "ScopedDittoUpdatesHandler.java")).t("AppName not recognized by BindManager: %s, skipping start bind", bzdxVar.v);
        return elfo.e(null);
    }

    @Override // defpackage.coxh
    public final void fE(final boolean z) {
        axnw.h(elfo.f(new Runnable() { // from class: bzcs
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar != null) {
                    bzdxVar.c(z);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bzef
    public final void h(final long j) {
        axnw.h(elfo.f(new Runnable() { // from class: bzcg
            @Override // java.lang.Runnable
            public final void run() {
                final bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar != null) {
                    final long micros = TimeUnit.DAYS.toMicros(TimeUnit.MILLISECONDS.toDays(j));
                    ((chnf) bzdxVar.l.b()).a().i(new eroh() { // from class: bzcy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            long j2 = micros;
                            Long l = (Long) obj;
                            if (l != null && l.longValue() > 0 && l.longValue() == j2) {
                                csjb a2 = bzdx.a.a();
                                a2.z("Firebase message priority downgraded day", j2);
                                a2.I("is skipped.");
                                a2.r();
                                return elfo.e(fbzx.a);
                            }
                            bzdx bzdxVar2 = bzdx.this;
                            csjb a3 = bzdx.a.a();
                            a3.z("Storing Firebase message priority downgraded day", j2);
                            a3.I("and sending settings update");
                            a3.r();
                            return elfr.d(((chnf) bzdxVar2.l.b()).b(Long.valueOf(j2)), bzdxVar2.a().e(fedn.class, new emwl() { // from class: bzdt
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    bzdx.a.s("processSettingsUpdate failed and will be retried later", (fedn) obj2);
                                    return fbzx.a;
                                }
                            }, bzdxVar2.h)).a(new Callable() { // from class: bzdd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return fbzx.a;
                                }
                            }, erpp.a);
                        }
                    }, erpp.a).k(axou.a(new bzdv()), erpp.a);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bzef
    public final void i() {
        axnw.h(elfo.f(new Runnable() { // from class: bzcr
            @Override // java.lang.Runnable
            public final void run() {
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar != null) {
                    bzdxVar.b();
                }
            }
        }, this.i));
    }

    @Override // defpackage.bzef
    public final void j(fcek fcekVar, String str) {
        d(fcekVar, str, false);
    }

    @Override // defpackage.bzef
    public final void l() {
        bzdx bzdxVar = this.b;
        if (bzdxVar != null) {
            if (!bzdxVar.i()) {
                bzdxVar.p.ifPresent(new Consumer() { // from class: bzcx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((cilk) obj).g();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            ciap ciapVar = (ciap) bzdxVar.q.get(bzdxVar.v);
            if (ciapVar != null) {
                ciapVar.h();
                return;
            }
            ensk f = bzdx.b.f();
            f.Y(ente.a, "BugleNetworkRetry");
            ((enrr) ((enrr) f).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "stopBind", 851, "ScopedDittoUpdatesHandler.java")).t("AppName not recognized by BindManager: %s, skipping stop bind", bzdxVar.v);
        }
    }

    @Override // defpackage.bzef
    public final void m(final fcek fcekVar, final String str, final bzee bzeeVar) {
        axnw.h(elfo.f(new Runnable() { // from class: bzcn
            @Override // java.lang.Runnable
            public final void run() {
                bzcw bzcwVar = bzcw.this;
                if (bzcwVar.o()) {
                    bzee bzeeVar2 = bzeeVar;
                    String str2 = str;
                    fcek fcekVar2 = fcekVar;
                    bzdx bzdxVar = bzcwVar.b;
                    bzdxVar.getClass();
                    bzdxVar.g(fcekVar2, str2, bzeeVar2);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bzef
    public final void n(final fcek fcekVar, final bzee bzeeVar) {
        axnw.h(elfo.f(new Runnable() { // from class: bzck
            @Override // java.lang.Runnable
            public final void run() {
                bzcw bzcwVar = bzcw.this;
                if (bzcwVar.o()) {
                    bzee bzeeVar2 = bzeeVar;
                    fcek fcekVar2 = fcekVar;
                    bzdx bzdxVar = bzcwVar.b;
                    bzdxVar.getClass();
                    bzdxVar.h(fcekVar2, bzeeVar2);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bzef
    public final boolean o() {
        bzdx bzdxVar = this.b;
        if (bzdxVar != null) {
            return bzdxVar.j();
        }
        return false;
    }

    @Override // defpackage.bzef
    public final elfl p(final int i) {
        return elfo.h(new erog() { // from class: bzch
            @Override // defpackage.erog
            public final ListenableFuture a() {
                fcek fcekVar;
                String str;
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar == null) {
                    return elfo.e(false);
                }
                synchronized (bzdxVar) {
                    fcekVar = bzdxVar.t;
                    str = bzdxVar.u;
                }
                if (fcekVar == null || TextUtils.isEmpty(str)) {
                    return elfo.e(false);
                }
                int i2 = i;
                ((bzcf) bzdxVar.g.b()).c();
                return i2 == 1 ? bzdxVar.m.d(fcekVar, str).h(new emwl() { // from class: bzdi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return true;
                    }
                }, erpp.a) : elfo.e(true);
            }
        }, this.i);
    }

    @Override // defpackage.bzef
    public final elfl q(final int i) {
        return elfo.h(new erog() { // from class: bzcq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                fcek fcekVar;
                String str;
                bzdx bzdxVar = bzcw.this.b;
                if (bzdxVar == null) {
                    return elfo.e(false);
                }
                synchronized (bzdxVar) {
                    fcekVar = bzdxVar.t;
                    str = bzdxVar.u;
                }
                if (fcekVar == null || TextUtils.isEmpty(str)) {
                    return elfo.e(false);
                }
                int i2 = i;
                ((bzcf) bzdxVar.g.b()).a(fcekVar, str);
                return i2 == 1 ? bzdxVar.m.b(fcekVar, str).h(new emwl() { // from class: bzdu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return true;
                    }
                }, erpp.a) : elfo.e(true);
            }
        }, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bzef
    public final void s() {
        fcek fcekVar;
        if (o()) {
            return;
        }
        cskc cskcVar = a;
        cskcVar.m("Trying to register with last active desktop.");
        if (!this.l.v()) {
            byte[] r = this.j.r("ditto_active_desktop_id");
            if (r == null) {
                cskcVar.m("No active desktop ID. Cleaning up attachment upload task.");
                ((bzoq) this.h.b()).a();
                return;
            }
            try {
                fcek fcekVar2 = (fcek) eyfy.parseFrom(fcek.a, r, eyfc.a());
                String f = this.j.f("ditto_active_desktop_request_id", null);
                if (f != null) {
                    cskcVar.r("Registering managers...");
                    d(fcekVar2, f, true);
                    if (g(fcekVar2)) {
                        this.g.c();
                        return;
                    }
                    return;
                }
                return;
            } catch (eygu e) {
                a.s("Invalid active ditto ID when registering with last active desktop.", e);
                return;
            }
        }
        ctyx ctyxVar = this.j;
        byte[] r2 = ctyxVar.r("ditto_active_desktop_id");
        String f2 = ctyxVar.f("ditto_active_desktop_request_id", null);
        engw l = this.l.l();
        if (r2 == null || f2 == null) {
            ((enrr) cskcVar.i().h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 191, "NewDittoRegistrationManagerImpl.java")).q("idBytes or request Id is null in preferences. Update the first active ditto desktop's desktopId & requestId to bugle preferences");
            fcekVar = ((bzej) l.get(0)).c().d;
            f2 = ((bzej) l.get(0)).e();
            this.j.i("ditto_active_desktop_id", fcekVar.toByteArray());
            this.j.l("ditto_active_desktop_request_id", f2);
        } else {
            try {
                fcekVar = (fcek) eyfy.parseFrom(fcek.a, r2, eyfc.a());
                Stream map = Collection.EL.stream(l).map(new Function() { // from class: bzci
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bzej) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: bzcj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bzge) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                if (!((engw) map.collect(endq.a)).contains(fcekVar)) {
                    ((enrr) cskcVar.i().h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 208, "NewDittoRegistrationManagerImpl.java")).q("The desktop stored in preferences is not active. Update the first active ditto desktop's desktopId & requestId to bugle preferences");
                    fcekVar = ((bzej) l.get(0)).c().d;
                    f2 = ((bzej) l.get(0)).e();
                    this.j.i("ditto_active_desktop_id", fcekVar.toByteArray());
                    this.j.l("ditto_active_desktop_request_id", f2);
                }
            } catch (eygu e2) {
                ((enrr) ((enrr) a.k().g(e2)).h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 217, "NewDittoRegistrationManagerImpl.java")).q("Invalid active ditto ID when registering with last active desktop.");
                return;
            }
        }
        d(fcekVar, f2, true);
        if (g(fcekVar)) {
            this.g.c();
        }
    }
}
