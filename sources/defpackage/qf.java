package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ActivityChooserView a;

    public qf(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.c()) {
            if (!this.a.isShown()) {
                this.a.a().m();
                return;
            }
            this.a.a().v();
            kte kteVar = this.a.h;
            if (kteVar != null) {
                kteVar.subUiVisibilityChanged(true);
            }
        }
    }
}
