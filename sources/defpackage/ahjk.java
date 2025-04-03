package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjk implements View.OnAttachStateChangeListener {
    final /* synthetic */ ahjl a;

    public ahjk(ahjl ahjlVar) {
        this.a = ahjlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ahjl ahjlVar = this.a;
        ahjlVar.a.l(-1);
        ahjlVar.a.d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ahjl ahjlVar = this.a;
        if (ahjlVar.a.o()) {
            ahjlVar.a.c();
        }
    }
}
