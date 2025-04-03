package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwv extends aktz {
    private boolean K = false;

    public cwwv() {
        y(new cwwu(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SpamSettingsActivity spamSettingsActivity = (SpamSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        spamSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        spamSettingsActivity.u = (cwqc) akgbVar.e.b();
        spamSettingsActivity.v = akgbVar.g;
        spamSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        spamSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        spamSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        spamSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        spamSettingsActivity.A = akkpVar.DA;
        spamSettingsActivity.B = akkpVar.ft;
        spamSettingsActivity.C = akisVar.cT;
        spamSettingsActivity.D = akgbVar.j;
        spamSettingsActivity.E = (elbx) akisVar.aJ.b();
        spamSettingsActivity.F = akgbVar.e;
        ((cwqd) spamSettingsActivity).H = akgbVar.c.bn;
        spamSettingsActivity.I = akgbVar.b.a.Sa;
        spamSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) spamSettingsActivity).n = akgbVar.b.a.RR;
    }
}
