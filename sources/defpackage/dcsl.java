package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcsl extends cwps {
    private boolean n = false;

    public dcsl() {
        y(new dcsk(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MediaViewerActivity mediaViewerActivity = (MediaViewerActivity) this;
        akgb akgbVar = (akgb) aX();
        mediaViewerActivity.t = (cqoh) akgbVar.b.cz.b();
        mediaViewerActivity.u = (cwqc) akgbVar.e.b();
        mediaViewerActivity.v = akgbVar.g;
        mediaViewerActivity.w = (bcqg) akgbVar.b.cZ.b();
        mediaViewerActivity.x = (crjx) akgbVar.b.a.r.b();
        mediaViewerActivity.y = akgbVar.h;
        mediaViewerActivity.z = akgbVar.b.b.nH;
    }
}
