package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwwy extends aktz {
    private boolean K = false;

    public cwwy() {
        y(new cwwx(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SwipeActionSettingsActivity swipeActionSettingsActivity = (SwipeActionSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        swipeActionSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        swipeActionSettingsActivity.u = (cwqc) akgbVar.e.b();
        swipeActionSettingsActivity.v = akgbVar.g;
        swipeActionSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        swipeActionSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        swipeActionSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        swipeActionSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        swipeActionSettingsActivity.A = akkpVar.DA;
        swipeActionSettingsActivity.B = akkpVar.ft;
        swipeActionSettingsActivity.C = akisVar.cT;
        swipeActionSettingsActivity.D = akgbVar.j;
        swipeActionSettingsActivity.E = (elbx) akisVar.aJ.b();
        swipeActionSettingsActivity.F = akgbVar.e;
        ((cwqd) swipeActionSettingsActivity).H = akgbVar.c.bn;
        swipeActionSettingsActivity.I = akgbVar.b.a.Sa;
        swipeActionSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) swipeActionSettingsActivity).n = akgbVar.b.a.RR;
    }
}
