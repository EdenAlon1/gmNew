package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcp {
    public static final dktn a = new dktn("ProvisioningEngineDataRetriever");
    public final dksa b;
    public final errl c;
    public final ffbr d;
    private final Context e;
    private final dkpp f;
    private final dikw g;
    private final cguo h;

    public dkcp(Context context, dksa dksaVar, dkpp dkppVar, errl errlVar, dikw dikwVar, cguo cguoVar, ffbr ffbrVar) {
        this.e = context;
        this.b = dksaVar;
        this.f = dkppVar;
        this.c = errlVar;
        this.g = dikwVar;
        this.h = cguoVar;
        this.d = ffbrVar;
    }

    private final boolean G(String str) {
        return (djai.z() && djai.ac()) ? this.h.c(str).y : dizg.z();
    }

    private static final boolean H(djtp djtpVar) {
        return djtpVar.R() && djtpVar.a() == 1 && !djtpVar.V();
    }

    public final boolean A(String str) {
        djtp f = f(str);
        return !f.m().C() && H(f);
    }

    public final boolean B(String str) {
        djtp f = f(str);
        return f.m().C() && H(f);
    }

    public final boolean C() {
        try {
            return this.b.m("rcs_tos_state", "bugle") == 2;
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            F(2);
            return ((dkdw) this.d.b()).H();
        }
    }

    public final void D(boolean z) {
        try {
            dksa dksaVar = this.b;
            if (z) {
                dksaVar.i("rcs_tos_state", 2, "bugle");
            } else {
                dksaVar.i("rcs_tos_state", 0, "bugle");
            }
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            ((dkdw) this.d.b()).t(z);
            F(2);
        }
    }

    @Deprecated
    public final void E() {
        if (dimo.b()) {
            D(true);
            return;
        }
        try {
            this.b.i("rcs_tos_state", 1, "bugle");
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting Carrier Consent in bugle storage, defaulting to local storage", new Object[0]);
            ((dkdw) this.d.b()).L();
            F(3);
        }
    }

    public final void F(int i) {
        if (((Boolean) dizg.o().a.X.a()).booleanValue()) {
            this.g.d(this.e, i);
        }
    }

    public final int a(String str) {
        try {
            return this.b.m(dksa.g("upiAttemptsCount", str), "RcsApplicationData");
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving UPI attempts count from bugle storage", new Object[0]);
            return -1;
        }
    }

    public final cmay b(String str) {
        try {
            return (cmay) this.b.n(dksa.g("phone_number_record_for_sim_", str), cmay.a);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            return cmay.a;
        }
    }

    public final cmbc c(String str) {
        try {
            return (cmbc) this.b.n(dksa.g("provisioning_otp_sms", str), cmbc.a);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving ProvisioningOtpSms from bugle storage", new Object[0]);
            return cmbc.a;
        }
    }

    public final cmbe d(String str) {
        try {
            return (cmbe) this.b.n(dksa.g("provisioning_success_data_for_sim_", str), cmbe.a);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving provisioningSuccessData from Bugle storage.", new Object[0]);
            return cmbe.a;
        }
    }

    public final cmeq e() {
        try {
            return (cmeq) this.b.n("rcs_provisioning_rcs_default_on_configuration", cmeq.a);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving RcsProvisioningRcsDefaultOnConfiguration from Bugle storage.", new Object[0]);
            return cmeq.a;
        }
    }

    public final djtp f(String str) {
        if (dizg.D()) {
            try {
                djtp a2 = this.b.a(str);
                if (a2 != null) {
                    return a2;
                }
                dkty.l(a, "No RCS Configuration was found in Bugle for simID: %s", dktx.SIM_ID.c(str));
            } catch (dksb e) {
                F(5);
                dkty.j(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            dkty.p(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCache.getProvisioningConfigurationForGivenSim()", new Object[0]);
        }
        return ((dkdw) this.d.b()).e(str);
    }

    public final Optional g() {
        try {
            String h = this.b.h("gmscoreIidToken", "", "RcsApplicationData");
            return dktk.d(h) ? Optional.empty() : Optional.of(h);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving GMSCore IID token from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    public final Optional h(String str, ezck ezckVar) {
        if (G(str)) {
            try {
                cmay cmayVar = (cmay) this.b.n(dksa.d(str, ezckVar), cmay.a);
                return Objects.equals(cmayVar, cmay.a) ? Optional.empty() : Optional.of(cmayVar);
            } catch (dksb e) {
                dkty.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            }
        }
        return Optional.empty();
    }

    public final Optional i(String str) {
        if (dizg.D()) {
            try {
                djtp a2 = this.b.a(str);
                if (a2 != null) {
                    return Optional.of(a2);
                }
                dkty.l(a, "No RCS Configuration was found in Bugle for simID: %s", dktx.SIM_ID.c(str));
            } catch (dksb e) {
                F(5);
                dkty.t(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            dkty.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCache.getProvisioningConfigurationForGivenSimIfExist()", new Object[0]);
        }
        return ((dkdw) this.d.b()).g(str);
    }

    @Deprecated
    public final Optional j() {
        return i(dizg.S() ? o() : this.f.l());
    }

    public final Optional k() {
        try {
            cmeq cmeqVar = (cmeq) this.b.n("rcsProvisioningGoogleToSConfiguration", cmeq.a);
            dktn dktnVar = a;
            clxt b = clxt.b(cmeqVar.c);
            if (b == null) {
                b = clxt.UNRECOGNIZED;
            }
            eyja eyjaVar = cmeqVar.g;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            dkty.l(dktnVar, "getRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", cmeqVar, b, Long.valueOf(eyjaVar.b));
            return Optional.of(cmeqVar);
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving RcsProvisioningGoogleTosConfiguration from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    @Deprecated
    public final String l() {
        String j = ((dkdw) this.d.b()).j(this.f.l());
        return !TextUtils.isEmpty(j) ? j : this.f.h();
    }

    public final String m(cosz coszVar) {
        String j = ((dkdw) this.d.b()).j(coszVar.c);
        return !TextUtils.isEmpty(j) ? j : coszVar.q;
    }

    public final String n(String str) {
        try {
            String h = this.b.h("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), "", "bugle");
            if (!TextUtils.isEmpty(h)) {
                return h;
            }
        } catch (dksb e) {
            F(6);
            dkty.j(e, a, "Error while retrieving manually entered MSISDN from Bugle's ContentProvider. Using ProvisioningEngineStateCache.getMsisdnForGivenSim()", new Object[0]);
        }
        String j = ((dkdw) this.d.b()).j(str);
        dkty.l(a, "Manually entered MSISDN is: %s", dktx.SIM_ID.c(j));
        return j;
    }

    public final String o() {
        String l;
        try {
            l = this.b.h("sim_id", "", "sim_state_tracker");
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving simId from Bugle, using local simId", new Object[0]);
            l = this.f.l();
        }
        dkty.d(a, "simId from Bugle is: %s", dktx.SIM_ID.c(l));
        return l;
    }

    public final void p(String str) {
        try {
            this.b.j("gmscoreIidToken", str, "RcsApplicationData");
            dkty.l(a, "putGMSCoreIIDToken %s", dktx.GENERIC.c(str));
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting GMSCore IID token in bugle storage", new Object[0]);
        }
    }

    public final void q(String str, cmay cmayVar) {
        try {
            this.b.o(dksa.g("phone_number_record_for_sim_", str), cmayVar);
            dkty.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", dktx.PHONE_NUMBER.c(cmayVar.c), dktx.SIM_ID.c(str));
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
        }
    }

    public final void r(String str, ezck ezckVar, cmay cmayVar) {
        if (G(str)) {
            try {
                this.b.o(dksa.d(str, ezckVar), cmayVar);
                dkty.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", dktx.PHONE_NUMBER.c(cmayVar.c), dktx.SIM_ID.c(str));
            } catch (dksb e) {
                dkty.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
            }
        }
    }

    public final void s(String str, cmbc cmbcVar) {
        try {
            this.b.o(dksa.g("provisioning_otp_sms", str), cmbcVar);
        } catch (dksb e) {
            dkty.j(e, a, "Error while updating otp storage in Bugle data store", new Object[0]);
        }
    }

    public final void t(String str, djtp djtpVar) {
        ((dkdw) this.d.b()).z(str, djtpVar);
        if (dizg.D()) {
            try {
                this.b.j("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), new evkn().k(djtpVar), "bugle");
            } catch (dksb e) {
                dkty.j(e, a, "Error while putting RCS Configuration for simId: %s", dktx.SIM_ID.c(str));
                F(5);
            }
        } else {
            dkty.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag", new Object[0]);
        }
        dkty.l(a, "Rcs Configuration was updated", new Object[0]);
    }

    public final void u(cmeq cmeqVar) {
        try {
            this.b.o("rcsProvisioningGoogleToSConfiguration", cmeqVar);
            dktn dktnVar = a;
            clxt b = clxt.b(cmeqVar.c);
            if (b == null) {
                b = clxt.UNRECOGNIZED;
            }
            eyja eyjaVar = cmeqVar.g;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            dkty.l(dktnVar, "putRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", cmeqVar, b, Long.valueOf(eyjaVar.b));
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting RcsProvisioningGoogleTosConfiguration in bugle storage", new Object[0]);
        }
    }

    public final void v(cmeq cmeqVar) {
        try {
            this.b.o("rcs_provisioning_rcs_default_on_configuration", cmeqVar);
            dktn dktnVar = a;
            cmem b = cmem.b(cmeqVar.h);
            if (b == null) {
                b = cmem.UNRECOGNIZED;
            }
            eyja eyjaVar = cmeqVar.g;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            dkty.l(dktnVar, "putRcsProvisioningRcsDefaultOnConfiguration %s, consentState = %s, ServerUpdateTime = %s", cmeqVar, b, Long.valueOf(eyjaVar.b));
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting RcsProvisioningRcsDefaultOnConfiguration in bugle storage", new Object[0]);
        }
    }

    public final void w(String str, int i) {
        try {
            this.b.i(dksa.g("upiAttemptsCount", str), i, "RcsApplicationData");
        } catch (dksb e) {
            dkty.j(e, a, "Error while putting UPI attempts count into bugle storage", new Object[0]);
        }
    }

    public final void x(String str) {
        djtp f = f(str);
        f.G(true);
        t(str, f);
    }

    public final boolean y() {
        boolean F;
        try {
            F = this.b.k("enable_rcs", true, "bugle");
        } catch (dksb e) {
            dkty.j(e, a, "Error while retrieving preferences RCS enabled/disabled from Bugle", new Object[0]);
            F = ((dkdw) this.d.b()).F();
        }
        dkty.l(a, "Rcs is enabled from user settings: %s", Boolean.valueOf(F));
        return F;
    }

    public final boolean z(String str) {
        return H(f(str));
    }
}
