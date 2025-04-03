package defpackage;

import com.google.android.apps.messaging.ui.debug.cloudstore.d2d.D2dToolsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbej extends cwps {
    private boolean n = false;

    public dbej() {
        y(new dbei(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        D2dToolsActivity d2dToolsActivity = (D2dToolsActivity) this;
        akgb akgbVar = (akgb) aX();
        d2dToolsActivity.t = (cqoh) akgbVar.b.cz.b();
        d2dToolsActivity.u = (cwqc) akgbVar.e.b();
        d2dToolsActivity.v = akgbVar.g;
        d2dToolsActivity.w = (bcqg) akgbVar.b.cZ.b();
        d2dToolsActivity.x = (crjx) akgbVar.b.a.r.b();
        d2dToolsActivity.y = akgbVar.h;
        d2dToolsActivity.z = akgbVar.b.b.nH;
    }
}
