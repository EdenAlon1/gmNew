package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcgg extends dbxx {
    private boolean K = false;

    public dcgg() {
        y(new dcgf(this));
    }

    @Override // defpackage.dbya, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        GalleryBrowserActivity galleryBrowserActivity = (GalleryBrowserActivity) this;
        akgb akgbVar = (akgb) aX();
        galleryBrowserActivity.t = (cqoh) akgbVar.b.cz.b();
        galleryBrowserActivity.u = (cwqc) akgbVar.e.b();
        galleryBrowserActivity.v = akgbVar.g;
        galleryBrowserActivity.w = (bcqg) akgbVar.b.cZ.b();
        galleryBrowserActivity.x = (crjx) akgbVar.b.a.r.b();
        galleryBrowserActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        galleryBrowserActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        galleryBrowserActivity.A = akkpVar.DA;
        galleryBrowserActivity.B = akkpVar.ft;
        galleryBrowserActivity.C = akisVar.cT;
        galleryBrowserActivity.D = akgbVar.j;
        galleryBrowserActivity.E = (elbx) akisVar.aJ.b();
        galleryBrowserActivity.F = akgbVar.e;
        galleryBrowserActivity.I = (alct) akgbVar.bk.b();
        galleryBrowserActivity.J = (cqoh) akgbVar.b.cz.b();
    }
}
