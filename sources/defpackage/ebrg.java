package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrg implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebrp a;

    public ebrg(ebrp ebrpVar) {
        this.a = ebrpVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.u(37);
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
