package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igf implements igd {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private boolean A;
    private idc B;
    private final ibu b;
    private final ifm c;
    private final RenderNode d;
    private long e;
    private Paint f;
    private Matrix g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private long s;
    private long t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    public igf(View view, ibu ibuVar, ifm ifmVar) {
        this.b = ibuVar;
        this.c = ifmVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (a.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                create.setAmbientShadowColor(create.getAmbientShadowColor());
                create.setSpotShadowColor(create.getSpotShadowColor());
            }
            O();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = ibw.a;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    private final void P() {
        boolean z = this.y;
        boolean z2 = z && !this.h;
        boolean z3 = z && this.h;
        if (z2 != this.z) {
            this.z = z2;
            this.d.setClipToBounds(z2);
        }
        if (z3 != this.A) {
            this.A = z3;
            this.d.setClipToOutline(z3);
        }
    }

    private final void Q(int i) {
        RenderNode renderNode = this.d;
        if (ifx.a(i, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (ifx.a(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        int i = this.j;
        if (ifx.a(i, 1) || !ibk.b(this.k, 3)) {
            Q(1);
        } else {
            Q(i);
        }
    }

    @Override // defpackage.igd
    public final void A(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.igd
    public final void B(int i, int i2, long j) {
        int i3 = (int) (4294967295L & j);
        int i4 = (int) (j >> 32);
        this.d.setLeftTopRightBottom(i, i2, i + i4, i2 + i3);
        if (kaf.e(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i4 / 2.0f);
            this.d.setPivotY(i3 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.igd
    public final void C(idc idcVar) {
        this.B = idcVar;
    }

    @Override // defpackage.igd
    public final void D(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.igd
    public final void E(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.igd
    public final void F(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.igd
    public final void G(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.igd
    public final void H(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.igd
    public final void I(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.igd
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            this.d.setSpotShadowColor(iby.b(j));
        }
    }

    @Override // defpackage.igd
    public final void K(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.igd
    public final void L(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.igd
    public final boolean M() {
        return this.d.isValid();
    }

    @Override // defpackage.igd
    public final void N() {
        R();
    }

    public final void O() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.igd
    public final float a() {
        return this.l;
    }

    @Override // defpackage.igd
    public final float b() {
        return this.x;
    }

    @Override // defpackage.igd
    public final float c() {
        return this.u;
    }

    @Override // defpackage.igd
    public final float d() {
        return this.v;
    }

    @Override // defpackage.igd
    public final float e() {
        return this.w;
    }

    @Override // defpackage.igd
    public final float f() {
        return this.n;
    }

    @Override // defpackage.igd
    public final float g() {
        return this.o;
    }

    @Override // defpackage.igd
    public final float h() {
        return this.r;
    }

    @Override // defpackage.igd
    public final float i() {
        return this.p;
    }

    @Override // defpackage.igd
    public final float j() {
        return this.q;
    }

    @Override // defpackage.igd
    public final int k() {
        return this.k;
    }

    @Override // defpackage.igd
    public final int l() {
        return this.j;
    }

    @Override // defpackage.igd
    public final long m() {
        return this.s;
    }

    @Override // defpackage.igd
    public final long n() {
        return this.t;
    }

    @Override // defpackage.igd
    public final Matrix o() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.igd
    public final idc p() {
        return this.B;
    }

    @Override // defpackage.igd
    public final void q() {
        O();
    }

    @Override // defpackage.igd
    public final void r(ibt ibtVar) {
        DisplayListCanvas a2 = iav.a(ibtVar);
        a2.getClass();
        a2.drawRenderNode(this.d);
    }

    @Override // defpackage.igd
    public final void s(jzn jznVar, kah kahVar, iga igaVar, ffji ffjiVar) {
        DisplayListCanvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (4294967295L & this.i)));
        try {
            ibu ibuVar = this.b;
            iau iauVar = ibuVar.a;
            Canvas canvas = iauVar.a;
            iauVar.a = start;
            ifm ifmVar = this.c;
            long d = kag.d(this.e);
            jzn c = ifmVar.b.c();
            kah d2 = ifmVar.b.d();
            ibt b = ifmVar.b.b();
            long a2 = ifmVar.b.a();
            ifl iflVar = ifmVar.b;
            iga igaVar2 = iflVar.a;
            iflVar.f(jznVar);
            iflVar.g(kahVar);
            iflVar.e(iauVar);
            iflVar.h(d);
            iflVar.a = igaVar;
            iauVar.l();
            try {
                ffjiVar.invoke(ifmVar);
                iauVar.j();
                ifl iflVar2 = ifmVar.b;
                iflVar2.f(c);
                iflVar2.g(d2);
                iflVar2.e(b);
                iflVar2.h(a2);
                iflVar2.a = igaVar2;
                ibuVar.a.a = canvas;
            } catch (Throwable th) {
                iauVar.j();
                ifl iflVar3 = ifmVar.b;
                iflVar3.f(c);
                iflVar3.g(d2);
                iflVar3.e(b);
                iflVar3.h(a2);
                iflVar3.a = igaVar2;
                throw th;
            }
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.igd
    public final void t(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.igd
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            this.d.setAmbientShadowColor(iby.b(j));
        }
    }

    @Override // defpackage.igd
    public final void v(int i) {
        if (ibk.b(this.k, i)) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(iat.b(i)));
        R();
    }

    @Override // defpackage.igd
    public final void w(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.igd
    public final void x(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.igd
    public final void y(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.igd
    public final void z(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }
}
