package defpackage;

import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ajki extends cwpv {
    private boolean n = false;

    public ajki() {
        y(new ajkh(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) this;
        akgb akgbVar = (akgb) aX();
        identityDetailsActivity.t = (cqoh) akgbVar.b.cz.b();
        identityDetailsActivity.u = (cwqc) akgbVar.e.b();
        identityDetailsActivity.v = akgbVar.g;
        identityDetailsActivity.w = (bcqg) akgbVar.b.cZ.b();
        identityDetailsActivity.x = (crjx) akgbVar.b.a.r.b();
        identityDetailsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        identityDetailsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        identityDetailsActivity.A = akkpVar.DA;
        identityDetailsActivity.B = akkpVar.ft;
        identityDetailsActivity.C = akisVar.cT;
        identityDetailsActivity.D = akgbVar.j;
        identityDetailsActivity.E = (elbx) akisVar.aJ.b();
        identityDetailsActivity.F = akgbVar.e;
    }
}
