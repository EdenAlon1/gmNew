package defpackage;

import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwf extends aktz {
    private boolean K = false;

    public cwwf() {
        y(new cwwe(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        RcsSettingsActivity rcsSettingsActivity = (RcsSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        rcsSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        rcsSettingsActivity.u = (cwqc) akgbVar.e.b();
        rcsSettingsActivity.v = akgbVar.g;
        rcsSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        rcsSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        rcsSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        rcsSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        rcsSettingsActivity.A = akkpVar.DA;
        rcsSettingsActivity.B = akkpVar.ft;
        rcsSettingsActivity.C = akisVar.cT;
        rcsSettingsActivity.D = akgbVar.j;
        rcsSettingsActivity.E = (elbx) akisVar.aJ.b();
        rcsSettingsActivity.F = akgbVar.e;
        ((cwqd) rcsSettingsActivity).H = akgbVar.c.bn;
        rcsSettingsActivity.I = akgbVar.b.a.Sa;
        rcsSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) rcsSettingsActivity).n = akgbVar.b.a.RR;
    }
}
