package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcb extends dkce {
    private static final dktn a = new dktn("RcsReconfigurationSmsHandler");
    private final dkcp d;
    private final dkpp e;
    private final cmos f;

    public dkcb(dkpp dkppVar, dkcp dkcpVar, cmos cmosVar) {
        this.f = cmosVar;
        this.e = dkppVar;
        this.d = dkcpVar;
    }

    @Override // defpackage.dkce
    protected final boolean c(String str, int i, int i2) {
        String str2;
        djtp f;
        djtr m;
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = b;
            for (int i3 = 0; i3 < 2; i3++) {
                str2 = strArr[i3];
                if (str.endsWith(str2)) {
                    break;
                }
            }
        }
        str2 = null;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        dkty.r(a, "Reconfiguration SMS body contains valid reconfiguration suffix: %s, encoding: UTF_16", str2);
        dkty.q("Received reconfiguration SMS", new Object[0]);
        String substring = (!TextUtils.isEmpty(str) && str.endsWith(str2)) ? str.substring(0, str.length() - str2.length()) : null;
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        if ((TextUtils.isEmpty(substring) || !substring.equals(this.e.j())) && (TextUtils.isEmpty(substring) || (f = this.d.f(this.e.l())) == null || (m = f.m()) == null || !emuz.e(substring, m.s()))) {
            return true;
        }
        cmos cmosVar = this.f;
        ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 395, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onReconfigSms");
        cmpn cmpnVar = cmosVar.a;
        cosz coszVar = (cosz) cmpnVar.m.i(i).orElse(null);
        if (coszVar == null) {
            ((ensz) ((ensz) cmpn.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 399, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: onReconfigSms. No SimSubscriptionInfo found for subId %s. Ignoring SMS.", i);
        } else {
            ffbr ffbrVar = cmpnVar.e;
            String str3 = coszVar.c;
            dkcp dkcpVar = (dkcp) ffbrVar.b();
            djtp f2 = dkcpVar.f(str3);
            f2.B();
            f2.D();
            dkcpVar.t(str3, f2);
            djro djroVar = new djro(str3);
            cmpnVar.x(djroVar, ckgb.RECONFIG_SMS);
            cmpnVar.v(djroVar, coszVar.d, eqws.RECONFIG_SMS);
        }
        return true;
    }
}
