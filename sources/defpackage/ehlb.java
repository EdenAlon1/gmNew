package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import defpackage.ehlc;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehlb<S extends ehlc> extends ProgressBar {
    public final ehlc a;
    public int b;
    public boolean c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final int k;
    private final pbt l;
    private final pbt m;

    protected ehlb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = new ehkx(this);
        this.i = new ehky(this);
        this.l = new ehkz(this);
        this.m = new ehla(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = ehiz.a(context2, attributeSet, ehml.a, i, i2, new int[0]);
        this.k = a.getInt(7, -1);
        this.d = Math.min(a.getInt(5, -1), 1000);
        a.recycle();
        this.j = true;
    }

    private final ehlz i() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().a;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract ehlc a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ehls getProgressDrawable() {
        return (ehls) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ehmb getIndeterminateDrawable() {
        return (ehmb) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.j) {
            ((ehlw) getCurrentDrawable()).l(h(), false, z);
        }
    }

    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void f(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = false;
            this.f = true;
            if (!getIndeterminateDrawable().isVisible() || ehkw.a(getContext().getContentResolver()) == 0.0f) {
                this.l.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.c();
            }
        }
    }

    public final void g() {
        if (this.k <= 0) {
            this.h.run();
        } else {
            removeCallbacks(this.h);
            postDelayed(this.h, this.k);
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    final boolean h() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.l);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.m);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.m);
        }
        if (h()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((ehlw) getCurrentDrawable()).n();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.m);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.m);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        ehlz i3 = i();
        if (i3 == null) {
            return;
        }
        setMeasuredDimension(i3.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : i3.b() + getPaddingLeft() + getPaddingRight(), i3.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : i3.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((ehlw) currentDrawable).n();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((ehlw) currentDrawable2).l(h(), false, false);
        }
        if ((currentDrawable2 instanceof ehmb) && h()) {
            ((ehmb) currentDrawable2).b.d();
        }
        this.f = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof ehmb)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((ehlw) drawable).n();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        f(i, false);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof ehls)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            ehls ehlsVar = (ehls) drawable;
            ehlsVar.n();
            super.setProgressDrawable(ehlsVar);
            ehlsVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
