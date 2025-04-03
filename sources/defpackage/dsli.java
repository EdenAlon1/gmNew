package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsli implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public dsli(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.a;
        view.getWidth();
        this.a.getHeight();
        ((ViewGroup) view).addView(this.b);
    }
}
