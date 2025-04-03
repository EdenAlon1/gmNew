package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgh implements ckge, diyo {
    private static final cskc d = cskc.g("Bugle", "RcsAvailabilityUtilForProvisioningEngineV2");
    protected Context b;
    volatile ckfg c;
    private final errl f;
    private final cslx g;
    private final dksp h;
    private final ckgc i;
    protected boolean a = false;
    private final ckgm e = new ckgm();

    public ckgh(Context context, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3, cslx cslxVar) {
        this.b = context;
        this.c = (ckfg) ffbrVar2.b();
        this.f = errlVar;
        this.g = cslxVar;
        final dksp dkspVar = new dksp();
        this.h = dkspVar;
        ckgc ckgcVar = new ckgc() { // from class: ckgf
            @Override // defpackage.ckgc
            public final void al(ckgd ckgdVar) {
                dksp.this.b(ckgdVar);
            }
        };
        this.i = ckgcVar;
        this.c.f(ckgcVar);
        Iterator it = ((Set) ffbrVar3.b()).iterator();
        while (it.hasNext()) {
            this.h.a(z((ckgc) it.next(), this.f));
        }
        ((cfud) ffbrVar.b()).c(this);
    }

    private static String A(eosr eosrVar) {
        switch (eosrVar) {
            case UNKNOWN_UNINITIALIZED_REASON:
                return "WAITING FOR ENGINE TO CONNECT";
            case UNINITIALIZED_REASON_NO_FAILURE:
                return "NO_AVAILABILITY_FAILURE";
            case UNINITIALIZED_REASON_INTERRUPTED:
                return "INTERRUPTED";
            case UNINITIALIZED_REASON_DISCONNECTED:
                return "DISCONNECTED";
            case UNINITIALIZED_REASON_ENGINE_EXCEPTION:
                return "ENGINE_EXCEPTION";
            case UNINITIALIZED_REASON_RUNNABLE_EXCEPTION:
                return "RUNNABLE_EXCEPTION";
            case UNINITIALIZED_REASON_WEAR:
                return "WEAR";
            case UNINITIALIZED_REASON_INVALID_REGISTRATION:
                return "INVALID_REGISTRATION";
            case UNINITIALIZED_REASON_CONNECTION_TIMEOUT:
                return "TIMEOUT";
            default:
                return "UNKNOWN(" + eosrVar.j + ")";
        }
    }

    private static dkso z(ckgc ckgcVar, Executor executor) {
        dksn f = dkso.f(new ckgg(ckgcVar), executor);
        f.b(ckgcVar);
        f.c(false);
        return f.a();
    }

    @Override // defpackage.ckge
    public final elfl a(ckgb ckgbVar) {
        csjb c = d.c();
        c.I("updateAvailabilityForAllSimsAsync");
        c.A("hint", ckgbVar);
        c.r();
        return this.c.a(ckgbVar);
    }

    @Override // defpackage.ckge
    public final elfl b(djrm djrmVar, ckgb ckgbVar) {
        csjb c = d.c();
        c.I("updateAvailabilityForRcsProvisioningIdAsync");
        c.A("hint", ckgbVar);
        c.r();
        return this.c.b(djrmVar, ckgbVar);
    }

    @Override // defpackage.ckge
    public final eosr c() {
        return eosr.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.ckge
    public final eqwf d() {
        return this.c.c();
    }

    @Override // defpackage.ckge
    public final eqwf e(String str) {
        return this.c.d(str);
    }

    @Override // defpackage.ckge
    public final eqwf f(int i) {
        return this.c.e(i);
    }

    @Override // defpackage.ckge
    public final String g(eqwf eqwfVar, eosr eosrVar) {
        switch (eqwfVar) {
            case INVALID_PRE_KOTO:
                return "This device is pre-Koto";
            case BUGLE_LOADING_AVAILABILITY_IN_PROGRESS:
                return "RCS state is pending. Check back in a moment. ".concat(A(eosrVar));
            case DISABLED_VIA_GSERVICES:
                return "RCS is disabled for this carrier by Google";
            case DOGFOOD_SETUP_PENDING:
                return "Dogfood RCS is not set up";
            case DISABLED_FROM_PREFERENCES:
                return "You turned off RCS. Turn it back on in settings";
            case DISABLED_NOT_DEFAULT_SMS_APP:
                return "We aren't the default SMS app";
            case DISABLED_REMOTELY:
                return "The carrier disabled this device remotely";
            case AVAILABLE:
                return "RCS is setup";
            case DISABLED_OLD_RCS_SERVICE_VERSION:
                return "RCS service version is old";
            case DISABLED_SIM_ABSENT:
                return "RCS is disabled due to SIM absent";
            case CARRIER_SETUP_PENDING:
                return "Carrier RCS is not set up";
            case DISABLED_MULTI_SLOT_DEVICE:
                return "RCS shouldn't be disabled when MSIM M3 is enabled. Please file a bug.";
            case DISABLED_FOR_FI:
            default:
                return "RcsAvailabilityUtil returned an invalid state! This is a bug!";
            case BUGLE_LOADING_AVAILABILITY_EXCEPTION:
                return "There was an error retrieving current RCS state: ".concat(A(eosrVar));
            case DISABLED_LEGACY_CLIENT_ENABLED:
                return "RCS is disabled because third-party RCS client is enabled";
            case DISABLED_NO_PERMISSIONS:
                return "RCS is disabled because it doesn't have phone permission";
            case CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "Carrier RCS is setup, waiting for T&C acceptance";
            case DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "Dogfood RCS is setup, waiting for T&C acceptance";
            case DISABLED_TERMS_AND_CONDITIONS_REJECTED:
                return "RCS is disabled due to user rejection of T&Cs";
            case SUBJECT_TO_BATTERY_OPTIMIZATIONS:
                return "RCS services can't run in the background";
            case UNKNOWN_PEV2_DISABLED:
                return "Availability is unobtainable from this source because PEv2 is disabled";
            case DISABLED_WAITING_FOR_PHENOTYPE:
                return "RCS is disabled, waiting for phenotype to update";
            case DISABLED_STUB_PROVISIONING_ENGINE:
                return "Availability request was done on a stub implementation of the provisioning engine.";
            case DISABLED_VIA_FLAGS:
                return "RCS has been disabled via flags.";
            case DISABLED_BY_EMM:
                return "RCS has been disabled by EMM. go/rcs-disable-via-emm";
            case DISABLED_FOR_SECONDARY_USER:
                return "RCS is disabled for the secondary user.";
            case DISABLED_VIA_RCS_CONFIG_CHAT_AUTH:
                return "RCS chatAuth support is disabled in the IMS configuration";
            case DISABLED_BY_PROVISIONING_RULE:
                return "RCS is disabled by provisioning rule";
            case DISABLED_FOR_WEAR:
                return "RCS is disabled for a Wear OS device that does not support RCS";
            case DISABLED_AUTOMATIC_PROVISIONING_RULE:
                return "RCS is disabled by default via provisioning rule. User must manually enable RCS from Settings.";
            case DISABLED_BY_CONFIG_VERSION_ZERO_POSITIVE_VALIDITY:
                return "RCS is disabled because the configuration has version = 0, and validity seconds > 0";
            case DISABLED_BY_CONFIG_VERSION_CARRIER:
                return "RCS is disabled because the carrier indicated the user is ineligible for RCS";
            case DISABLED_BY_CONFIG_VERSION_APP_VERSION:
                return "RCS is disabled because the provisioning device has too low of an App version for RCS";
            case DISABLED_BY_CONFIG_VERSION_PERMANENT:
                return "RCS is disabled because the configuration indicates the user or device is permanently banned";
            case DISABLED_BY_CONFIG_VERSION_AWAITING_INPUT:
                return "RCS is disabled because the configuration indicates awaiting user input";
            case DISABLED_BY_CONFIG_VERSION_ATTESTATION_FAILURE:
                return "RCS is disabled because the configuration indicates an attestation failure for this user or device";
            case DISABLED_BY_CONFIG_VERSION_OTHER:
                return "RCS is disabled because the configuration has an invalid version number";
            case DISABLED_BY_CONFIG_VERSION_VENDOR_NOT_SUPPORTED:
                return "RCS is disabled because the configuration indicates the app vendor is not supported";
            case DISABLED_NOT_DEFAULT_SIM:
                return "RCS is disabled because the sim is not the default sim.";
        }
    }

    @Override // defpackage.ckge
    public final void h(ckgc ckgcVar) {
        i(ckgcVar, this.g);
    }

    @Override // defpackage.ckge
    public final void i(ckgc ckgcVar, Executor executor) {
        this.h.a(z(ckgcVar, executor));
    }

    @Override // defpackage.ckge
    public final void j() {
        if (this.a) {
            return;
        }
        this.b.registerReceiver(this.e, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        this.a = true;
    }

    @Override // defpackage.ckge
    public final void l(ckgc ckgcVar) {
        this.h.d(ckgcVar);
    }

    @Override // defpackage.ckge
    public final void m() {
        this.c.g();
    }

    @Override // defpackage.ckge
    public final void n(ckgb ckgbVar) {
        csjb c = d.c();
        c.I("updateRcsAvailability");
        c.A("hint", ckgbVar);
        c.r();
        this.c.j(ckgbVar);
    }

    @Override // defpackage.ckge
    @Deprecated
    public final void o(ckgb ckgbVar) {
        csjb c = d.c();
        c.I("updateAvailabilityAsync");
        c.A("hint", ckgbVar);
        c.r();
        this.c.h(ckgbVar);
    }

    @Override // defpackage.diyo
    public final void onCsLibPhenotypeUpdated() {
        csjb c = d.c();
        c.I("onCsLibPhenotypeUpdated");
        c.r();
    }

    @Override // defpackage.ckge
    public final void p(djrm djrmVar, ckgb ckgbVar) {
        this.c.i(djrmVar, ckgbVar);
    }

    @Override // defpackage.ckge
    public final boolean q() {
        return d() == eqwf.AVAILABLE;
    }

    @Override // defpackage.ckge
    public final boolean r() {
        return d() == eqwf.DISABLED_FROM_PREFERENCES;
    }

    @Override // defpackage.ckge
    @Deprecated
    public final boolean s() {
        int ordinal = d().ordinal();
        if (ordinal != 1 && ordinal != 6 && ordinal != 10 && ordinal != 13 && ordinal != 21) {
            switch (ordinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // defpackage.ckge
    public final boolean t() {
        return d() == eqwf.DISABLED_VIA_GSERVICES;
    }

    @Override // defpackage.ckge
    public final int u() {
        return 5;
    }

    @Override // defpackage.ckge
    public final eqwf v(djrm djrmVar) {
        return this.c.n(djrmVar);
    }

    @Override // defpackage.ckge
    public final eqwf w(djrm djrmVar) {
        return this.c.k(djrmVar);
    }

    @Override // defpackage.ckge
    @Deprecated
    public final eqwf x() {
        return this.c.l();
    }

    @Override // defpackage.ckge
    public final void y() {
        this.c.m();
    }

    @Override // defpackage.ckge
    public final void k() {
    }
}
