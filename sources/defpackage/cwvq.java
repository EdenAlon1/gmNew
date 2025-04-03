package defpackage;

import com.google.android.apps.messaging.ui.appsettings.AboutPrivacyTermsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwvq extends aktz {
    private boolean K = false;

    public cwvq() {
        y(new cwvp(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        AboutPrivacyTermsActivity aboutPrivacyTermsActivity = (AboutPrivacyTermsActivity) this;
        akgb akgbVar = (akgb) aX();
        aboutPrivacyTermsActivity.t = (cqoh) akgbVar.b.cz.b();
        aboutPrivacyTermsActivity.u = (cwqc) akgbVar.e.b();
        aboutPrivacyTermsActivity.v = akgbVar.g;
        aboutPrivacyTermsActivity.w = (bcqg) akgbVar.b.cZ.b();
        aboutPrivacyTermsActivity.x = (crjx) akgbVar.b.a.r.b();
        aboutPrivacyTermsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        aboutPrivacyTermsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        aboutPrivacyTermsActivity.A = akkpVar.DA;
        aboutPrivacyTermsActivity.B = akkpVar.ft;
        aboutPrivacyTermsActivity.C = akisVar.cT;
        aboutPrivacyTermsActivity.D = akgbVar.j;
        aboutPrivacyTermsActivity.E = (elbx) akisVar.aJ.b();
        aboutPrivacyTermsActivity.F = akgbVar.e;
        ((cwqd) aboutPrivacyTermsActivity).H = akgbVar.c.bn;
        aboutPrivacyTermsActivity.I = akgbVar.b.a.Sa;
        aboutPrivacyTermsActivity.J = (eg) akgbVar.f.b();
        ((aktz) aboutPrivacyTermsActivity).n = akgbVar.b.a.RR;
    }
}
