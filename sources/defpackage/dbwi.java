package defpackage;

import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbwi extends cwps {
    private boolean n = false;

    public dbwi() {
        y(new dbwh(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        GaiaPairingVerificationActivity gaiaPairingVerificationActivity = (GaiaPairingVerificationActivity) this;
        akgb akgbVar = (akgb) aX();
        gaiaPairingVerificationActivity.t = (cqoh) akgbVar.b.cz.b();
        gaiaPairingVerificationActivity.u = (cwqc) akgbVar.e.b();
        gaiaPairingVerificationActivity.v = akgbVar.g;
        gaiaPairingVerificationActivity.w = (bcqg) akgbVar.b.cZ.b();
        gaiaPairingVerificationActivity.x = (crjx) akgbVar.b.a.r.b();
        gaiaPairingVerificationActivity.y = akgbVar.h;
        gaiaPairingVerificationActivity.z = akgbVar.b.b.nH;
    }
}
