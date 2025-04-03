package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import defpackage.dvxi;
import defpackage.efwh;
import defpackage.efwt;
import defpackage.efwu;
import defpackage.efwv;
import defpackage.efxa;
import defpackage.efxb;
import defpackage.efxc;
import defpackage.ewmc;
import defpackage.ewmd;
import defpackage.fazf;
import defpackage.fdrj;
import defpackage.fdrm;
import defpackage.kvo;
import defpackage.ljm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EditableArtView extends efxa {
    private Paint A;
    private Paint B;
    private Paint C;
    private int D;
    private final Matrix E;
    private final Matrix F;
    private final Matrix G;
    private boolean H;
    private boolean I;
    private final Path J;
    private float K;
    private ValueAnimator L;
    private final RectF M;
    private final float[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    public final List a;
    public final Matrix b;
    public final Rect c;
    public final Rect d;
    public final Path e;
    public final Path f;
    float g;
    GestureDetector h;
    public boolean i;
    boolean j;
    public int k;
    public boolean l;
    public float m;
    public boolean n;
    public long o;
    public boolean p;
    public final RectF q;
    public final RectF r;
    public efxc s;
    public dvxi t;
    public ScaleGestureDetector u;
    final ScaleGestureDetector.OnScaleGestureListener v;
    final GestureDetector.SimpleOnGestureListener w;
    public int x;
    public efwh y;

    public EditableArtView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new efwt(this);
        this.w = new efwu(this);
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v() {
        Context context = getContext();
        if (!this.z) {
            ((fazf) context).ab().a(this);
        }
        Resources resources = context.getApplicationContext().getResources();
        this.D = resources.getColor(R.color.photo_picker_edit_background);
        Paint paint = new Paint();
        this.A = paint;
        paint.setAntiAlias(true);
        this.A.setColor(resources.getColor(R.color.photo_picker_edit_crop_dim));
        this.A.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.B = paint2;
        paint2.setAntiAlias(true);
        this.B.setColor(resources.getColor(R.color.photo_picker_edit_crop_highlight));
        this.B.setStyle(Paint.Style.STROKE);
        this.B.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_border_stroke_width));
        Paint paint3 = new Paint();
        this.C = paint3;
        paint3.setAntiAlias(true);
        this.C.setColor(resources.getColor(R.color.photo_picker_edit_crop_frame));
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_frame_stroke_width));
        this.h = new GestureDetector(context, this.w, null, !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"));
        this.u = new ScaleGestureDetector(context, this.v);
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fdrm.m() ? b() : a())));
    }

    private final void w(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, efxb.b, 0, 0);
        try {
            this.O = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.P = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.Q = obtainStyledAttributes.getDimensionPixelSize(4, 0) + obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.R = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        this.b.postRotate(-this.s.k, this.c.centerX(), this.c.centerY());
        this.b.getValues(this.N);
        float f = this.N[0];
        this.b.postRotate(this.s.k, this.c.centerX(), this.c.centerY());
        return f;
    }

    public final float b() {
        if (this.m != 0.0f) {
            return a() / this.m;
        }
        return 1.0f;
    }

    public final int c() {
        return ((Drawable) this.a.get(0)).getIntrinsicHeight();
    }

    public final int d() {
        return ((Drawable) this.a.get(0)).getIntrinsicWidth();
    }

    public final void f(Rect rect) {
        float width = (rect.top - this.r.top) / this.r.width();
        float width2 = (rect.left - this.r.left) / this.r.width();
        float width3 = rect.width() / this.r.width();
        float width4 = rect.width() / this.r.width();
        ewmc ewmcVar = (ewmc) ewmd.a.createBuilder();
        ewmcVar.copyOnWrite();
        ewmd ewmdVar = (ewmd) ewmcVar.instance;
        ewmdVar.b |= 1;
        ewmdVar.c = width2;
        ewmcVar.copyOnWrite();
        ewmd ewmdVar2 = (ewmd) ewmcVar.instance;
        ewmdVar2.b |= 2;
        ewmdVar2.d = width;
        ewmcVar.copyOnWrite();
        ewmd ewmdVar3 = (ewmd) ewmcVar.instance;
        ewmdVar3.b |= 8;
        ewmdVar3.f = width + width3;
        ewmcVar.copyOnWrite();
        ewmd ewmdVar4 = (ewmd) ewmcVar.instance;
        ewmdVar4.b |= 4;
        ewmdVar4.e = width2 + width4;
        g((ewmd) ewmcVar.build());
    }

    public final void g(ewmd ewmdVar) {
        RectF rectF = this.r;
        float f = rectF.right - rectF.left;
        float f2 = (ewmdVar.c * f) + this.r.left;
        float f3 = (ewmdVar.e * f) + this.r.left;
        Rect rect = this.c;
        float f4 = (rect.right - rect.left) / (f3 - f2);
        this.b.postScale(f4, f4, this.c.centerX(), this.c.centerY());
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fdrm.m() ? b() : a())));
        this.r.set(this.q);
        this.b.mapRect(this.r);
        RectF rectF2 = this.r;
        float f5 = rectF2.right - rectF2.left;
        this.b.postTranslate(this.c.left - ((ewmdVar.c * f5) + this.r.left), this.c.top - ((ewmdVar.d * f5) + this.r.top));
        invalidate();
        s();
    }

    public final void h() {
        if (!this.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).setCallback(null);
            }
        }
        this.a.clear();
    }

    public final void i(boolean z) {
        if (this.a.isEmpty() || !this.H) {
            return;
        }
        int d = d();
        int c = c();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setBounds(0, 0, d, c);
        }
        if (this.I || z || (this.m == 0.0f && !this.a.isEmpty() && this.H)) {
            int d2 = d();
            int c2 = c();
            Rect rect = this.c;
            int i = rect.right - rect.left;
            Rect rect2 = this.c;
            int i2 = rect2.bottom - rect2.top;
            this.I = false;
            float f = d2;
            float f2 = c2;
            this.q.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.g = f3;
            float f4 = i2;
            float f5 = i;
            if (f3 > f4 / f5) {
                Rect rect3 = this.c;
                this.M.set(this.c.left, r0 - r7, this.c.right, ((rect3.top + rect3.bottom) / 2) + (Math.round(f5 * this.g) / 2));
            } else {
                Rect rect4 = this.c;
                this.M.set(r1 - r7, this.c.top, ((rect4.right + rect4.left) / 2) + (Math.round(f4 / this.g) / 2), this.c.bottom);
            }
            this.b.setRectToRect(this.q, this.M, Matrix.ScaleToFit.CENTER);
            this.b.getValues(this.N);
            float f6 = this.N[0];
            this.m = f6;
            this.K = f6 * ((float) fdrj.a());
            this.E.set(this.b);
            this.E.invert(this.F);
            this.b.preConcat(this.s.l);
        }
    }

    public final void j(Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas);
        }
    }

    public final void k(boolean z) {
        this.j = z;
        invalidate();
    }

    public final void l() {
        this.b.set(this.E);
        if (fdrj.g()) {
            this.s.k = 0.0f;
        }
        invalidate();
        s();
    }

    public final void m(float f) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final Matrix matrix = new Matrix(this.b);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
            this.L = ofFloat;
            ofFloat.setInterpolator(new ljm());
            this.L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: efws
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    EditableArtView editableArtView = EditableArtView.this;
                    editableArtView.b.set(matrix);
                    editableArtView.b.postRotate(floatValue, editableArtView.c.centerX(), editableArtView.c.centerY());
                    editableArtView.invalidate();
                    editableArtView.s();
                }
            });
            this.L.addListener(new efwv(this, matrix, f));
            this.L.setDuration(fdrm.c());
            this.L.start();
        }
    }

    public final void n(int i, float f) {
        double d = f;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        float f2 = (cos * (-0.715f)) + 0.715f;
        float f3 = ((-0.072f) * cos) + 0.072f;
        float f4 = ((-0.213f) * cos) + 0.213f;
        ((Drawable) this.a.get(i)).setColorFilter(new ColorMatrixColorFilter(new float[]{(0.787f * cos) + 0.213f + (sin * (-0.213f)), ((-0.715f) * sin) + f2, (sin * 0.928f) + f3, 0.0f, 0.0f, (0.143f * sin) + f4, (0.285f * cos) + 0.715f + (0.14f * sin), f3 + ((-0.283f) * sin), 0.0f, 0.0f, f4 + ((-0.787f) * sin), f2 + (0.715f * sin), (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        invalidate();
    }

    public final void o(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.m), this.K) / a();
        this.b.postScale(min, min, f2, f3);
        r();
        invalidate();
        s();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.D);
        if (this.a.isEmpty()) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(this.b);
        j(canvas);
        canvas.restoreToCount(saveCount);
        this.r.set(((Drawable) this.a.get(0)).getBounds());
        this.b.mapRect(this.r);
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.A);
        canvas.save();
        canvas.clipPath(this.f);
        canvas.concat(this.b);
        j(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(this.d, this.B);
        if (this.j) {
            if (this.x != 1) {
                int width = this.d.width() / 3;
                canvas.drawLine(this.d.left, this.d.top + width, this.d.right, this.d.top + width, this.B);
                canvas.drawLine(this.d.left, this.d.bottom - width, this.d.right, this.d.bottom - width, this.B);
                canvas.drawLine(this.d.left + width, this.d.top, this.d.left + width, this.d.bottom, this.B);
                canvas.drawLine(this.d.right - width, this.d.top, this.d.right - width, this.d.bottom, this.B);
            }
            int width2 = this.d.width() / 9;
            this.J.reset();
            this.J.moveTo(this.d.left, this.d.top + width2);
            float f = -width2;
            this.J.rLineTo(0.0f, f);
            float f2 = width2;
            this.J.rLineTo(f2, 0.0f);
            this.J.moveTo(this.d.right - width2, this.d.top);
            this.J.rLineTo(f2, 0.0f);
            this.J.rLineTo(0.0f, f2);
            this.J.moveTo(this.d.right, this.d.bottom - width2);
            this.J.rLineTo(0.0f, f2);
            this.J.rLineTo(f, 0.0f);
            this.J.moveTo(this.d.left + width2, this.d.bottom);
            this.J.rLineTo(f, 0.0f);
            this.J.rLineTo(0.0f, f);
            canvas.drawPath(this.J, this.C);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.H = true;
        int width = getWidth();
        int height = getHeight();
        int i5 = (width - this.O) - this.P;
        int i6 = (height - this.Q) - this.R;
        int min = Math.min(i5, i6);
        int i7 = i5 - min;
        int i8 = i6 - min;
        int[] iArr = kvo.a;
        int i9 = (getLayoutDirection() == 0 ? this.O : this.P) + (i7 / 2);
        int i10 = this.Q + (i8 / 2);
        this.c.set(i9, i10, i9 + min, min + i10);
        this.d.set(this.c);
        this.e.reset();
        this.e.addCircle(this.c.centerX(), this.c.centerY(), this.c.width() / 2.0f, Path.Direction.CCW);
        this.f.set(this.e);
        i(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 != 6) goto L86;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        this.Q = i;
        this.I = true;
        requestLayout();
        invalidate();
    }

    public final void q(int i, Bitmap bitmap) {
        ((Drawable) this.a.get(i)).setCallback(null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        bitmapDrawable.setCallback(this);
        this.a.set(i, bitmapDrawable);
        requestLayout();
        invalidate();
    }

    public final void r() {
        this.r.set(this.q);
        this.b.mapRect(this.r);
        float f = this.c.left;
        float f2 = this.c.right;
        RectF rectF = this.r;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = this.c.top;
        float f9 = this.c.bottom;
        RectF rectF2 = this.r;
        float f10 = rectF2.top;
        float f11 = rectF2.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        this.b.postTranslate(f7, f6);
    }

    public final void s() {
        this.G.setConcat(this.F, this.b);
        this.s.l = this.G;
    }

    public EditableArtView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new efwt(this);
        this.w = new efwu(this);
        w(context, attributeSet);
        v();
    }

    public EditableArtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new efwt(this);
        this.w = new efwu(this);
        w(context, attributeSet);
        v();
    }
}
