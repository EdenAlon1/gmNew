package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmo implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ dwna a;

    public dwmo(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dwna dwnaVar = this.a;
        View view = dwnaVar.h;
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0) {
            dwnaVar.d(6);
            return;
        }
        Rect rect = new Rect();
        dwnaVar.h.getGlobalVisibleRect(rect);
        if (rect.equals(dwnaVar.I)) {
            return;
        }
        dwnaVar.I = rect;
        Rect rect2 = new Rect();
        dwnaVar.h.getRootView().getGlobalVisibleRect(rect2);
        if (rect2.contains(dwnaVar.I)) {
            dwnaVar.requestLayout();
        } else {
            dwnaVar.d(6);
        }
    }
}
