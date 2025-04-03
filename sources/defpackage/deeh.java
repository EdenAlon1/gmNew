package defpackage;

import com.google.android.apps.messaging.wearable.WearableSetDefaultSmsAppActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class deeh extends cwps {
    private boolean n = false;

    public deeh() {
        y(new deeg(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        WearableSetDefaultSmsAppActivity wearableSetDefaultSmsAppActivity = (WearableSetDefaultSmsAppActivity) this;
        akgb akgbVar = (akgb) aX();
        wearableSetDefaultSmsAppActivity.t = (cqoh) akgbVar.b.cz.b();
        wearableSetDefaultSmsAppActivity.u = (cwqc) akgbVar.e.b();
        wearableSetDefaultSmsAppActivity.v = akgbVar.g;
        wearableSetDefaultSmsAppActivity.w = (bcqg) akgbVar.b.cZ.b();
        wearableSetDefaultSmsAppActivity.x = (crjx) akgbVar.b.a.r.b();
        wearableSetDefaultSmsAppActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        wearableSetDefaultSmsAppActivity.z = akisVar.b.nH;
        wearableSetDefaultSmsAppActivity.n = fbaz.a(akisVar.a.fP);
        akis akisVar2 = akgbVar.b;
        akkp akkpVar = akisVar2.a;
        wearableSetDefaultSmsAppActivity.o = akkpVar.Px;
        wearableSetDefaultSmsAppActivity.p = akkpVar.nW;
        wearableSetDefaultSmsAppActivity.q = akisVar2.q;
        wearableSetDefaultSmsAppActivity.r = akisVar2.aZ;
    }
}
