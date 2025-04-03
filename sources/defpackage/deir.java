package defpackage;

import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class deir extends cwps {
    private boolean n = false;

    public deir() {
        y(new deiq(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SignedInWelcomeActivity signedInWelcomeActivity = (SignedInWelcomeActivity) this;
        akgb akgbVar = (akgb) aX();
        signedInWelcomeActivity.t = (cqoh) akgbVar.b.cz.b();
        signedInWelcomeActivity.u = (cwqc) akgbVar.e.b();
        signedInWelcomeActivity.v = akgbVar.g;
        signedInWelcomeActivity.w = (bcqg) akgbVar.b.cZ.b();
        signedInWelcomeActivity.x = (crjx) akgbVar.b.a.r.b();
        signedInWelcomeActivity.y = akgbVar.h;
        signedInWelcomeActivity.z = akgbVar.b.b.nH;
    }
}
