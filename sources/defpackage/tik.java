package defpackage;

import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tik extends cwps {
    private boolean n = false;

    public tik() {
        y(new tij(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        FiAccountConfirmationActivity fiAccountConfirmationActivity = (FiAccountConfirmationActivity) this;
        akgb akgbVar = (akgb) aX();
        fiAccountConfirmationActivity.t = (cqoh) akgbVar.b.cz.b();
        fiAccountConfirmationActivity.u = (cwqc) akgbVar.e.b();
        fiAccountConfirmationActivity.v = akgbVar.g;
        fiAccountConfirmationActivity.w = (bcqg) akgbVar.b.cZ.b();
        fiAccountConfirmationActivity.x = (crjx) akgbVar.b.a.r.b();
        fiAccountConfirmationActivity.y = akgbVar.h;
        fiAccountConfirmationActivity.z = akgbVar.b.b.nH;
    }
}
