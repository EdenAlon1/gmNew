package defpackage;

import com.google.android.apps.messaging.sms.storage.SmsStorageLowWarningActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvmg extends cwps {
    private boolean n = false;

    public cvmg() {
        y(new cvmf(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SmsStorageLowWarningActivity smsStorageLowWarningActivity = (SmsStorageLowWarningActivity) this;
        akgb akgbVar = (akgb) aX();
        smsStorageLowWarningActivity.t = (cqoh) akgbVar.b.cz.b();
        smsStorageLowWarningActivity.u = (cwqc) akgbVar.e.b();
        smsStorageLowWarningActivity.v = akgbVar.g;
        smsStorageLowWarningActivity.w = (bcqg) akgbVar.b.cZ.b();
        smsStorageLowWarningActivity.x = (crjx) akgbVar.b.a.r.b();
        smsStorageLowWarningActivity.y = akgbVar.h;
        smsStorageLowWarningActivity.z = akgbVar.b.b.nH;
    }
}
