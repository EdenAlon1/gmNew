package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfl implements jdu {
    private static boolean a = true;
    private final AndroidComposeView b;
    private final RenderNode c;
    private int d;
    private ict e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;

    public jfl(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.c = create;
        this.d = 0;
        if (a) {
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
            Q();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            a = false;
        }
        this.k = 3;
    }

    private final ict O() {
        ict ictVar = this.e;
        if (ictVar != null) {
            return ictVar;
        }
        iba ibaVar = new iba();
        this.e = ibaVar;
        return ibaVar;
    }

    private final void P(RenderNode renderNode, int i) {
        if (icc.b(i, 1)) {
            renderNode.setLayerType(2);
            ict ictVar = this.e;
            renderNode.setLayerPaint(ictVar != null ? ((iba) ictVar).a : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (icc.b(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Q() {
        this.c.discardDisplayList();
    }

    private final void R() {
        int i = this.d;
        if (icc.b(i, 1) || !ibk.b(this.k, 3)) {
            P(this.c, 1);
        } else {
            P(this.c, i);
        }
    }

    @Override // defpackage.jdu
    public final void A(float f) {
        this.c.setRotationX(f);
    }

    @Override // defpackage.jdu
    public final void B(float f) {
        this.c.setRotationY(f);
    }

    @Override // defpackage.jdu
    public final void C(float f) {
        this.c.setRotation(f);
    }

    @Override // defpackage.jdu
    public final void D(float f) {
        this.c.setScaleX(f);
    }

    @Override // defpackage.jdu
    public final void E(float f) {
        this.c.setScaleY(f);
    }

    @Override // defpackage.jdu
    public final void F(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setSpotShadowColor(i);
        }
    }

    @Override // defpackage.jdu
    public final void G(float f) {
        this.c.setTranslationX(f);
    }

    @Override // defpackage.jdu
    public final void H(float f) {
        this.c.setTranslationY(f);
    }

    @Override // defpackage.jdu
    public final boolean I() {
        return this.j;
    }

    @Override // defpackage.jdu
    public final boolean J() {
        return this.c.getClipToOutline();
    }

    @Override // defpackage.jdu
    public final boolean K() {
        return this.c.isValid();
    }

    @Override // defpackage.jdu
    public final boolean L(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        return this.c.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.jdu
    public final void M() {
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jdu
    public final void N() {
        O().l(null);
        R();
    }

    @Override // defpackage.jdu
    public final float a() {
        return this.c.getAlpha();
    }

    @Override // defpackage.jdu
    public final float b() {
        return this.c.getElevation();
    }

    @Override // defpackage.jdu
    public final int c() {
        return this.i;
    }

    @Override // defpackage.jdu
    public final int d() {
        return this.i - this.g;
    }

    @Override // defpackage.jdu
    public final int e() {
        return this.f;
    }

    @Override // defpackage.jdu
    public final int f() {
        return this.h;
    }

    @Override // defpackage.jdu
    public final int g() {
        return this.g;
    }

    @Override // defpackage.jdu
    public final int h() {
        return this.h - this.f;
    }

    @Override // defpackage.jdu
    public final void i() {
        Q();
    }

    @Override // defpackage.jdu
    public final void j(Canvas canvas) {
        canvas.getClass();
        ((DisplayListCanvas) canvas).drawRenderNode(this.c);
    }

    @Override // defpackage.jdu
    public final void k(Matrix matrix) {
        this.c.getMatrix(matrix);
    }

    @Override // defpackage.jdu
    public final void l(int i) {
        this.f += i;
        this.h += i;
        this.c.offsetLeftAndRight(i);
    }

    @Override // defpackage.jdu
    public final void m(int i) {
        this.g += i;
        this.i += i;
        this.c.offsetTopAndBottom(i);
    }

    @Override // defpackage.jdu
    public final void n(ibu ibuVar, icv icvVar, ffji ffjiVar) {
        DisplayListCanvas start = this.c.start(h(), d());
        iau iauVar = ibuVar.a;
        Canvas canvas = iauVar.a;
        iauVar.a = start;
        if (icvVar != null) {
            iauVar.l();
            iauVar.r(icvVar);
        }
        ffjiVar.invoke(iauVar);
        if (icvVar != null) {
            iauVar.j();
        }
        ibuVar.a.a = canvas;
        this.c.end(start);
    }

    @Override // defpackage.jdu
    public final void o(float f) {
        this.c.setAlpha(f);
    }

    @Override // defpackage.jdu
    public final void p(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setAmbientShadowColor(i);
        }
    }

    @Override // defpackage.jdu
    public final void q(int i) {
        this.k = i;
        O().j(i);
        R();
    }

    @Override // defpackage.jdu
    public final void r(float f) {
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.jdu
    public final void s(boolean z) {
        this.j = z;
        this.c.setClipToBounds(z);
    }

    @Override // defpackage.jdu
    public final void t(boolean z) {
        this.c.setClipToOutline(z);
    }

    @Override // defpackage.jdu
    public final void u(int i) {
        this.d = i;
        R();
    }

    @Override // defpackage.jdu
    public final void v(float f) {
        this.c.setElevation(f);
    }

    @Override // defpackage.jdu
    public final void w(Outline outline) {
        this.c.setOutline(outline);
    }

    @Override // defpackage.jdu
    public final void x(float f) {
        this.c.setPivotX(f);
    }

    @Override // defpackage.jdu
    public final void y(float f) {
        this.c.setPivotY(f);
    }

    @Override // defpackage.jdu
    public final void z(idc idcVar) {
    }
}
