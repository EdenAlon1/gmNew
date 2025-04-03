package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class davq extends cwps {
    private boolean n = false;

    public davq() {
        y(new davp(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugMmsConfigActivity debugMmsConfigActivity = (DebugMmsConfigActivity) this;
        akgb akgbVar = (akgb) aX();
        debugMmsConfigActivity.t = (cqoh) akgbVar.b.cz.b();
        debugMmsConfigActivity.u = (cwqc) akgbVar.e.b();
        debugMmsConfigActivity.v = akgbVar.g;
        debugMmsConfigActivity.w = (bcqg) akgbVar.b.cZ.b();
        debugMmsConfigActivity.x = (crjx) akgbVar.b.a.r.b();
        debugMmsConfigActivity.y = akgbVar.h;
        debugMmsConfigActivity.z = akgbVar.b.b.nH;
    }
}
