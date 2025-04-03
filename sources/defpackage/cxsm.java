package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxsm implements View.OnAttachStateChangeListener {
    final /* synthetic */ ffbr a;
    final /* synthetic */ cxsr b;

    public cxsm(cxsr cxsrVar, ffbr ffbrVar) {
        this.a = ffbrVar;
        this.b = cxsrVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((ctyx) this.a.b()).m(this.b.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((ctyx) this.a.b()).o(this.b.f);
    }
}
