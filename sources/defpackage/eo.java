package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eo implements View.OnAttachStateChangeListener {
    final /* synthetic */ gc a;
    final /* synthetic */ ep b;

    public eo(ep epVar, gc gcVar) {
        this.b = epVar;
        this.a = gcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        gc gcVar = this.a;
        gcVar.e();
        hj.d((ViewGroup) gcVar.a.Q.getParent(), this.b.a).g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
