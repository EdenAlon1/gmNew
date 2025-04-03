package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcge extends dbxx {
    private boolean K = false;

    public dcge() {
        y(new dcgd(this));
    }

    @Override // defpackage.dbya, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        CameraActivity cameraActivity = (CameraActivity) this;
        akgb akgbVar = (akgb) aX();
        cameraActivity.t = (cqoh) akgbVar.b.cz.b();
        cameraActivity.u = (cwqc) akgbVar.e.b();
        cameraActivity.v = akgbVar.g;
        cameraActivity.w = (bcqg) akgbVar.b.cZ.b();
        cameraActivity.x = (crjx) akgbVar.b.a.r.b();
        cameraActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        cameraActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        cameraActivity.A = akkpVar.DA;
        cameraActivity.B = akkpVar.ft;
        cameraActivity.C = akisVar.cT;
        cameraActivity.D = akgbVar.j;
        cameraActivity.E = (elbx) akisVar.aJ.b();
        cameraActivity.F = akgbVar.e;
        cameraActivity.I = (alct) akgbVar.bk.b();
        cameraActivity.J = (cqoh) akgbVar.b.cz.b();
    }
}
