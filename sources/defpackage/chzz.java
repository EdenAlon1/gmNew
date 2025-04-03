package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chzz implements chzk {
    public static final cfup a = cfvl.c(cfvl.b, "ditto_bind_retry_timeout_exponent", 2.0d);
    static final cfup b = cfvl.e(cfvl.b, "max_foreground_bind_retry_exponent", 3);
    public static final enru c = enru.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl");
    static final Duration d = Duration.ofSeconds(10);
    public final cgwn A;
    public final Optional B;
    public final Optional C;
    public final Duration D;
    public final Duration E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final ffbr I;
    public final int J;
    private final errl K;
    private final int L;
    public final chhw e;
    public final ffbr f;
    public final ffbr g;
    public final cqoh h;
    public final elbx i;
    public final ffbr j;
    public chzy m;
    public ScheduledFuture o;
    public ScheduledFuture p;
    public ScheduledFuture q;
    public ScheduledFuture t;
    public final ffbr u;
    public final akzt v;
    public final ffbr w;
    public final errm x;
    public final chga y;
    public final ciio z;
    public final AtomicInteger k = new AtomicInteger();
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object n = new Object();
    public Instant r = Instant.MAX;
    public Set s = new HashSet();

    public chzz(chga chgaVar, ffbr ffbrVar, ffbr ffbrVar2, akzt akztVar, ffbr ffbrVar3, errm errmVar, errl errlVar, ffbr ffbrVar4, cqoh cqohVar, elbx elbxVar, ffbr ffbrVar5, ffbr ffbrVar6, ciio ciioVar, chhw chhwVar, cgwn cgwnVar, int i, Optional optional, Optional optional2, Duration duration, Duration duration2, int i2, int i3, boolean z, boolean z2) {
        this.f = ffbrVar;
        this.e = chhwVar;
        this.y = chgaVar;
        this.u = ffbrVar2;
        this.v = akztVar;
        this.w = ffbrVar3;
        this.x = errmVar;
        this.K = errlVar;
        this.g = ffbrVar4;
        this.h = cqohVar;
        this.i = elbxVar;
        this.j = ffbrVar5;
        this.z = ciioVar;
        this.A = cgwnVar;
        this.J = i;
        this.B = optional;
        this.C = optional2;
        this.E = duration2;
        this.D = duration;
        this.L = i2;
        this.F = i3;
        this.G = z;
        this.H = z2;
        this.I = ffbrVar6;
    }

    private final void l() {
        synchronized (this.n) {
            ScheduledFuture scheduledFuture = this.q;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.q.cancel(false);
                this.q = null;
            }
        }
    }

    private final void m() {
        synchronized (this.n) {
            this.r = Instant.MAX;
            ScheduledFuture scheduledFuture = this.p;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.p.cancel(false);
                this.p = null;
            }
        }
    }

    @Override // defpackage.chzk
    public final elfl a() {
        ensk h = c.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startIfNotStarted", 232, "BindHandlerImpl.java")).t("%s BindHandler: Start a new bind session and stream immediately, if it is not currently started.", epkl.a(this.J));
        this.k.set(0);
        return e(true);
    }

    @Override // defpackage.chzk
    public final void b() {
        elfo.g(new Callable() { // from class: chzp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ensk h = chzz.c.h();
                h.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "onAppBackgroundingInternal", 376, "BindHandlerImpl.java");
                chzz chzzVar = chzz.this;
                enrrVar.t("%s BindHandler: App backgrounded. Refresh the idle timer.", epkl.a(chzzVar.J));
                synchronized (chzzVar.n) {
                    ScheduledFuture scheduledFuture = chzzVar.p;
                    if (scheduledFuture != null && !scheduledFuture.isDone()) {
                        chzzVar.h();
                    }
                }
                return null;
            }
        }, this.K);
    }

    @Override // defpackage.chzk
    public final void c() {
        synchronized (this.n) {
            ensk h = c.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "stop", 464, "BindHandlerImpl.java")).t("%s BindHandler: Stopping the bind session because stop() is explicitly called.", epkl.a(this.J));
            chzy chzyVar = this.m;
            if (chzyVar != null) {
                chzyVar.e();
            }
            j();
        }
    }

    @Override // defpackage.chzk
    public final elfl d(final String str) {
        return (!this.C.isPresent() || TextUtils.isEmpty(str)) ? a() : a().h(new emwl() { // from class: chzt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk e = chzz.c.e();
                e.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 253, "BindHandlerImpl.java");
                chzz chzzVar = chzz.this;
                String a2 = epkl.a(chzzVar.J);
                String str2 = str;
                enrrVar.D("%s BindHandler: add message ID to check: %s", a2, str2);
                synchronized (chzzVar.n) {
                    chzzVar.s.add(str2);
                    if (chzzVar.t == null) {
                        ensk h = chzz.c.h();
                        h.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 261, "BindHandlerImpl.java")).t("%s BindHandler: scheduling a pull", epkl.a(chzzVar.J));
                        chzzVar.t = chzzVar.x.schedule(new chzo(chzzVar), ((Integer) cgyj.s.e()).intValue(), TimeUnit.SECONDS);
                    }
                }
                ((akzt) chzzVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 1);
                return null;
            }
        }, this.x);
    }

    public final elfl e(final boolean z) {
        elfl k;
        if (this.l.getAndSet(false)) {
            ensk h = c.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 384, "BindHandlerImpl.java")).t("%s BindHandler: Forcing a RegisterRefresh due to a previous Unauthenticated error", epkl.a(this.J));
            k = this.A.l(cgwm.FORCE_REFRESH);
        } else {
            k = this.A.k();
        }
        return k.h(new emwl() { // from class: chzn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcdu fcduVar = (fcdu) obj;
                chzz chzzVar = chzz.this;
                synchronized (chzzVar.n) {
                    if (chzzVar.m == null) {
                        ensk h2 = chzz.c.h();
                        h2.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 402, "BindHandlerImpl.java")).t("%s BindHandler: Starting new receiveMessages", epkl.a(chzzVar.J));
                        chzzVar.m = new chzy(chzzVar);
                        chzy chzyVar = chzzVar.m;
                        String j = chzzVar.A.j();
                        fcfn b2 = chzzVar.G ? chzzVar.y.b(j) : chzzVar.y.a(j);
                        eyee eyeeVar = fcduVar.b;
                        b2.copyOnWrite();
                        fcfo fcfoVar = (fcfo) b2.instance;
                        fcfo fcfoVar2 = fcfo.a;
                        eyeeVar.getClass();
                        fcfoVar.f = eyeeVar;
                        fcas fcasVar = (fcas) fcat.a.createBuilder();
                        fcasVar.copyOnWrite();
                        fcat fcatVar = (fcat) fcasVar.instance;
                        fcfo fcfoVar3 = (fcfo) b2.build();
                        fcfoVar3.getClass();
                        fcatVar.c = fcfoVar3;
                        fcatVar.b |= 1;
                        if (((auwh) chzzVar.I.b()).a() && !chzzVar.D.equals(chzl.a)) {
                            if (chzzVar.D.compareTo(chzz.d) < 0 || chzzVar.D.compareTo(chzzVar.E) >= 0) {
                                ensk j2 = chzz.c.j();
                                j2.Y(ente.a, "BugleNetwork");
                                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "buildReceiveMessagesRequest", 443, "BindHandlerImpl.java")).K("%s BindHandler: Ignoring out of bounds value %s for the pong interval [%s, %s)", epkl.a(chzzVar.J), chzzVar.D, chzz.d, chzzVar.E);
                            } else {
                                fcai fcaiVar = (fcai) fcaj.a.createBuilder();
                                long seconds = chzzVar.D.toSeconds();
                                fcaiVar.copyOnWrite();
                                ((fcaj) fcaiVar.instance).b = seconds;
                                fcasVar.copyOnWrite();
                                fcat fcatVar2 = (fcat) fcasVar.instance;
                                fcaj fcajVar = (fcaj) fcaiVar.build();
                                fcajVar.getClass();
                                fcatVar2.d = fcajVar;
                                fcatVar2.b |= 4;
                            }
                        }
                        fcat fcatVar3 = (fcat) fcasVar.build();
                        ensk e = chzz.c.e();
                        e.Y(ente.a, "BugleNetwork");
                        enrr enrrVar = (enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 407, "BindHandlerImpl.java");
                        String a2 = epkl.a(chzzVar.J);
                        fcfo fcfoVar4 = fcatVar3.c;
                        if (fcfoVar4 == null) {
                            fcfoVar4 = fcfo.a;
                        }
                        enrrVar.D("%s BindHandler: starting rpc receiveMessages. requestId: %s", a2, fcfoVar4.c);
                        chzzVar.e.f(fcatVar3, chzyVar);
                    }
                    if (z) {
                        ScheduledFuture scheduledFuture = chzzVar.p;
                        chzzVar.h();
                        if (chzzVar.B.isPresent() && scheduledFuture == null) {
                            ensk h3 = chzz.c.h();
                            h3.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 417, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has started.", epkl.a(chzzVar.J));
                            ((ciab) chzzVar.B.get()).b();
                        }
                    }
                }
                return null;
            }
        }, this.K);
    }

    public final void f() {
        synchronized (this.n) {
            if (this.t == null) {
                ensk j = c.j();
                j.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 346, "BindHandlerImpl.java")).q("Future is null in completeOrRescheduleMessageIdCheckCallback");
            }
            if (this.s.isEmpty()) {
                ensk e = c.e();
                e.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 349, "BindHandlerImpl.java")).q("Will not reschedule pull because there is no more ID to check");
                this.t = null;
            } else {
                ensk h = c.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 352, "BindHandlerImpl.java")).t("%s BindHandler: rescheduling a pull", epkl.a(this.J));
                this.t = this.x.schedule(new chzo(this), ((Integer) cgyj.s.e()).intValue(), TimeUnit.SECONDS);
            }
        }
    }

    public final void g() {
        synchronized (this.n) {
            l();
            this.q = this.x.schedule(new Runnable() { // from class: chzu
                @Override // java.lang.Runnable
                public final void run() {
                    chzz chzzVar = chzz.this;
                    synchronized (chzzVar.n) {
                        ensk j = chzz.c.j();
                        j.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerBindingWatchdog", 524, "BindHandlerImpl.java")).t("%s BindHandler: BindingWatchdog triggered.", epkl.a(chzzVar.J));
                        chzzVar.q = null;
                        chzy chzyVar = chzzVar.m;
                        if (chzyVar != null && chzyVar.a != null) {
                            ensk h = chzz.c.h();
                            h.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "watchdogTimeout", 725, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream due to pong timeout, will trigger onError and may retry", epkl.a(chzyVar.b.J));
                            chzyVar.a.d("Watchdog triggered", new chzx());
                        }
                    }
                }
            }, this.E.toSeconds(), TimeUnit.SECONDS);
        }
    }

    public final void h() {
        synchronized (this.n) {
            m();
            this.r = this.h.f().plus(Duration.ofSeconds(this.L));
            this.p = this.x.schedule(new Runnable() { // from class: chzm
                @Override // java.lang.Runnable
                public final void run() {
                    chzz.this.k();
                }
            }, this.L, TimeUnit.SECONDS);
        }
    }

    public final void i() {
        synchronized (this.n) {
            if (this.m != null) {
                ensk h = c.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStream", 477, "BindHandlerImpl.java")).t("%s BindHandler: Shutting down response observer", epkl.a(this.J));
                this.m = null;
                l();
            }
        }
    }

    public final void j() {
        synchronized (this.n) {
            i();
            m();
            if (this.B.isPresent()) {
                ensk h = c.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStreamAndSession", 491, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has ended.", epkl.a(this.J));
                ((ciab) this.B.get()).a();
            }
            ScheduledFuture scheduledFuture = this.t;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.t.cancel(false);
            }
            this.t = null;
        }
    }

    public final void k() {
        synchronized (this.n) {
            enru enruVar = c;
            ensk e = enruVar.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 564, "BindHandlerImpl.java")).t("%s BindHandler: IdleWatchdog triggered.", epkl.a(this.J));
            if (((csiy) this.g.b()).a) {
                ensk h = enruVar.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 567, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered but app is still in the foreground. Extend the time.", epkl.a(this.J));
                h();
                return;
            }
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 575, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered and app is in background. Close the stream and session.", epkl.a(this.J));
            chzy chzyVar = this.m;
            if (chzyVar != null) {
                chzyVar.e();
            }
            j();
        }
    }
}
