package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyp extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new ljm();
    private static final int[] g = {-16777216};
    public final oyo a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public oyp(Context context) {
        ksw.h(context);
        this.b = context.getResources();
        oyo oyoVar = new oyo();
        this.a = oyoVar;
        oyoVar.i = g;
        oyoVar.g();
        oyoVar.d(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new oym(this, oyoVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new oyn(this, oyoVar));
        this.i = ofFloat;
    }

    static final void e(float f2, oyo oyoVar) {
        if (f2 <= 0.75f) {
            oyoVar.t = oyoVar.a();
            return;
        }
        int a = oyoVar.a();
        int[] iArr = oyoVar.i;
        oyoVar.f();
        int i = iArr[0];
        int i2 = a >> 24;
        int i3 = a >> 16;
        int i4 = a >> 8;
        int i5 = a & PrivateKeyType.INVALID;
        int i6 = i >> 24;
        int i7 = i >> 16;
        int i8 = i >> 8;
        int i9 = i & PrivateKeyType.INVALID;
        int i10 = i8 & PrivateKeyType.INVALID;
        int i11 = i7 & PrivateKeyType.INVALID;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i12 = (i4 & PrivateKeyType.INVALID) + ((int) ((i10 - r4) * f3));
        int i13 = (i3 & PrivateKeyType.INVALID) + ((int) ((i11 - r3) * f3));
        oyoVar.t = (((i2 & PrivateKeyType.INVALID) + ((int) (f3 * ((i6 & PrivateKeyType.INVALID) - r2)))) << 24) | (i13 << 16) | (i12 << 8) | (i5 + ((int) ((i9 - i5) * f3)));
    }

    final void a(float f2, oyo oyoVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            e(f2, oyoVar);
            double floor = Math.floor(oyoVar.l / 0.8f) + 1.0d;
            float f4 = oyoVar.j;
            float f5 = oyoVar.k;
            oyoVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            oyoVar.f = f5;
            float f6 = oyoVar.l;
            oyoVar.g = f6 + ((((float) floor) - f6) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f7 = oyoVar.l;
            if (f2 < 0.5f) {
                interpolation = oyoVar.j;
                f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = oyoVar.j + 0.79f;
                interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = f7 + (0.20999998f * f2);
            float f10 = f2 + this.c;
            oyoVar.e = interpolation;
            oyoVar.f = f3;
            oyoVar.g = f9;
            this.h = f10 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        oyo oyoVar = this.a;
        if (f2 != oyoVar.o) {
            oyoVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        oyo oyoVar = this.a;
        oyoVar.e = 0.0f;
        oyoVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        oyo oyoVar = this.a;
        float f2 = oyoVar.p;
        float f3 = (oyoVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((oyoVar.q * oyoVar.o) / 2.0f, oyoVar.h / 2.0f);
        }
        RectF rectF = oyoVar.a;
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = oyoVar.e;
        float f5 = oyoVar.g;
        float f6 = f4 + f5;
        float f7 = oyoVar.f + f5;
        oyoVar.b.setColor(oyoVar.t);
        oyoVar.b.setAlpha(oyoVar.s);
        float f8 = oyoVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, oyoVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        float f10 = f6 * 360.0f;
        float f11 = (f7 * 360.0f) - f10;
        canvas.drawArc(rectF, f10, f11, false, oyoVar.b);
        if (oyoVar.m) {
            Path path = oyoVar.n;
            if (path == null) {
                oyoVar.n = new Path();
                oyoVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f12 = (oyoVar.q * oyoVar.o) / 2.0f;
            oyoVar.n.moveTo(0.0f, 0.0f);
            oyoVar.n.lineTo(oyoVar.q * oyoVar.o, 0.0f);
            Path path2 = oyoVar.n;
            float f13 = oyoVar.q;
            float f14 = oyoVar.o;
            path2.lineTo((f13 * f14) / 2.0f, oyoVar.r * f14);
            oyoVar.n.offset((min + rectF.centerX()) - f12, rectF.centerY() + (oyoVar.h / 2.0f));
            oyoVar.n.close();
            oyoVar.c.setColor(oyoVar.t);
            oyoVar.c.setAlpha(oyoVar.s);
            canvas.save();
            canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
            canvas.drawPath(oyoVar.n, oyoVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.e();
        oyo oyoVar = this.a;
        if (oyoVar.f != oyoVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            oyoVar.g();
            this.a.b();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.c(false);
        this.a.g();
        this.a.b();
        invalidateSelf();
    }
}
