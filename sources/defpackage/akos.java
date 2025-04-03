package defpackage;

import com.google.android.apps.messaging.samsung.settings.CmcUserConsentSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class akos extends aktz {
    private boolean K = false;

    public akos() {
        y(new akor(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        CmcUserConsentSettingsActivity cmcUserConsentSettingsActivity = (CmcUserConsentSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        cmcUserConsentSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        cmcUserConsentSettingsActivity.u = (cwqc) akgbVar.e.b();
        cmcUserConsentSettingsActivity.v = akgbVar.g;
        cmcUserConsentSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        cmcUserConsentSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        cmcUserConsentSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        cmcUserConsentSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        cmcUserConsentSettingsActivity.A = akkpVar.DA;
        cmcUserConsentSettingsActivity.B = akkpVar.ft;
        cmcUserConsentSettingsActivity.C = akisVar.cT;
        cmcUserConsentSettingsActivity.D = akgbVar.j;
        cmcUserConsentSettingsActivity.E = (elbx) akisVar.aJ.b();
        cmcUserConsentSettingsActivity.F = akgbVar.e;
        ((cwqd) cmcUserConsentSettingsActivity).H = akgbVar.c.bn;
        cmcUserConsentSettingsActivity.I = akgbVar.b.a.Sa;
        cmcUserConsentSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) cmcUserConsentSettingsActivity).n = akgbVar.b.a.RR;
    }
}
