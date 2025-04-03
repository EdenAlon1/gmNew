package defpackage;

import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddly extends cwps {
    private boolean n = false;

    public ddly() {
        y(new ddlx(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ZeroStateSearchActivity zeroStateSearchActivity = (ZeroStateSearchActivity) this;
        akgb akgbVar = (akgb) aX();
        zeroStateSearchActivity.t = (cqoh) akgbVar.b.cz.b();
        zeroStateSearchActivity.u = (cwqc) akgbVar.e.b();
        zeroStateSearchActivity.v = akgbVar.g;
        zeroStateSearchActivity.w = (bcqg) akgbVar.b.cZ.b();
        zeroStateSearchActivity.x = (crjx) akgbVar.b.a.r.b();
        zeroStateSearchActivity.y = akgbVar.h;
        zeroStateSearchActivity.z = akgbVar.b.b.nH;
    }
}
