package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebkv implements View.OnAttachStateChangeListener {
    final /* synthetic */ eavy a;
    final /* synthetic */ ebkw b;

    public ebkv(ebkw ebkwVar, eavy eavyVar) {
        this.a = eavyVar;
        this.b = ebkwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.a.f(this.a);
        this.a.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.a.k(this.a);
    }
}
