package defpackage;

import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwlb extends aktz {
    private boolean K = false;

    public cwlb() {
        y(new cwla(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SmartActionSettingsActivity smartActionSettingsActivity = (SmartActionSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        smartActionSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        smartActionSettingsActivity.u = (cwqc) akgbVar.e.b();
        smartActionSettingsActivity.v = akgbVar.g;
        smartActionSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        smartActionSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        smartActionSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        smartActionSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        smartActionSettingsActivity.A = akkpVar.DA;
        smartActionSettingsActivity.B = akkpVar.ft;
        smartActionSettingsActivity.C = akisVar.cT;
        smartActionSettingsActivity.D = akgbVar.j;
        smartActionSettingsActivity.E = (elbx) akisVar.aJ.b();
        smartActionSettingsActivity.F = akgbVar.e;
        ((cwqd) smartActionSettingsActivity).H = akgbVar.c.bn;
        smartActionSettingsActivity.I = akgbVar.b.a.Sa;
        smartActionSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) smartActionSettingsActivity).n = akgbVar.b.a.RR;
    }
}
