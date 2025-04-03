package defpackage;

import com.google.android.apps.messaging.ui.debug.workqueue.pwqui.PwqDebugUiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbog extends cwps {
    private boolean n = false;

    public dbog() {
        y(new dbof(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        PwqDebugUiActivity pwqDebugUiActivity = (PwqDebugUiActivity) this;
        akgb akgbVar = (akgb) aX();
        pwqDebugUiActivity.t = (cqoh) akgbVar.b.cz.b();
        pwqDebugUiActivity.u = (cwqc) akgbVar.e.b();
        pwqDebugUiActivity.v = akgbVar.g;
        pwqDebugUiActivity.w = (bcqg) akgbVar.b.cZ.b();
        pwqDebugUiActivity.x = (crjx) akgbVar.b.a.r.b();
        pwqDebugUiActivity.y = akgbVar.h;
        pwqDebugUiActivity.z = akgbVar.b.b.nH;
    }
}
