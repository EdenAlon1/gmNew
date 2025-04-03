package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewGroup.MarginLayoutParams c;

    public drwx(View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.a = view;
        this.b = view2;
        this.c = marginLayoutParams;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.getWidth();
        View view = this.a;
        View view2 = this.b;
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = height + this.c.topMargin;
        view2.setLayoutParams(marginLayoutParams);
    }
}
