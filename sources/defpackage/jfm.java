package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfm implements jdu {
    private ict c;
    private final RenderNode a = new RenderNode("Compose");
    private int b = 0;
    private int d = 3;

    private final ict O() {
        ict ictVar = this.c;
        if (ictVar != null) {
            return ictVar;
        }
        iba ibaVar = new iba();
        this.c = ibaVar;
        return ibaVar;
    }

    private final void P(RenderNode renderNode, int i) {
        if (icc.b(i, 1)) {
            ict ictVar = this.c;
            renderNode.setUseCompositingLayer(true, ictVar != null ? ((iba) ictVar).a : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (icc.b(i, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Q() {
        int i = this.b;
        if (icc.b(i, 1) || !ibk.b(this.d, 3)) {
            P(this.a, 1);
        } else {
            P(this.a, i);
        }
    }

    @Override // defpackage.jdu
    public final void A(float f) {
        this.a.setRotationX(f);
    }

    @Override // defpackage.jdu
    public final void B(float f) {
        this.a.setRotationY(f);
    }

    @Override // defpackage.jdu
    public final void C(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.jdu
    public final void D(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.jdu
    public final void E(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.jdu
    public final void F(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // defpackage.jdu
    public final void G(float f) {
        this.a.setTranslationX(f);
    }

    @Override // defpackage.jdu
    public final void H(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.jdu
    public final boolean I() {
        boolean clipToBounds;
        clipToBounds = this.a.getClipToBounds();
        return clipToBounds;
    }

    @Override // defpackage.jdu
    public final boolean J() {
        boolean clipToOutline;
        clipToOutline = this.a.getClipToOutline();
        return clipToOutline;
    }

    @Override // defpackage.jdu
    public final boolean K() {
        boolean hasDisplayList;
        hasDisplayList = this.a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.jdu
    public final boolean L(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.a.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // defpackage.jdu
    public final void M() {
        this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jdu
    public final void N() {
        O().l(null);
        Q();
    }

    @Override // defpackage.jdu
    public final float a() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
    }

    @Override // defpackage.jdu
    public final float b() {
        float elevation;
        elevation = this.a.getElevation();
        return elevation;
    }

    @Override // defpackage.jdu
    public final int c() {
        int bottom;
        bottom = this.a.getBottom();
        return bottom;
    }

    @Override // defpackage.jdu
    public final int d() {
        int height;
        height = this.a.getHeight();
        return height;
    }

    @Override // defpackage.jdu
    public final int e() {
        int left;
        left = this.a.getLeft();
        return left;
    }

    @Override // defpackage.jdu
    public final int f() {
        int right;
        right = this.a.getRight();
        return right;
    }

    @Override // defpackage.jdu
    public final int g() {
        int top;
        top = this.a.getTop();
        return top;
    }

    @Override // defpackage.jdu
    public final int h() {
        int width;
        width = this.a.getWidth();
        return width;
    }

    @Override // defpackage.jdu
    public final void i() {
        this.a.discardDisplayList();
    }

    @Override // defpackage.jdu
    public final void j(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.jdu
    public final void k(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.jdu
    public final void l(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.jdu
    public final void m(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.jdu
    public final void n(ibu ibuVar, icv icvVar, ffji ffjiVar) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.a;
        iau iauVar = ibuVar.a;
        beginRecording = renderNode.beginRecording();
        Canvas canvas = iauVar.a;
        iauVar.a = beginRecording;
        if (icvVar != null) {
            iauVar.l();
            iauVar.r(icvVar);
        }
        ffjiVar.invoke(iauVar);
        if (icvVar != null) {
            iauVar.j();
        }
        ibuVar.a.a = canvas;
        this.a.endRecording();
    }

    @Override // defpackage.jdu
    public final void o(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.jdu
    public final void p(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.jdu
    public final void q(int i) {
        this.d = i;
        O().j(i);
        Q();
    }

    @Override // defpackage.jdu
    public final void r(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.jdu
    public final void s(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.jdu
    public final void t(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.jdu
    public final void u(int i) {
        this.b = i;
        Q();
    }

    @Override // defpackage.jdu
    public final void v(float f) {
        this.a.setElevation(f);
    }

    @Override // defpackage.jdu
    public final void w(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.jdu
    public final void x(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.jdu
    public final void y(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.jdu
    public final void z(idc idcVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.setRenderEffect(idcVar != null ? idcVar.b() : null);
        }
    }
}
