package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class davt extends cwps {
    private boolean n = false;

    public davt() {
        y(new davs(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugMobileConfigurationActivity debugMobileConfigurationActivity = (DebugMobileConfigurationActivity) this;
        akgb akgbVar = (akgb) aX();
        debugMobileConfigurationActivity.t = (cqoh) akgbVar.b.cz.b();
        debugMobileConfigurationActivity.u = (cwqc) akgbVar.e.b();
        debugMobileConfigurationActivity.v = akgbVar.g;
        debugMobileConfigurationActivity.w = (bcqg) akgbVar.b.cZ.b();
        debugMobileConfigurationActivity.x = (crjx) akgbVar.b.a.r.b();
        debugMobileConfigurationActivity.y = akgbVar.h;
        debugMobileConfigurationActivity.z = akgbVar.b.b.nH;
    }
}
