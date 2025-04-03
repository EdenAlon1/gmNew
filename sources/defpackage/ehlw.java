package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ehlw extends Drawable implements Animatable {
    private static final Property a = new ehlv(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    private float e;
    final Context i;
    final ehlc j;
    public List l;
    public boolean m;
    public int o;
    private final float d = -1.0f;
    final Paint n = new Paint();
    final Rect p = new Rect();
    final ehkw k = new ehkw();

    public ehlw(Context context, ehlc ehlcVar) {
        this.i = context;
        this.j = ehlcVar;
        setAlpha(PrivateKeyType.INVALID);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.m;
        this.m = true;
        valueAnimatorArr[0].end();
        this.m = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ehlw, Float>) a, 0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(egyv.b);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator;
            valueAnimator.addListener(new ehlt(this));
        }
        if (this.c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ehlw, Float>) a, 1.0f, 0.0f);
            this.c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.c.setInterpolator(egyv.b);
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator2;
            valueAnimator2.addListener(new ehlu(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.b : this.c;
        ValueAnimator valueAnimator4 = z ? this.c : this.b;
        if (!z3) {
            if (valueAnimator4.isRunning()) {
                boolean z4 = this.m;
                this.m = true;
                valueAnimator4.cancel();
                this.m = z4;
            }
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                a(valueAnimator3);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator3.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        if (!(z ? this.j.d() : this.j.c())) {
            a(valueAnimator3);
            return z5;
        }
        if (z2 || !valueAnimator3.isPaused()) {
            valueAnimator3.start();
            return z5;
        }
        valueAnimator3.resume();
        return z5;
    }

    final float f() {
        if (this.j.d() || this.j.c()) {
            return this.e;
        }
        return 1.0f;
    }

    final float g() {
        float f = this.d;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof ehls;
        if (this.j.b(z) && this.j.k != 0) {
            float a2 = ehkw.a(this.i.getContentResolver());
            if (a2 > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((z ? this.j.h : this.j.i) * 1000.0f) / this.j.k) * a2));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(pbt pbtVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        if (this.l.contains(pbtVar)) {
            return;
        }
        this.l.add(pbtVar);
    }

    final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k() || j();
    }

    public final boolean j() {
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean k() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float a2 = ehkw.a(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && a2 > 0.0f) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n() {
        l(false, false, false);
    }

    public final void o(pbt pbtVar) {
        List list = this.l;
        if (list == null || !list.contains(pbtVar)) {
            return;
        }
        this.l.remove(pbtVar);
        if (this.l.isEmpty()) {
            this.l = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
