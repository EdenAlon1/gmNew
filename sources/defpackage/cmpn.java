package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpn implements ckaj, cnjv, cnjs, cnjx, cijf, cijd, cnju, cnjz, dihl {
    public static final entd a = entd.c("BugleRcsProvisioning");
    static final cfva b;
    private final ffbr A;
    private final ffbr B;
    private final dkvu C;
    private final ctud D;
    private final asvd E;
    private final ffbr F;
    private final ffbr G;
    private final asvq H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final Map Q = new ConcurrentHashMap();
    private final Set R = enpw.i();
    private final cmos S = new cmos(this);
    private final cmot T = new cmot(this);
    private final djrb U;
    public final ffbr c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    public final ckhh g;
    public final cmel h;
    public final ajoz i;
    public final elbx j;
    public final ffbr k;
    public final cmnf l;
    public final cort m;
    public final cguo n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    private final Context s;
    private final ffbr t;
    private final errl u;
    private final dkay v;
    private final dkcc w;
    private final dkca x;
    private final akvz y;
    private final cqoh z;

    static {
        cfvl.e(cfvl.b, "vendor_ims_service_connection_timeout_ms", 10000);
        b = cfvl.c(cfvl.b, "phenotype_trigger_event_sample_rate", 50.0d);
    }

    public cmpn(ffbr ffbrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3, cfud cfudVar, ffbr ffbrVar4, errl errlVar, errl errlVar2, ffbr ffbrVar5, ffbr ffbrVar6, dkay dkayVar, dkcc dkccVar, dkca dkcaVar, ckhh ckhhVar, akvz akvzVar, djrb djrbVar, cmel cmelVar, cqoh cqohVar, ffbr ffbrVar7, ajoz ajozVar, ffbr ffbrVar8, elbx elbxVar, ctud ctudVar, dkvu dkvuVar, ffbr ffbrVar9, cmnf cmnfVar, cort cortVar, ffbr ffbrVar10, ffbr ffbrVar11, cguo cguoVar, ffbr ffbrVar12, ffbr ffbrVar13, asvq asvqVar, asvd asvdVar, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21) {
        this.M = ffbrVar;
        this.N = ffbrVar2;
        this.s = context;
        this.c = ffbrVar3;
        this.t = ffbrVar4;
        this.d = errlVar;
        this.u = errlVar2;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.v = dkayVar;
        this.w = dkccVar;
        this.x = dkcaVar;
        this.g = ckhhVar;
        this.y = akvzVar;
        this.U = djrbVar;
        this.h = cmelVar;
        this.z = cqohVar;
        this.A = ffbrVar7;
        this.i = ajozVar;
        this.B = ffbrVar8;
        this.j = elbxVar;
        this.C = dkvuVar;
        this.D = ctudVar;
        this.k = ffbrVar9;
        this.l = cmnfVar;
        this.m = cortVar;
        this.F = ffbrVar10;
        this.G = ffbrVar11;
        this.n = cguoVar;
        this.o = ffbrVar12;
        this.p = ffbrVar13;
        this.E = asvdVar;
        this.H = asvqVar;
        this.I = ffbrVar14;
        this.q = ffbrVar15;
        this.J = ffbrVar16;
        this.K = ffbrVar17;
        this.r = ffbrVar18;
        this.L = ffbrVar19;
        this.O = ffbrVar20;
        this.P = ffbrVar21;
        cfudVar.c(new diyo() { // from class: cmov
            @Override // defpackage.diyo
            public final void onCsLibPhenotypeUpdated() {
                ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onCsLibPhenotypeUpdated", 898, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, enableProvisioningTaskInBugle = %s", Boolean.valueOf(dizg.C()));
                final cmpn cmpnVar = cmpn.this;
                if (djai.aa()) {
                    cmpnVar.s();
                    return;
                }
                final String str = (String) djai.t().a.ai.a();
                final String l = ((dkpp) cmpnVar.f.b()).l();
                ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onCsLibPhenotypeUpdated", 905, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, reprovisionCampaignId = %s, simId = %s", str, dktx.SIM_ID.c(l));
                if (str.equals("")) {
                    cmpnVar.s();
                } else {
                    cmpnVar.h.f(l).i(new eroh() { // from class: cmoj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            String str2 = (String) obj;
                            ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignIfNeeded", 932, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, lastReprovisionCampaignId = %s", str2);
                            cmpn cmpnVar2 = cmpn.this;
                            String str3 = l;
                            if (cmpnVar2.y(str3)) {
                                String str4 = str;
                                if (str4.equals("Default")) {
                                    cmpnVar2.h.l(str3, str4);
                                    cmpnVar2.s();
                                } else if (str4.startsWith("Rollback")) {
                                    if (str2.equals("Default")) {
                                        cmpnVar2.s();
                                    } else if (str2.startsWith("Rollback")) {
                                        if (!str2.equals(str4)) {
                                            cmpnVar2.h.l(str3, str4);
                                        }
                                        cmpnVar2.s();
                                    } else {
                                        cmpnVar2.q(str3, str4);
                                    }
                                } else if (str2.equals(str4)) {
                                    cmpnVar2.s();
                                } else {
                                    cmpnVar2.q(str3, str4);
                                }
                            } else {
                                ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignIfNeeded", 936, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, skipping ReprovisionCampaign since RCS is not available");
                                cmpnVar2.s();
                            }
                            return elfo.e(str2);
                        }
                    }, cmpnVar.d).k(axnw.b(), erpp.a);
                }
            }
        });
        ((ckge) ((csjk) ffbrVar4.b()).a()).i(new ckgc() { // from class: cmow
            @Override // defpackage.ckgc
            public final void al(ckgd ckgdVar) {
                AutoCloseable f;
                cmpn cmpnVar = cmpn.this;
                if (!((aunm) cmpnVar.r.b()).a()) {
                    cmpnVar.p(ckgdVar);
                    return;
                }
                try {
                    f = cmpnVar.j.b("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate");
                } catch (IllegalStateException unused) {
                    eleg.d();
                    f = eleg.f("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate");
                }
                try {
                    cmpnVar.p(ckgdVar);
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
        }, errlVar);
    }

    private final elfl C(ckgb ckgbVar, boolean z) {
        return D(ckgbVar, z, Optional.empty());
    }

    private final elfl D(final ckgb ckgbVar, boolean z, Optional optional) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateAvailabilityForAllSimsAsync", 1132, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: updateAvailabilityForAllSimsAsync : hint = %s logTriggerEvent = %s", ckgbVar, z);
        if (z) {
            optional.ifPresentOrElse(new Consumer() { // from class: cmph
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cmpn.this.g.c(cmpn.o(ckgbVar), ((Double) obj).doubleValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: cmpi
                @Override // java.lang.Runnable
                public final void run() {
                    cmpn.this.g.b(cmpn.o(ckgbVar));
                }
            });
        }
        return ((ckge) ((csjk) this.t.b()).a()).a(ckgbVar);
    }

    private final eqxa E(String str) {
        djtp f = ((dkcp) this.e.b()).f(str);
        boolean Q = f.Q();
        boolean z = !f.R();
        int a2 = f.a();
        boolean V = f.V();
        eqwz eqwzVar = (eqwz) eqxa.a.createBuilder();
        eqwzVar.copyOnWrite();
        eqxa eqxaVar = (eqxa) eqwzVar.instance;
        eqxaVar.b |= 1;
        eqxaVar.c = Q;
        eqwzVar.copyOnWrite();
        eqxa eqxaVar2 = (eqxa) eqwzVar.instance;
        eqxaVar2.b |= 2;
        eqxaVar2.d = z;
        eqwzVar.copyOnWrite();
        eqxa eqxaVar3 = (eqxa) eqwzVar.instance;
        eqxaVar3.b |= 4;
        eqxaVar3.e = a2 != 1;
        eqwzVar.copyOnWrite();
        eqxa eqxaVar4 = (eqxa) eqwzVar.instance;
        eqxaVar4.b |= 8;
        eqxaVar4.f = V;
        return (eqxa) eqwzVar.build();
    }

    private final String F(eqwf eqwfVar) {
        return eqwfVar == null ? "null" : ((ckge) ((csjk) this.t.b()).a()).g(eqwfVar, eosr.UNKNOWN_UNINITIALIZED_REASON);
    }

    @Deprecated
    private final void G(eqws eqwsVar) {
        ((cmne) this.c.b()).a(eqwsVar).k(axnw.b(), erpp.a);
    }

    private final void H(djrm djrmVar, eyxa eyxaVar, eqws eqwsVar) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForRcsProvisioningId", 1240, "RcsProvisioningTriggerImpl.java")).D("scheduleProvisioningForRcsProvisioningId rcsProvisioningId: %s, provisioningTriggerEvent: %s", dktx.SIM_ID.c(djrmVar), eqwsVar);
        this.l.e(djrmVar, eyxaVar, eqwsVar);
    }

    private final boolean I(String str) {
        boolean z = ((dkcp) this.e.b()).d(str).c;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "shouldScheduleNotifyRcsUnavailableTask", 1596, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Should schedule notify RCS unavailable task NotifyBackendRcsIsUnavailable: %b", Boolean.valueOf(z));
        return dizg.C() && z;
    }

    public static eqws o(ckgb ckgbVar) {
        dkvg dkvgVar = dkvg.UNKNOWN;
        switch (ckgbVar.ordinal()) {
            case 1:
                return eqws.RECEIVED_POST_PROVISIONING_INTENT;
            case 2:
                return eqws.CSLIB_PHENOTYPE_UPDATE;
            case 3:
                return eqws.DEFAULT_SMS_APP_ENABLED;
            case 4:
                return eqws.DEFAULT_SMS_APP_DISABLED;
            case 5:
                return eqws.BOOT_COMPLETE;
            case 6:
                return eqws.PACKAGE_REPLACED;
            case 7:
                return eqws.USER_SETTING_ENABLED;
            case 8:
                return eqws.USER_SETTING_DISABLED;
            case 9:
                return eqws.GSERVICE_UPDATE;
            case 10:
                return eqws.RECONFIG_SMS;
            case 11:
                return eqws.SINGLE_REGISTRATION_PROVISIONING_EVENT;
            case 12:
                return eqws.SINGLE_REGISTRATION_CAPABILITY_UPDATE;
            case 13:
                return eqws.RCS_CONFIGURATION_UPDATED;
            case 14:
                return eqws.SIM_SWAP;
            case 15:
                return eqws.SIM_REMOVAL;
            case 16:
                return eqws.TACHYON_REPROVISION_ERROR;
            case 17:
                return eqws.TACHYON_INVALID_IDENTITY_ERROR;
            case 18:
                return eqws.MOBILE_CONFIGURATION_UPDATE;
            case 19:
                return eqws.USER_SETTING_ENABLED_GLOBAL;
            case 20:
                return eqws.USER_SETTING_DISABLED_GLOBAL;
            case 21:
                return eqws.USER_SETTING_ENABLED_PER_SIM;
            case 22:
                return eqws.USER_SETTING_DISABLED_PER_SIM;
            case 23:
                return eqws.FI_ACTIVATION_COMPLETE;
            case 24:
                return eqws.DEFAULT_CALL_SIM_UPDATE;
            case 25:
                return eqws.DEFAULT_SMS_SIM_UPDATE;
            case 26:
                return eqws.DEFAULT_DATA_SIM_UPDATE;
            case 27:
                return eqws.SERVICE_STATE_CHANGE;
            default:
                return eqws.UNDEFINED_TRIGGER_EVENT;
        }
    }

    static boolean z(eqwf eqwfVar) {
        dkvg dkvgVar = dkvg.UNKNOWN;
        switch (eqwfVar) {
            case INVALID_PRE_KOTO:
            case BUGLE_LOADING_AVAILABILITY_IN_PROGRESS:
            case DOGFOOD_SETUP_PENDING:
            case AVAILABLE:
            case CARRIER_SETUP_PENDING:
            case BUGLE_LOADING_AVAILABILITY_EXCEPTION:
            case CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
            case DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
            case SUBJECT_TO_BATTERY_OPTIMIZATIONS:
            case UNKNOWN_PEV2_DISABLED:
            case DISABLED_STUB_PROVISIONING_ENGINE:
            case DISABLED_VIA_RCS_CONFIG_CHAT_AUTH:
            case DISABLED_BY_CONFIG_VERSION_ZERO_POSITIVE_VALIDITY:
            case DISABLED_BY_CONFIG_VERSION_CARRIER:
            case DISABLED_BY_CONFIG_VERSION_APP_VERSION:
            case DISABLED_BY_CONFIG_VERSION_PERMANENT:
            case DISABLED_BY_CONFIG_VERSION_AWAITING_INPUT:
            case DISABLED_BY_CONFIG_VERSION_ATTESTATION_FAILURE:
            case DISABLED_BY_CONFIG_VERSION_OTHER:
            case DISABLED_BY_CONFIG_VERSION_VENDOR_NOT_SUPPORTED:
                return false;
            case DISABLED_VIA_GSERVICES:
            case DISABLED_FROM_PREFERENCES:
            case DISABLED_NOT_DEFAULT_SMS_APP:
            case DISABLED_REMOTELY:
            case DISABLED_OLD_RCS_SERVICE_VERSION:
            case DISABLED_SIM_ABSENT:
            case DISABLED_MULTI_SLOT_DEVICE:
            case DISABLED_FOR_FI:
            case DISABLED_LEGACY_CLIENT_ENABLED:
            case DISABLED_NO_PERMISSIONS:
            case DISABLED_TERMS_AND_CONDITIONS_REJECTED:
            case DISABLED_WAITING_FOR_PHENOTYPE:
            case DISABLED_VIA_FLAGS:
            case DISABLED_BY_EMM:
            case DISABLED_FOR_SECONDARY_USER:
            case DISABLED_BY_PROVISIONING_RULE:
            case DISABLED_FOR_WEAR:
            case DISABLED_AUTOMATIC_PROVISIONING_RULE:
            case DISABLED_NOT_DEFAULT_SIM:
                return true;
            default:
                throw new IllegalStateException("unsupported BugleRcsAvailability :" + eqwfVar.N);
        }
    }

    public final elfl A(final djro djroVar, final int i, final ckgb ckgbVar) {
        if (!dizg.C()) {
            return elfo.e(null);
        }
        if (((atrm) this.N.b()).a()) {
            return elfo.h(new erog() { // from class: cmoq
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ensz enszVar = (ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleTachyonReprovisionErrorForSim", 1311, "RcsProvisioningTriggerImpl.java");
                    dktx dktxVar = dktx.SIM_ID;
                    djro djroVar2 = djroVar;
                    String c = dktxVar.c(djroVar2);
                    String a2 = cmpm.a(i);
                    ckgb ckgbVar2 = ckgbVar;
                    enszVar.J("Tachyon error re-provision received for simId %s, at %s due to %s. Restarting provisioning", c, a2, ckgbVar2.name());
                    cmpn cmpnVar = cmpn.this;
                    ((dkcp) cmpnVar.e.b()).x(djroVar2.a);
                    cmpnVar.x(djroVar2, ckgbVar2);
                    return erre.a;
                }
            }, this.d).i(new eroh() { // from class: cmor
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cmpn.this.l.a(djroVar, eqws.TACHYON_REPROVISION_ERROR);
                }
            }, erpp.a);
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleTachyonReprovisionErrorForSim", 1327, "RcsProvisioningTriggerImpl.java")).J("Tachyon error re-provision received for simId %s, at %s due to %s. Restarting provisioning", dktx.SIM_ID.c(djroVar), cmpm.a(i), ckgbVar.name());
        ((dkcp) this.e.b()).x(djroVar.a);
        x(djroVar, ckgbVar);
        return this.l.a(djroVar, eqws.TACHYON_REPROVISION_ERROR);
    }

    @Override // defpackage.cnjz
    public final void B() {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSingleRegistrationConfigurationRemoved", 544, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule SR provisioning on removed configuration by AOSP.");
        this.g.b(eqws.SINGLE_REGISTRATION_CONFIGURATION_REMOVED);
        final eyxa eyxaVar = eyxa.TRIGGER_CALLBACK_REMOVED_BY_PLATFORM;
        eqws eqwsVar = eqws.SINGLE_REGISTRATION_CONFIGURATION_REMOVED;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioning", 1262, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioning using legacy code path");
        final int b2 = ((dkpp) this.f.b()).b();
        String l = ((dkpp) this.f.b()).l();
        dkvg a2 = this.C.a(b2);
        dkvg dkvgVar = dkvg.UNKNOWN;
        int ordinal = a2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1295, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Provisioning Engine version is unknown due to temporary Telephony platform unavailability. %s", a2.name());
                return;
            } else {
                ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1282, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: DR is active, initializing DR provisioning. %s", a2.name());
                ((cmne) this.c.b()).k(l, eqwsVar);
                return;
            }
        }
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1288, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Single Registration Provisioning Engine is active, initializing SR provisioning. %s", a2.name());
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "initializeSingleRegistrationProvisioning", 569, "RcsProvisioningTriggerImpl.java")).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %d", b2);
        elfo.f(new Runnable() { // from class: cmpj
            @Override // java.lang.Runnable
            public final void run() {
                cmpn.this.i.a(b2, eyxaVar);
            }
        }, this.d).k(axnw.b(), this.d);
    }

    @Override // defpackage.cnjs
    public final void a() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onBootComplete", 459, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onBootComplete");
        C(ckgb.BOOT_COMPLETE, true).k(axnw.b(), this.d);
    }

    @Override // defpackage.cnjx
    public final void b() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onPackageReplaced", 466, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onPackageReplace");
        C(ckgb.PACKAGE_REPLACED, true).k(axnw.b(), this.d);
    }

    @Override // defpackage.cijd
    public final elfl c(fcek fcekVar) {
        fgtg b2 = fgtg.b(fcekVar.b);
        if (b2 == null) {
            b2 = fgtg.UNRECOGNIZED;
        }
        if (b2.equals(fgtg.PHONE_NUMBER)) {
            djrj a2 = ((djrk) this.G.b()).a(fcekVar.c);
            Optional map = ((djsi) this.F.b()).h(a2).map(new Function() { // from class: cmpd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cmpn.this.A(djrn.a((djrm) obj), 2, ckgb.TACHYON_REPROVISION_ERROR);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "logNoIdentityMappingForPhoneNumber", 891, "RcsProvisioningTriggerImpl.java")).t("No identity mapping for phone number: %s", dktx.PHONE_NUMBER.c(a2.toString()));
            return (elfl) map.orElse(elfo.e(null));
        }
        ensz enszVar = (ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachygramProvisioningError", 870, "RcsProvisioningTriggerImpl.java");
        fgtg b3 = fgtg.b(fcekVar.b);
        if (b3 == null) {
            b3 = fgtg.UNRECOGNIZED;
        }
        enszVar.t("TachyonCommon.Id type %s is not a phone number.", b3);
        return elfo.e(null);
    }

    @Override // defpackage.cijf
    public final elfl d(ciil ciilVar, final fgtr fgtrVar) {
        Optional empty;
        elfl e;
        if (((atrm) this.N.b()).a()) {
            if (ciilVar.a().equals(ciik.PHONE_NUMBER) && (ciilVar instanceof ciii)) {
                djrj a2 = ((djrk) this.G.b()).a(((ciii) ciilVar).a);
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfoAsync", 784, "RcsProvisioningTriggerImpl.java")).t("PhoneNumberRegistrationInfo: %s", dktx.PHONE_NUMBER.c(a2.a));
                e = ((djsi) this.F.b()).e(a2).h(new emwl() { // from class: cmox
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = cmpn.a;
                        return ((Optional) obj).map(new cmpg());
                    }
                }, erpp.a);
            } else {
                ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfoAsync", 772, "RcsProvisioningTriggerImpl.java")).t("RegistrationInfo.RegistrationType %s is not a phone number.", ciilVar.a());
                e = elfo.e(Optional.empty());
            }
            return e.i(new eroh() { // from class: cmpb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cmpn.this.n(fgtrVar, (Optional) obj);
                }
            }, erpp.a);
        }
        if (ciilVar.a().equals(ciik.PHONE_NUMBER) && (ciilVar instanceof ciii)) {
            djrj a3 = ((djrk) this.G.b()).a(((ciii) ciilVar).a);
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfo", 814, "RcsProvisioningTriggerImpl.java")).t("PhoneNumberRegistrationInfo: %s", dktx.PHONE_NUMBER.c(a3.a));
            empty = ((djsi) this.F.b()).h(a3).map(new cmpg());
        } else {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfo", 803, "RcsProvisioningTriggerImpl.java")).t("RegistrationInfo.RegistrationType %s is not a phone number.", ciilVar.a());
            empty = Optional.empty();
        }
        return n(fgtrVar, empty);
    }

    @Override // defpackage.ckaj
    public final elfl e(final String str) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdated", 1008, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onMobileConfigurationUpdated for simId: %s", dktx.SIM_ID.c(str));
        this.R.add(str);
        if (!this.E.a() || !djai.aa()) {
            return m(str);
        }
        final String str2 = this.n.c(str).Q;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdated", 1017, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: onMobileConfigurationUpdated, reprovisionCampaignId = %s, simId = %s", str2, str);
        return str2.isEmpty() ? m(str) : this.h.f(str).i(new eroh() { // from class: cmpk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignInMobileConfigurationUpdatedIfNeeded", 1047, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onMobileConfigurationUpdated, lastReprovisionCampaignId = %s", str3);
                cmpn cmpnVar = cmpn.this;
                String str4 = str;
                if (!cmpnVar.y(str4)) {
                    ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignInMobileConfigurationUpdatedIfNeeded", 1051, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onMobileConfigurationUpdated, skipping ReprovisionCampaign since RCS is not available");
                    return cmpnVar.m(str4);
                }
                String str5 = str2;
                if (str5.equals("Default")) {
                    cmpnVar.h.l(str4, str5);
                    return cmpnVar.m(str4);
                }
                if (str5.startsWith("Rollback")) {
                    if (str3.equals("Default")) {
                        return cmpnVar.m(str4);
                    }
                    if (str3.startsWith("Rollback")) {
                        if (!str3.equals(str5)) {
                            cmpnVar.h.l(str4, str5);
                        }
                        return cmpnVar.m(str4);
                    }
                    cmpnVar.q(str4, str5);
                } else {
                    if (str3.equals(str5)) {
                        return cmpnVar.m(str4);
                    }
                    cmpnVar.q(str4, str5);
                }
                return elfo.e(null);
            }
        }, this.d);
    }

    @Override // defpackage.ckaj
    public final void f() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onAppStart", 502, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule provisioning on app startup");
        C(ckgb.NO_HINT, false).h(new emwl() { // from class: cmoy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmpn.this.w(eyxa.TRIGGER_APP_START, eqws.APP_STARTUP);
                return null;
            }
        }, this.d).k(axnw.b(), this.d);
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onDefaultSmsAppChange", 1847, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onDefaultSmsAppChange : isDefaultSmsApp = %s", Boolean.valueOf(z));
        return C(z ? ckgb.DEFAULT_SMS_APP_ENABLED : ckgb.DEFAULT_SMS_APP_DISABLED, true);
    }

    @Override // defpackage.ckaj
    public final void g(int i) {
        String str;
        Iterator it = this.m.p().iterator();
        while (true) {
            if (!it.hasNext()) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromEligibleSubIdOrEmpty", 1090, "RcsProvisioningTriggerImpl.java")).r("simId not found for subId: %s in the Intent", i);
                str = "";
                break;
            } else {
                cosz coszVar = (cosz) it.next();
                if (coszVar.d == i) {
                    str = coszVar.c;
                    break;
                }
            }
        }
        if (str.isEmpty()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1098, "RcsProvisioningTriggerImpl.java")).q("Provisioning is not scheduled because the subId sent in intent does not map to valid simId");
            if (ctid.h) {
                cmoi.b(this.s, 3, i);
                return;
            }
            return;
        }
        djro djroVar = new djro(str);
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1110, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onFiActivationComplete for rcsProvisioningId : %s", dktx.SIM_ID.c(djroVar));
        x(djroVar, ckgb.FI_ACTIVATION_COMPLETE);
        H(djroVar, eyxa.TRIGGER_FI_ACTIVATION_COMPLETE, eqws.FI_ACTIVATION_COMPLETE);
    }

    @Override // defpackage.ckaj
    public final void h(boolean z) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsGlobalSettingChange", 582, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onRcsGlobalSettingChange : isRcsEnabled = %s", Boolean.valueOf(z));
        C(z ? ckgb.USER_SETTING_ENABLED_GLOBAL : ckgb.USER_SETTING_DISABLED_GLOBAL, true).k(axnw.b(), this.u);
    }

    @Override // defpackage.ckaj
    public final void i(djrm djrmVar, boolean z) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsPerSimSettingChange", 593, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: onRcsPerSimSettingChange : rcsProvisioningId = %s, isRcsEnabled = %s", dktx.SIM_ID.c(djrn.a(djrmVar).a), z);
        ckgb ckgbVar = z ? ckgb.USER_SETTING_ENABLED_PER_SIM : ckgb.USER_SETTING_DISABLED_PER_SIM;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningIdAsync", 1209, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningIdAsync : rcsProvisioningId = %s hint = %s", dktx.SIM_ID.c(djrmVar), ckgbVar);
        this.g.b(o(ckgbVar));
        ((ckge) ((csjk) this.t.b()).a()).b(djrmVar, ckgbVar).k(axnw.b(), this.u);
    }

    @Override // defpackage.ckaj
    public final void j(eqws eqwsVar) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 473, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Reconfiguration response, restarting provisioning");
        ((dkcp) this.e.b()).x(((dkpp) this.f.b()).l());
        this.g.b(eqwsVar);
        int b2 = ((dkpp) this.f.b()).b();
        if (this.U.c(b2)) {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 479, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Triggering Single Registration re-configuration for subId %s.", b2);
        } else {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 484, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Single Registration is not capable for subId %s. Skipping re-configuration in AOSP.", b2);
        }
        if (((djyc) this.A.b()).a()) {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 492, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Provisioning engine is currently running, skip restartProvisioning.");
            return;
        }
        dkvg a2 = this.C.a(((dkpp) this.f.b()).b());
        if (!a2.equals(dkvg.DUAL_REG)) {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioning", 1369, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", a2.name());
            return;
        }
        ((cmne) this.c.b()).c(eqwsVar).k(axnw.b(), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        if (r8.equals(r1) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ckaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpn.k(java.lang.String):void");
    }

    @Override // defpackage.ckaj
    public final void l(String str, String str2) {
        if (((dkcp) this.e.b()).z(str) && I(str)) {
            ((cmne) this.c.b()).i(str, "SIM swap", eqws.SIM_SWAP);
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSimSwap", 615, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: SIM swap detected, restarting provisioning");
        if (!emxe.c(str)) {
            x(new djro(str), ckgb.SIM_SWAP);
        }
        final djro djroVar = new djro(str2);
        x(djroVar, ckgb.SIM_SWAP);
        if (!((atri) this.M.b()).a()) {
            if (((dkcp) this.e.b()).z(((dkpp) this.f.b()).l())) {
                ((ckds) this.B.b()).z();
            } else {
                ((ckds) this.B.b()).y();
            }
        }
        cort cortVar = this.m;
        final eqws eqwsVar = eqws.SIM_SWAP;
        cortVar.j(djroVar).ifPresent(new Consumer() { // from class: cmol
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cmpn.this.v(djroVar, ((cosz) obj).d, eqwsVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final elfl m(String str) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdatedWithoutReprovisionCampaign", 1039, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onMobileConfigurationUpdatedWithoutReprovisionCampaign");
        djro djroVar = new djro(str);
        ckgb ckgbVar = ckgb.MOBILE_CONFIGURATION_UPDATE;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateAvailabilityForProvisioningIdAsync", 1156, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: updateAvailabilityForProvisioningIdAsync : hint = %s logTriggerEvent = %s", ckgbVar, true);
        this.g.b(o(ckgbVar));
        return ((ckge) ((csjk) this.t.b()).a()).b(djroVar, ckgbVar);
    }

    public final elfl n(fgtr fgtrVar, Optional optional) {
        if (!optional.isPresent()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationError", 845, "RcsProvisioningTriggerImpl.java")).q("Unable to handle Tachyon registration error, could not find simId for phone number.");
            return elfo.e(null);
        }
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationError", 839, "RcsProvisioningTriggerImpl.java")).t("onTachyonRegistrationError for simId: %s", dktx.SIM_ID.c(((djro) optional.get()).a));
        djro djroVar = (djro) optional.get();
        dkvg dkvgVar = dkvg.UNKNOWN;
        int ordinal = fgtrVar.ordinal();
        if (ordinal == 31) {
            return A(djroVar, 1, ckgb.TACHYON_INVALID_IDENTITY_ERROR);
        }
        if (ordinal == 33) {
            return A(djroVar, 1, ckgb.TACHYON_REPROVISION_ERROR);
        }
        ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationErrorForSim", 862, "RcsProvisioningTriggerImpl.java")).t("Unhandled TachyonError type %s.", fgtrVar);
        return elfo.e(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ba, code lost:
    
        if (z(r11) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((defpackage.eyfy) r10.get()).equals(defpackage.cmeq.a) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0433  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void p(defpackage.ckgd r20) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpn.p(ckgd):void");
    }

    final void q(String str, String str2) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaign", 984, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: handleReprovisionCampaign with simId = %s, reprovisionCampaignId = %s", dktx.SIM_ID.c(str), str2);
        ((cmne) this.c.b()).h(str, eqws.REPROVISIONING_CAMPAIGN, true);
        this.h.l(str, str2);
    }

    @Override // defpackage.cnju
    public final void r(Intent intent) {
        Optional empty;
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1892, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onConfigSms");
        if (dizg.C()) {
            dkcc dkccVar = this.w;
            cmos cmosVar = this.S;
            ((errl) dkccVar.a.b()).getClass();
            dkpp dkppVar = (dkpp) dkccVar.b.b();
            dkppVar.getClass();
            dkcp dkcpVar = (dkcp) dkccVar.c.b();
            dkcpVar.getClass();
            cmosVar.getClass();
            dkcb dkcbVar = new dkcb(dkppVar, dkcpVar, cmosVar);
            int max = Math.max(intent.getIntExtra("subscription", -1), -1);
            if (max < 0) {
                ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSubIdFromIntent", 1885, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: invalid subId in the intent.");
            }
            cosz coszVar = (cosz) this.m.i(max).orElse(null);
            if (coszVar != null) {
                dkcbVar.b(((dked) this.k.b()).b(coszVar.c));
            } else {
                ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1906, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", max);
                dkcbVar.b(((dked) this.k.b()).a());
            }
            dkcbVar.d(this.s, intent);
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1912, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: completed processSmsIntent.");
            if (djai.z() && djai.ab()) {
                Optional i = this.m.i(max);
                ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1918, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: simSubscriptionInfo: %s", coszVar);
                if (i.isEmpty()) {
                    ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1920, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", max);
                    return;
                }
                empty = Optional.of(((cosz) i.get()).c);
            } else {
                empty = Optional.empty();
            }
            Optional optional = empty;
            dkca dkcaVar = this.x;
            cmot cmotVar = this.T;
            Context context = (Context) dkcaVar.a.b();
            context.getClass();
            cmotVar.getClass();
            ((errl) dkcaVar.b.b()).getClass();
            dikl diklVar = (dikl) dkcaVar.c.b();
            diklVar.getClass();
            dked dkedVar = (dked) dkcaVar.d.b();
            dkedVar.getClass();
            cguo cguoVar = (cguo) dkcaVar.e.b();
            cguoVar.getClass();
            final dkbz dkbzVar = new dkbz(context, cmotVar, diklVar, dkedVar, cguoVar, optional);
            optional.ifPresentOrElse(new Consumer() { // from class: cmpl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    dkbzVar.b(((dked) cmpn.this.k.b()).b((String) obj));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: cmok
                @Override // java.lang.Runnable
                public final void run() {
                    ((ensz) ((ensz) cmpn.a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1934, "RcsProvisioningTriggerImpl.java")).q("No sim id to register OTP SMS port. Using default port.");
                    dkbz.this.a();
                }
            });
            dkbzVar.d(this.s, intent);
        }
    }

    final void s() {
        axnw.h(D(ckgb.CSLIB_PHENOTYPE_UPDATE, true, Optional.of((Double) b.e())).h(new emwl() { // from class: cmpa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmpn.this.w(eyxa.TRIGGER_PHENOTYPE_FLAG_UPDATE, eqws.CSLIB_PHENOTYPE_UPDATE);
                return null;
            }
        }, this.d));
    }

    public final void t(String str, int i, int i2) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 415, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onOtpSms");
        this.g.b(eqws.OTP_SMS_RECEIVED);
        cmbb cmbbVar = (cmbb) cmbc.a.createBuilder();
        cmbbVar.copyOnWrite();
        cmbc cmbcVar = (cmbc) cmbbVar.instance;
        str.getClass();
        cmbcVar.b |= 1;
        cmbcVar.c = str;
        cmbbVar.copyOnWrite();
        cmbc cmbcVar2 = (cmbc) cmbbVar.instance;
        cmbcVar2.b |= 2;
        cmbcVar2.d = i;
        cmbbVar.copyOnWrite();
        cmbc cmbcVar3 = (cmbc) cmbbVar.instance;
        cmbcVar3.b |= 4;
        cmbcVar3.e = i2;
        eyja a2 = cuxw.a(this.z.f().toEpochMilli());
        cmbbVar.copyOnWrite();
        cmbc cmbcVar4 = (cmbc) cmbbVar.instance;
        a2.getClass();
        cmbcVar4.f = a2;
        cmbcVar4.b |= 8;
        cmbc cmbcVar5 = (cmbc) cmbbVar.build();
        try {
            String str2 = ((cosz) this.m.i(i).orElseThrow()).c;
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 436, "RcsProvisioningTriggerImpl.java")).B("RcsProvisioningTrigger: onOtpSms with simId: %s and subId: %s", dktx.SIM_ID.c(str2), i);
            this.h.h(dksc.g("provisioning_otp_sms", str2), cmbcVar5).k(axnw.b(), erpp.a);
            if (((djyc) this.A.b()).a()) {
                ((djyc) this.A.b()).a.b(cmbcVar5);
            } else {
                ((cmne) this.c.b()).m(str2, Duration.ZERO, 2, eqws.OTP_SMS_RECEIVED);
            }
        } catch (NoSuchElementException unused) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 431, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the OTP.", i);
        }
    }

    @Override // defpackage.dihl
    public final void u() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSystemBound", 532, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: System bound to :rcs process. Schedule provisioning.");
        this.g.b(eqws.RCS_SYSTEM_BINDING);
        w(eyxa.TRIGGER_SYSTEM_BINDING_ON_CREATE, eqws.RCS_SYSTEM_BINDING);
    }

    public final void v(djro djroVar, int i, eqws eqwsVar) {
        dkvg a2 = this.C.a(i);
        if (!Objects.equals(a2, dkvg.DUAL_REG)) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioningForSimId", 1342, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", a2.name());
            return;
        }
        ((cmne) this.c.b()).d(djroVar, eqwsVar).k(axnw.b(), this.d);
    }

    public final void w(eyxa eyxaVar, eqws eqwsVar) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForEligibleSims", 1250, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioningForEligibleSims");
        this.l.d(eyxaVar, eqwsVar);
    }

    public final void x(djrm djrmVar, ckgb ckgbVar) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningId", 1192, "RcsProvisioningTriggerImpl.java")).J("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningId : rcsProvisioningId = %s hint = %s, logTriggerEvent = %s ", dktx.SIM_ID.c(djrmVar), ckgbVar, true);
        this.g.b(o(ckgbVar));
        ((ckge) ((csjk) this.t.b()).a()).p(djrmVar, ckgbVar);
    }

    public final boolean y(String str) {
        return ((ckge) ((csjk) this.t.b()).a()).w(new djro(str)) == eqwf.AVAILABLE;
    }
}
