package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebag implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebai a;

    public ebag(ebai ebaiVar) {
        this.a = ebaiVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ebai ebaiVar = this.a;
        ebbc ebbcVar = ((ebbg) ebaiVar.a).b;
        if (ebbcVar.e()) {
            ebaiVar.a(ebbcVar.a());
        }
        this.a.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
