package com.google.android.apps.messaging.shared.rcsprovisioning;

import android.app.Notification;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.asqs;
import defpackage.aunn;
import defpackage.axnw;
import defpackage.cguo;
import defpackage.cinj;
import defpackage.cins;
import defpackage.ckgb;
import defpackage.ckge;
import defpackage.ckhh;
import defpackage.cmne;
import defpackage.cmnt;
import defpackage.cmnu;
import defpackage.cort;
import defpackage.cqoh;
import defpackage.csjk;
import defpackage.cthp;
import defpackage.djai;
import defpackage.djrm;
import defpackage.djrn;
import defpackage.djtd;
import defpackage.djxs;
import defpackage.djxt;
import defpackage.dkay;
import defpackage.dkcp;
import defpackage.dkpm;
import defpackage.dktx;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elav;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emxe;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eqws;
import defpackage.eqxl;
import defpackage.eqxm;
import defpackage.erpp;
import defpackage.errl;
import defpackage.kfb;
import defpackage.kfd;
import defpackage.kfg;
import defpackage.pot;
import defpackage.ppb;
import defpackage.ppn;
import defpackage.ppo;
import defpackage.ppp;
import defpackage.ppq;
import defpackage.ppr;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsProvisioningListenableWorker extends ppr implements djtd {
    private final csjk A;
    private final long B;
    private final boolean C;
    private int D;
    private final cqoh E;
    private volatile String F;
    private final cmnu G;
    private final long H;
    private final elbx I;
    private final cthp J;
    private final cins K;
    private final cguo L;
    private final aunn M;
    public final Context f;
    public final cmne g;
    public djxs h;
    public ppq i;
    public final String j;
    public final eqws k;
    public final String l;
    public kfb m;
    public final errl n;
    public elfl o;
    public final djxt p;
    public final cort q;
    public final Optional r;
    public final boolean s;
    public final asqs t;
    public int u;
    private final dkcp w;
    private final dkpm x;
    private final dkay y;
    private final ckhh z;
    private static final AtomicLong v = new AtomicLong(0);
    public static final entd e = entd.c("BugleRcsWorker");

    /* compiled from: PG */
    public interface a {
        asqs ax();

        aunn az();

        elbx b();

        cguo bW();

        csjk cE();

        cins cb();

        ckhh cm();

        cmne cp();

        cmnu cq();

        cort ct();

        djxs dr();

        djxt ds();

        dkay dt();

        dkcp du();

        dkpm dv();

        void iP();

        void iQ();

        cthp j();

        cqoh v();

        errl x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcsProvisioningListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        dkcp du = p(context).du();
        cmne cp = p(context).cp();
        dkpm dv = p(context).dv();
        dkay dt = p(context).dt();
        ckhh cm = p(context).cm();
        csjk cE = p(context).cE();
        cqoh v2 = p(context).v();
        cmnu cq = p(context).cq();
        elbx b = p(context).b();
        cthp j = p(context).j();
        cins cb = p(context).cb();
        errl x = p(context).x();
        djxt ds = p(context).ds();
        cort ct = p(context).ct();
        cguo bW = p(context).bW();
        asqs ax = p(context).ax();
        aunn az = p(context).az();
        p(context).iQ();
        p(context).iP();
        this.i = new ppn();
        this.o = null;
        this.f = context;
        this.j = String.valueOf(v.getAndIncrement());
        this.H = v2.f().toEpochMilli();
        pot potVar = workerParameters.b;
        this.B = potVar.b("scheduled_time_sec", 0L);
        this.C = potVar.h("is_config_refresh");
        this.w = du;
        this.g = cp;
        this.x = dv;
        this.y = dt;
        this.z = cm;
        this.A = cE;
        this.E = v2;
        this.G = cq;
        this.I = b;
        this.J = j;
        this.K = cb;
        this.n = x;
        this.p = ds;
        this.q = ct;
        this.L = bW;
        this.t = ax;
        eqws b2 = eqws.b(potVar.a("trigger_event", 0));
        this.k = b2 == null ? eqws.UNDEFINED_TRIGGER_EVENT : b2;
        this.l = emxe.b(potVar.d("worker_id"));
        boolean h = potVar.h("use_sim_subscription_info");
        this.s = h;
        if (h) {
            this.r = Optional.ofNullable(potVar.d("rcs_provisioning_id")).map(new Function() { // from class: cmnb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new djro((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            this.r = Optional.empty();
        }
        this.M = az;
    }

    public static String c(String str, Object[] objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    private static a p(Context context) {
        return (a) ekhw.a(context, a.class);
    }

    private final elav q(String str) {
        try {
            return this.I.b(str);
        } catch (IllegalStateException unused) {
            eleg.d();
            return eleg.f(str);
        }
    }

    private final elfl r() {
        this.u = 2;
        return elfl.g(kfg.a(new kfd() { // from class: cmmv
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                final RcsProvisioningListenableWorker rcsProvisioningListenableWorker = RcsProvisioningListenableWorker.this;
                rcsProvisioningListenableWorker.m = kfbVar;
                rcsProvisioningListenableWorker.o = elfo.f(new Runnable() { // from class: cmmy
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c;
                        RcsProvisioningListenableWorker rcsProvisioningListenableWorker2 = RcsProvisioningListenableWorker.this;
                        if (rcsProvisioningListenableWorker2.s) {
                            cosz coszVar = (cosz) rcsProvisioningListenableWorker2.q.j((djrm) rcsProvisioningListenableWorker2.r.orElseThrow()).orElse(null);
                            if (coszVar == null) {
                                ((ensz) ((ensz) RcsProvisioningListenableWorker.e.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logw", 661, "RcsProvisioningListenableWorker.java")).J("[seqId=%s][workId=%s] %s", rcsProvisioningListenableWorker2.j, rcsProvisioningListenableWorker2.l, RcsProvisioningListenableWorker.c("Cannot start provisioning engine. Unable to obtain sim info for sim id: %s", new Object[]{rcsProvisioningListenableWorker2.r.orElseThrow()}));
                                return;
                            }
                            djxt djxtVar = rcsProvisioningListenableWorker2.p;
                            boolean z = rcsProvisioningListenableWorker2.s;
                            boolean a2 = rcsProvisioningListenableWorker2.t.a();
                            Optional of = Optional.of(coszVar);
                            Optional.of(djxtVar.R);
                            Context context = djxtVar.a;
                            dikl diklVar = djxtVar.b;
                            djxy djxyVar = djxtVar.c;
                            Optional optional = djxtVar.d;
                            djvo djvoVar = djxtVar.e;
                            djxv djxvVar = djxtVar.f;
                            dkpm dkpmVar = djxtVar.g;
                            djvk djvkVar = djxtVar.h;
                            Optional optional2 = djxtVar.m;
                            dkcp dkcpVar = djxtVar.i;
                            c = 0;
                            dkdv dkdvVar = djxtVar.j;
                            errl errlVar = djxtVar.k;
                            ctvb ctvbVar = djxtVar.l;
                            dked dkedVar = djxtVar.n;
                            dfpi dfpiVar = djxtVar.o;
                            cort cortVar = djxtVar.z;
                            ctwb ctwbVar = djxtVar.p;
                            djup djupVar = djxtVar.A;
                            djtw djtwVar = djxtVar.q;
                            csjk csjkVar = djxtVar.B;
                            djun djunVar = djxtVar.r;
                            cguo cguoVar = djxtVar.C;
                            ffbr ffbrVar = djxtVar.L;
                            djuo djuoVar = djxtVar.V;
                            cgud cgudVar = djxtVar.D;
                            ffbr ffbrVar2 = djxtVar.M;
                            djyf djyfVar = djxtVar.s;
                            ffsk ffskVar = djxtVar.E;
                            ffbr ffbrVar3 = djxtVar.N;
                            djyc djycVar = djxtVar.t;
                            ffhd ffhdVar = djxtVar.F;
                            ffbr ffbrVar4 = djxtVar.O;
                            csjk csjkVar2 = djxtVar.u;
                            errl errlVar2 = djxtVar.G;
                            ffbr ffbrVar5 = djxtVar.P;
                            rcsProvisioningListenableWorker2.h = new djxs(context, diklVar, djxyVar, optional, djvoVar, djxvVar, dkpmVar, djvkVar, optional2, dkcpVar, dkdvVar, errlVar, ctvbVar, dkedVar, dfpiVar, ctwbVar, djtwVar, djunVar, djuoVar, djyfVar, djycVar, csjkVar2, djxtVar.v, djxtVar.w, djxtVar.x, djxtVar.y, z, of, cortVar, djupVar, csjkVar, cguoVar, cgudVar, ffskVar, ffhdVar, errlVar2, djxtVar.H, djxtVar.I, djxtVar.J, djxtVar.K, a2, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, djxtVar.Q, djxtVar.S, djxtVar.T, Optional.of(djxtVar.U));
                        } else {
                            c = 0;
                            rcsProvisioningListenableWorker2.h = ((RcsProvisioningListenableWorker.a) ekhw.a(rcsProvisioningListenableWorker2.f, RcsProvisioningListenableWorker.a.class)).dr();
                        }
                        djxs djxsVar = rcsProvisioningListenableWorker2.h;
                        djxsVar.getClass();
                        djxsVar.K = Optional.of(rcsProvisioningListenableWorker2);
                        djxs djxsVar2 = rcsProvisioningListenableWorker2.h;
                        eqws eqwsVar = rcsProvisioningListenableWorker2.k;
                        djxsVar2.W = eqwsVar;
                        djxsVar2.X = rcsProvisioningListenableWorker2.l;
                        String name = eqwsVar.name();
                        Object[] objArr = new Object[1];
                        objArr[c] = name;
                        rcsProvisioningListenableWorker2.m("Starting StateMachine, trigger is %s", objArr);
                        djxs djxsVar3 = rcsProvisioningListenableWorker2.h;
                        djxsVar3.getClass();
                        djxsVar3.P();
                    }
                }, rcsProvisioningListenableWorker.n);
                axnw.h(rcsProvisioningListenableWorker.o);
                return "RCS Provisioning Task";
            }
        }));
    }

    private final void s(String str) {
        this.G.b(str).k(axnw.b(), erpp.a);
    }

    private final void t(int i, String str) {
        this.D = this.G.a(str);
        int i2 = i - 1;
        if (i2 == 0) {
            this.u = 4;
            String k = k();
            long f = this.w.f(k).f();
            if (f > 0) {
                this.g.f(k, Duration.ofSeconds(f), true, eqws.RCS_CONFIGURATION_UPDATED);
            }
            if (this.s) {
                ((ckge) this.A.a()).p((djrm) this.r.orElseThrow(new Supplier() { // from class: cmmz
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        entd entdVar = RcsProvisioningListenableWorker.e;
                        throw new IllegalStateException("RCS Provisioning Id should not be empty");
                    }
                }), ckgb.RCS_CONFIGURATION_UPDATE);
            } else {
                ((ckge) this.A.a()).n(ckgb.RCS_CONFIGURATION_UPDATE);
            }
            String k2 = k();
            m("Configuration is updated for SIM %s, notifying listeners", dktx.SIM_ID.c(k2));
            this.y.t(k2, Optional.of(this.w.f(k2)));
            s(k2);
            this.i = new ppp();
        } else if (i2 == 1) {
            m("RCS is disabled, shutting down Provisioning Task", new Object[0]);
            this.u = 6;
            this.i = new ppp();
        } else if (i2 == 2) {
            m("Provisioning Engine needs user input, shutting down Provisioning Task", new Object[0]);
            this.u = 5;
            s(k());
            this.i = new ppp();
        } else if (i2 != 4) {
            m("Provisioning Engine entered RetryState, provisioning task will be rescheduled with exponential backoff", new Object[0]);
            this.u = 7;
            u(k(), 3);
        } else {
            m("Provisioning Engine needs manual msisdn entry, shutting down Provisioning Task", new Object[0]);
            this.u = 5;
            if ((djai.z() && djai.ac()) ? this.L.c(str).x : djai.W()) {
                this.g.m(k(), Duration.ofMillis(djai.p()), 3, eqws.MANUAL_MSISDN_ENTRY_REQUIRED);
            }
            this.i = new ppp();
        }
        l();
    }

    private final void u(String str, final int i) {
        this.G.c(str).h(new emwl() { // from class: cmmx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Duration duration = (Duration) obj;
                csjy.i("Bugle", "Scheduling custom retry");
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = RcsProvisioningListenableWorker.this;
                rcsProvisioningListenableWorker.g.m(rcsProvisioningListenableWorker.k(), duration, i, eqws.STATE_MACHINE_RETRY);
                return duration;
            }
        }, erpp.a).k(axnw.b(), erpp.a);
        this.i = new ppp();
    }

    @Override // defpackage.ppr
    public final ListenableFuture a() {
        if (this.G.a(k()) >= ((Integer) cmnt.c.e()).intValue()) {
            return super.a();
        }
        this.J.c();
        int i = cinj.FOREGROUND_SERVICE.G;
        Notification c = this.K.c(this.f.getString(R.string.rcs_foreground_service_message_v2));
        c.getClass();
        return elfo.e(new ppb(i, c, 0));
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        m("RCS provisioning task has started", new Object[0]);
        if (this.M.a()) {
            elav q = q("RcsProvisioningListenableWorker: startWork");
            try {
                elfl r = r();
                q.close();
                return r;
            } catch (Throwable th) {
                try {
                    q.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzm b = this.I.b("RcsProvisioningListenableWorker: startWork");
        try {
            elfl r2 = r();
            b.close();
            return r2;
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ppr
    public final void d() {
        m("Provisioning task is stopped by the system", new Object[0]);
        this.u = 3;
        u(k(), 2);
        l();
    }

    public final String k() {
        return this.s ? djrn.a((djrm) this.r.orElseThrow(new Supplier() { // from class: cmmw
            @Override // java.util.function.Supplier
            public final Object get() {
                entd entdVar = RcsProvisioningListenableWorker.e;
                throw new IllegalStateException("RCS Provisioning Id should not be empty");
            }
        })).a : this.x.f();
    }

    public final void l() {
        int i = 1;
        m("finish provisioning task with result %s", this.i);
        m("RCS provisioning task has finished with result %s", this.i);
        eqxl eqxlVar = (eqxl) eqxm.a.createBuilder();
        eqxlVar.copyOnWrite();
        eqxm eqxmVar = (eqxm) eqxlVar.instance;
        eqxmVar.b |= 1;
        eqxmVar.c = this.C;
        long seconds = this.B != 0 ? TimeUnit.MILLISECONDS.toSeconds(this.H) - this.B : 0L;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar2 = (eqxm) eqxlVar.instance;
        eqxmVar2.b |= 2;
        eqxmVar2.d = seconds;
        long epochMilli = this.E.f().toEpochMilli() - this.H;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar3 = (eqxm) eqxlVar.instance;
        eqxmVar3.b |= 4;
        eqxmVar3.e = epochMilli;
        String str = this.j;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar4 = (eqxm) eqxlVar.instance;
        str.getClass();
        eqxmVar4.b |= 8;
        eqxmVar4.f = str;
        int i2 = this.u;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar5 = (eqxm) eqxlVar.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        eqxmVar5.g = i3;
        eqxmVar5.b |= 16;
        ppq ppqVar = this.i;
        if (ppqVar.equals(new ppp())) {
            i = 3;
        } else if (ppqVar.equals(new ppo())) {
            i = 2;
        } else if (ppqVar.equals(new ppn())) {
            i = 4;
        }
        eqxlVar.copyOnWrite();
        eqxm eqxmVar6 = (eqxm) eqxlVar.instance;
        eqxmVar6.h = i - 1;
        eqxmVar6.b |= 32;
        int e2 = e();
        eqxlVar.copyOnWrite();
        eqxm eqxmVar7 = (eqxm) eqxlVar.instance;
        eqxmVar7.b |= 64;
        eqxmVar7.i = e2;
        String str2 = this.l;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar8 = (eqxm) eqxlVar.instance;
        eqxmVar8.b |= 128;
        eqxmVar8.j = str2;
        String b = emxe.b(this.F);
        eqxlVar.copyOnWrite();
        eqxm eqxmVar9 = (eqxm) eqxlVar.instance;
        eqxmVar9.b |= 256;
        eqxmVar9.k = b;
        int i4 = this.D;
        eqxlVar.copyOnWrite();
        eqxm eqxmVar10 = (eqxm) eqxlVar.instance;
        eqxmVar10.b |= 512;
        eqxmVar10.l = i4;
        this.z.e((eqxm) eqxlVar.build());
        elfl elflVar = this.o;
        if (elflVar != null) {
            axnw.h(elflVar.h(new emwl() { // from class: cmna
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    djxs djxsVar = RcsProvisioningListenableWorker.this.h;
                    if (djxsVar != null) {
                        djxsVar.J();
                    }
                    return true;
                }
            }, this.n));
        } else {
            djxs djxsVar = this.h;
            if (djxsVar != null) {
                djxsVar.J();
            }
        }
        kfb kfbVar = this.m;
        if (kfbVar != null) {
            kfbVar.b(this.i);
        }
    }

    public final void m(String str, Object... objArr) {
        ((ensz) ((ensz) e.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logi", 657, "RcsProvisioningListenableWorker.java")).J("[seqId=%s][workId=%s] %s", this.j, this.l, c(str, objArr));
    }

    @Override // defpackage.djtd
    public final void n(String str) {
        this.F = str;
    }

    @Override // defpackage.djtd
    public final void o(int i, String str) {
        m("Received a provisioning state changed event from the provisioning engine %s", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "MANUAL_MSISDN_ENTRY_REQUIRED" : "RETRY" : "USER_INPUT_REQUIRED" : "RCS_DISABLED" : "CONFIGURATION_UPDATED");
        if (this.M.a()) {
            elav q = q("RcsProvisioningListenableWorker: RcsProvisioningStateChanged");
            try {
                t(i, str);
                q.close();
                return;
            } catch (Throwable th) {
                try {
                    q.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzm b = this.I.b("RcsProvisioningListenableWorker: RcsProvisioningStateChanged");
        try {
            t(i, str);
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
