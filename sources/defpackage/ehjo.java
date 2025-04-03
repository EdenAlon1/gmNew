package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehjo implements OnBackAnimationCallback {
    final /* synthetic */ ehjl a;
    final /* synthetic */ ehjp b;

    public ehjo(ehjp ehjpVar, ehjl ehjlVar) {
        this.a = ehjlVar;
        this.b = ehjpVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.x();
        }
    }

    public final void onBackInvoked() {
        this.a.z();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.H(new aak(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.F(new aak(backEvent));
        }
    }
}
