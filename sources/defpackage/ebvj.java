package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebvj implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebvk a;
    private final eays b;

    public ebvj(ebvk ebvkVar, View view, int i) {
        this.a = ebvkVar;
        this.b = new ebvi(this, view, i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.c(this.b);
        eayo eayoVar = this.a.a;
        if (eayoVar.e()) {
            this.b.b(eayoVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.d(this.b);
    }
}
