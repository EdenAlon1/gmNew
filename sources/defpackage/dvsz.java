package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsz extends ViewGroup {
    private final int[] A;
    private final Point B;
    private final int C;
    private final Shader D;
    private final Shader E;
    private final Shader F;
    private final Shader G;
    private final Shader H;
    private final Shader I;
    private final Shader J;
    private final float K;
    private final float L;
    private final float M;
    private final float N;
    private final float O;
    private final float P;
    private final float Q;
    private final float R;
    private final float S;
    private final float T;
    private final float U;
    private final float V;
    private final float W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    boolean b;
    public PopupWindow c;
    public boolean d;
    public View e;
    public View f;
    public float g;
    public int h;
    public int i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    private final Path l;
    private final RectF m;
    private final Paint n;
    private final Paint o;
    private final RectF p;
    private final RectF q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public dvsz(Context context) {
        super(context);
        this.a = new Rect();
        this.A = new int[2];
        this.B = new Point();
        this.ab = 3;
        this.g = 1.0f;
        this.h = 0;
        this.i = 0;
        this.ad = 1;
        setId(R.id.tooltip_view);
        setWillNotDraw(false);
        this.l = new Path();
        this.m = new RectF();
        Paint paint = new Paint();
        this.n = paint;
        this.p = new RectF();
        this.q = new RectF();
        Paint paint2 = new Paint(4);
        this.o = paint2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dvsx.a);
        this.r = obtainStyledAttributes.getDimensionPixelSize(5, easo.b(displayMetrics, 0));
        this.s = obtainStyledAttributes.getDimensionPixelSize(4, easo.b(displayMetrics, 8));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, easo.b(displayMetrics, 16));
        this.t = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, easo.b(displayMetrics, 24));
        this.w = dimensionPixelSize2;
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, easo.b(displayMetrics, 4));
        this.C = dimensionPixelSize3;
        int b = easo.b(displayMetrics, 4);
        this.u = b;
        int b2 = easo.b(displayMetrics, 4);
        this.v = b2;
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, easo.b(displayMetrics, 24));
        this.x = dimensionPixelSize4;
        this.z = easo.b(displayMetrics, 30);
        int color = obtainStyledAttributes.getColor(2, -16033840);
        int color2 = obtainStyledAttributes.getColor(6, 1075847200);
        this.y = color2;
        obtainStyledAttributes.recycle();
        paint2.setStyle(Paint.Style.FILL);
        paint.setStyle(Paint.Style.FILL);
        b(color);
        int h = kps.h(color2, 68);
        int h2 = kps.h(color2, 20);
        int h3 = kps.h(color2, 0);
        this.D = new LinearGradient(0.0f, 0.0f, 0.0f, dimensionPixelSize3, new int[]{h, h2, h3}, (float[]) null, Shader.TileMode.CLAMP);
        this.E = new LinearGradient(0.0f, 0.0f, dimensionPixelSize3, 0.0f, new int[]{h, h2, h3}, (float[]) null, Shader.TileMode.CLAMP);
        float f = dimensionPixelSize4 + dimensionPixelSize3;
        float f2 = f(f);
        this.F = new RadialGradient(f, f, f, new int[]{0, 0, h, h2, h3}, new float[]{0.0f, f2, f2, e(f2), 1.0f}, Shader.TileMode.CLAMP);
        float f3 = dimensionPixelSize - b;
        this.K = f3;
        float f4 = dimensionPixelSize2;
        float f5 = (f4 * f3) / (dimensionPixelSize + dimensionPixelSize);
        this.L = f5;
        float f6 = f4 - (f5 + f5);
        this.M = f6;
        float degrees = (float) Math.toDegrees(Math.atan(f3 / f5));
        this.N = degrees;
        float f7 = f5 * 0.15f;
        float l = l((float) Math.hypot(f7 + f7, f3 * 0.15f), degrees);
        this.T = l;
        float f8 = f(l);
        this.G = new RadialGradient(l, l, l, new int[]{0, h3, h2, h}, new float[]{0.0f, f8, e(f8), 1.0f}, Shader.TileMode.CLAMP);
        float l2 = l(f6, degrees + degrees) + dimensionPixelSize3;
        this.U = l2;
        float f9 = f(l2);
        this.H = new RadialGradient(l2, l2, l2, new int[]{0, 0, h, h2, h3}, new float[]{0.0f, f9, f9, e(f9), 1.0f}, Shader.TileMode.CLAMP);
        float f10 = dimensionPixelSize - b2;
        this.O = f10;
        float f11 = dimensionPixelSize2;
        float f12 = dimensionPixelSize;
        float f13 = ((f12 - f10) * f11) / f12;
        this.P = f13;
        float f14 = f11 - f13;
        this.R = f14;
        float degrees2 = (float) Math.toDegrees(Math.atan(f10 / f14));
        this.S = degrees2;
        float f15 = f14 * 0.05f;
        float l3 = l((float) Math.hypot(f15 + f15, f10 * 0.05f), degrees2);
        this.V = l3;
        float f16 = f(l3);
        this.I = new RadialGradient(l3, l3, l3, new int[]{0, h3, h2, h}, new float[]{0.0f, f16, e(f16), 1.0f}, Shader.TileMode.CLAMP);
        float f17 = dimensionPixelSize;
        float f18 = dimensionPixelSize2 * ((f17 - (f17 - (0.7f * b2))) / f17);
        this.Q = f18;
        float l4 = l((float) Math.hypot(f18, r5 * 0.3f), degrees2 + 90.0f) + dimensionPixelSize3;
        this.W = l4;
        float f19 = f(l4);
        this.J = new RadialGradient(l4, l4, l4, new int[]{0, 0, h, h2, h3}, new float[]{0.0f, f19, f19, e(f19), 1.0f}, Shader.TileMode.CLAMP);
        this.d = true;
    }

    private static float e(float f) {
        return f + ((1.0f - f) / 2.0f);
    }

    private final float f(float f) {
        return 1.0f - (this.C / f);
    }

    private final int g() {
        int i;
        int i2 = this.ac;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            int i4 = this.w / 2;
            int i5 = this.s;
            i = i4 + i5 + i5;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException();
            }
            i = this.a.width() / 2;
        }
        int[] iArr = kvo.a;
        if (getLayoutDirection() == 1) {
            i = this.a.width() - i;
        }
        return i + this.a.left;
    }

    private final int h() {
        return (int) (this.h + this.m.width());
    }

    private static int i(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final void j(Canvas canvas, int i) {
        if (i != 0) {
            canvas.save();
            RectF rectF = this.p;
            canvas.rotate(i, rectF.centerX(), rectF.centerY());
        }
        canvas.drawRect(this.p, this.o);
        if (i != 0) {
            canvas.restore();
        }
    }

    private final void k(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private static final float l(float f, float f2) {
        return (float) ((f / 2.0f) / Math.sin(Math.toRadians(f2 / 2.0f)));
    }

    public final void a(Rect rect) {
        this.a.set(rect);
    }

    public final void b(int i) {
        this.n.setColor(i);
    }

    public final void c() {
        int i;
        int i2;
        k(this.B);
        Point point = this.B;
        int i3 = point.x;
        int i4 = point.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.ad = 1;
        int i5 = this.ab;
        if (i5 == 1) {
            i = (-measuredHeight) - this.s;
        } else if (i5 == 2) {
            i = this.a.height() + this.s;
        } else {
            i = 0;
        }
        int[] iArr = kvo.a;
        int layoutDirection = getLayoutDirection();
        int i6 = this.a.top + i;
        int i7 = this.ac;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException();
            }
            Rect rect = this.a;
            i2 = rect.left + ((rect.width() - measuredWidth) / 2);
        } else if (layoutDirection == 1) {
            Rect rect2 = this.a;
            i2 = (rect2.left + rect2.width()) - measuredWidth;
        } else {
            i2 = this.a.left;
        }
        int i9 = this.s;
        this.h = i(i2, i9, (i3 - i9) - measuredWidth);
        int i10 = this.s;
        this.i = i(i6, i10, (i4 - i10) - measuredHeight);
        int g = g();
        int i11 = this.w / 2;
        int i12 = g - i11;
        int i13 = i11 + g;
        int i14 = this.h;
        int i15 = i12 - i14;
        int i16 = this.C;
        int i17 = i14 + measuredWidth;
        int i18 = this.z;
        if (i15 + i16 < i18) {
            this.h = g - i16;
            this.ad = 2;
        } else if ((i17 + i16) - i13 < i18) {
            this.h = (g - measuredWidth) - i16;
            this.ad = 3;
        }
    }

    public final void d(View view, Rect rect, int i, int i2) {
        this.f = view;
        a(rect);
        this.aa = i;
        this.ab = 3;
        this.ac = i2;
        this.b = true;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float sin;
        float f5;
        canvas.save();
        this.o.setShader(this.F);
        RectF rectF = this.p;
        float f6 = this.C + this.x;
        float f7 = f6 + f6;
        rectF.set(0.0f, 0.0f, f7, f7);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        boolean z = this.ab == 1;
        int i = this.ad;
        boolean z2 = i == 2;
        boolean z3 = i == 3;
        if (z || !z2) {
            canvas.drawArc(this.p, 180.0f, 90.0f, true, this.o);
        }
        RectF rectF2 = this.m;
        int i2 = this.x;
        canvas.translate(rectF2.width() - (i2 + i2), 0.0f);
        if (z || !z3) {
            canvas.drawArc(this.p, 270.0f, 90.0f, true, this.o);
        }
        RectF rectF3 = this.m;
        int i3 = this.x;
        canvas.translate(0.0f, rectF3.height() - (i3 + i3));
        if (!z || !z3) {
            canvas.drawArc(this.p, 0.0f, 90.0f, true, this.o);
        }
        RectF rectF4 = this.m;
        int i4 = this.x;
        canvas.translate(-(rectF4.width() - (i4 + i4)), 0.0f);
        if (!z || !z2) {
            canvas.drawArc(this.p, 90.0f, 90.0f, true, this.o);
        }
        canvas.restore();
        this.o.setShader(this.D);
        RectF rectF5 = this.p;
        RectF rectF6 = this.m;
        int i5 = this.x;
        rectF5.set(0.0f, 0.0f, rectF6.width() - (i5 + i5), this.C);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        if (this.ab != 2) {
            canvas.save();
            canvas.translate(this.x + this.C, 0.0f);
            j(canvas, 180);
            canvas.restore();
        }
        if (this.ab != 1) {
            canvas.save();
            int i6 = this.x;
            canvas.translate(i6 + r3, this.C + this.m.height());
            j(canvas, 0);
            canvas.restore();
        }
        this.o.setShader(this.E);
        RectF rectF7 = this.p;
        int i7 = this.C;
        RectF rectF8 = this.m;
        int i8 = this.x;
        rectF7.set(0.0f, 0.0f, i7, rectF8.height() - (i8 + i8));
        canvas.save();
        canvas.translate(0.0f, this.C + this.x);
        j(canvas, 180);
        canvas.translate(this.m.width() + this.C, 0.0f);
        j(canvas, 0);
        canvas.restore();
        canvas.restore();
        int i9 = this.ad;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 0) {
            int i11 = this.ab;
            float g = g();
            canvas.save();
            int i12 = this.x;
            int i13 = this.C;
            boolean z4 = i11 == 1;
            canvas.translate(i12 + i13, z4 ? i13 + this.m.height() : this.t);
            float f8 = this.C;
            this.p.set(0.0f, 0.0f, ((((g - this.h) - f8) - (this.w / 2.0f)) - this.x) - (this.L * 0.15f), f8);
            this.o.setShader(this.D);
            int i14 = true != z4 ? 180 : 0;
            j(canvas, i14);
            RectF rectF9 = this.p;
            float f9 = this.T;
            float width = rectF9.width() - f9;
            if (z4) {
                f = 0.0f;
            } else {
                float f10 = -f9;
                f = f10 + f10 + this.C;
            }
            canvas.translate(width, f);
            this.o.setShader(this.G);
            RectF rectF10 = this.q;
            float f11 = this.T;
            float f12 = f11 + f11;
            rectF10.set(0.0f, 0.0f, f12, f12);
            canvas.drawArc(this.q, z4 ? 270.0f : 90.0f - this.N, this.N, true, this.o);
            if (!z4) {
                float f13 = this.T;
                canvas.translate(0.0f, f13 + f13);
            }
            int i15 = i11 == 1 ? 1 : -1;
            float f14 = this.L * 0.15f;
            float f15 = i15;
            canvas.translate(f14 + f14 + this.T, this.K * f15 * 0.15f);
            canvas.rotate(this.N * f15);
            if (!z4) {
                canvas.translate(0.0f, -this.C);
            }
            this.p.right = (float) Math.hypot(this.L * 0.85f, this.K * 0.85f);
            this.o.setShader(this.D);
            j(canvas, i14);
            if (!z4) {
                canvas.translate(0.0f, this.C);
            }
            float f16 = this.U;
            float f17 = this.M / 2.0f;
            if (z4) {
                f2 = 0.15f;
                f3 = 0.85f;
                f4 = 2.0f;
                sin = ((float) (Math.sin(Math.toRadians(90.0f - this.N)) * (this.U - this.C))) + f16;
            } else {
                f2 = 0.15f;
                f3 = 0.85f;
                f4 = 2.0f;
                sin = f16 - ((float) (Math.sin(Math.toRadians(90.0f - this.N)) * (this.U - this.C)));
            }
            float f18 = sin;
            float f19 = f16 - f17;
            float f20 = this.K * f3;
            canvas.rotate((-this.N) * f15);
            float f21 = this.L * f3;
            if (!z4) {
                f20 = -f20;
            }
            canvas.translate(f21 - f19, f20 - f18);
            float f22 = this.N;
            this.o.setShader(this.H);
            RectF rectF11 = this.q;
            float f23 = this.U;
            float f24 = f23 + f23;
            rectF11.set(0.0f, 0.0f, f24, f24);
            canvas.drawArc(this.q, (true != z4 ? 270 : 90) - this.N, f22 + f22, true, this.o);
            canvas.translate(this.M + f19, f18);
            canvas.rotate((-this.N) * f15);
            if (!z4) {
                canvas.translate(0.0f, -this.C);
            }
            this.o.setShader(this.D);
            j(canvas, i14);
            if (!z4) {
                canvas.translate(0.0f, this.C);
            }
            canvas.rotate(this.N * f15);
            canvas.translate((this.L * 1.15f) - this.T, f15 * (-this.K));
            if (!z4) {
                float f25 = -this.T;
                canvas.translate(0.0f, f25 + f25);
            }
            this.o.setShader(this.G);
            RectF rectF12 = this.q;
            float f26 = this.T;
            float f27 = f26 + f26;
            rectF12.set(0.0f, 0.0f, f27, f27);
            canvas.drawArc(this.q, z4 ? 270.0f - this.N : 90.0f, this.N, true, this.o);
            this.p.right = (((this.m.width() - this.x) - ((g - this.h) - this.C)) - (this.w / f4)) - (this.L * f2);
            float f28 = this.T;
            canvas.translate(f28, z4 ? 0.0f : (f28 + f28) - this.C);
            this.o.setShader(this.D);
            canvas.save();
            j(canvas, i14);
            canvas.restore();
            canvas.restore();
        } else if (i10 == 1) {
            int i16 = this.ab;
            int i17 = this.h;
            canvas.save();
            int i18 = i17 - this.h;
            int i19 = this.C;
            int i20 = this.w;
            float f29 = this.R;
            boolean z5 = i16 == 1;
            canvas.translate(i18 + i19 + i20 + (f29 * 0.05f), z5 ? i19 + this.m.height() : this.t);
            this.p.set(0.0f, 0.0f, ((this.m.width() - this.w) - this.x) - (this.R * 0.05f), this.C);
            this.o.setShader(this.D);
            int i21 = true != z5 ? 180 : 0;
            j(canvas, i21);
            float f30 = -this.V;
            canvas.translate(f30, z5 ? 0.0f : f30 + f30 + this.C);
            this.o.setShader(this.I);
            RectF rectF13 = this.q;
            float f31 = this.V;
            float f32 = f31 + f31;
            rectF13.set(0.0f, 0.0f, f32, f32);
            canvas.drawArc(this.q, z5 ? 270.0f - this.S : 90.0f, this.S, true, this.o);
            if (!z5) {
                float f33 = this.V;
                canvas.translate(0.0f, f33 + f33);
            }
            int i22 = i16 == 1 ? 1 : -1;
            float f34 = this.R;
            float f35 = this.P;
            float f36 = this.O;
            float f37 = f34 * 0.05f;
            float f38 = i22;
            float f39 = f38 * f36 * 0.05f;
            float f40 = (f36 * 0.95f) + (this.v * 0.3f);
            float f41 = (f34 * 0.95f) + (f35 * 0.3f);
            canvas.translate((this.V - (f37 + f37)) - f41, f39 + (f38 * f40));
            canvas.rotate((-this.S) * f38);
            if (!z5) {
                canvas.translate(0.0f, -this.C);
            }
            this.p.right = (float) Math.hypot(f41, f40);
            this.o.setShader(this.D);
            j(canvas, i21);
            if (!z5) {
                canvas.translate(0.0f, this.C);
            }
            float f42 = this.W;
            double cos = Math.cos(Math.toRadians(90.0f - this.S));
            float f43 = this.W;
            double d = cos * (f43 - this.C);
            float sin2 = z5 ? f43 + ((float) (Math.sin(Math.toRadians(90.0f - this.S)) * (this.W - this.C))) : f43 - ((float) (Math.sin(Math.toRadians(90.0f - this.S)) * (this.W - this.C)));
            double d2 = f42 - d;
            canvas.rotate(f38 * this.S);
            float f44 = this.W;
            float f45 = (float) d2;
            canvas.translate(f45 - (f44 + f44), -sin2);
            float f46 = this.S + 90.0f;
            this.o.setShader(this.J);
            RectF rectF14 = this.q;
            float f47 = this.W;
            float f48 = f47 + f47;
            rectF14.set(0.0f, 0.0f, f48, f48);
            canvas.drawArc(this.q, 180.0f - (true != z5 ? 0.0f : f46), f46, true, this.o);
            float f49 = this.W;
            canvas.translate((((f49 + f49) - f45) - this.Q) - this.C, sin2 - ((i22 * this.v) * 0.3f));
            this.p.set(0.0f, 0.0f, this.C, this.O + this.x);
            if (z5) {
                canvas.translate(0.0f, -this.p.height());
            }
            this.o.setShader(this.E);
            j(canvas, 180);
            canvas.restore();
        } else if (i10 == 2) {
            int i23 = this.ab;
            int h = h();
            canvas.save();
            int i24 = this.x;
            int i25 = this.C;
            boolean z6 = i23 == 1;
            canvas.translate(i24 + i25, z6 ? i25 + this.m.height() : this.t);
            this.p.set(0.0f, 0.0f, (((h - this.h) - this.w) - this.x) - (this.R * 0.05f), this.C);
            this.o.setShader(this.D);
            int i26 = true == z6 ? 0 : 180;
            j(canvas, i26);
            RectF rectF15 = this.p;
            float f50 = this.V;
            float width2 = rectF15.width() - f50;
            if (z6) {
                f5 = 0.0f;
            } else {
                float f51 = -f50;
                f5 = f51 + f51 + this.C;
            }
            canvas.translate(width2, f5);
            this.o.setShader(this.I);
            RectF rectF16 = this.q;
            float f52 = this.V;
            float f53 = f52 + f52;
            rectF16.set(0.0f, 0.0f, f53, f53);
            boolean z7 = z6;
            canvas.drawArc(this.q, z6 ? 270.0f : 90.0f - this.S, this.S, true, this.o);
            if (!z7) {
                float f54 = this.V;
                canvas.translate(0.0f, f54 + f54);
            }
            int i27 = i23 != 1 ? -1 : 1;
            float f55 = this.R * 0.05f;
            float f56 = i27;
            canvas.translate(f55 + f55 + this.V, this.O * f56 * 0.05f);
            canvas.rotate(this.S * f56);
            if (!z7) {
                canvas.translate(0.0f, -this.C);
            }
            float f57 = this.R;
            float f58 = this.P;
            float f59 = (this.O * 0.95f) + (this.v * 0.3f);
            float f60 = (f57 * 0.95f) + (f58 * 0.3f);
            int i28 = i27;
            this.p.right = (float) Math.hypot(f60, f59);
            this.o.setShader(this.D);
            j(canvas, i26);
            if (!z7) {
                canvas.translate(0.0f, this.C);
            }
            float f61 = this.W;
            double cos2 = Math.cos(Math.toRadians(90.0f - this.S));
            float f62 = this.W;
            double d3 = cos2 * (f62 - this.C);
            float sin3 = z7 ? f62 + ((float) (Math.sin(Math.toRadians(90.0f - this.S)) * (this.W - this.C))) : f62 - ((float) (Math.sin(Math.toRadians(90.0f - this.S)) * (this.W - this.C)));
            canvas.rotate((-this.S) * f56);
            float f63 = (float) (f61 - d3);
            canvas.translate(f60 - f63, (f56 * f59) - sin3);
            float f64 = this.S + 90.0f;
            this.o.setShader(this.J);
            RectF rectF17 = this.q;
            float f65 = this.W;
            float f66 = f65 + f65;
            rectF17.set(0.0f, 0.0f, f66, f66);
            canvas.drawArc(this.q, z7 ? 0.0f : 270.0f - this.S, f64, true, this.o);
            canvas.translate(f63 + this.Q, sin3 - ((this.v * i28) * 0.3f));
            this.p.set(0.0f, 0.0f, this.C, this.O + this.x);
            if (z7) {
                canvas.translate(0.0f, -this.p.height());
            }
            this.o.setShader(this.E);
            j(canvas, 0);
            canvas.restore();
        }
        float f67 = this.C;
        canvas.translate(f67, f67);
        canvas.save();
        canvas.translate(this.s - this.h, 0.0f);
        canvas.drawPath(this.l, this.n);
        canvas.restore();
        RectF rectF18 = this.m;
        float f68 = this.x;
        canvas.drawRoundRect(rectF18, f68, f68, this.n);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.e;
        int i6 = this.ab;
        if (i6 == 2) {
            i5 = this.t;
            i6 = 2;
        } else {
            i5 = 0;
        }
        int i7 = this.r;
        int i8 = i4 - i2;
        int i9 = this.C + i7;
        view.layout(i9, i5 + i9, (i3 - i) - i7, (i8 - i7) - (i6 == 1 ? this.t : 0));
        c();
        this.c.update(this.h, this.i, getMeasuredWidth(), getMeasuredHeight(), true);
        int i10 = this.ad;
        if (i10 == 1) {
            int g = g();
            this.l.reset();
            int i11 = this.ab;
            if (i11 == 1) {
                this.l.moveTo(((g - this.s) - this.C) - (this.w / 2), this.m.bottom);
                this.l.rLineTo(this.w, 0.0f);
                this.l.rLineTo(-this.L, this.K);
                Path path = this.l;
                float f = this.M;
                float f2 = -f;
                path.rQuadTo(f2 / 2.0f, f / 2.0f, f2, 0.0f);
                this.l.rLineTo(-this.L, -this.K);
                this.l.close();
                return;
            }
            if (i11 == 2) {
                this.l.moveTo(((g - this.s) - this.C) + (this.w / 2), this.m.top);
                this.l.rLineTo(-this.w, 0.0f);
                this.l.rLineTo(this.L, -this.K);
                Path path2 = this.l;
                float f3 = this.M;
                path2.rQuadTo(f3 / 2.0f, (-f3) / 2.0f, f3, 0.0f);
                this.l.rLineTo(this.L, this.K);
                this.l.close();
                return;
            }
            return;
        }
        if (i10 == 3) {
            int h = h();
            this.l.reset();
            int i12 = this.ab;
            if (i12 == 1) {
                this.l.moveTo((h - this.s) - this.w, this.m.bottom - this.x);
                this.l.rLineTo(this.w, 0.0f);
                this.l.rLineTo(0.0f, this.O + this.x);
                Path path3 = this.l;
                float f4 = -this.P;
                path3.rQuadTo(f4 / 10.0f, this.v, f4, 0.0f);
                this.l.rLineTo(-this.R, -this.O);
                this.l.close();
                return;
            }
            if (i12 == 2) {
                this.l.moveTo((h - this.s) - this.w, this.m.top + this.x);
                this.l.rLineTo(this.w, 0.0f);
                this.l.rLineTo(0.0f, -(this.O + this.x));
                Path path4 = this.l;
                float f5 = -this.P;
                path4.rQuadTo(f5 / 10.0f, -this.v, f5, 0.0f);
                this.l.rLineTo(-this.R, this.O);
                this.l.close();
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i13 = this.h;
            this.l.reset();
            int i14 = this.ab;
            if (i14 == 1) {
                this.l.moveTo((i13 - this.s) + this.w, this.m.bottom - this.x);
                this.l.rLineTo(-this.w, 0.0f);
                this.l.rLineTo(0.0f, this.O + this.x);
                Path path5 = this.l;
                float f6 = this.P;
                path5.rQuadTo(f6 / 10.0f, this.v, f6, 0.0f);
                this.l.rLineTo(this.R, -this.O);
                this.l.close();
                return;
            }
            if (i14 == 2) {
                this.l.moveTo((i13 - this.s) + this.w, this.m.top + this.x);
                this.l.rLineTo(-this.w, 0.0f);
                this.l.rLineTo(0.0f, -(this.O + this.x));
                Path path6 = this.l;
                float f7 = this.P;
                path6.rQuadTo(f7 / 10.0f, -this.v, f7, 0.0f);
                this.l.rLineTo(this.R, this.O);
                this.l.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvsz.onMeasure(int, int):void");
    }
}
