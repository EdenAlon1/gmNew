package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class davn extends cwps {
    private boolean n = false;

    public davn() {
        y(new davm(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugGServiceKeysActivity debugGServiceKeysActivity = (DebugGServiceKeysActivity) this;
        akgb akgbVar = (akgb) aX();
        debugGServiceKeysActivity.t = (cqoh) akgbVar.b.cz.b();
        debugGServiceKeysActivity.u = (cwqc) akgbVar.e.b();
        debugGServiceKeysActivity.v = akgbVar.g;
        debugGServiceKeysActivity.w = (bcqg) akgbVar.b.cZ.b();
        debugGServiceKeysActivity.x = (crjx) akgbVar.b.a.r.b();
        debugGServiceKeysActivity.y = akgbVar.h;
        debugGServiceKeysActivity.z = akgbVar.b.b.nH;
    }
}
