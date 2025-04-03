package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwws extends aktz {
    private boolean K = false;

    public cwws() {
        y(new cwwr(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SmartsSettingsActivity smartsSettingsActivity = (SmartsSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        smartsSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        smartsSettingsActivity.u = (cwqc) akgbVar.e.b();
        smartsSettingsActivity.v = akgbVar.g;
        smartsSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        smartsSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        smartsSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        smartsSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        smartsSettingsActivity.A = akkpVar.DA;
        smartsSettingsActivity.B = akkpVar.ft;
        smartsSettingsActivity.C = akisVar.cT;
        smartsSettingsActivity.D = akgbVar.j;
        smartsSettingsActivity.E = (elbx) akisVar.aJ.b();
        smartsSettingsActivity.F = akgbVar.e;
        ((cwqd) smartsSettingsActivity).H = akgbVar.c.bn;
        smartsSettingsActivity.I = akgbVar.b.a.Sa;
        smartsSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) smartsSettingsActivity).n = akgbVar.b.a.RR;
    }
}
