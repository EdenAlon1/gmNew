package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.efwm;
import defpackage.efwn;
import defpackage.efxb;
import defpackage.eobe;
import defpackage.fdrm;
import defpackage.kps;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ColorPickerView extends View {
    private static final int[] j = {R.string.op3_art_color_picker_wheel_color_announce_0, R.string.op3_art_color_picker_wheel_color_announce_1, R.string.op3_art_color_picker_wheel_color_announce_2, R.string.op3_art_color_picker_wheel_color_announce_3, R.string.op3_art_color_picker_wheel_color_announce_4, R.string.op3_art_color_picker_wheel_color_announce_5, R.string.op3_art_color_picker_wheel_color_announce_6, R.string.op3_art_color_picker_wheel_color_announce_7, R.string.op3_art_color_picker_wheel_color_announce_8, R.string.op3_art_color_picker_wheel_color_announce_9, R.string.op3_art_color_picker_wheel_color_announce_10, R.string.op3_art_color_picker_wheel_color_announce_11};
    private static final float[] k = {0.0f, 0.1666f, 0.3333f, 0.5f, 0.6666f, 0.8333f, 1.0f};
    public final Paint a;
    public final float[] b;
    final GestureDetector.SimpleOnGestureListener c;
    public float d;
    public efwn e;
    public boolean f;
    public final int g;
    public int h;
    public final int i;
    private final Paint l;
    private final Paint m;
    private final GestureDetector n;
    private int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;

    public ColorPickerView(Context context) {
        this(context, null);
    }

    public final float a() {
        float f = this.b[0] - this.d;
        return f < 0.0f ? f + 360.0f : f;
    }

    public final void b(Integer num) {
        efwn efwnVar = this.e;
        if (efwnVar != null) {
            efwnVar.a(a(), num);
        }
    }

    public final void c() {
        setContentDescription(getContext().getString(j[Math.round(this.b[0] / 30.0f) % 12], Integer.valueOf(this.o & 16777215)));
    }

    public final void d() {
        this.o = kps.c(this.b);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final void e(int i, int i2) {
        int[] iArr = new int[7];
        float[] fArr = this.b;
        float[] fArr2 = {0.0f, fArr[1], fArr[2]};
        for (int i3 = 0; i3 < 7; i3++) {
            fArr2[0] = 360 - (i3 * 60);
            iArr[i3] = kps.c(fArr2);
        }
        this.l.setShader(new SweepGradient(i / 2.0f, i2 / 2.0f, iArr, k));
    }

    public final void f(float f, float f2, MotionEvent motionEvent, Integer num) {
        double degrees = Math.toDegrees(Math.atan2(-(f2 - (getHeight() / 2.0f)), f - (getWidth() / 2.0f)));
        if (degrees < eobe.a) {
            degrees += 360.0d;
        }
        float[] fArr = this.b;
        if (fArr[0] != degrees) {
            fArr[0] = (float) degrees;
            d();
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
                c();
            }
            b(num);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float f = this.q + (this.p / 2.0f);
        float f2 = width / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(f2, height, f, this.l);
        double d = f;
        double cos = Math.cos(Math.toRadians(this.b[0])) * d;
        double sin = d * Math.sin(Math.toRadians(this.b[0]));
        this.m.setColor(this.o);
        float f3 = (float) (f2 + cos);
        float f4 = (float) (height - sin);
        canvas.drawCircle(f3, f4, this.h, this.m);
        canvas.drawCircle(f3, f4, this.h, this.a);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int min = Math.min(i, i2);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.l.setStrokeWidth(this.p);
        e(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            int i = true == this.f ? 8 : 1;
            this.f = false;
            this.h = this.r;
            this.a.setStrokeWidth(this.u);
            f(motionEvent.getX(), motionEvent.getY(), motionEvent, Integer.valueOf(i));
        }
        return this.n.onTouchEvent(motionEvent);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, efxb.a, 0, 0);
        try {
            this.p = obtainStyledAttributes.getDimensionPixelSize(9, 0);
            this.q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.r = dimensionPixelSize;
            this.g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.s = dimensionPixelSize2;
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.t = dimensionPixelSize3;
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.u = dimensionPixelSize4;
            this.i = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int i = obtainStyledAttributes.getInt(5, 0);
            this.v = i;
            int i2 = obtainStyledAttributes.getInt(3, 0);
            this.w = i2;
            obtainStyledAttributes.recycle();
            this.h = dimensionPixelSize;
            Paint paint = new Paint(1);
            this.l = paint;
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint(1);
            this.a = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(dimensionPixelSize4);
            float[] fArr = {0.0f, 1.0f, 0.5f};
            this.b = fArr;
            this.d = 0.0f;
            Paint paint3 = new Paint(1);
            this.m = paint3;
            paint3.setShadowLayer(dimensionPixelSize3, 0.0f, dimensionPixelSize2, kps.h(i, i2));
            if (!fdrm.a.get().h() || Build.VERSION.SDK_INT < 28) {
                setLayerType(1, null);
            }
            this.o = kps.c(fArr);
            efwm efwmVar = new efwm(this);
            this.c = efwmVar;
            this.n = new GestureDetector(context, efwmVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
