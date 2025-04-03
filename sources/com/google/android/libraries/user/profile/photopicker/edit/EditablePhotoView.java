package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import defpackage.dvxi;
import defpackage.egka;
import defpackage.egkb;
import defpackage.egkh;
import defpackage.egki;
import defpackage.egkl;
import defpackage.fazf;
import defpackage.fdrm;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EditablePhotoView extends egkh {
    private final Matrix A;
    private final Matrix B;
    private boolean C;
    private final Path D;
    private final RectF E;
    private final float[] F;
    private int G;
    private int H;
    private int I;
    private int J;
    public Drawable a;
    public final Matrix b;
    public final Rect c;
    float d;
    GestureDetector e;
    public boolean f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public long l;
    public ValueAnimator m;
    public boolean n;
    public final RectF o;
    public final RectF p;
    public egkl q;
    public dvxi r;
    public ScaleGestureDetector s;
    final ScaleGestureDetector.OnScaleGestureListener t;
    final GestureDetector.SimpleOnGestureListener u;
    private Paint w;
    private Paint x;
    private int y;
    private final Matrix z;

    public EditablePhotoView(Context context) {
        super(context);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new egka(this);
        this.u = new egkb(this);
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        Context context = getContext();
        if (!this.v) {
            ((fazf) context).ab().a(this);
        }
        Resources resources = context.getApplicationContext().getResources();
        this.y = resources.getColor(R.color.photo_picker_edit_background);
        Paint paint = new Paint();
        this.w = paint;
        paint.setAntiAlias(true);
        this.w.setColor(resources.getColor(R.color.photo_picker_edit_crop_dim));
        this.w.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setAntiAlias(true);
        this.x.setColor(resources.getColor(R.color.photo_picker_edit_crop_highlight));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_border_stroke_width));
        this.e = new GestureDetector(context, this.u, null, !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"));
        this.s = new ScaleGestureDetector(context, this.t);
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fdrm.m() ? b() : a())));
    }

    private final void j(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, egki.a, 0, 0);
        try {
            this.G = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.H = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.I = obtainStyledAttributes.getDimensionPixelSize(4, 0) + obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.J = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        this.b.postRotate(-this.q.k, this.c.centerX(), this.c.centerY());
        this.b.getValues(this.F);
        float f = this.F[0];
        this.b.postRotate(this.q.k, this.c.centerX(), this.c.centerY());
        return f;
    }

    public final float b() {
        if (this.i != 0.0f) {
            return a() / this.i;
        }
        return 1.0f;
    }

    public final void c() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.a = null;
        this.f = false;
    }

    public final void d(boolean z) {
        Drawable drawable = this.a;
        if (drawable == null || !this.C) {
            return;
        }
        this.a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        if (z || (this.i == 0.0f && this.a != null && this.C)) {
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            Rect rect = this.c;
            int i = rect.right - rect.left;
            Rect rect2 = this.c;
            int i2 = rect2.bottom - rect2.top;
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            this.o.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.d = f3;
            float f4 = i2;
            float f5 = i;
            if (f3 > f4 / f5) {
                Rect rect3 = this.c;
                this.E.set(this.c.left, r1 - r7, this.c.right, ((rect3.top + rect3.bottom) / 2) + (Math.round(f5 * this.d) / 2));
            } else {
                Rect rect4 = this.c;
                this.E.set(r1 - r7, this.c.top, ((rect4.right + rect4.left) / 2) + (Math.round(f4 / this.d) / 2), this.c.bottom);
            }
            this.b.setRectToRect(this.o, this.E, Matrix.ScaleToFit.CENTER);
            this.b.getValues(this.F);
            float f6 = this.F[0];
            this.i = f6;
            this.j = f6 * ((float) fdrm.a.get().a());
            this.z.set(this.b);
            this.z.invert(this.A);
            this.b.preConcat(this.q.l);
        }
    }

    public final void f() {
        this.B.setConcat(this.A, this.b);
        this.q.l = this.B;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.y);
        if (this.a == null) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
        this.p.set(this.a.getBounds());
        this.b.mapRect(this.p);
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.w);
        canvas.save();
        canvas.clipPath(this.D);
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(this.c, this.x);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.C = true;
        int width = getWidth();
        int height = getHeight();
        int i5 = (width - this.G) - this.H;
        int min = Math.min(i5, (height - this.I) - this.J);
        int i6 = i5 - min;
        int[] iArr = kvo.a;
        int i7 = (getLayoutDirection() == 0 ? this.G : this.H) + (i6 / 2);
        int i8 = this.I;
        this.c.set(i7, i8, i7 + min, min + i8);
        this.D.reset();
        this.D.addCircle(this.c.centerX(), this.c.centerY(), this.c.width() / 2.0f, Path.Direction.CCW);
        d(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r0 != 6) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.ScaleGestureDetector r0 = r6.s
            r1 = 1
            if (r0 == 0) goto L61
            android.view.GestureDetector r2 = r6.e
            if (r2 != 0) goto La
            goto L61
        La:
            boolean r2 = r6.f
            if (r2 == 0) goto L61
            r0.onTouchEvent(r7)
            android.view.GestureDetector r0 = r6.e
            r0.onTouchEvent(r7)
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L5b
            if (r0 == r1) goto L25
            r2 = 5
            if (r0 == r2) goto L5b
            r2 = 6
            if (r0 == r2) goto L25
            goto L61
        L25:
            int r0 = r6.g
            int r2 = r7.getPointerCount()
            int r2 = r2 + (-1)
            int r0 = r0 - r2
            r6.g = r0
            int r0 = r7.getPointerCount()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L41
            long r4 = r7.getEventTime()
            r6.l = r4
            r6.h = r3
            goto L4b
        L41:
            int r7 = r7.getPointerCount()
            if (r7 != r1) goto L4b
            r4 = 0
            r6.l = r4
        L4b:
            boolean r7 = r6.n
            if (r7 == 0) goto L61
            dvxi r7 = r6.r
            dvxh r0 = defpackage.dvxh.c()
            r7.a(r0, r6)
            r6.n = r3
            goto L61
        L5b:
            int r7 = r7.getPointerCount()
            r6.g = r7
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new egka(this);
        this.u = new egkb(this);
        j(context, attributeSet);
        i();
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new egka(this);
        this.u = new egkb(this);
        j(context, attributeSet);
        i();
    }
}
