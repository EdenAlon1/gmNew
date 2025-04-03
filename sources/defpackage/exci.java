package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exci implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnWindowFocusChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnWindowAttachListener {
    private final exbz a;
    private final TextView b;
    private final int e;
    private final int f;
    private long g = System.currentTimeMillis() - 300;
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public exci(exbz exbzVar, TextView textView, int i, int i2) {
        this.a = exbzVar;
        this.b = textView;
        this.e = i;
        this.f = i2;
    }

    private final boolean a(boolean z, String str) {
        if (excj.f(this.b, z)) {
            return false;
        }
        excj.c(a.a(str, "TextViewListener.", ": Dismissing toolbar."));
        excj.b(this.a);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        a(true, "onGlobalFocusChanged");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!a(true, "onPreDraw") && this.a.i() && currentTimeMillis - this.g >= 300) {
            excj.e(this.d, this.b, this.e, this.f);
            if (!this.d.equals(this.c)) {
                this.c.set(this.d);
                this.a.e(this.c);
                this.a.g();
                this.g = currentTimeMillis;
            }
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        a(true, "onWindowAttached");
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        a(true, "onWindowDetached");
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        a(z, "onWindowFocusChanged");
    }
}
