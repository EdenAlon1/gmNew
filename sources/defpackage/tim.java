package defpackage;

import com.google.android.apps.messaging.cloudstore.fi.FiSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tim extends aktz {
    private boolean K = false;

    public tim() {
        y(new til(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        FiSettingsActivity fiSettingsActivity = (FiSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        fiSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        fiSettingsActivity.u = (cwqc) akgbVar.e.b();
        fiSettingsActivity.v = akgbVar.g;
        fiSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        fiSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        fiSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        fiSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        fiSettingsActivity.A = akkpVar.DA;
        fiSettingsActivity.B = akkpVar.ft;
        fiSettingsActivity.C = akisVar.cT;
        fiSettingsActivity.D = akgbVar.j;
        fiSettingsActivity.E = (elbx) akisVar.aJ.b();
        fiSettingsActivity.F = akgbVar.e;
        ((cwqd) fiSettingsActivity).H = akgbVar.c.bn;
        fiSettingsActivity.I = akgbVar.b.a.Sa;
        fiSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) fiSettingsActivity).n = akgbVar.b.a.RR;
    }
}
