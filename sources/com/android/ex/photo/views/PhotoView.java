package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import defpackage.ktq;
import defpackage.qme;
import defpackage.qmf;
import defpackage.qmg;
import defpackage.qmh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhotoView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static int d;
    private static boolean e;
    private static Paint f;
    private static Paint g;
    public final Matrix a;
    public qmf b;
    public final RectF c;
    private final int h;
    private ktq i;
    private ScaleGestureDetector j;
    private View.OnClickListener k;
    private qmh l;
    private qmg m;
    private final RectF n;
    private final float[] o;
    private boolean p;
    private float q;
    private float r;
    private boolean s;

    public PhotoView(Context context) {
        super(context);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.n = new RectF();
        new RectF();
        this.c = new RectF();
        this.o = new float[9];
        e();
    }

    private final void e() {
        Context context = getContext();
        if (!e) {
            e = true;
            Resources resources = context.getApplicationContext().getResources();
            resources.getDimensionPixelSize(R.dimen.photo_crop_width);
            Paint paint = new Paint();
            f = paint;
            paint.setAntiAlias(true);
            f.setColor(resources.getColor(R.color.photo_crop_dim_color));
            f.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            g = paint2;
            paint2.setAntiAlias(true);
            g.setColor(resources.getColor(R.color.photo_crop_highlight_color));
            g.setStyle(Paint.Style.STROKE);
            g.setStrokeWidth(resources.getDimension(R.dimen.photo_crop_stroke_width));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            d = scaledTouchSlop * scaledTouchSlop;
        }
        this.i = new ktq(context, this, null);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.j = scaleGestureDetector;
        this.s = scaleGestureDetector.isQuickScaleEnabled();
        this.b = new qmf(this);
        this.l = new qmh(this);
        this.m = new qmg(this);
    }

    private final void f() {
        this.p = false;
    }

    public final float a() {
        this.a.getValues(this.o);
        return this.o[0];
    }

    public final int b(float f2, float f3) {
        this.c.set(this.n);
        this.a.mapRect(this.c);
        float width = getWidth();
        RectF rectF = this.c;
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = width + 0.0f;
        float max = f5 - f4 < f6 ? ((f6 - (f5 + f4)) / 2.0f) + 0.0f : Math.max(width - f5, Math.min(-f4, f2));
        float height = getHeight();
        RectF rectF2 = this.c;
        float f7 = rectF2.top;
        float f8 = rectF2.bottom;
        float f9 = height + 0.0f;
        float max2 = f8 - f7 < f9 ? ((f9 - (f8 + f7)) / 2.0f) + 0.0f : Math.max(height - f8, Math.min(-f7, f3));
        this.a.postTranslate(max, max2);
        invalidate();
        boolean z = max == f2;
        boolean z2 = max2 == f3;
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public final void c(float f2, float f3, float f4) {
        this.a.postRotate(0.0f, getWidth() / 2, getHeight() / 2);
        float min = Math.min(Math.max(f2, 0.0f), 0.0f);
        float a = a();
        if (min > 0.0f && a <= 0.0f) {
            postDelayed(new qme(this), 600L);
        }
        float f5 = min / a;
        this.a.postScale(f5, f5, f3, f4);
        this.a.postRotate(0.0f, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    public final void d() {
        this.c.set(this.n);
        this.a.mapRect(this.c);
        float width = getWidth();
        RectF rectF = this.c;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width + 0.0f;
        float f6 = f3 - f2 < f5 ? ((f5 - (f3 + f2)) / 2.0f) + 0.0f : f2 > 0.0f ? -f2 : f3 < width ? width - f3 : 0.0f;
        float height = getHeight();
        RectF rectF2 = this.c;
        float f7 = rectF2.top;
        float f8 = rectF2.bottom;
        float f9 = height + 0.0f;
        if (f8 - f7 < f9) {
            f4 = 0.0f + ((f9 - (f8 + f7)) / 2.0f);
        } else if (f7 > 0.0f) {
            f4 = -f7;
        } else if (f8 < height) {
            f4 = height - f8;
        }
        if (Math.abs(f6) <= 20.0f && Math.abs(f4) <= 20.0f) {
            this.a.postTranslate(f6, f4);
            invalidate();
            return;
        }
        qmg qmgVar = this.m;
        if (qmgVar.e) {
            return;
        }
        qmgVar.d = -1L;
        qmgVar.b = f6;
        qmgVar.c = f4;
        qmgVar.f = false;
        qmgVar.e = true;
        qmgVar.a.postDelayed(qmgVar, 250L);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == null) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.p = true;
        if (!this.s) {
            f();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.s && this.p) {
                    float x = motionEvent.getX() - this.q;
                    int y = (int) (motionEvent.getY() - this.r);
                    int i = (int) x;
                    if ((i * i) + (y * y) > d) {
                        this.p = false;
                        return false;
                    }
                }
            } else if (this.s) {
                f();
                return false;
            }
        } else if (this.s) {
            this.q = motionEvent.getX();
            this.r = motionEvent.getY();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getWidth();
        getHeight();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.h == -1) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.h);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.k;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.c;
        if (rectF == null) {
            return true;
        }
        rectF.contains(x, y);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.j;
        if (scaleGestureDetector != null && this.i != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.i.b(motionEvent);
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                boolean z = this.l.a;
                d();
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == null || super.verifyDrawable(drawable);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.n = new RectF();
        new RectF();
        this.c = new RectF();
        this.o = new float[9];
        e();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.n = new RectF();
        new RectF();
        this.c = new RectF();
        this.o = new float[9];
        e();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
