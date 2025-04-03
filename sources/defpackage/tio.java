package defpackage;

import com.google.android.apps.messaging.cloudstore.fi.FiSettingsRedirectActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tio extends aktz {
    private boolean K = false;

    public tio() {
        y(new tin(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        FiSettingsRedirectActivity fiSettingsRedirectActivity = (FiSettingsRedirectActivity) this;
        akgb akgbVar = (akgb) aX();
        fiSettingsRedirectActivity.t = (cqoh) akgbVar.b.cz.b();
        fiSettingsRedirectActivity.u = (cwqc) akgbVar.e.b();
        fiSettingsRedirectActivity.v = akgbVar.g;
        fiSettingsRedirectActivity.w = (bcqg) akgbVar.b.cZ.b();
        fiSettingsRedirectActivity.x = (crjx) akgbVar.b.a.r.b();
        fiSettingsRedirectActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        fiSettingsRedirectActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        fiSettingsRedirectActivity.A = akkpVar.DA;
        fiSettingsRedirectActivity.B = akkpVar.ft;
        fiSettingsRedirectActivity.C = akisVar.cT;
        fiSettingsRedirectActivity.D = akgbVar.j;
        fiSettingsRedirectActivity.E = (elbx) akisVar.aJ.b();
        fiSettingsRedirectActivity.F = akgbVar.e;
        ((cwqd) fiSettingsRedirectActivity).H = akgbVar.c.bn;
        fiSettingsRedirectActivity.I = akgbVar.b.a.Sa;
        fiSettingsRedirectActivity.J = (eg) akgbVar.f.b();
        ((aktz) fiSettingsRedirectActivity).n = akgbVar.b.a.RR;
    }
}
