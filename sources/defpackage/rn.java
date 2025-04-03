package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rn implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ rp a;

    public rn(rp rpVar) {
        this.a = rpVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        rt rtVar = this.a.d;
        if (!rtVar.isAttachedToWindow() || !rtVar.getGlobalVisibleRect(this.a.c)) {
            this.a.m();
        } else {
            this.a.n();
            super/*uo*/.v();
        }
    }
}
