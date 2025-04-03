package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kw extends Drawable {
    private static final float b = (float) Math.toRadians(45.0d);
    public float a;
    private final Paint c;
    private final float d;
    private final float e;
    private final float f;
    private float g;
    private boolean h;
    private final Path i;
    private final int j;
    private float k;
    private final int l;

    public kw(Context context) {
        Paint paint = new Paint();
        this.c = paint;
        this.i = new Path();
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, kt.o, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(3, 0));
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.k = (float) ((dimension / 2.0f) * Math.cos(b));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.h != z) {
            this.h = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.g) {
            this.g = round;
            invalidateSelf();
        }
        this.j = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.d = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        if (i != this.c.getColor()) {
            this.c.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || getLayoutDirection() == 1)) {
            z = true;
        }
        float f = this.d;
        float f2 = f * f;
        float sqrt = (float) Math.sqrt(f2 + f2);
        float f3 = this.e;
        float f4 = this.a;
        float f5 = (sqrt - f3) * f4;
        float f6 = (this.f - f3) * f4;
        float round = Math.round(((this.k + 0.0f) * f4) + 0.0f);
        float f7 = b;
        float f8 = this.a;
        float f9 = (f7 + 0.0f) * f8;
        float f10 = true != z ? -180.0f : 0.0f;
        float f11 = f8 * 180.0f;
        double d = f9 + 0.0f;
        double d2 = f5 + f3;
        float round2 = Math.round(Math.cos(d) * d2);
        float round3 = Math.round(d2 * Math.sin(d));
        this.i.rewind();
        float strokeWidth = this.g + this.c.getStrokeWidth();
        float f12 = ((-this.k) - strokeWidth) * this.a;
        float f13 = f3 + f6;
        float f14 = (-f13) / 2.0f;
        this.i.moveTo(f14 + round, 0.0f);
        this.i.rLineTo(f13 - (round + round), 0.0f);
        float f15 = strokeWidth + f12;
        this.i.moveTo(f14, f15);
        this.i.rLineTo(round2, round3);
        this.i.moveTo(f14, -f15);
        this.i.rLineTo(round2, -round3);
        this.i.close();
        canvas.save();
        float strokeWidth2 = this.c.getStrokeWidth();
        float f16 = this.g;
        int height = ((int) ((bounds.height() - (3.0f * strokeWidth2)) - (f16 + f16))) / 4;
        canvas.translate(bounds.centerX(), height + height + (strokeWidth2 * 1.5f) + f16);
        if (this.h) {
            canvas.rotate((f10 + f11) * (true != z ? 1 : -1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.i, this.c);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.c.getAlpha()) {
            this.c.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.a != f) {
            this.a = f;
            invalidateSelf();
        }
    }
}
