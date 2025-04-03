package defpackage;

import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ajfn extends aktz {
    private boolean K = false;

    public ajfn() {
        y(new ajfm(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        GeminiSettingsActivity geminiSettingsActivity = (GeminiSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        geminiSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        geminiSettingsActivity.u = (cwqc) akgbVar.e.b();
        geminiSettingsActivity.v = akgbVar.g;
        geminiSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        geminiSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        geminiSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        geminiSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        geminiSettingsActivity.A = akkpVar.DA;
        geminiSettingsActivity.B = akkpVar.ft;
        geminiSettingsActivity.C = akisVar.cT;
        geminiSettingsActivity.D = akgbVar.j;
        geminiSettingsActivity.E = (elbx) akisVar.aJ.b();
        geminiSettingsActivity.F = akgbVar.e;
        ((cwqd) geminiSettingsActivity).H = akgbVar.c.bn;
        geminiSettingsActivity.I = akgbVar.b.a.Sa;
        geminiSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) geminiSettingsActivity).n = akgbVar.b.a.RR;
    }
}
