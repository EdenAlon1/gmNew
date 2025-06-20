package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgh extends Drawable {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ehow h;
    private int o;
    private ColorStateList p;
    private final ehoy i = ehox.a;
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final ehgg n = new ehgg(this);
    public boolean g = true;

    public ehgh(ehow ehowVar) {
        this.h = ehowVar;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    protected final RectF a() {
        this.m.set(getBounds());
        return this.m;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            Paint paint = this.a;
            copyBounds(this.k);
            float height = this.b / r2.height();
            paint.setShader(new LinearGradient(0.0f, r2.top, 0.0f, r2.bottom, new int[]{kps.g(this.c, this.o), kps.g(this.d, this.o), kps.g(kps.h(this.d, 0), this.o), kps.g(kps.h(this.f, 0), this.o), kps.g(this.f, this.o), kps.g(this.e, this.o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.g = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        copyBounds(this.k);
        this.l.set(this.k);
        float min = Math.min(this.h.f.a(a()), this.l.width() / 2.0f);
        if (this.h.g(a())) {
            this.l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.l, min, min, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.h.g(a())) {
            outline.setRoundRect(getBounds(), this.h.f.a(a()));
        } else {
            copyBounds(this.k);
            this.l.set(this.k);
            this.i.b(this.h, this.l, this.j);
            ehfy.e(outline, this.j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.h.g(a())) {
            return true;
        }
        int round = Math.round(this.b);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.o)) != this.o) {
            this.g = true;
            this.o = colorForState;
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
