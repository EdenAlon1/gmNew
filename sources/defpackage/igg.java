package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igg implements igd {
    private final ibu a;
    private final ifm b;
    private final RenderNode c;
    private long d;
    private Paint e;
    private Matrix f;
    private boolean g;
    private float h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private long o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private idc x;
    private int y;

    public igg(ibu ibuVar, ifm ifmVar) {
        this.a = ibuVar;
        this.b = ifmVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = ibw.a;
        this.o = j;
        this.p = j;
        this.t = 8.0f;
        this.y = 0;
    }

    private final Paint O() {
        Paint paint = this.e;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.e = paint2;
        return paint2;
    }

    private final void P() {
        boolean z = this.u;
        boolean z2 = z && !this.g;
        boolean z3 = z && this.g;
        if (z2 != this.v) {
            this.v = z2;
            this.c.setClipToBounds(z2);
        }
        if (z3 != this.w) {
            this.w = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void Q(RenderNode renderNode, int i) {
        if (ifx.a(i, 1)) {
            renderNode.setUseCompositingLayer(true, this.e);
            renderNode.setHasOverlappingRendering(true);
        } else if (ifx.a(i, 2)) {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        int i = this.y;
        if (!ifx.a(i, 1) && ibk.b(this.i, 3) && this.x == null) {
            Q(this.c, i);
        } else {
            Q(this.c, 1);
        }
    }

    @Override // defpackage.igd
    public final void A(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.c.resetPivot();
        } else {
            this.c.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.c.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.igd
    public final void B(int i, int i2, long j) {
        this.c.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.d = kag.d(j);
    }

    @Override // defpackage.igd
    public final void C(idc idcVar) {
        this.x = idcVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.c.setRenderEffect(idcVar != null ? idcVar.b() : null);
        }
    }

    @Override // defpackage.igd
    public final void D(float f) {
        this.q = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.igd
    public final void E(float f) {
        this.r = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.igd
    public final void F(float f) {
        this.s = f;
        this.c.setRotationZ(f);
    }

    @Override // defpackage.igd
    public final void G(float f) {
        this.j = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.igd
    public final void H(float f) {
        this.k = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.igd
    public final void I(float f) {
        this.n = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.igd
    public final void J(long j) {
        this.p = j;
        this.c.setSpotShadowColor(iby.b(j));
    }

    @Override // defpackage.igd
    public final void K(float f) {
        this.l = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.igd
    public final void L(float f) {
        this.m = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.igd
    public final boolean M() {
        boolean hasDisplayList;
        hasDisplayList = this.c.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.igd
    public final void N() {
        O().setColorFilter(null);
        R();
    }

    @Override // defpackage.igd
    public final float a() {
        return this.h;
    }

    @Override // defpackage.igd
    public final float b() {
        return this.t;
    }

    @Override // defpackage.igd
    public final float c() {
        return this.q;
    }

    @Override // defpackage.igd
    public final float d() {
        return this.r;
    }

    @Override // defpackage.igd
    public final float e() {
        return this.s;
    }

    @Override // defpackage.igd
    public final float f() {
        return this.j;
    }

    @Override // defpackage.igd
    public final float g() {
        return this.k;
    }

    @Override // defpackage.igd
    public final float h() {
        return this.n;
    }

    @Override // defpackage.igd
    public final float i() {
        return this.l;
    }

    @Override // defpackage.igd
    public final float j() {
        return this.m;
    }

    @Override // defpackage.igd
    public final int k() {
        return this.i;
    }

    @Override // defpackage.igd
    public final int l() {
        return this.y;
    }

    @Override // defpackage.igd
    public final long m() {
        return this.o;
    }

    @Override // defpackage.igd
    public final long n() {
        return this.p;
    }

    @Override // defpackage.igd
    public final Matrix o() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.igd
    public final idc p() {
        return this.x;
    }

    @Override // defpackage.igd
    public final void q() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.igd
    public final void r(ibt ibtVar) {
        iav.a(ibtVar).drawRenderNode(this.c);
    }

    @Override // defpackage.igd
    public final void s(jzn jznVar, kah kahVar, iga igaVar, ffji ffjiVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.c.beginRecording();
        try {
            ibu ibuVar = this.a;
            iau iauVar = ibuVar.a;
            Canvas canvas = iauVar.a;
            iauVar.a = beginRecording;
            ifl iflVar = this.b.b;
            iflVar.f(jznVar);
            iflVar.g(kahVar);
            iflVar.a = igaVar;
            iflVar.h(this.d);
            iflVar.e(iauVar);
            ffjiVar.invoke(this.b);
            ibuVar.a.a = canvas;
        } finally {
            this.c.endRecording();
        }
    }

    @Override // defpackage.igd
    public final void t(float f) {
        this.h = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.igd
    public final void u(long j) {
        this.o = j;
        this.c.setAmbientShadowColor(iby.b(j));
    }

    @Override // defpackage.igd
    public final void v(int i) {
        this.i = i;
        O().setBlendMode(iat.a(i));
        R();
    }

    @Override // defpackage.igd
    public final void w(float f) {
        this.t = f;
        this.c.setCameraDistance(f);
    }

    @Override // defpackage.igd
    public final void x(boolean z) {
        this.u = z;
        P();
    }

    @Override // defpackage.igd
    public final void y(int i) {
        this.y = i;
        R();
    }

    @Override // defpackage.igd
    public final void z(Outline outline, long j) {
        this.c.setOutline(outline);
        this.g = outline != null;
        P();
    }
}
