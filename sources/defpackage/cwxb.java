package defpackage;

import com.google.android.apps.messaging.ui.appsettings.TurnOffRcsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwxb extends cwqd {
    private boolean n = false;

    public cwxb() {
        y(new cwxa(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        TurnOffRcsActivity turnOffRcsActivity = (TurnOffRcsActivity) this;
        akgb akgbVar = (akgb) aX();
        turnOffRcsActivity.t = (cqoh) akgbVar.b.cz.b();
        turnOffRcsActivity.u = (cwqc) akgbVar.e.b();
        turnOffRcsActivity.v = akgbVar.g;
        turnOffRcsActivity.w = (bcqg) akgbVar.b.cZ.b();
        turnOffRcsActivity.x = (crjx) akgbVar.b.a.r.b();
        turnOffRcsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        turnOffRcsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        turnOffRcsActivity.A = akkpVar.DA;
        turnOffRcsActivity.B = akkpVar.ft;
        turnOffRcsActivity.C = akisVar.cT;
        turnOffRcsActivity.D = akgbVar.j;
        turnOffRcsActivity.E = (elbx) akisVar.aJ.b();
        turnOffRcsActivity.F = akgbVar.e;
        ((cwqd) turnOffRcsActivity).H = akgbVar.c.bn;
        turnOffRcsActivity.I = akgbVar.b.a.Sa;
        turnOffRcsActivity.J = (eg) akgbVar.f.b();
    }
}
