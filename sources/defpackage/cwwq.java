package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwq extends aktz {
    private boolean K = false;

    public cwwq() {
        y(new cwwp(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SimSelectionSettingsActivity simSelectionSettingsActivity = (SimSelectionSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        simSelectionSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        simSelectionSettingsActivity.u = (cwqc) akgbVar.e.b();
        simSelectionSettingsActivity.v = akgbVar.g;
        simSelectionSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        simSelectionSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        simSelectionSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        simSelectionSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        simSelectionSettingsActivity.A = akkpVar.DA;
        simSelectionSettingsActivity.B = akkpVar.ft;
        simSelectionSettingsActivity.C = akisVar.cT;
        simSelectionSettingsActivity.D = akgbVar.j;
        simSelectionSettingsActivity.E = (elbx) akisVar.aJ.b();
        simSelectionSettingsActivity.F = akgbVar.e;
        ((cwqd) simSelectionSettingsActivity).H = akgbVar.c.bn;
        simSelectionSettingsActivity.I = akgbVar.b.a.Sa;
        simSelectionSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) simSelectionSettingsActivity).n = akgbVar.b.a.RR;
    }
}
