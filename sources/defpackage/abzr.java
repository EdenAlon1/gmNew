package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abzr extends cwps {
    private boolean n = false;

    public abzr() {
        y(new abzq(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DataDonationActivity dataDonationActivity = (DataDonationActivity) this;
        akgb akgbVar = (akgb) aX();
        dataDonationActivity.t = (cqoh) akgbVar.b.cz.b();
        dataDonationActivity.u = (cwqc) akgbVar.e.b();
        dataDonationActivity.v = akgbVar.g;
        dataDonationActivity.w = (bcqg) akgbVar.b.cZ.b();
        dataDonationActivity.x = (crjx) akgbVar.b.a.r.b();
        dataDonationActivity.y = akgbVar.h;
        dataDonationActivity.z = akgbVar.b.b.nH;
    }
}
