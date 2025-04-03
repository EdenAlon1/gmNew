package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class davw extends cwps {
    private boolean n = false;

    public davw() {
        y(new davv(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugPrefsActivity debugPrefsActivity = (DebugPrefsActivity) this;
        akgb akgbVar = (akgb) aX();
        debugPrefsActivity.t = (cqoh) akgbVar.b.cz.b();
        debugPrefsActivity.u = (cwqc) akgbVar.e.b();
        debugPrefsActivity.v = akgbVar.g;
        debugPrefsActivity.w = (bcqg) akgbVar.b.cZ.b();
        debugPrefsActivity.x = (crjx) akgbVar.b.a.r.b();
        debugPrefsActivity.y = akgbVar.h;
        debugPrefsActivity.z = akgbVar.b.b.nH;
    }
}
