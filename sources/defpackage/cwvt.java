package defpackage;

import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwvt extends aktz {
    private boolean K = false;

    public cwvt() {
        y(new cwvs(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        ApplicationSettingsActivity applicationSettingsActivity = (ApplicationSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        applicationSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        applicationSettingsActivity.u = (cwqc) akgbVar.e.b();
        applicationSettingsActivity.v = akgbVar.g;
        applicationSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        applicationSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        applicationSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        applicationSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        applicationSettingsActivity.A = akkpVar.DA;
        applicationSettingsActivity.B = akkpVar.ft;
        applicationSettingsActivity.C = akisVar.cT;
        applicationSettingsActivity.D = akgbVar.j;
        applicationSettingsActivity.E = (elbx) akisVar.aJ.b();
        applicationSettingsActivity.F = akgbVar.e;
        ((cwqd) applicationSettingsActivity).H = akgbVar.c.bn;
        applicationSettingsActivity.I = akgbVar.b.a.Sa;
        applicationSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) applicationSettingsActivity).n = akgbVar.b.a.RR;
    }
}
