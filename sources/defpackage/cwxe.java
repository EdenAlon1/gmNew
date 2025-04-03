package defpackage;

import com.google.android.apps.messaging.ui.appsettings.VmtSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwxe extends aktz {
    private boolean K = false;

    public cwxe() {
        y(new cwxd(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        VmtSettingsActivity vmtSettingsActivity = (VmtSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        vmtSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        vmtSettingsActivity.u = (cwqc) akgbVar.e.b();
        vmtSettingsActivity.v = akgbVar.g;
        vmtSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        vmtSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        vmtSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        vmtSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        vmtSettingsActivity.A = akkpVar.DA;
        vmtSettingsActivity.B = akkpVar.ft;
        vmtSettingsActivity.C = akisVar.cT;
        vmtSettingsActivity.D = akgbVar.j;
        vmtSettingsActivity.E = (elbx) akisVar.aJ.b();
        vmtSettingsActivity.F = akgbVar.e;
        ((cwqd) vmtSettingsActivity).H = akgbVar.c.bn;
        vmtSettingsActivity.I = akgbVar.b.a.Sa;
        vmtSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) vmtSettingsActivity).n = akgbVar.b.a.RR;
    }
}
