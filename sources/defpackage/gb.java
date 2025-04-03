package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gb implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;

    public gb(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        int[] iArr = kvo.a;
        kvb.c(this.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
