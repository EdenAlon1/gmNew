package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwwk extends cwpv {
    private boolean n = false;

    public cwwk() {
        y(new cwwj(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SettingsActivity settingsActivity = (SettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        settingsActivity.t = (cqoh) akgbVar.b.cz.b();
        settingsActivity.u = (cwqc) akgbVar.e.b();
        settingsActivity.v = akgbVar.g;
        settingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        settingsActivity.x = (crjx) akgbVar.b.a.r.b();
        settingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        settingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        settingsActivity.A = akkpVar.DA;
        settingsActivity.B = akkpVar.ft;
        settingsActivity.C = akisVar.cT;
        settingsActivity.D = akgbVar.j;
        settingsActivity.E = (elbx) akisVar.aJ.b();
        settingsActivity.F = akgbVar.e;
    }
}
