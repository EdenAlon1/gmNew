package defpackage;

import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwi extends aktz {
    private boolean K = false;

    public cwwi() {
        y(new cwwh(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        RichCardsSettingsActivity richCardsSettingsActivity = (RichCardsSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        richCardsSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        richCardsSettingsActivity.u = (cwqc) akgbVar.e.b();
        richCardsSettingsActivity.v = akgbVar.g;
        richCardsSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        richCardsSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        richCardsSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        richCardsSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        richCardsSettingsActivity.A = akkpVar.DA;
        richCardsSettingsActivity.B = akkpVar.ft;
        richCardsSettingsActivity.C = akisVar.cT;
        richCardsSettingsActivity.D = akgbVar.j;
        richCardsSettingsActivity.E = (elbx) akisVar.aJ.b();
        richCardsSettingsActivity.F = akgbVar.e;
        ((cwqd) richCardsSettingsActivity).H = akgbVar.c.bn;
        richCardsSettingsActivity.I = akgbVar.b.a.Sa;
        richCardsSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) richCardsSettingsActivity).n = akgbVar.b.a.RR;
    }
}
