package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnt implements cmne {
    public static final dktn a = new dktn("provisioning");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler");
    public static final cfup c = cfvl.e(cfvl.b, "expeditedApiRetryLimit", 0);
    public final ffbr d;
    private final Context e;
    private final ffbr f;
    private final ckhf g;
    private final csjk h;
    private final errl i;
    private final ffbr j;
    private final cqoh k;
    private final ffbr l;
    private final dkvu m;
    private pot n;
    private final cort o;
    private final errl p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public cmnt(Context context, ffbr ffbrVar, ffbr ffbrVar2, ckhf ckhfVar, csjk csjkVar, errl errlVar, ffbr ffbrVar3, cqoh cqohVar, ffbr ffbrVar4, dkvu dkvuVar, cort cortVar, errl errlVar2, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.e = context;
        this.f = ffbrVar;
        this.d = ffbrVar2;
        this.g = ckhfVar;
        this.h = csjkVar;
        this.i = errlVar;
        this.j = ffbrVar3;
        this.k = cqohVar;
        this.l = ffbrVar4;
        this.m = dkvuVar;
        this.o = cortVar;
        this.p = errlVar2;
        this.q = ffbrVar5;
        this.r = ffbrVar6;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.u = ffbrVar9;
    }

    private final void o(final String str, final long j, final boolean z, final ppa ppaVar, final eqws eqwsVar) {
        axnw.h(elfo.f(new Runnable() { // from class: cmno
            @Override // java.lang.Runnable
            public final void run() {
                cmnt.this.n(str, j, z, ppaVar, eqwsVar);
            }
        }, this.i));
    }

    @Override // defpackage.cmne
    public final elfl a(final eqws eqwsVar) {
        dkty.k("RcsAvailabilityLogWorkerScheduler is cancelled", new Object[0]);
        axnw.h(elfl.g(((pqc) pqr.a(this.g.a).b("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker")).c));
        return elfl.g(((pqc) pqr.a(this.e).a("provisioning")).c).h(new emwl() { // from class: cmns
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dktn dktnVar = cmnt.a;
                dkty.k("Cancel All Provisioning work operation result is: %s, trigger is %s", (ppz) obj, eqws.this.name());
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.cmne
    public final elfl b() {
        return elfl.g(((ejoc) this.j.b()).a("revoke_google_tos_consent_user_disabled")).h(new emwl() { // from class: cmnr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) cmnt.b.e()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "cancelAllRevokeGoogleToSConsentTasks", 488, "RcsProvisioningWorkManagerScheduler.java")).q("cancelRevokeGoogleToSConsentTask, for RevokeGoogleToSConsentWorker.revoke_google_tos_consent_user_disabled tag");
                return null;
            }
        }, this.p);
    }

    @Override // defpackage.cmne
    public final elfl c(final eqws eqwsVar) {
        return a(eqwsVar).h(new emwl() { // from class: cmnp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmnt cmntVar = cmnt.this;
                cmntVar.n(((dkpp) cmntVar.d.b()).l(), 0L, false, ppa.REPLACE, eqwsVar);
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.cmne
    public final elfl d(final djro djroVar, final eqws eqwsVar) {
        dkty.l(a, "Restart provisioning: %s", eqwsVar);
        return a(eqwsVar).h(new emwl() { // from class: cmnq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmnt.this.n(djroVar.a, 0L, false, ppa.REPLACE, eqwsVar);
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.cmne
    public final void e(String str, Duration duration, eqws eqwsVar) {
        f(str, duration, false, eqwsVar);
    }

    @Override // defpackage.cmne
    public final void f(String str, Duration duration, boolean z, eqws eqwsVar) {
        dkty.k("Scheduled config refresh with %s seconds delay, %s appendIfExists", Long.valueOf(duration.getSeconds()), Boolean.valueOf(z));
        o(str, duration.getSeconds(), true, z ? ppa.APPEND : ppa.KEEP, eqwsVar);
    }

    @Override // defpackage.cmne
    public final void g(String str) {
        ((dkcp) this.f.b()).x(str);
        f(str, Duration.ZERO, false, eqws.DEBUG_UTILS);
    }

    @Override // defpackage.cmne
    public final void h(String str, eqws eqwsVar, boolean z) {
        if (dizg.C()) {
            dkty.l(a, "Schedule DisableRcsTask due to trigger = %s, forceDisableThenReprovision = %s", eqwsVar.name(), Boolean.valueOf(z));
            ejoc ejocVar = (ejoc) this.j.b();
            int i = cmml.a;
            poh pohVar = new poh();
            pohVar.c(2);
            poj a2 = pohVar.a();
            pon ponVar = new pon();
            ponVar.f("force_disable_then_reprovision", z);
            ponVar.e("sim_id", str);
            pot a3 = ponVar.a();
            ejoe n = ejoi.n(cmml.class);
            n.d(a2);
            ejnt ejntVar = (ejnt) n;
            ejntVar.c = new ejnw(0L, TimeUnit.SECONDS);
            n.g(new ejnx("disable_rcs".concat(String.valueOf(str)), poz.KEEP));
            ejntVar.e = a3;
            elfl.g(ejocVar.c(n.h())).k(axnw.b(), this.i);
        }
    }

    @Override // defpackage.cmne
    public final void i(String str, String str2, eqws eqwsVar) {
        ejoc ejocVar = (ejoc) this.j.b();
        poh pohVar = new poh();
        pohVar.c(2);
        poj a2 = pohVar.a();
        ejoe n = ejoi.n(cmmr.class);
        n.d(a2);
        pon ponVar = new pon();
        ponVar.e("sim_id", str);
        ejnt ejntVar = (ejnt) n;
        ejntVar.e = ponVar.a();
        ejntVar.c = new ejnw(0L, TimeUnit.SECONDS);
        n.g(new ejnx("notify_rcs_unavailable".concat(String.valueOf(str)), poz.KEEP));
        elfl.g(ejocVar.c(n.h())).k(axnw.b(), this.i);
        ((enrr) ((enrr) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "scheduleNotifyRcsUnavailableTask", 179, "RcsProvisioningWorkManagerScheduler.java")).D("Scheduling NotifyRcsUnavailable task due to %s, the trigger is %s", str2, eqwsVar.name());
    }

    @Override // defpackage.cmne
    public final void j(eqws eqwsVar) {
        k(((dkpp) this.d.b()).l(), eqwsVar);
    }

    @Override // defpackage.cmne
    public final void k(String str, eqws eqwsVar) {
        if (eqwsVar.equals(eqws.REPROVISIONING_CAMPAIGN) || eqwsVar.equals(eqws.FI_ACTIVATION_COMPLETE)) {
            m(str, Duration.ZERO, 2, eqwsVar);
        } else {
            m(str, Duration.ZERO, 1, eqwsVar);
        }
    }

    @Override // defpackage.cmne
    public final void l(boolean z, eqws eqwsVar) {
        ejoi h;
        dkty.c("RevokeGoogleConsentTask scheduled, isDisabled = %s, trigger = %s", Boolean.valueOf(z), eqwsVar.name());
        ejoc ejocVar = (ejoc) this.j.b();
        Duration duration = cmnz.a;
        pon ponVar = new pon();
        ponVar.f("is_disabled_by_user", z);
        pot a2 = ponVar.a();
        if (z && djai.M()) {
            ejoe n = ejoi.n(cmnz.class);
            poh pohVar = new poh();
            pohVar.c(2);
            n.d(pohVar.a());
            ejnt ejntVar = (ejnt) n;
            ejntVar.c = new ejnw(((Long) djai.t().a.as.a()).longValue(), TimeUnit.MINUTES);
            n.g(new ejnx("revoke_google_tos_consent_user_disabled", poz.KEEP));
            ejntVar.e = a2;
            h = n.h();
        } else {
            ejoe n2 = ejoi.n(cmnz.class);
            poh pohVar2 = new poh();
            pohVar2.c(2);
            n2.d(pohVar2.a());
            ejnt ejntVar2 = (ejnt) n2;
            ejntVar2.c = new ejnw(0L, TimeUnit.SECONDS);
            n2.g(new ejnx("revoke_google_tos_consent", poz.KEEP));
            ejntVar2.e = a2;
            h = n2.h();
        }
        elfl.g(ejocVar.c(h)).k(axnw.b(), this.i);
    }

    @Override // defpackage.cmne
    public final void m(String str, Duration duration, int i, eqws eqwsVar) {
        int i2 = i - 1;
        o(str, duration.getSeconds(), false, i2 != 1 ? i2 != 2 ? ppa.KEEP : ppa.APPEND : ppa.REPLACE, eqwsVar);
    }

    public final void n(String str, long j, boolean z, ppa ppaVar, eqws eqwsVar) {
        int i;
        String concat;
        String str2 = str;
        djro djroVar = new djro(str2);
        Integer num = (Integer) this.o.j(new djro(djroVar.a)).map(new Function() { // from class: cmnn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cosz) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(-1);
        int intValue = num.intValue();
        dkvg a2 = this.m.a(intValue);
        int i2 = 1;
        if (!Objects.equals(a2, dkvg.DUAL_REG)) {
            dkty.l(a, "Skipping DR provisioning scheduling, sipConnectionType:%s subId: %d", a2.name(), num);
            return;
        }
        if (TextUtils.isEmpty(djroVar.a)) {
            djroVar = new djro(((dkpp) this.d.b()).l());
        }
        if (dizg.C()) {
            this.g.a();
        }
        if (!dizg.C()) {
            dkty.l(a, "Provisioning task in Bugle is disabled by P/H flag", new Object[0]);
            return;
        }
        if (!z && ((dkcp) this.f.b()).f(djroVar.a).Z()) {
            if (eqwsVar.equals(eqws.FI_ACTIVATION_COMPLETE) && ctid.h) {
                cmoi.b(this.e, 4, intValue);
            }
            dkty.l(a, "Skipping full provisioning scheduling since we already have valid and updated RCS configuration", new Object[0]);
            return;
        }
        if (new djtc(((ckge) this.h.a()).w(djroVar)).d()) {
            if (eqwsVar.equals(eqws.FI_ACTIVATION_COMPLETE) && ctid.h) {
                cmoi.b(this.e, 3, intValue);
            }
            dkty.l(a, "Skipping provisioning scheduling since RCS is disabled", new Object[0]);
            return;
        }
        if (eqwsVar.equals(eqws.FI_ACTIVATION_COMPLETE) && ctid.h) {
            cmoi.b(this.e, 2, intValue);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ((dkpp) this.d.b()).l();
        }
        poh pohVar = new poh();
        pohVar.c(2);
        poj a3 = pohVar.a();
        ppv ppvVar = new ppv(RcsProvisioningListenableWorker.class);
        if (((auna) this.u.b()).a()) {
            String str3 = true == eqwsVar.equals(eqws.DEBUG_UTILS) ? "debugprovisioning" : "provisioning";
            ppvVar.g(a3);
            ppvVar.i(Duration.ofSeconds(j));
            i = 3;
            ppvVar.f(poa.EXPONENTIAL, ((Integer) cmmj.b.e()).intValue(), TimeUnit.SECONDS);
            ppvVar.d(str3);
        } else {
            i = 3;
            ppvVar.g(a3);
            ppvVar.i(Duration.ofSeconds(j));
            ppvVar.f(poa.EXPONENTIAL, ((Integer) cmmj.b.e()).intValue(), TimeUnit.SECONDS);
            ppvVar.d("provisioning");
        }
        String uuid = UUID.randomUUID().toString();
        cort cortVar = this.o;
        ffbr ffbrVar = this.q;
        cost a4 = cortVar.a();
        if (!((asqs) ffbrVar.b()).a() && !str2.equals(a4.c)) {
            try {
                throw new IllegalArgumentException("Submitting provisioning task for non-default system SIM.");
            } catch (IllegalArgumentException e) {
                ((enrr) ((enrr) ((enrr) b.j()).g(e)).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "submitProvisioningTask", (char) 546, "RcsProvisioningWorkManagerScheduler.java")).q("RcsProvisioningWorkManagerScheduler: Submitting provisioning task for non-default system SIM.");
            }
        }
        pon ponVar = new pon();
        ponVar.h("scheduled_time_sec", Duration.ofMillis(this.k.f().toEpochMilli()).plusSeconds(j).getSeconds());
        ponVar.f("is_config_refresh", z);
        ponVar.g("trigger_event", eqwsVar.aa);
        ponVar.e("worker_id", uuid);
        ponVar.e("rcs_provisioning_id", str2);
        ponVar.f("use_sim_subscription_info", true);
        pot a5 = ponVar.a();
        this.n = a5;
        ppvVar.j(a5);
        if (((cmnu) this.l.b()).a(str2) < ((Integer) c.e()).intValue()) {
            ppvVar.c(pqg.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        }
        if (((auna) this.u.b()).a() && eqwsVar.equals(eqws.DEBUG_UTILS)) {
            concat = "debugprovisioning_" + str2 + "_" + String.valueOf(UUID.randomUUID());
        } else {
            concat = "provisioning_".concat(String.valueOf(str2));
        }
        dktn dktnVar = a;
        Long valueOf = Long.valueOf(j);
        String name = eqwsVar.name();
        String c2 = dktx.SIM_ID.c(str2);
        Object[] objArr = new Object[5];
        objArr[0] = valueOf;
        objArr[1] = ppaVar;
        objArr[2] = name;
        objArr[i] = uuid;
        objArr[4] = c2;
        dkty.l(dktnVar, "Scheduled provisioning task with %s seconds delay, %s policy, trigger is %s, workerId is %s, simId is %s", objArr);
        if (((aung) this.r.b()).a()) {
            ckhh ckhhVar = (ckhh) this.s.b();
            eqxn eqxnVar = (eqxn) eqxo.a.createBuilder();
            eqxnVar.copyOnWrite();
            eqxo eqxoVar = (eqxo) eqxnVar.instance;
            eqxoVar.c = eqwsVar.aa;
            eqxoVar.b |= 1;
            eqxnVar.copyOnWrite();
            eqxo eqxoVar2 = (eqxo) eqxnVar.instance;
            eqxoVar2.b |= 2;
            eqxoVar2.d = j;
            int ordinal = ppaVar.ordinal();
            if (ordinal == 0) {
                i2 = i;
            } else if (ordinal == 1) {
                i2 = 2;
            } else if (ordinal == 2) {
                i2 = 4;
            } else if (ordinal == i) {
                i2 = 5;
            }
            eqxnVar.copyOnWrite();
            eqxo eqxoVar3 = (eqxo) eqxnVar.instance;
            eqxoVar3.f = i2 - 1;
            eqxoVar3.b |= 8;
            eqpc b2 = ((dijt) this.t.b()).b(new djro(str2));
            eqxnVar.copyOnWrite();
            eqxo eqxoVar4 = (eqxo) eqxnVar.instance;
            b2.getClass();
            eqxoVar4.e = b2;
            eqxoVar4.b |= 4;
            ckhhVar.f((eqxo) eqxnVar.build());
        }
        pqr.a(this.e).j(concat, ppaVar, (ppw) ppvVar.b()).a();
    }
}
