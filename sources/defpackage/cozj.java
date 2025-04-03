package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozj implements coxg {
    public static final cskc c = cskc.g("Bugle", "TelephonySyncManager");
    private static final long k = TimeUnit.SECONDS.toMillis(1);
    private static final long l = TimeUnit.MINUTES.toMillis(1);
    private static final enip m = enip.r(eqqh.APP_STARTUP_RESUME_SYNC, eqqh.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
    private static volatile Boolean n = null;
    public final cqoh d;
    public final emyl e;
    public final fazb f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final Context u;
    private final errl v;
    private final errl w;
    private final ffbr x;
    private final erqa y = new erqa();
    public final List j = new ArrayList();
    private long z = -1;
    private long A = -1;
    private long B = -1;
    private cno C = null;

    public cozj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Context context, final fazb fazbVar, fazb fazbVar2, errl errlVar, errl errlVar2, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.o = ffbrVar;
        this.p = ffbrVar2;
        this.q = ffbrVar3;
        this.d = cqohVar;
        this.r = ffbrVar4;
        this.s = ffbrVar5;
        this.t = ffbrVar6;
        this.u = context;
        this.e = new emyl() { // from class: coyv
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = cozj.c;
                return new CopyOnWriteArraySet((Collection) fazb.this.b());
            }
        };
        this.f = fazbVar2;
        this.v = errlVar;
        this.w = errlVar2;
        this.x = ffbrVar7;
        this.g = ffbrVar8;
        this.h = ffbrVar9;
        this.i = ffbrVar10;
    }

    private final void A(long j, long j2, long j3, eqqh eqqhVar) {
        y(j, j2, j3, eqqhVar, UUID.randomUUID());
    }

    private final boolean B() {
        if (n == null) {
            n = Boolean.valueOf(((Optional) ((fbbb) this.q).a).isEmpty() || ((ctvs) this.o.b()).e());
        }
        boolean z = n.booleanValue() && ((ctvs) this.o.b()).d();
        csjb d = c.d();
        d.I("Checking canSyncWithTelephony");
        d.B("canSyncWithTelephony", z);
        d.B("isWearable", ((Optional) ((fbbb) this.q).a).isPresent());
        d.B("isSmsCapable", ((ctvs) this.o.b()).e());
        d.B("isDefaultSmsApp", ((ctvs) this.o.b()).d());
        d.r();
        return z;
    }

    private final boolean C() {
        if (((ctud) this.t.b()).r() && ctid.i(this.u)) {
            return true;
        }
        c.r("no permission to sync.");
        return false;
    }

    private final void z(final eqqh eqqhVar, final eqqd eqqdVar, final boolean z) {
        elfo.g(new Callable() { // from class: cozb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eqqh eqqhVar2 = eqqhVar;
                cozj cozjVar = cozj.this;
                eqqd eqqdVar2 = eqqdVar;
                if (z) {
                    ((cqcd) cozjVar.g.b()).b(eqqhVar2, 1, false, engw.r(eqqdVar2));
                } else {
                    ((cqcd) cozjVar.g.b()).c(eqqhVar2, 1, engw.r(eqqdVar2));
                }
                return true;
            }
        }, this.w).k(axnw.c(new Consumer() { // from class: cozc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb c2 = cozj.c.c();
                c2.I("Logged syncRequestFailed to clearcut.");
                c2.A("reason", eqqh.this);
                c2.A("problem", eqqdVar);
                c2.B("isFullSync", z);
                c2.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), erpp.a);
    }

    @Override // defpackage.coxg
    public final long a(long j) {
        long e = ((coxi) this.p.b()).a.e("last_full_sync_time_millis", -1L);
        long j2 = (e < 0 ? j : e + l) - j;
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    @Override // defpackage.coxg
    public final synchronized cqdh b(long j) {
        cno cnoVar = this.C;
        if (cnoVar == null) {
            return null;
        }
        return (cqdh) cnoVar.d(j);
    }

    @Override // defpackage.coxg
    public final elfl c(final boolean z, final long j, final long j2, final long j3, final UUID uuid) {
        return elfl.g(this.y.b(eldl.c(new erog() { // from class: coze
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cozj cozjVar = cozj.this;
                boolean z2 = z;
                long j4 = j;
                long j5 = j2;
                long j6 = j3;
                final UUID uuid2 = uuid;
                final coxf x = cozjVar.x(z2, j4, j5, j6, uuid2);
                if (!coxf.CAN_START.equals(x)) {
                    return elfo.e(x);
                }
                final cpda cpdaVar = (cpda) cozjVar.f.b();
                final AtomicReference atomicReference = new AtomicReference();
                final AtomicReference atomicReference2 = new AtomicReference();
                return elfl.g(cpdaVar.a.b(new emwl() { // from class: cpcx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        AtomicReference atomicReference3 = atomicReference;
                        cpcp cpcpVar = (cpcp) obj;
                        Instant f = cpda.this.b.f();
                        atomicReference3.set(f);
                        cpco cpcoVar = (cpco) cpcpVar.toBuilder();
                        UUID uuid3 = uuid2;
                        String uuid4 = uuid3.toString();
                        cpcoVar.copyOnWrite();
                        cpcp cpcpVar2 = (cpcp) cpcoVar.instance;
                        uuid4.getClass();
                        cpcpVar2.b |= 2;
                        cpcpVar2.d = uuid4;
                        eyja b = eykj.b((Instant) atomicReference3.get());
                        cpcoVar.copyOnWrite();
                        cpcp cpcpVar3 = (cpcp) cpcoVar.instance;
                        b.getClass();
                        cpcpVar3.e = b;
                        cpcpVar3.b |= 4;
                        boolean equals = uuid3.toString().equals(cpcpVar.d);
                        AtomicReference atomicReference4 = atomicReference2;
                        if (equals) {
                            eyja eyjaVar = cpcpVar.e;
                            if (eyjaVar == null) {
                                eyjaVar = eyja.a;
                            }
                            atomicReference4.set(eykj.d(eyjaVar));
                        } else {
                            atomicReference4.set(f);
                        }
                        eyja b2 = eykj.b((Instant) atomicReference4.get());
                        cpcoVar.copyOnWrite();
                        cpcp cpcpVar4 = (cpcp) cpcoVar.instance;
                        b2.getClass();
                        cpcpVar4.f = b2;
                        cpcpVar4.b |= 8;
                        return (cpcp) cpcoVar.build();
                    }
                }, erpp.a)).h(new emwl() { // from class: cpcy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int i = cpda.c;
                        return cpcz.d(uuid2, (Instant) atomicReference.get(), (Instant) atomicReference2.get());
                    }
                }, erpp.a).h(new emwl() { // from class: cozd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cskc cskcVar = cozj.c;
                        return coxf.this;
                    }
                }, erpp.a);
            }
        }), this.w));
    }

    @Override // defpackage.coxg
    public final elfl d() {
        return ((cpda) this.f.b()).a();
    }

    @Override // defpackage.coxg
    public final elfl e() {
        return elfo.e(Boolean.valueOf(((coxi) this.p.b()).b()));
    }

    @Override // defpackage.coxg
    public final elfl f(final eqqh eqqhVar) {
        return elfo.g(new Callable() { // from class: cozg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cozj.this.k(eqqhVar);
                return ffcu.a;
            }
        }, (Executor) this.x.b());
    }

    @Override // defpackage.coxg
    public final synchronized void g() {
        csjb a = c.a();
        a.I("Sync started at");
        a.H(this.z);
        a.I("marked as complete");
        a.r();
        this.z = -1L;
        this.C = null;
        cpda cpdaVar = (cpda) this.f.b();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final AtomicReference atomicReference3 = new AtomicReference();
        elfl.g(cpdaVar.a.b(new emwl() { // from class: cpcv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cpcp cpcpVar = (cpcp) obj;
                int i = cpda.c;
                atomicReference.set(cpcpVar.d);
                eyja eyjaVar = cpcpVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                atomicReference2.set(eykj.d(eyjaVar));
                eyja eyjaVar2 = cpcpVar.f;
                if (eyjaVar2 == null) {
                    eyjaVar2 = eyja.a;
                }
                atomicReference3.set(eykj.d(eyjaVar2));
                cpco cpcoVar = (cpco) cpcpVar.toBuilder();
                cpcoVar.copyOnWrite();
                cpcp cpcpVar2 = (cpcp) cpcoVar.instance;
                cpcpVar2.b &= -3;
                cpcpVar2.d = cpcp.a.d;
                cpcoVar.copyOnWrite();
                cpcp cpcpVar3 = (cpcp) cpcoVar.instance;
                cpcpVar3.e = null;
                cpcpVar3.b &= -5;
                cpcoVar.copyOnWrite();
                cpcp cpcpVar4 = (cpcp) cpcoVar.instance;
                cpcpVar4.f = null;
                cpcpVar4.b &= -9;
                return (cpcp) cpcoVar.build();
            }
        }, erpp.a)).h(new emwl() { // from class: cpcw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = cpda.c;
                Optional c2 = cpda.c((String) atomicReference.get());
                final AtomicReference atomicReference4 = atomicReference2;
                final AtomicReference atomicReference5 = atomicReference3;
                return c2.map(new Function() { // from class: cpct
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cpda.c;
                        return cpcz.d((UUID) obj2, (Instant) atomicReference4.get(), (Instant) atomicReference5.get());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, erpp.a).h(new emwl() { // from class: cozf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cozj cozjVar = cozj.this;
                long size = cozjVar.j.size();
                if (cozjVar.j.isEmpty()) {
                    cozjVar.p(false);
                    Iterator it = ((CopyOnWriteArraySet) cozjVar.e.get()).iterator();
                    while (it.hasNext()) {
                        ((coxh) it.next()).fE(true);
                    }
                } else {
                    cozi coziVar = (cozi) cozjVar.j.remove(0);
                    cozjVar.y(coziVar.a, coziVar.b, coziVar.c, eqqh.QUEUED_SYNC, coziVar.d);
                    Iterator it2 = ((CopyOnWriteArraySet) cozjVar.e.get()).iterator();
                    while (it2.hasNext()) {
                        ((coxh) it2.next()).fE(false);
                    }
                }
                if (optional.isPresent()) {
                    cqbz cqbzVar = (cqbz) cozjVar.h.b();
                    cpcz cpczVar = (cpcz) optional.get();
                    Instant f = cozjVar.d.f();
                    int i = engw.d;
                    cqbzVar.a(cpczVar.c(), cpczVar.a(), (Instant) cpczVar.b().orElse(Instant.EPOCH), f, size, enou.a);
                } else {
                    cqbz cqbzVar2 = (cqbz) cozjVar.h.b();
                    int i2 = engw.d;
                    engw engwVar = enou.a;
                    eqpq eqpqVar = (eqpq) eqpr.a.createBuilder();
                    eqpqVar.copyOnWrite();
                    eqpr eqprVar = (eqpr) eqpqVar.instance;
                    eqprVar.b |= 1;
                    eqprVar.c = size;
                    cqbzVar2.a.c(engwVar, (eqpr) eqpqVar.build());
                }
                return true;
            }
        }, this.w).k(axnw.b(), this.v);
    }

    @Override // defpackage.coxg
    public final void h() {
        j(this.d.f().toEpochMilli(), eqqh.IMMEDIATE_SYNC);
    }

    @Override // defpackage.coxg
    public final synchronized void i(long j) {
        ekzz f = eleg.f("TelephonySyncManager::onNewMessageInserted");
        try {
            long j2 = this.A;
            if (j2 < 0 || j > j2) {
                csjb a = c.a();
                a.I("New message at");
                a.H(j);
                a.I("is after upper bound of current sync batch");
                a.H(this.A);
                a.r();
            } else {
                this.B = Math.max(j2, j);
                csjb a2 = c.a();
                a2.I("New message at");
                a2.H(j);
                a2.I("is before upper bound of current sync batch");
                a2.H(this.A);
                a2.r();
            }
            f.close();
        } finally {
        }
    }

    @Override // defpackage.coxg
    public final void j(long j, eqqh eqqhVar) {
        A(j, ((coxi) this.p.b()).a(), j, eqqhVar);
    }

    @Override // defpackage.coxg
    public final void k(final eqqh eqqhVar) {
        if (!B()) {
            z(eqqhVar, eqqd.CANT_SYNC_WITH_TELEPHONY, true);
            csjb a = c.a();
            a.I("Skip forceFullSync() because canSyncWithTelephony is false");
            a.r();
            return;
        }
        p(true);
        ((covs) this.r.b()).i();
        n();
        if (!C()) {
            z(eqqhVar, eqqd.MISSING_PERMISSIONS, true);
            return;
        }
        csjb c2 = c.c();
        c2.I("Starting full sync");
        c2.A("reason", eqqhVar);
        c2.r();
        final long epochMilli = this.d.f().toEpochMilli() + cpze.b().toMillis();
        final elfl e = (eqqhVar == eqqh.SELECTED_DEFAULT_SMS_APP ? ((cpda) this.f.b()).b(epochMilli).h(new emwl() { // from class: coyr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cozj.c;
                return cozh.FIRST_FULL_SYNC;
            }
        }, erpp.a) : ((cpda) this.f.b()).a().i(new eroh() { // from class: coyz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Long) obj).equals(0L)) {
                    return elfo.e(cozh.NOT_FIRST_FULL_SYNC);
                }
                return ((cpda) cozj.this.f.b()).b(epochMilli).h(new emwl() { // from class: coyu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = cozj.c;
                        return cozh.FIRST_FULL_SYNC;
                    }
                }, erpp.a);
            }
        }, this.v)).e(IOException.class, new emwl() { // from class: coza
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cozj.c.s("Failed to update first full sync timestamp", (IOException) obj);
                return cozh.FAILED_TO_UPDATE_TIMESTAMP;
            }
        }, erpp.a);
        final elfl h = m.contains(eqqhVar) ? elfl.g(((cpda) this.f.b()).a.a()).h(new emwl() { // from class: cpcs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cpcp cpcpVar = (cpcp) obj;
                int i = cpda.c;
                String str = cpcpVar.d;
                eyja eyjaVar = cpcpVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                final Instant d = eykj.d(eyjaVar);
                eyja eyjaVar2 = cpcpVar.f;
                if (eyjaVar2 == null) {
                    eyjaVar2 = eyja.a;
                }
                final Instant d2 = eykj.d(eyjaVar2);
                return cpda.c(str).map(new Function() { // from class: cpcr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cpda.c;
                        return cpcz.d((UUID) obj2, Instant.this, d2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, erpp.a).h(new emwl() { // from class: coyw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cozj.c;
                return (UUID) ((Optional) obj).map(new Function() { // from class: coyx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cpcz) obj2).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: coyy
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cozj.c.r("Resuming full sync but no sync id was found.");
                        return UUID.randomUUID();
                    }
                });
            }
        }, this.v) : elfo.e(UUID.randomUUID());
        elfo.m(e, h).b(new erog() { // from class: coys
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cozh cozhVar = (cozh) erqt.q(e);
                UUID uuid = (UUID) erqt.q(h);
                UUID randomUUID = UUID.randomUUID();
                boolean equals = cozhVar.equals(cozh.FIRST_FULL_SYNC);
                int i = engw.d;
                engr engrVar = new engr();
                if (cozh.FAILED_TO_UPDATE_TIMESTAMP.equals(cozhVar)) {
                    engrVar.h(eqqd.FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP);
                }
                long j = epochMilli;
                eqqh eqqhVar2 = eqqhVar;
                cozj cozjVar = cozj.this;
                cqcd cqcdVar = (cqcd) cozjVar.g.b();
                cqcdVar.a.b(uuid, engrVar.g(), cqcd.d(eqqhVar2, true, equals, randomUUID));
                return ((cpzd) cozjVar.i.b()).a(Instant.ofEpochMilli(-1L), Instant.ofEpochMilli(j), Instant.ofEpochMilli(j), eqqhVar2, uuid, randomUUID);
            }
        }, (Executor) this.x.b()).k(axnw.c(new Consumer() { // from class: coyt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cozj.c.q("ForwardSyncExecutionScheduler queued forward sync");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.v);
    }

    @Override // defpackage.coxg
    public final void l(eqqh eqqhVar) {
        j(this.d.f().toEpochMilli() + cpze.b().toMillis(), eqqhVar);
    }

    @Override // defpackage.coxg
    public final void m(Uri uri, Instant instant) {
        long epochMilli = instant.toEpochMilli();
        long j = k;
        long j2 = epochMilli + j;
        long j3 = epochMilli - j;
        A(epochMilli, j3 >= 0 ? j3 : 0L, j2, eqqh.SPOT_SYNC);
    }

    @Override // defpackage.coxg
    public final void n() {
        ((coxi) this.p.b()).a.k("last_full_sync_time_millis", -1L);
        ((coxi) this.p.b()).a.k("last_sync_time_millis", -1L);
    }

    @Override // defpackage.coxg
    public final synchronized void o(cno cnoVar) {
        this.C = cnoVar;
    }

    @Override // defpackage.coxg
    public final void p(boolean z) {
        boolean u = u();
        cskc cskcVar = c;
        csjb c2 = cskcVar.c();
        c2.I("setting full sync.");
        c2.B("inProgress", z);
        c2.B("before", u);
        c2.r();
        if (u != z) {
            csjb a = cskcVar.a();
            a.I("setFullSyncInProgressFlag:");
            a.J(z);
            a.r();
            ((coxi) this.p.b()).a.g("bugle_full_sync_in_progress", z);
            if (z) {
                return;
            }
            baeh baehVar = (baeh) this.s.b();
            dtuu dtuuVar = (dtuu) baehVar.b.b();
            dtuuVar.getClass();
            new FillPartSizeAction(baehVar.a, dtuuVar).A();
        }
    }

    @Override // defpackage.coxg
    public final void q(boolean z) {
        n = Boolean.valueOf(z);
    }

    @Override // defpackage.coxg
    public final synchronized void r(long j) {
        emxf.a(this.A < 0);
        this.A = j;
        this.B = -1L;
    }

    @Override // defpackage.coxg
    public final boolean s() {
        return ((coxi) this.p.b()).a() != -1;
    }

    @Override // defpackage.coxg
    public final synchronized boolean t(long j) {
        boolean z;
        z = true;
        emxf.a(this.A >= 0);
        long j2 = this.B;
        if (j2 < 0 || j2 < j) {
            z = false;
        }
        csjb a = c.a();
        a.I("Sync batch of messages.");
        a.z("lowerBoundTimestamp", j);
        a.z("upperBoundTimestamp", this.A);
        a.B("dirty", z);
        a.z("maxRecentChangeTimestamp", this.B);
        a.r();
        this.A = -1L;
        this.B = -1L;
        return z;
    }

    @Override // defpackage.coxg
    public final boolean u() {
        return ((coxi) this.p.b()).b();
    }

    @Override // defpackage.coxg
    public final synchronized boolean v() {
        return this.z >= 0;
    }

    @Override // defpackage.coxg
    public final synchronized boolean w(long j) {
        emxf.a(j >= 0);
        csjb a = c.a();
        a.I("IsSyncing");
        a.z("upperBoundTimestamp", j);
        a.z("currentUpperBoundTimestamp", this.A);
        a.r();
        return j == this.A;
    }

    public final synchronized coxf x(boolean z, long j, long j2, long j3, UUID uuid) {
        cskc cskcVar = c;
        csjb d = cskcVar.d();
        d.I("Checking if sync can start");
        d.z("startTimestampMs", j);
        d.A("syncId", uuid);
        d.B("isFull", z);
        d.r();
        if (z) {
            long a = a(j);
            if (a > 0) {
                csjb a2 = cskcVar.a();
                a2.I("Full sync requested, but delayed");
                a2.z("startTimestampMs", j);
                a2.z("delayUntilFullSyncMs", a);
                a2.A("syncId", uuid);
                a2.r();
                return coxf.FULL_SYNC_DELAYED;
            }
        }
        if (!v()) {
            csjb a3 = cskcVar.a();
            a3.I("Sync configured");
            a3.z("startTimestampMs", j);
            a3.A("syncId", uuid);
            a3.B("isFull", z);
            a3.r();
            this.z = j;
            this.A = j3;
            this.B = -1L;
            Iterator it = ((CopyOnWriteArraySet) this.e.get()).iterator();
            while (it.hasNext()) {
                ((coxh) it.next()).b(z);
            }
            return coxf.CAN_START;
        }
        csjb a4 = cskcVar.a();
        a4.I("Not allowed to sync yet");
        a4.z("Current sync started at", this.z);
        a4.A("syncId", uuid);
        a4.B("isFull", z);
        a4.r();
        if (z) {
            return coxf.DO_NOT_START;
        }
        csjb a5 = cskcVar.a();
        a5.I("Adding partial sync request to queue");
        a5.z("startTimestampMs", j);
        a5.A("syncId", uuid);
        a5.r();
        this.j.add(new cozi(j, j2, j3, uuid));
        return coxf.PARTIAL_SYNC_QUEUED;
    }

    public final void y(long j, long j2, long j3, eqqh eqqhVar, UUID uuid) {
        if (!B()) {
            z(eqqhVar, eqqd.CANT_SYNC_WITH_TELEPHONY, false);
            return;
        }
        if (!C()) {
            z(eqqhVar, eqqd.MISSING_PERMISSIONS, false);
            return;
        }
        ffbr ffbrVar = this.g;
        UUID randomUUID = UUID.randomUUID();
        cqcd cqcdVar = (cqcd) ffbrVar.b();
        int i = engw.d;
        cqcdVar.a.b(uuid, enou.a, cqcd.d(eqqhVar, false, false, randomUUID));
        axnw.h(((cpzd) this.i.b()).a(Instant.ofEpochMilli(j2), Instant.ofEpochMilli(j3), Instant.ofEpochMilli(j), eqqhVar, uuid, randomUUID));
    }
}
