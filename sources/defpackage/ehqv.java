package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqv implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public ehqv(BaseTransientBottomBar baseTransientBottomBar, View view) {
        this.b = new WeakReference(baseTransientBottomBar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    public final void a() {
        if (this.a.get() != null) {
            ((View) this.a.get()).removeOnAttachStateChangeListener(this);
            ehjg.j((View) this.a.get(), this);
        }
        this.a.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.b.get();
        String str = BaseTransientBottomBar.b;
        if (baseTransientBottomBar.l) {
            ((BaseTransientBottomBar) this.b.get()).h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        ehjg.h(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        ehjg.j(view, this);
    }
}
