package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class arcq implements View.OnAttachStateChangeListener {
    final /* synthetic */ arcs a;

    public arcq(arcs arcsVar) {
        this.a = arcsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view.equals(this.a.g)) {
            this.a.e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
