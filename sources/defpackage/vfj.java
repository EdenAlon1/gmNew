package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfj implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if ((view instanceof cwqp) && view.getVisibility() == 0) {
            ((cwqp) view).e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
