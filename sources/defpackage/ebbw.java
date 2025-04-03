package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbw implements View.OnAttachStateChangeListener {
    final /* synthetic */ eays a;
    final /* synthetic */ ebbx b;

    public ebbw(ebbx ebbxVar, eays eaysVar) {
        this.a = eaysVar;
        this.b = ebbxVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.b.c(this.a);
        if (this.b.b.e()) {
            this.a.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.b.d(this.a);
    }
}
