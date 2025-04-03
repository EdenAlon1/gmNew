package defpackage;

import com.google.android.apps.messaging.ui.appsettings.HqmsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwvy extends aktz {
    private boolean K = false;

    public cwvy() {
        y(new cwvx(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        HqmsSettingsActivity hqmsSettingsActivity = (HqmsSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        hqmsSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        hqmsSettingsActivity.u = (cwqc) akgbVar.e.b();
        hqmsSettingsActivity.v = akgbVar.g;
        hqmsSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        hqmsSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        hqmsSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        hqmsSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        hqmsSettingsActivity.A = akkpVar.DA;
        hqmsSettingsActivity.B = akkpVar.ft;
        hqmsSettingsActivity.C = akisVar.cT;
        hqmsSettingsActivity.D = akgbVar.j;
        hqmsSettingsActivity.E = (elbx) akisVar.aJ.b();
        hqmsSettingsActivity.F = akgbVar.e;
        ((cwqd) hqmsSettingsActivity).H = akgbVar.c.bn;
        hqmsSettingsActivity.I = akgbVar.b.a.Sa;
        hqmsSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) hqmsSettingsActivity).n = akgbVar.b.a.RR;
    }
}
