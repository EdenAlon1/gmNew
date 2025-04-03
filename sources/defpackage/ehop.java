package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehop extends Drawable implements ehph {
    public static final /* synthetic */ int A = 0;
    private static final String a = "ehop";
    private static final Paint b;
    private static final ehoo[] c;
    private PorterDuffColorFilter B;
    private final RectF C;
    private boolean D;
    private ehow E;
    private lem F;
    private float[] G;
    private final ehom H;
    private final ehov d;
    private final Matrix e;
    private final Path f;
    private final Path g;
    private final RectF h;
    private final RectF i;
    private final Region j;
    private final Region k;
    private final Paint l;
    private final Paint m;
    private final ehod n;
    private final ehoy o;
    private PorterDuffColorFilter p;
    public ehon q;
    public final ehpf[] r;
    public final ehpf[] s;
    public final BitSet t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    lel[] y;
    public float[] z;

    static {
        ehou ehouVar = new ehou();
        int i = 0;
        ehoi a2 = ehoq.a(0);
        ehouVar.e(a2);
        ehouVar.g(a2);
        ehouVar.c(a2);
        ehouVar.a(a2);
        ehouVar.i(0.0f);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new ehoo[4];
        while (true) {
            ehoo[] ehooVarArr = c;
            int length = ehooVarArr.length;
            if (i >= 4) {
                return;
            }
            ehooVarArr[i] = new ehoo(i);
            i++;
        }
    }

    public ehop() {
        this(new ehow());
    }

    public static ehop E(Context context) {
        return F(context, 0.0f, null);
    }

    public static ehop F(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ehdr.d(context, R.attr.colorSurface, a));
        }
        ehop ehopVar = new ehop();
        ehopVar.K(context);
        ehopVar.O(colorStateList);
        ehopVar.N(f);
        return ehopVar;
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = z(colorForState);
            }
            this.w = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int z2 = z(color);
        this.w = z2;
        if (z2 != color) {
            return new PorterDuffColorFilter(z2, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private final RectF c() {
        this.i.set(D());
        RectF rectF = this.i;
        float v = v();
        rectF.inset(v, v);
        return this.i;
    }

    private final void d(RectF rectF, Path path) {
        H(rectF, path);
        if (this.q.k != 1.0f) {
            this.e.reset();
            Matrix matrix = this.e;
            float f = this.q.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.e);
        }
        path.computeBounds(this.C, true);
    }

    private final void e(Canvas canvas) {
        if (this.t.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.q.t != 0) {
            canvas.drawPath(this.f, this.n.e);
        }
        for (int i = 0; i < 4; i++) {
            this.r[i].c(this.n, this.q.s, canvas);
            this.s[i].c(this.n, this.q.s, canvas);
        }
        if (this.x) {
            int A2 = A();
            int B = B();
            canvas.translate(-A2, -B);
            canvas.drawPath(this.f, b);
            canvas.translate(A2, B);
        }
    }

    private final void g(int[] iArr, boolean z) {
        boolean z2;
        RectF D = D();
        if (this.q.b == null || D.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.F == null);
        if (this.z == null) {
            this.z = new float[4];
        }
        ehpo ehpoVar = this.q.b;
        int a2 = ehpoVar.a(iArr);
        if (a2 < 0) {
            a2 = ehpoVar.a(StateSet.WILD_CARD);
        }
        ehow ehowVar = ehpoVar.d[a2];
        for (int i = 0; i < 4; i++) {
            float a3 = ehoy.c(i, ehowVar).a(D);
            if (z3) {
                this.z[i] = a3;
                z2 = true;
            } else {
                z2 = false;
            }
            lel lelVar = this.y[i];
            if (lelVar != null) {
                lelVar.e(a3);
                if (z2) {
                    this.y[i].f();
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final void h() {
        float y = y();
        this.q.s = (int) Math.ceil(0.75f * y);
        this.q.t = (int) Math.ceil(y * 0.25f);
        k();
        super.invalidateSelf();
    }

    private final boolean i() {
        return (this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.STROKE) && this.m.getStrokeWidth() > 0.0f;
    }

    private final boolean j(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.q.e != null && color2 != (colorForState2 = this.q.e.getColorForState(iArr, (color2 = this.l.getColor())))) {
            this.l.setColor(colorForState2);
            z = true;
        }
        if (this.q.f == null || color == (colorForState = this.q.f.getColorForState(iArr, (color = this.m.getColor())))) {
            return z;
        }
        this.m.setColor(colorForState);
        return true;
    }

    private final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter = this.p;
        PorterDuffColorFilter porterDuffColorFilter2 = this.B;
        ehon ehonVar = this.q;
        this.p = b(ehonVar.h, ehonVar.i, this.l, true);
        ehon ehonVar2 = this.q;
        ColorStateList colorStateList = ehonVar2.g;
        this.B = b(null, ehonVar2.i, this.m, false);
        boolean z = this.q.v;
        return (Objects.equals(porterDuffColorFilter, this.p) && Objects.equals(porterDuffColorFilter2, this.B)) ? false : true;
    }

    private static final float l(RectF rectF, ehow ehowVar, float[] fArr) {
        if (fArr == null) {
            if (ehowVar.g(rectF)) {
                return ehowVar.f.a(rectF);
            }
            return -1.0f;
        }
        if (ehjj.b(fArr) && ehowVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int A() {
        ehon ehonVar = this.q;
        return (int) (ehonVar.t * Math.sin(Math.toRadians(ehonVar.u)));
    }

    public final int B() {
        ehon ehonVar = this.q;
        return (int) (ehonVar.t * Math.cos(Math.toRadians(ehonVar.u)));
    }

    public final ColorStateList C() {
        return this.q.e;
    }

    public final RectF D() {
        this.h.set(getBounds());
        return this.h;
    }

    public final ehow G() {
        return this.q.a;
    }

    protected final void H(RectF rectF, Path path) {
        ehon ehonVar = this.q;
        this.o.a(ehonVar.a, this.z, ehonVar.l, rectF, this.H, path);
    }

    public final void I(Canvas canvas, Paint paint, Path path, ehow ehowVar, float[] fArr, RectF rectF) {
        float l = l(rectF, ehowVar, fArr);
        if (l < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = l * this.q.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void J(Canvas canvas) {
        I(canvas, this.m, this.g, this.E, this.G, c());
    }

    public final void K(Context context) {
        this.q.c = new ehfz(context);
        h();
    }

    public final void L(float f) {
        fy(this.q.a.d(f));
    }

    public final void M(lem lemVar) {
        if (this.F == lemVar) {
            return;
        }
        this.F = lemVar;
        int i = 0;
        while (true) {
            lel[] lelVarArr = this.y;
            int length = lelVarArr.length;
            if (i >= 4) {
                g(getState(), true);
                invalidateSelf();
                return;
            }
            if (lelVarArr[i] == null) {
                lelVarArr[i] = new lel(this, c[i]);
            }
            lel lelVar = this.y[i];
            lem lemVar2 = new lem();
            lemVar2.c((float) lemVar.b);
            double d = lemVar.a;
            lemVar2.e((float) (d * d));
            lelVar.r = lemVar2;
            i++;
        }
    }

    public final void N(float f) {
        ehon ehonVar = this.q;
        if (ehonVar.p != f) {
            ehonVar.p = f;
            h();
        }
    }

    public final void O(ColorStateList colorStateList) {
        ehon ehonVar = this.q;
        if (ehonVar.e != colorStateList) {
            ehonVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void P(float f) {
        ehon ehonVar = this.q;
        if (ehonVar.l != f) {
            ehonVar.l = f;
            this.u = true;
            this.v = true;
            invalidateSelf();
        }
    }

    public final void Q(float f) {
        ehon ehonVar = this.q;
        if (ehonVar.o != f) {
            ehonVar.o = f;
            h();
        }
    }

    public final void R(int i) {
        this.n.a(i);
        this.q.v = false;
        super.invalidateSelf();
    }

    public final void S(ehpo ehpoVar) {
        ehon ehonVar = this.q;
        if (ehonVar.b != ehpoVar) {
            ehonVar.b = ehpoVar;
            g(getState(), true);
            invalidateSelf();
        }
    }

    public final void T(float f, int i) {
        W(f);
        V(ColorStateList.valueOf(i));
    }

    public final void U(float f, ColorStateList colorStateList) {
        W(f);
        V(colorStateList);
    }

    public final void V(ColorStateList colorStateList) {
        ehon ehonVar = this.q;
        if (ehonVar.f != colorStateList) {
            ehonVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void W(float f) {
        this.q.m = f;
        invalidateSelf();
    }

    public final boolean X() {
        if (this.q.a.g(D())) {
            return true;
        }
        float[] fArr = this.z;
        return fArr != null && ehjj.b(fArr) && this.q.a.f();
    }

    public final void Y() {
        ehon ehonVar = this.q;
        if (ehonVar.r != 2) {
            ehonVar.r = 2;
            super.invalidateSelf();
        }
    }

    public final void Z() {
        ehon ehonVar = this.q;
        if (ehonVar.u != 180) {
            ehonVar.u = 180;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        this.l.setColorFilter(this.p);
        int alpha = this.l.getAlpha();
        this.l.setAlpha(a(alpha, this.q.n));
        this.m.setColorFilter(this.B);
        this.m.setStrokeWidth(this.q.m);
        int alpha2 = this.m.getAlpha();
        this.m.setAlpha(a(alpha2, this.q.n));
        if (this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.FILL) {
            if (this.u) {
                d(D(), this.f);
                this.u = false;
            }
            ehon ehonVar = this.q;
            int i2 = ehonVar.r;
            if (i2 != 1 && ehonVar.s > 0 && (i2 == 2 || (!X() && !this.f.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate(A(), B());
                if (this.x) {
                    float width = this.C.width() - getBounds().width();
                    float height = this.C.height() - getBounds().height();
                    int i3 = (int) width;
                    if (i3 < 0 || (i = (int) height) < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    int width2 = (int) this.C.width();
                    int i4 = this.q.s;
                    int height2 = (int) this.C.height();
                    int i5 = this.q.s;
                    Bitmap createBitmap = Bitmap.createBitmap(width2 + i4 + i4 + i3, height2 + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f = (getBounds().left - this.q.s) - i3;
                    float f2 = (getBounds().top - this.q.s) - i;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            I(canvas, this.l, this.f, this.q.a, this.z, D());
        }
        if (i()) {
            if (this.v) {
                this.E = G().e(this.d);
                if (this.z != null) {
                    if (this.G == null) {
                        this.G = new float[4];
                    }
                    float v = v();
                    int i6 = 0;
                    while (true) {
                        float[] fArr = this.z;
                        int length = fArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.G[i6] = Math.max(0.0f, fArr[i6] - v);
                        i6++;
                    }
                } else {
                    this.G = null;
                }
                this.o.a(this.E, this.G, this.q.l, c(), null, this.g);
                this.v = false;
            }
            J(canvas);
        }
        this.l.setAlpha(alpha);
        this.m.setAlpha(alpha2);
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        ehon ehonVar = this.q;
        ehonVar.a = ehowVar;
        ehonVar.b = null;
        this.z = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.q.r == 2) {
            return;
        }
        RectF D = D();
        if (D.isEmpty()) {
            return;
        }
        float l = l(D, this.q.a, this.z);
        if (l >= 0.0f) {
            outline.setRoundRect(getBounds(), l * this.q.l);
            return;
        }
        if (this.u) {
            d(D, this.f);
            this.u = false;
        }
        ehfy.e(outline, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.q.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.j.set(getBounds());
        d(D(), this.f);
        this.k.setPath(this.f, this.j);
        this.j.op(this.k, Region.Op.DIFFERENCE);
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.u = true;
        this.v = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.q.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ehon ehonVar = this.q;
        ColorStateList colorStateList2 = ehonVar.g;
        ColorStateList colorStateList3 = ehonVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.q.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        ehpo ehpoVar = this.q.b;
        return ehpoVar != null && ehpoVar.a > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.q = new ehon(this.q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.u = true;
        this.v = true;
        super.onBoundsChange(rect);
        if (this.q.b != null && !rect.isEmpty()) {
            g(getState(), this.D);
        }
        this.D = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.ehiu
    protected boolean onStateChange(int[] iArr) {
        if (this.q.b != null) {
            g(iArr, false);
        }
        boolean z = j(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ehon ehonVar = this.q;
        if (ehonVar.n != i) {
            ehonVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.q.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.q.h = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ehon ehonVar = this.q;
        if (ehonVar.i != mode) {
            ehonVar.i = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float u() {
        return this.q.p;
    }

    public final float v() {
        if (i()) {
            return this.m.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float w() {
        float[] fArr = this.z;
        return fArr != null ? fArr[3] : this.q.a.f.a(D());
    }

    public final float x() {
        float[] fArr = this.z;
        return fArr != null ? fArr[0] : this.q.a.g.a(D());
    }

    public final float y() {
        float u = u();
        float f = this.q.q;
        return u + 0.0f;
    }

    protected final int z(int i) {
        float y = y();
        ehon ehonVar = this.q;
        float f = y + ehonVar.o;
        ehfz ehfzVar = ehonVar.c;
        return ehfzVar != null ? ehfzVar.b(i, f) : i;
    }

    public ehop(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new ehow(ehow.h(context, attributeSet, i, i2)));
    }

    protected ehop(ehon ehonVar) {
        ehoy ehoyVar;
        this.d = new ehol(this);
        this.r = new ehpf[4];
        this.s = new ehpf[4];
        this.t = new BitSet(8);
        this.e = new Matrix();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Region();
        this.k = new Region();
        Paint paint = new Paint(1);
        this.l = paint;
        Paint paint2 = new Paint(1);
        this.m = paint2;
        this.n = new ehod();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ehoyVar = ehox.a;
        } else {
            ehoyVar = new ehoy();
        }
        this.o = ehoyVar;
        this.C = new RectF();
        this.x = true;
        this.D = true;
        this.y = new lel[4];
        this.q = ehonVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.H = new ehom(this);
    }

    public ehop(ehow ehowVar) {
        this(new ehon(ehowVar));
    }
}
