package defpackage;

import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ajlf extends aktz {
    private boolean K = false;

    public ajlf() {
        y(new ajle(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        privacySettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        privacySettingsActivity.u = (cwqc) akgbVar.e.b();
        privacySettingsActivity.v = akgbVar.g;
        privacySettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        privacySettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        privacySettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        privacySettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        privacySettingsActivity.A = akkpVar.DA;
        privacySettingsActivity.B = akkpVar.ft;
        privacySettingsActivity.C = akisVar.cT;
        privacySettingsActivity.D = akgbVar.j;
        privacySettingsActivity.E = (elbx) akisVar.aJ.b();
        privacySettingsActivity.F = akgbVar.e;
        ((cwqd) privacySettingsActivity).H = akgbVar.c.bn;
        privacySettingsActivity.I = akgbVar.b.a.Sa;
        privacySettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) privacySettingsActivity).n = akgbVar.b.a.RR;
    }
}
