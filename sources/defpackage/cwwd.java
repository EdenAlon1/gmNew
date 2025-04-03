package defpackage;

import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwd extends aktz {
    private boolean K = false;

    public cwwd() {
        y(new cwwc(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        PerSubscriptionSettingsActivity perSubscriptionSettingsActivity = (PerSubscriptionSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        perSubscriptionSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        perSubscriptionSettingsActivity.u = (cwqc) akgbVar.e.b();
        perSubscriptionSettingsActivity.v = akgbVar.g;
        perSubscriptionSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        perSubscriptionSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        perSubscriptionSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        perSubscriptionSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        perSubscriptionSettingsActivity.A = akkpVar.DA;
        perSubscriptionSettingsActivity.B = akkpVar.ft;
        perSubscriptionSettingsActivity.C = akisVar.cT;
        perSubscriptionSettingsActivity.D = akgbVar.j;
        perSubscriptionSettingsActivity.E = (elbx) akisVar.aJ.b();
        perSubscriptionSettingsActivity.F = akgbVar.e;
        ((cwqd) perSubscriptionSettingsActivity).H = akgbVar.c.bn;
        perSubscriptionSettingsActivity.I = akgbVar.b.a.Sa;
        perSubscriptionSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) perSubscriptionSettingsActivity).n = akgbVar.b.a.RR;
    }
}
