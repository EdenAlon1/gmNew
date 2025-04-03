package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehta implements View.OnAttachStateChangeListener {
    final /* synthetic */ ehtc a;

    public ehta(ehtc ehtcVar) {
        this.a = ehtcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.h();
    }
}
