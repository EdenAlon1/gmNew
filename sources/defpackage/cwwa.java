package defpackage;

import com.google.android.apps.messaging.ui.appsettings.NudgeSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwa extends aktz {
    private boolean K = false;

    public cwwa() {
        y(new cwvz(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        NudgeSettingsActivity nudgeSettingsActivity = (NudgeSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        nudgeSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        nudgeSettingsActivity.u = (cwqc) akgbVar.e.b();
        nudgeSettingsActivity.v = akgbVar.g;
        nudgeSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        nudgeSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        nudgeSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        nudgeSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        nudgeSettingsActivity.A = akkpVar.DA;
        nudgeSettingsActivity.B = akkpVar.ft;
        nudgeSettingsActivity.C = akisVar.cT;
        nudgeSettingsActivity.D = akgbVar.j;
        nudgeSettingsActivity.E = (elbx) akisVar.aJ.b();
        nudgeSettingsActivity.F = akgbVar.e;
        ((cwqd) nudgeSettingsActivity).H = akgbVar.c.bn;
        nudgeSettingsActivity.I = akgbVar.b.a.Sa;
        nudgeSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) nudgeSettingsActivity).n = akgbVar.b.a.RR;
    }
}
