package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpn extends Drawable {
    private static final LinearInterpolator d = new LinearInterpolator();
    public float a;
    public boolean b;
    public float c;
    private final ValueAnimator e;
    private final ValueAnimator f;
    private final Paint j;
    private final int k;
    private final dwee m;
    private final dweh n;
    private final RectF g = new RectF();
    private final Rect h = new Rect();
    private int o = PrivateKeyType.INVALID;
    private boolean p = false;
    private final float l = -1.0f;
    private final int i = -1;

    public dcpn(int i) {
        this.k = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcpk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dcpn dcpnVar = dcpn.this;
                dcpnVar.a = valueAnimator.getAnimatedFraction();
                dcpnVar.invalidateSelf();
            }
        });
        ofFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = d;
        ofFloat.setInterpolator(linearInterpolator);
        this.e = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcpk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dcpn dcpnVar = dcpn.this;
                dcpnVar.a = valueAnimator.getAnimatedFraction();
                dcpnVar.invalidateSelf();
            }
        });
        ofFloat2.addListener(new dcpm(this));
        ofFloat2.setDuration(750L);
        ofFloat2.setInterpolator(linearInterpolator);
        this.f = ofFloat2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.b = false;
        dwee dweeVar = new dwee();
        this.m = dweeVar;
        this.n = new dweh(dweeVar);
    }

    public final void a() {
        this.m.c(getLevel() / 10000.0d);
        dweh dwehVar = this.n;
        if (dwehVar.e) {
            if (dwehVar.f) {
                dwehVar.f = false;
                dwec.c().b(dwehVar.g);
            }
            dwehVar.e = false;
        }
        if (this.e.isStarted()) {
            this.e.cancel();
        }
        if (this.f.isStarted()) {
            this.f.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (!this.p) {
            this.c = getLevel() / 10000;
            dwee dweeVar = this.m;
            dweeVar.c(getLevel() / 10000.0d);
            dweeVar.b(this.c);
            dweeVar.l = true;
            dweeVar.d(new dcpl(this));
            this.p = true;
        }
        if (this.l == -1.0f) {
            rect = getBounds();
        } else {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            this.h.left = centerX - (getIntrinsicWidth() / 2);
            this.h.right = centerX + (getIntrinsicWidth() / 2);
            this.h.top = centerY - (getIntrinsicHeight() / 2);
            this.h.bottom = centerY + (getIntrinsicHeight() / 2);
            rect = this.h;
        }
        int i = this.k;
        float f = this.a;
        float f2 = i;
        float f3 = f2 * f;
        this.j.setStrokeWidth(f3);
        this.g.set(rect);
        float f4 = f2 - (f3 / 2.0f);
        this.g.inset(f4, f4);
        float width = this.g.width() / 2.0f;
        float f5 = this.c * 360.0f;
        this.j.setColor(this.i);
        int i2 = (int) (this.o * f);
        this.j.setAlpha((int) (i2 * 0.0f));
        canvas.drawOval(this.g, this.j);
        this.j.setAlpha(i2);
        float max = Math.max(f5, (float) (((width - f3) * 3.141592653589793d) / (f3 * 180.0f)));
        if (max >= 5.0f) {
            canvas.drawArc(this.g, -90.0f, max, false, this.j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        this.m.b(i / 10000.0d);
        dweh dwehVar = this.n;
        if (!dwehVar.e) {
            dwehVar.e = true;
            dwehVar.d = -1L;
            dwehVar.a();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.o) {
            this.o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.b;
        if (!z3 && !z2) {
            return false;
        }
        this.b = z;
        if (!z) {
            if (!z3) {
                a();
                return z3;
            }
            if (this.e.isRunning()) {
                this.f.setCurrentPlayTime(750 - this.e.getCurrentPlayTime());
                this.e.cancel();
            }
            this.f.start();
            return z3;
        }
        super.setVisible(true, z2);
        if (this.f.isRunning()) {
            this.e.setCurrentPlayTime(750 - this.f.getCurrentPlayTime());
            this.f.cancel();
        }
        if (!z2) {
            this.e.start();
            return z3;
        }
        a();
        this.e.start();
        return z3;
    }
}
