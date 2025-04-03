package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdh extends ehop implements Drawable.Callback, ehiu {
    private ColorStateList C;
    private ColorStateList D;
    private float E;
    private ColorStateList F;
    private float G;
    private boolean H;
    private Drawable I;
    private ColorStateList J;
    private boolean K;
    private Drawable L;
    private ColorStateList M;
    private float N;
    private boolean O;
    private Drawable P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private final Context V;
    private final Paint W;
    private final Paint.FontMetrics X;
    private final RectF Y;
    private final PointF Z;
    private final Path aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private int ah;
    private int ai;
    private ColorFilter aj;
    private PorterDuffColorFilter ak;
    private ColorStateList al;
    private PorterDuff.Mode am;
    private int[] an;
    private WeakReference ao;
    private boolean ap;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public float e;
    public boolean f;
    public Drawable g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final ehiv m;
    public TextUtils.TruncateAt n;
    public boolean o;
    public int p;
    public static final int[] a = {R.attr.state_enabled};
    private static final ShapeDrawable B = new ShapeDrawable(new OvalShape());

    private ehdh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = -1.0f;
        this.W = new Paint(1);
        this.X = new Paint.FontMetrics();
        this.Y = new RectF();
        this.Z = new PointF();
        this.aa = new Path();
        this.ai = PrivateKeyType.INVALID;
        this.am = PorterDuff.Mode.SRC_IN;
        this.ao = new WeakReference(null);
        K(context);
        this.V = context;
        ehiv ehivVar = new ehiv(this);
        this.m = ehivVar;
        this.d = "";
        ehivVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        t(iArr);
        this.o = true;
        B.setTint(-1);
    }

    private final float aa() {
        Drawable drawable = this.ag ? this.P : this.I;
        float f = this.e;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final ColorFilter ab() {
        ColorFilter colorFilter = this.aj;
        return colorFilter != null ? colorFilter : this.ak;
    }

    private final void ac(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.g) {
            if (drawable.isStateful()) {
                drawable.setState(this.an);
            }
            drawable.setTintList(this.M);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.K) {
            drawable2.setTintList(this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private final void ad(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ai() || ah()) {
            float f = this.i + this.R;
            float aa = aa();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + aa;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - aa;
            }
            Drawable drawable = this.ag ? this.P : this.I;
            float f2 = this.e;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) Math.ceil(ehjg.a(this.V, 24));
                if (drawable.getIntrinsicHeight() <= f2) {
                    f2 = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    private final boolean ae() {
        return this.O && this.P != null && this.h;
    }

    private static boolean af(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean ag(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.C;
        int z3 = z(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ab) : 0);
        boolean z4 = true;
        if (this.ab != z3) {
            this.ab = z3;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int z5 = z(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ac) : 0);
        if (this.ac != z5) {
            this.ac = z5;
            onStateChange = true;
        }
        int g = kps.g(z5, z3);
        if ((this.ad != g) | (C() == null)) {
            this.ad = g;
            O(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.F;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ae) : 0;
        if (this.ae != colorForState) {
            this.ae = colorForState;
            onStateChange = true;
        }
        ehmu ehmuVar = this.m.f;
        int colorForState2 = (ehmuVar == null || (colorStateList = ehmuVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.af);
        if (this.af != colorForState2) {
            this.af = colorForState2;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int i = 0;
            while (true) {
                if (i >= state.length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.h) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.ag == z || this.P == null) {
            z2 = false;
        } else {
            float a2 = a();
            this.ag = z;
            if (a2 != a()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.al;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.ah) : 0;
        if (this.ah != colorForState3) {
            this.ah = colorForState3;
            this.ak = ehfy.b(this, this.al, this.am);
        } else {
            z4 = onStateChange;
        }
        if (s(this.I)) {
            z4 |= this.I.setState(iArr);
        }
        if (s(this.P)) {
            z4 |= this.P.setState(iArr);
        }
        if (s(this.g)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            z4 |= this.g.setState(iArr3);
        }
        if (s(this.L)) {
            z4 |= this.L.setState(iArr2);
        }
        if (z4) {
            invalidateSelf();
        }
        if (z2) {
            j();
        }
        return z4;
    }

    private final boolean ah() {
        return this.O && this.P != null && this.ag;
    }

    private final boolean ai() {
        return this.H && this.I != null;
    }

    private final boolean aj() {
        return this.f && this.g != null;
    }

    private static final void ak(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ehdh g(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehdh.g(android.content.Context, android.util.AttributeSet, int, int):ehdh");
    }

    public static ehdh h(Context context, int i) {
        AttributeSet d = ehfy.d(context, i, "chip");
        int styleAttribute = d.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.apps.messaging.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return g(context, d, com.google.android.apps.messaging.R.attr.chipStandaloneStyle, styleAttribute);
    }

    public static boolean s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float a() {
        if (ai() || ah()) {
            return this.R + aa() + this.S;
        }
        return 0.0f;
    }

    public final float b() {
        if (aj()) {
            return this.T + this.N + this.U;
        }
        return 0.0f;
    }

    public final float c() {
        return this.ap ? w() : this.E;
    }

    public final Drawable d() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return kqj.a(drawable);
        }
        return null;
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.ai) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.ai);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        if (!this.ap) {
            this.W.setColor(this.ab);
            this.W.setStyle(Paint.Style.FILL);
            this.Y.set(bounds);
            canvas2.drawRoundRect(this.Y, c(), c(), this.W);
        }
        if (!this.ap) {
            this.W.setColor(this.ac);
            this.W.setStyle(Paint.Style.FILL);
            this.W.setColorFilter(ab());
            this.Y.set(bounds);
            canvas2.drawRoundRect(this.Y, c(), c(), this.W);
        }
        if (this.ap) {
            super.draw(canvas);
        }
        if (this.G <= 0.0f || this.ap) {
            f = 2.0f;
        } else {
            this.W.setColor(this.ae);
            this.W.setStyle(Paint.Style.STROKE);
            if (!this.ap) {
                this.W.setColorFilter(ab());
            }
            f = 2.0f;
            this.Y.set(bounds.left + (this.G / 2.0f), bounds.top + (this.G / 2.0f), bounds.right - (this.G / 2.0f), bounds.bottom - (this.G / 2.0f));
            float f2 = this.E - (this.G / 2.0f);
            canvas2.drawRoundRect(this.Y, f2, f2, this.W);
        }
        this.W.setColor(0);
        this.W.setStyle(Paint.Style.FILL);
        this.Y.set(bounds);
        if (this.ap) {
            H(new RectF(bounds), this.aa);
            super.I(canvas2, this.W, this.aa, this.q.a, this.z, D());
        } else {
            canvas2.drawRoundRect(this.Y, c(), c(), this.W);
        }
        if (ai()) {
            ad(bounds, this.Y);
            RectF rectF = this.Y;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas2.translate(f3, f4);
            this.I.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
            this.I.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (ah()) {
            ad(bounds, this.Y);
            RectF rectF2 = this.Y;
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            canvas2.translate(f5, f6);
            this.P.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
            this.P.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.o && this.d != null) {
            PointF pointF = this.Z;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float a2 = this.i + a() + this.j;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + a2;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - a2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.m.a.getFontMetrics(this.X);
                Paint.FontMetrics fontMetrics = this.X;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            RectF rectF3 = this.Y;
            rectF3.setEmpty();
            if (this.d != null) {
                float a3 = this.i + a() + this.j;
                float b = this.l + b() + this.k;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + a3;
                    rectF3.right = bounds.right - b;
                } else {
                    rectF3.left = bounds.left + b;
                    rectF3.right = bounds.right - a3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            ehiv ehivVar = this.m;
            if (ehivVar.f != null) {
                ehivVar.a.drawableState = getState();
                ehiv ehivVar2 = this.m;
                ehivVar2.f.c(this.V, ehivVar2.a, ehivVar2.b);
            }
            this.m.a.setTextAlign(align);
            boolean z = Math.round(this.m.a(this.d.toString())) > Math.round(this.Y.width());
            if (z) {
                int save = canvas2.save();
                canvas2.clipRect(this.Y);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence = this.d;
            if (z && this.n != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.m.a, this.Y.width(), this.n);
            }
            PointF pointF2 = this.Z;
            Canvas canvas3 = canvas2;
            canvas3.drawText(charSequence, 0, charSequence.length(), pointF2.x, pointF2.y, this.m.a);
            canvas2 = canvas3;
            if (z) {
                canvas2.restoreToCount(i3);
            }
        }
        if (aj()) {
            RectF rectF4 = this.Y;
            rectF4.setEmpty();
            if (aj()) {
                float f7 = this.l + this.U;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.N;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.N;
                }
                rectF4.top = bounds.exactCenterY() - (this.N / f);
                rectF4.bottom = rectF4.top + this.N;
            }
            RectF rectF5 = this.Y;
            float f8 = rectF5.left;
            float f9 = rectF5.top;
            canvas2.translate(f8, f9);
            this.g.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
            this.L.setBounds(this.g.getBounds());
            this.L.jumpToCurrentState();
            this.L.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.ai < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // defpackage.ehiu
    public final void e() {
        j();
        invalidateSelf();
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ai;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.aj;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.i + a() + this.j + this.m.a(this.d.toString()) + this.k + b() + this.l), this.p);
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.ap) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
            outline2 = outline;
        }
        outline2.setAlpha(this.ai / 255.0f);
    }

    public final ehmu i() {
        return this.m.f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (af(this.C) || af(this.D) || af(this.F)) {
            return true;
        }
        ehmu ehmuVar = this.m.f;
        return !(ehmuVar == null || (colorStateList = ehmuVar.k) == null || !colorStateList.isStateful()) || ae() || s(this.I) || s(this.P) || af(this.al);
    }

    protected final void j() {
        ehdg ehdgVar = (ehdg) this.ao.get();
        if (ehdgVar != null) {
            ehdgVar.a();
        }
    }

    public final void k(boolean z) {
        if (this.O != z) {
            boolean ah = ah();
            this.O = z;
            boolean ah2 = ah();
            if (ah != ah2) {
                if (ah2) {
                    ac(this.P);
                } else {
                    ak(this.P);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void l(Drawable drawable) {
        Drawable drawable2 = this.I;
        Drawable a2 = drawable2 != null ? kqj.a(drawable2) : null;
        if (a2 != drawable) {
            float a3 = a();
            this.I = drawable != null ? drawable.mutate() : null;
            float a4 = a();
            ak(a2);
            if (ai()) {
                ac(this.I);
            }
            invalidateSelf();
            if (a3 != a4) {
                j();
            }
        }
    }

    public final void m(boolean z) {
        if (this.H != z) {
            boolean ai = ai();
            this.H = z;
            boolean ai2 = ai();
            if (ai != ai2) {
                if (ai2) {
                    ac(this.I);
                } else {
                    ak(this.I);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void n(boolean z) {
        if (this.f != z) {
            boolean aj = aj();
            this.f = z;
            boolean aj2 = aj();
            if (aj != aj2) {
                if (aj2) {
                    ac(this.g);
                } else {
                    ak(this.g);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void o(ehdg ehdgVar) {
        this.ao = new WeakReference(ehdgVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ai()) {
            onLayoutDirectionChanged |= this.I.setLayoutDirection(i);
        }
        if (ah()) {
            onLayoutDirectionChanged |= this.P.setLayoutDirection(i);
        }
        if (aj()) {
            onLayoutDirectionChanged |= this.g.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (ai()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (ah()) {
            onLevelChange |= this.P.setLevel(i);
        }
        if (aj()) {
            onLevelChange |= this.g.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable, defpackage.ehiu
    public final boolean onStateChange(int[] iArr) {
        if (this.ap) {
            super.onStateChange(iArr);
        }
        return ag(iArr, this.an);
    }

    public final void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.m.d = true;
        invalidateSelf();
        j();
    }

    public final void q(ehmu ehmuVar) {
        this.m.c(ehmuVar, this.V);
    }

    public final void r(int i) {
        q(new ehmu(this.V, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ai != i) {
            this.ai = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.aj != colorFilter) {
            this.aj = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.al != colorStateList) {
            this.al = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.am != mode) {
            this.am = mode;
            this.ak = ehfy.b(this, this.al, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ai()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (ah()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (aj()) {
            visible |= this.g.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean t(int[] iArr) {
        if (Arrays.equals(this.an, iArr)) {
            return false;
        }
        this.an = iArr;
        if (aj()) {
            return ag(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
