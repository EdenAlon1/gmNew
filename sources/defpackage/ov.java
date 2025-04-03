package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ov implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ox a;

    public ov(ox oxVar) {
        this.a = oxVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.x()) {
            ox oxVar = this.a;
            if (oxVar.a.q) {
                return;
            }
            View view = oxVar.c;
            if (view == null || !view.isShown()) {
                this.a.m();
            } else {
                this.a.a.v();
            }
        }
    }
}
