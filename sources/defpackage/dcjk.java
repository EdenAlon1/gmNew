package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcjk extends dbxx {
    private boolean K = false;

    public dcjk() {
        y(new dcjj(this));
    }

    @Override // defpackage.dbya, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) this;
        akgb akgbVar = (akgb) aX();
        gifBrowserActivity.t = (cqoh) akgbVar.b.cz.b();
        gifBrowserActivity.u = (cwqc) akgbVar.e.b();
        gifBrowserActivity.v = akgbVar.g;
        gifBrowserActivity.w = (bcqg) akgbVar.b.cZ.b();
        gifBrowserActivity.x = (crjx) akgbVar.b.a.r.b();
        gifBrowserActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        gifBrowserActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        gifBrowserActivity.A = akkpVar.DA;
        gifBrowserActivity.B = akkpVar.ft;
        gifBrowserActivity.C = akisVar.cT;
        gifBrowserActivity.D = akgbVar.j;
        gifBrowserActivity.E = (elbx) akisVar.aJ.b();
        gifBrowserActivity.F = akgbVar.e;
        gifBrowserActivity.I = (alct) akgbVar.bk.b();
        gifBrowserActivity.J = (cqoh) akgbVar.b.cz.b();
    }
}
