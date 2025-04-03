package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukt implements ViewTreeObserver.OnGlobalLayoutListener {
    private View a;
    private duks b;

    public final void a() {
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.a = null;
        this.b = null;
    }

    public final void b(duks duksVar, View view) {
        this.b = duksVar;
        this.a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Point B = this.b.B();
        this.a.measure(B.x, B.y);
        this.b.E(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        a();
    }
}
