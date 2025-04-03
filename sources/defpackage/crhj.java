package defpackage;

import com.google.android.apps.messaging.shared.ui.AsyncImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crhj implements Runnable {
    final /* synthetic */ AsyncImageView a;

    public crhj(AsyncImageView asyncImageView) {
        this.a = asyncImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.g()) {
            AsyncImageView asyncImageView = this.a;
            asyncImageView.c = (cbbi) ((cbat) asyncImageView.a.a()).d();
        }
        this.a.e();
        this.a.b();
        crhk crhkVar = this.a.d;
        if (crhkVar != null) {
            crhkVar.c();
            this.a.d = null;
        }
    }
}
