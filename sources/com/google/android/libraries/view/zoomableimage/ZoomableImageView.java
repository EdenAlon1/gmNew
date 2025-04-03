package com.google.android.libraries.view.zoomableimage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import defpackage.dcsf;
import defpackage.dcst;
import defpackage.egyq;
import defpackage.egyr;
import defpackage.egys;
import defpackage.egyt;
import defpackage.ellj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ZoomableImageView extends AppCompatImageView {
    public final float a;
    public final float b;
    public final float c;
    public final Matrix d;
    public final Matrix e;
    public View.OnClickListener f;
    public egyt g;
    public AnimatorSet h;
    public AnimatorSet i;
    public dcst j;
    private final long k;
    private final long l;
    private final GestureDetector m;
    private final ScaleGestureDetector n;
    private final Matrix o;
    private Size p;
    private RectF q;
    private Insets r;
    private Path s;
    private float t;

    /* compiled from: PG */
    public class FlingAnimationHelper {
        public FlingAnimationHelper() {
        }

        public void setMatrixTranslateX(float f) {
            ZoomableImageView.this.e.postTranslate(f - new egyt(ZoomableImageView.this.e).a, 0.0f);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.b(zoomableImageView.e);
            ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
            zoomableImageView2.setImageMatrix(zoomableImageView2.e);
        }

        public void setMatrixTranslateY(float f) {
            ZoomableImageView.this.e.postTranslate(0.0f, f - new egyt(ZoomableImageView.this.e).b);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.b(zoomableImageView.e);
            ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
            zoomableImageView2.setImageMatrix(zoomableImageView2.e);
        }
    }

    /* compiled from: PG */
    public class ZoomWithAnimationHelper {
        public final PointF a = new PointF();

        public ZoomWithAnimationHelper() {
        }

        public void setMatrixScale(float f) {
            float f2 = f / new egyt(ZoomableImageView.this.e).c;
            PointF pointF = this.a;
            ZoomableImageView.this.e.postScale(f2, f2, pointF.x, pointF.y);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.setImageMatrix(zoomableImageView.e);
        }
    }

    public ZoomableImageView(Context context) {
        this(context, null);
    }

    private final RectF i(Matrix matrix) {
        egyt egytVar = new egyt(matrix);
        float f = egytVar.a;
        return new RectF(f, egytVar.b, (egytVar.c * this.p.getWidth()) + f, egytVar.b + (egytVar.c * this.p.getHeight()));
    }

    private final void j() {
        if (getWidth() == 0 || getHeight() == 0 || getDrawable() == null) {
            return;
        }
        Size size = new Size(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        this.p = size;
        if (size.getWidth() == 0 || this.p.getHeight() == 0) {
            return;
        }
        float width = getWidth();
        float width2 = this.p.getWidth();
        float height = getHeight();
        float height2 = this.p.getHeight();
        Matrix matrix = this.e;
        float min = Math.min(width / width2, height / height2);
        matrix.setScale(min, min);
        b(this.e);
        this.o.set(this.e);
        this.d.set(this.o);
        c();
        this.q = new RectF(getDrawable().copyBounds());
        this.g = new egyt(this.o);
        dcst dcstVar = this.j;
        if (dcstVar != null) {
            dcsf dcsfVar = new dcsf(a());
            View view = dcstVar.a.g.Q;
            view.getClass();
            ellj.g(dcsfVar, view);
        }
    }

    private final void k() {
        RectF rectF = new RectF();
        this.e.mapRect(rectF, this.q);
        this.s.reset();
        Path path = this.s;
        float f = this.t;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    private final void l(Matrix matrix, long j) {
        PointF pointF;
        b(matrix);
        Matrix matrix2 = this.e;
        RectF i = i(matrix2);
        RectF i2 = i(matrix);
        if (new egyt(matrix2).equals(new egyt(matrix))) {
            pointF = new PointF(i.centerX(), i.centerY());
        } else {
            pointF = new PointF(((i.left * i2.right) - (i.right * i2.left)) / (((i.left - i.right) + i2.right) - i2.left), ((i.top * i2.bottom) - (i.bottom * i2.top)) / (((i.top - i.bottom) + i2.bottom) - i2.top));
        }
        egyt egytVar = new egyt(this.e);
        egyt egytVar2 = new egyt(matrix);
        ZoomWithAnimationHelper zoomWithAnimationHelper = new ZoomWithAnimationHelper();
        zoomWithAnimationHelper.a.set(pointF);
        if (h()) {
            this.h.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(zoomWithAnimationHelper, "matrixScale", egytVar.c, egytVar2.c));
        this.h.setDuration(j);
        this.h.setInterpolator(new DecelerateInterpolator());
        this.h.start();
    }

    private static final float m(float f, float f2, int i, int i2) {
        float f3 = i2 - (f2 * i);
        if (f3 >= 0.0f) {
            f3 /= 2.0f;
        } else if (f >= f3) {
            f3 = f > 0.0f ? 0.0f : f;
        }
        return f3 - f;
    }

    public final Rect a() {
        if (getDrawable() == null) {
            return new Rect();
        }
        RectF rectF = new RectF();
        this.d.mapRect(rectF, this.q);
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public final void b(Matrix matrix) {
        egyt egytVar = new egyt(matrix);
        matrix.postTranslate(m(egytVar.a, egytVar.c, this.p.getWidth(), getWidth()), m(egytVar.b, egytVar.c, this.p.getHeight(), getHeight()));
    }

    public final void c() {
        int i;
        int i2;
        int i3;
        int i4;
        int width = getWidth();
        i = this.r.left;
        int i5 = width - i;
        i2 = this.r.right;
        int i6 = i5 - i2;
        int height = getHeight();
        i3 = this.r.top;
        int i7 = height - i3;
        i4 = this.r.bottom;
        int i8 = i7 - i4;
        if (i6 <= 0 || i8 <= 0 || getDrawable() == null || this.p.getWidth() == 0 || this.p.getHeight() == 0) {
            return;
        }
        float width2 = this.p.getWidth();
        float height2 = this.p.getHeight();
        Matrix matrix = this.o;
        float min = Math.min(i6 / width2, i8 / height2);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.setScale(min, min);
        b(matrix2);
        this.d.set(matrix2);
        l(this.d, this.l);
    }

    public final void d(int i) {
        this.s = new Path();
        this.t = i;
        k();
    }

    public final void e(int i, int i2, int i3, int i4) {
        Insets of;
        of = Insets.of(i, i2, i3, i4);
        this.r = of;
    }

    public final void f(Matrix matrix) {
        l(matrix, this.k);
    }

    public final boolean g() {
        egyt egytVar = this.g;
        if (egytVar != null) {
            return egytVar.c < new egyt(this.e).c;
        }
        return false;
    }

    public final boolean h() {
        AnimatorSet animatorSet = this.h;
        return animatorSet != null && animatorSet.isRunning();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.t > 0.0f) {
            canvas.clipPath(this.s);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(g());
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.i.cancel();
        }
        return super.onTouchEvent(motionEvent) | this.m.onTouchEvent(motionEvent) | this.n.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (getDrawable() != null) {
            j();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (getDrawable() != null) {
            j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        if (this.t > 0.0f) {
            k();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        if (getDrawable() == null) {
            j();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Insets insets;
        this.o = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = null;
        this.p = new Size(0, 0);
        this.q = new RectF();
        insets = Insets.NONE;
        this.r = insets;
        this.s = new Path();
        setScaleType(ImageView.ScaleType.MATRIX);
        setClickable(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, egyq.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getFloat(4, 5.0f);
            this.k = obtainStyledAttributes.getInt(3, 300);
            this.l = obtainStyledAttributes.getInt(2, 165);
            this.b = obtainStyledAttributes.getFloat(0, 0.5f);
            this.c = obtainStyledAttributes.getFloat(1, -0.002f);
            obtainStyledAttributes.recycle();
            this.m = new GestureDetector(context, new egyr(this));
            this.n = new ScaleGestureDetector(context, new egys(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
