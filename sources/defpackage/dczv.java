package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dczv extends cwpv {
    private boolean n = false;

    public dczv() {
        y(new dczu(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        PhoneNumberInputV2Activity phoneNumberInputV2Activity = (PhoneNumberInputV2Activity) this;
        akgb akgbVar = (akgb) aX();
        phoneNumberInputV2Activity.t = (cqoh) akgbVar.b.cz.b();
        phoneNumberInputV2Activity.u = (cwqc) akgbVar.e.b();
        phoneNumberInputV2Activity.v = akgbVar.g;
        phoneNumberInputV2Activity.w = (bcqg) akgbVar.b.cZ.b();
        phoneNumberInputV2Activity.x = (crjx) akgbVar.b.a.r.b();
        phoneNumberInputV2Activity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        phoneNumberInputV2Activity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        phoneNumberInputV2Activity.A = akkpVar.DA;
        phoneNumberInputV2Activity.B = akkpVar.ft;
        phoneNumberInputV2Activity.C = akisVar.cT;
        phoneNumberInputV2Activity.D = akgbVar.j;
        phoneNumberInputV2Activity.E = (elbx) akisVar.aJ.b();
        phoneNumberInputV2Activity.F = akgbVar.e;
    }
}
