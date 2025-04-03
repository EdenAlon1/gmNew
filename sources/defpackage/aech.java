package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aech implements View.OnAttachStateChangeListener {
    final /* synthetic */ aedh a;

    public aech(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aedh.e(this.a.b).getViewTreeObserver().removeOnGlobalLayoutListener(this.a.aY);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
