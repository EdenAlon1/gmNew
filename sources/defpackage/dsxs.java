package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxs implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    public dsxs(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.a;
        view.getWidth();
        view.setTranslationY(-this.a.getHeight());
        view.setElevation(ffmk.g(this.b >> 3, r1));
    }
}
