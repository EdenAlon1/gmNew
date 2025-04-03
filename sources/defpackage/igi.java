package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igi implements igd {
    private static final Canvas a = new igh();
    private float A;
    private idc B;
    private final igm b;
    private final ibu c;
    private final igl d;
    private final Resources e;
    private final Rect f;
    private Paint g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private long w;
    private long x;
    private float y;
    private float z;

    public /* synthetic */ igi(igm igmVar) {
        ibu ibuVar = new ibu();
        ifm ifmVar = new ifm();
        this.b = igmVar;
        this.c = ibuVar;
        igl iglVar = new igl(igmVar, ibuVar, ifmVar);
        this.d = iglVar;
        this.e = igmVar.getResources();
        this.f = new Rect();
        igmVar.addView(iglVar);
        iglVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = ibw.a;
        this.w = j;
        this.x = j;
    }

    private final Paint P() {
        Paint paint = this.g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.g = paint2;
        return paint2;
    }

    private final void Q(int i) {
        igl iglVar = this.d;
        boolean z = true;
        if (ifx.a(i, 1)) {
            iglVar.setLayerType(2, this.g);
        } else if (ifx.a(i, 2)) {
            iglVar.setLayerType(0, this.g);
            z = false;
        } else {
            iglVar.setLayerType(0, this.g);
        }
        if (iglVar.c != z) {
            iglVar.c = z;
            iglVar.invalidate();
        }
    }

    private final void R() {
        int i = this.o;
        if (ifx.a(i, 1) || !ibk.b(this.n, 3)) {
            Q(1);
        } else {
            Q(i);
        }
    }

    @Override // defpackage.igd
    public final void A(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.q = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                this.d.resetPivot();
                return;
            }
            this.q = true;
            this.d.setPivotX(((int) (this.j >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.j)) / 2.0f);
        }
    }

    @Override // defpackage.igd
    public final void B(int i, int i2, long j) {
        if (kaf.e(this.j, j)) {
            int i3 = this.h;
            if (i3 != i) {
                this.d.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                this.d.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (O()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            this.d.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                this.d.setPivotX(i5 / 2.0f);
                this.d.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.igd
    public final void C(idc idcVar) {
        this.B = idcVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(idcVar != null ? idcVar.b() : null);
        }
    }

    @Override // defpackage.igd
    public final void D(float f) {
        this.y = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.igd
    public final void E(float f) {
        this.z = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.igd
    public final void F(float f) {
        this.A = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.igd
    public final void G(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.igd
    public final void H(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.igd
    public final void I(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.igd
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            this.d.setOutlineSpotShadowColor(iby.b(j));
        }
    }

    @Override // defpackage.igd
    public final void K(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.igd
    public final void L(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.igd
    public final /* synthetic */ boolean M() {
        return true;
    }

    @Override // defpackage.igd
    public final void N() {
        P().setColorFilter(null);
        R();
    }

    public final boolean O() {
        return this.m || this.d.getClipToOutline();
    }

    @Override // defpackage.igd
    public final float a() {
        return this.p;
    }

    @Override // defpackage.igd
    public final float b() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.igd
    public final float c() {
        return this.y;
    }

    @Override // defpackage.igd
    public final float d() {
        return this.z;
    }

    @Override // defpackage.igd
    public final float e() {
        return this.A;
    }

    @Override // defpackage.igd
    public final float f() {
        return this.r;
    }

    @Override // defpackage.igd
    public final float g() {
        return this.s;
    }

    @Override // defpackage.igd
    public final float h() {
        return this.v;
    }

    @Override // defpackage.igd
    public final float i() {
        return this.t;
    }

    @Override // defpackage.igd
    public final float j() {
        return this.u;
    }

    @Override // defpackage.igd
    public final int k() {
        return this.n;
    }

    @Override // defpackage.igd
    public final int l() {
        return this.o;
    }

    @Override // defpackage.igd
    public final long m() {
        return this.w;
    }

    @Override // defpackage.igd
    public final long n() {
        return this.x;
    }

    @Override // defpackage.igd
    public final Matrix o() {
        return this.d.getMatrix();
    }

    @Override // defpackage.igd
    public final idc p() {
        return this.B;
    }

    @Override // defpackage.igd
    public final void q() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.igd
    public final void r(ibt ibtVar) {
        if (this.k) {
            igl iglVar = this.d;
            Rect rect = null;
            if (O() && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.d.getWidth();
                rect.bottom = this.d.getHeight();
            }
            iglVar.setClipBounds(rect);
        }
        if (iav.a(ibtVar).isHardwareAccelerated()) {
            igm igmVar = this.b;
            igl iglVar2 = this.d;
            igmVar.a(ibtVar, iglVar2, iglVar2.getDrawingTime());
        }
    }

    @Override // defpackage.igd
    public final void s(jzn jznVar, kah kahVar, iga igaVar, ffji ffjiVar) {
        if (this.d.getParent() == null) {
            this.b.addView(this.d);
        }
        igl iglVar = this.d;
        iglVar.d = jznVar;
        iglVar.e = kahVar;
        iglVar.f = ffjiVar;
        iglVar.g = igaVar;
        if (iglVar.isAttachedToWindow()) {
            this.d.setVisibility(4);
            this.d.setVisibility(0);
            try {
                ibu ibuVar = this.c;
                Canvas canvas = a;
                iau iauVar = ibuVar.a;
                Canvas canvas2 = iauVar.a;
                iauVar.a = canvas;
                igm igmVar = this.b;
                igl iglVar2 = this.d;
                igmVar.a(iauVar, iglVar2, iglVar2.getDrawingTime());
                ibuVar.a.a = canvas2;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.igd
    public final void t(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.igd
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineAmbientShadowColor(iby.b(j));
        }
    }

    @Override // defpackage.igd
    public final void v(int i) {
        this.n = i;
        P().setXfermode(new PorterDuffXfermode(iat.b(i)));
        R();
    }

    @Override // defpackage.igd
    public final void w(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.igd
    public final void x(boolean z) {
        this.m = z && !this.l;
        this.k = true;
        this.d.setClipToOutline(z && this.l);
    }

    @Override // defpackage.igd
    public final void y(int i) {
        this.o = i;
        R();
    }

    @Override // defpackage.igd
    public final void z(Outline outline, long j) {
        igl iglVar = this.d;
        iglVar.b = outline;
        iglVar.invalidateOutline();
        if (O() && outline != null) {
            this.d.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }
}
