package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddag implements ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ ddae a;

    public ddag(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.a.l();
        }
    }
}
