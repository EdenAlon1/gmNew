package defpackage;

import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxkm extends aktz {
    private boolean K = false;

    public cxkm() {
        y(new cxkl(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        ProtectionSafetySettingsActivity protectionSafetySettingsActivity = (ProtectionSafetySettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        protectionSafetySettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        protectionSafetySettingsActivity.u = (cwqc) akgbVar.e.b();
        protectionSafetySettingsActivity.v = akgbVar.g;
        protectionSafetySettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        protectionSafetySettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        protectionSafetySettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        protectionSafetySettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        protectionSafetySettingsActivity.A = akkpVar.DA;
        protectionSafetySettingsActivity.B = akkpVar.ft;
        protectionSafetySettingsActivity.C = akisVar.cT;
        protectionSafetySettingsActivity.D = akgbVar.j;
        protectionSafetySettingsActivity.E = (elbx) akisVar.aJ.b();
        protectionSafetySettingsActivity.F = akgbVar.e;
        ((cwqd) protectionSafetySettingsActivity).H = akgbVar.c.bn;
        protectionSafetySettingsActivity.I = akgbVar.b.a.Sa;
        protectionSafetySettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) protectionSafetySettingsActivity).n = akgbVar.b.a.RR;
    }
}
