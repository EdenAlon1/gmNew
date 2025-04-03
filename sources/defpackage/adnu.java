package defpackage;

import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adnu extends cwqd {
    private boolean n = false;

    public adnu() {
        y(new adnt(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SignOutAccountActivity signOutAccountActivity = (SignOutAccountActivity) this;
        akgb akgbVar = (akgb) aX();
        signOutAccountActivity.t = (cqoh) akgbVar.b.cz.b();
        signOutAccountActivity.u = (cwqc) akgbVar.e.b();
        signOutAccountActivity.v = akgbVar.g;
        signOutAccountActivity.w = (bcqg) akgbVar.b.cZ.b();
        signOutAccountActivity.x = (crjx) akgbVar.b.a.r.b();
        signOutAccountActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        signOutAccountActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        signOutAccountActivity.A = akkpVar.DA;
        signOutAccountActivity.B = akkpVar.ft;
        signOutAccountActivity.C = akisVar.cT;
        signOutAccountActivity.D = akgbVar.j;
        signOutAccountActivity.E = (elbx) akisVar.aJ.b();
        signOutAccountActivity.F = akgbVar.e;
        ((cwqd) signOutAccountActivity).H = akgbVar.c.bn;
        signOutAccountActivity.I = akgbVar.b.a.Sa;
        signOutAccountActivity.J = (eg) akgbVar.f.b();
    }
}
