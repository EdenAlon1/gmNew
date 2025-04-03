package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhs {
    private ColorStateList A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private Typeface H;
    private Typeface I;
    private Typeface J;
    private Typeface K;
    private Typeface L;
    private Typeface M;
    private Typeface N;
    private ehmo O;
    private ehmo P;
    private CharSequence Q;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private int X;
    private int Y;
    private int[] Z;
    public float a;
    private boolean aa;
    private final TextPaint ab;
    private TimeInterpolator ac;
    private TimeInterpolator ad;
    private float ae;
    private float af;
    private float ag;
    private ColorStateList ah;
    private float ai;
    private float aj;
    private float ak;
    private ColorStateList al;
    private float am;
    private float an;
    private float ao;
    private float ap;
    private CharSequence aq;
    private boolean ar;
    public boolean b;
    public float c;
    public int d;
    public final Rect e;
    public ColorStateList h;
    public int i;
    public CharSequence k;
    public boolean l;
    public final TextPaint m;
    public float n;
    public StaticLayout o;
    public float p;
    private final View u;
    private float v;
    private final Rect w;
    private final RectF x;
    private int y = 16;
    private int z = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    public TextUtils.TruncateAt j = TextUtils.TruncateAt.END;
    private boolean R = true;
    public int q = 1;
    public int r = 1;
    public int s = -1;
    public int t = -1;

    public ehhs(View view) {
        this.u = view;
        TextPaint textPaint = new TextPaint(129);
        this.ab = textPaint;
        this.m = new TextPaint(textPaint);
        this.e = new Rect();
        this.w = new Rect();
        this.x = new RectF();
        this.c = L();
        k(view.getContext().getResources().getConfiguration());
    }

    private final float L() {
        float f = this.v;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float M(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = egyv.a;
        return f + (f3 * (f2 - f));
    }

    private static int N(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int O(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.Z;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void P() {
        float f;
        float f2 = this.a;
        if (this.b) {
            this.x.set(f2 < this.c ? this.w : this.e);
        } else {
            this.x.left = M(this.w.left, this.e.left, f2, this.ac);
            this.x.top = M(this.B, this.C, f2, this.ac);
            this.x.right = M(this.w.right, this.e.right, f2, this.ac);
            this.x.bottom = M(this.w.bottom, this.e.bottom, f2, this.ac);
        }
        if (!this.b) {
            this.F = M(this.D, this.E, f2, this.ac);
            this.G = M(this.B, this.C, f2, this.ac);
            R(f2);
            f = f2;
        } else if (f2 < this.c) {
            this.F = this.D;
            this.G = this.B;
            R(0.0f);
            f = 0.0f;
        } else {
            this.F = this.E;
            this.G = this.C - Math.max(0, this.d);
            R(1.0f);
            f = 1.0f;
        }
        this.ao = 1.0f - M(0.0f, 1.0f, 1.0f - f2, egyv.b);
        this.u.postInvalidateOnAnimation();
        this.ap = M(1.0f, 0.0f, f2, egyv.b);
        this.u.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.h;
        ColorStateList colorStateList2 = this.A;
        if (colorStateList != colorStateList2) {
            this.ab.setColor(N(O(colorStateList2), f(), f));
        } else {
            this.ab.setColor(f());
        }
        float f3 = this.am;
        float f4 = this.n;
        if (f3 != f4) {
            this.ab.setLetterSpacing(M(f4, f3, f2, egyv.b));
        } else {
            this.ab.setLetterSpacing(f3);
        }
        this.U = M(this.ai, this.ae, f2, null);
        this.V = M(this.aj, this.af, f2, null);
        this.W = M(this.ak, this.ag, f2, null);
        int N = N(O(this.al), O(this.ah), f2);
        this.X = N;
        this.ab.setShadowLayer(this.U, this.V, this.W, N);
        if (this.b) {
            int alpha = this.ab.getAlpha();
            float f5 = this.c;
            this.ab.setAlpha((int) ((f2 <= f5 ? egyv.a(1.0f, 0.0f, this.v, f5, f2) : egyv.a(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.ab;
                textPaint.setShadowLayer(this.U, this.V, this.W, ehdr.a(this.X, textPaint.getAlpha()));
            }
        }
        this.u.postInvalidateOnAnimation();
    }

    private final void Q(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.k == null) {
            return;
        }
        float width = this.e.width();
        float width2 = this.w.width();
        if (S(f, 1.0f)) {
            f2 = J() ? this.g : this.f;
            f3 = J() ? this.am : this.n;
            this.S = J() ? 1.0f : M(this.f, this.g, f, this.ad) / this.f;
            if (true != J()) {
                width = width2;
            }
            typeface = this.H;
            width2 = width;
        } else {
            float f4 = this.f;
            float f5 = this.n;
            typeface = this.K;
            if (S(f, 0.0f)) {
                this.S = 1.0f;
            } else {
                this.S = M(this.f, this.g, f, this.ad) / this.f;
            }
            float f6 = this.g / this.f;
            float f7 = width2 * f6;
            if (!z && !this.b && f7 > width && J()) {
                width2 = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.q : this.r;
        if (width2 > 0.0f) {
            float f8 = this.T;
            float f9 = this.an;
            Typeface typeface2 = this.N;
            StaticLayout staticLayout = this.o;
            boolean z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.Y == i && !this.aa) ? false : true;
            this.T = f2;
            this.an = f3;
            this.N = typeface;
            this.aa = false;
            this.Y = i;
            this.ab.setLinearText(this.S != 1.0f);
            r4 = z2;
        }
        if (this.Q == null || r4) {
            this.ab.setTextSize(this.T);
            this.ab.setTypeface(this.N);
            this.ab.setLetterSpacing(this.an);
            boolean F = F(this.k);
            this.l = F;
            StaticLayout g = g(true != U() ? 1 : i, this.ab, this.k, width2 * (J() ? 1.0f : this.S), F);
            this.o = g;
            this.Q = g.getText();
        }
    }

    private final void R(float f) {
        Q(f, false);
        this.u.postInvalidateOnAnimation();
    }

    private static boolean S(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean T(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean U() {
        if (this.q > 1 || this.r > 1) {
            return !this.l || this.b;
        }
        return false;
    }

    private static final float V(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void A(float f) {
        float a = kqp.a(f, 0.0f, 1.0f);
        if (a != this.a) {
            this.a = a;
            P();
        }
    }

    public final void B(float f) {
        this.v = f;
        this.c = L();
    }

    public final void C(TimeInterpolator timeInterpolator) {
        this.ac = timeInterpolator;
        l();
    }

    public final void D(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.k, charSequence)) {
            this.k = charSequence;
            this.Q = null;
            l();
        }
    }

    public final void E(TimeInterpolator timeInterpolator) {
        this.ad = timeInterpolator;
        l();
    }

    public final boolean F(CharSequence charSequence) {
        int layoutDirection = this.u.getLayoutDirection();
        boolean z = this.R;
        boolean z2 = layoutDirection == 1;
        if (z) {
            return (z2 ? ksk.d : ksk.c).a(charSequence, charSequence.length());
        }
        return z2;
    }

    public final boolean G(Typeface typeface) {
        ehmo ehmoVar = this.P;
        if (ehmoVar != null) {
            ehmoVar.c();
        }
        if (this.J == typeface) {
            return false;
        }
        this.J = typeface;
        Typeface a = ehmw.a(this.u.getContext().getResources().getConfiguration(), typeface);
        this.I = a;
        if (a == null) {
            a = this.J;
        }
        this.H = a;
        return true;
    }

    public final boolean H(Typeface typeface) {
        ehmo ehmoVar = this.O;
        if (ehmoVar != null) {
            ehmoVar.c();
        }
        if (this.M == typeface) {
            return false;
        }
        this.M = typeface;
        Typeface a = ehmw.a(this.u.getContext().getResources().getConfiguration(), typeface);
        this.L = a;
        if (a == null) {
            a = this.M;
        }
        this.K = a;
        return true;
    }

    public final boolean I(int[] iArr) {
        ColorStateList colorStateList;
        this.Z = iArr;
        ColorStateList colorStateList2 = this.h;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.A) == null || !colorStateList.isStateful())) {
            return false;
        }
        l();
        return true;
    }

    public final boolean J() {
        return this.r == 1;
    }

    public final void K() {
        this.R = false;
    }

    public final float a() {
        i(this.m);
        return (-this.m.ascent()) + this.m.descent();
    }

    public final float b() {
        i(this.m);
        return -this.m.ascent();
    }

    public final float c() {
        int i = this.s;
        return i != -1 ? i : b();
    }

    public final float d() {
        j(this.m);
        return (-this.m.ascent()) + this.m.descent();
    }

    public final float e() {
        j(this.m);
        return -this.m.ascent();
    }

    public final int f() {
        return O(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
    
        if (r5.l != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.StaticLayout g(int r6, android.text.TextPaint r7, java.lang.CharSequence r8, float r9, boolean r10) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L8
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: defpackage.ehir -> L4d
            r2 = r1
            goto L2b
        L8:
            int r2 = r5.y     // Catch: defpackage.ehir -> L4d
            boolean r3 = r5.l     // Catch: defpackage.ehir -> L4d
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r3)     // Catch: defpackage.ehir -> L4d
            r2 = r2 & 7
            if (r2 == r1) goto L26
            r3 = 5
            if (r2 == r3) goto L21
            boolean r2 = r5.l     // Catch: defpackage.ehir -> L4d
            if (r2 == 0) goto L1e
        L1b:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch: defpackage.ehir -> L4d
            goto L28
        L1e:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: defpackage.ehir -> L4d
            goto L28
        L21:
            boolean r2 = r5.l     // Catch: defpackage.ehir -> L4d
            if (r2 == 0) goto L1b
            goto L1e
        L26:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch: defpackage.ehir -> L4d
        L28:
            r4 = r2
            r2 = r6
            r6 = r4
        L2b:
            int r9 = (int) r9     // Catch: defpackage.ehir -> L4d
            ehis r3 = new ehis     // Catch: defpackage.ehir -> L4d
            r3.<init>(r8, r7, r9)     // Catch: defpackage.ehir -> L4d
            android.text.TextUtils$TruncateAt r7 = r5.j     // Catch: defpackage.ehir -> L4d
            r3.f = r7     // Catch: defpackage.ehir -> L4d
            r3.e = r10     // Catch: defpackage.ehir -> L4d
            r3.a = r6     // Catch: defpackage.ehir -> L4d
            r6 = 0
            r3.d = r6     // Catch: defpackage.ehir -> L4d
            r3.b = r2     // Catch: defpackage.ehir -> L4d
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r3.b(r6, r7)     // Catch: defpackage.ehir -> L4d
            r3.c = r1     // Catch: defpackage.ehir -> L4d
            r3.g = r0     // Catch: defpackage.ehir -> L4d
            android.text.StaticLayout r0 = r3.a()     // Catch: defpackage.ehir -> L4d
            goto L5b
        L4d:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "CollapsingTextHelper"
            android.util.Log.e(r8, r7, r6)
        L5b:
            defpackage.ksw.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehhs.g(int, android.text.TextPaint, java.lang.CharSequence, float, boolean):android.text.StaticLayout");
    }

    public final void h(Canvas canvas) {
        int save = canvas.save();
        if (this.Q == null || this.x.width() <= 0.0f || this.x.height() <= 0.0f) {
            return;
        }
        this.ab.setTextSize(this.T);
        float f = this.F;
        float f2 = this.G;
        float f3 = this.S;
        if (f3 != 1.0f && !this.b) {
            canvas.scale(f3, f3, f, f2);
        }
        if (U() && J() && (!this.b || this.a > this.c)) {
            float lineStart = this.F - this.o.getLineStart(0);
            int alpha = this.ab.getAlpha();
            canvas.translate(lineStart, f2);
            if (!this.b) {
                this.ab.setAlpha((int) (this.ap * alpha));
                if (Build.VERSION.SDK_INT >= 31) {
                    TextPaint textPaint = this.ab;
                    textPaint.setShadowLayer(this.U, this.V, this.W, ehdr.a(this.X, textPaint.getAlpha()));
                }
                this.o.draw(canvas);
            }
            if (!this.b) {
                this.ab.setAlpha((int) (this.ao * alpha));
            }
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint2 = this.ab;
                textPaint2.setShadowLayer(this.U, this.V, this.W, ehdr.a(this.X, textPaint2.getAlpha()));
            }
            int lineBaseline = this.o.getLineBaseline(0);
            CharSequence charSequence = this.aq;
            float f4 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.ab);
            if (Build.VERSION.SDK_INT >= 31) {
                this.ab.setShadowLayer(this.U, this.V, this.W, this.X);
            }
            if (!this.b) {
                String trim = this.aq.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                String str = trim;
                this.ab.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.o.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.ab);
            }
        } else {
            canvas.translate(f, f2);
            this.o.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public final void i(TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.H);
        textPaint.setLetterSpacing(this.am);
    }

    public final void j(TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.K);
        textPaint.setLetterSpacing(this.n);
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.J;
            if (typeface != null) {
                this.I = ehmw.a(configuration, typeface);
            }
            Typeface typeface2 = this.M;
            if (typeface2 != null) {
                this.L = ehmw.a(configuration, typeface2);
            }
            Typeface typeface3 = this.I;
            if (typeface3 == null) {
                typeface3 = this.J;
            }
            this.H = typeface3;
            Typeface typeface4 = this.L;
            if (typeface4 == null) {
                typeface4 = this.M;
            }
            this.K = typeface4;
            m(true);
        }
    }

    public final void l() {
        m(false);
    }

    public final void m(boolean z) {
        float V;
        StaticLayout staticLayout;
        if (this.u.getHeight() <= 0 || this.u.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        Q(1.0f, z);
        CharSequence charSequence = this.Q;
        if (charSequence != null && (staticLayout = this.o) != null) {
            if (J()) {
                charSequence = TextUtils.ellipsize(charSequence, this.ab, staticLayout.getWidth(), this.j);
            }
            this.aq = charSequence;
        }
        CharSequence charSequence2 = this.aq;
        if (charSequence2 != null) {
            this.p = V(this.ab, charSequence2);
        } else {
            this.p = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.C = this.e.top;
        } else if (i != 80) {
            TextPaint textPaint = this.ab;
            this.C = this.e.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.C = this.e.bottom + this.ab.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.E = this.e.centerX() - (this.p / 2.0f);
        } else if (i2 != 5) {
            this.E = this.e.left;
        } else {
            this.E = this.e.right - this.p;
        }
        Q(0.0f, z);
        float height = this.o != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.o;
        if (staticLayout2 == null || this.q <= 1) {
            CharSequence charSequence3 = this.Q;
            V = charSequence3 != null ? V(this.ab, charSequence3) : 0.0f;
        } else {
            V = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.o;
        this.i = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.y, this.l ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.B = this.w.top;
        } else if (i3 != 80) {
            this.B = this.w.centerY() - (height / 2.0f);
        } else {
            this.B = (this.w.bottom - height) + (this.ar ? this.ab.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.D = this.w.centerX() - (V / 2.0f);
        } else if (i4 != 5) {
            this.D = this.w.left;
        } else {
            this.D = this.w.right - V;
        }
        R(this.a);
        P();
    }

    public final void n(ColorStateList colorStateList) {
        if (this.h == colorStateList && this.A == colorStateList) {
            return;
        }
        this.h = colorStateList;
        this.A = colorStateList;
        l();
    }

    public final void o(Rect rect) {
        p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void p(int i, int i2, int i3, int i4) {
        if (T(this.e, i, i2, i3, i4)) {
            return;
        }
        this.e.set(i, i2, i3, i4);
        this.aa = true;
    }

    public final void q(int i) {
        ehmu ehmuVar = new ehmu(this.u.getContext(), i);
        ColorStateList colorStateList = ehmuVar.k;
        if (colorStateList != null) {
            this.h = colorStateList;
        }
        float f = ehmuVar.l;
        if (f != 0.0f) {
            this.g = f;
        }
        ColorStateList colorStateList2 = ehmuVar.a;
        if (colorStateList2 != null) {
            this.ah = colorStateList2;
        }
        this.af = ehmuVar.f;
        this.ag = ehmuVar.g;
        this.ae = ehmuVar.h;
        this.am = ehmuVar.j;
        ehmo ehmoVar = this.P;
        if (ehmoVar != null) {
            ehmoVar.c();
        }
        this.P = new ehmo(new ehhq(this), ehmuVar.a());
        ehmuVar.b(this.u.getContext(), this.P);
        l();
    }

    public final void r(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            l();
        }
    }

    public final void s(int i) {
        if (this.z != i) {
            this.z = i;
            l();
        }
    }

    public final void t(int i, int i2, int i3, int i4) {
        u(i, i2, i3, i4, true);
    }

    public final void u(int i, int i2, int i3, int i4, boolean z) {
        if (T(this.w, i, i2, i3, i4) && z == this.ar) {
            return;
        }
        this.w.set(i, i2, i3, i4);
        this.aa = true;
        this.ar = z;
    }

    public final void v(int i) {
        if (i != this.q) {
            this.q = i;
            l();
        }
    }

    public final void w(int i) {
        ehmu ehmuVar = new ehmu(this.u.getContext(), i);
        ColorStateList colorStateList = ehmuVar.k;
        if (colorStateList != null) {
            this.A = colorStateList;
        }
        float f = ehmuVar.l;
        if (f != 0.0f) {
            this.f = f;
        }
        ColorStateList colorStateList2 = ehmuVar.a;
        if (colorStateList2 != null) {
            this.al = colorStateList2;
        }
        this.aj = ehmuVar.f;
        this.ak = ehmuVar.g;
        this.ai = ehmuVar.h;
        this.n = ehmuVar.j;
        ehmo ehmoVar = this.O;
        if (ehmoVar != null) {
            ehmoVar.c();
        }
        this.O = new ehmo(new ehhr(this), ehmuVar.a());
        ehmuVar.b(this.u.getContext(), this.O);
        l();
    }

    public final void x(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            l();
        }
    }

    public final void y(int i) {
        if (this.y != i) {
            this.y = i;
            l();
        }
    }

    public final void z(float f) {
        if (this.f != f) {
            this.f = f;
            l();
        }
    }
}
