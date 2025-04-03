package androidx.compose.ui.graphics;

import defpackage.ffco;
import defpackage.ffcp;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibk;
import defpackage.ibw;
import defpackage.ibx;
import defpackage.icc;
import defpackage.idc;
import defpackage.idh;
import defpackage.idk;
import defpackage.idq;
import defpackage.idr;
import defpackage.isx;
import defpackage.ivp;
import defpackage.iwi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends ivp<idk> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float f;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final idh m;
    private final boolean n;
    private final long p;
    private final long q;
    private final int r;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final idc o = null;
    private final int s = 3;
    private final ibx t = null;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, idh idhVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = f5;
        this.g = f6;
        this.j = f7;
        this.k = f8;
        this.l = j;
        this.m = idhVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new idk(this.a, this.b, this.c, this.d, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        idk idkVar = (idk) hvhVar;
        idkVar.a = this.a;
        idkVar.b = this.b;
        idkVar.c = this.c;
        idkVar.d = this.d;
        idkVar.e = this.f;
        idkVar.f = this.g;
        idkVar.g = this.j;
        idkVar.h = this.k;
        idkVar.i = this.l;
        idkVar.j = this.m;
        idkVar.k = this.n;
        idkVar.l = this.p;
        idkVar.m = this.q;
        idkVar.n = this.r;
        idkVar.o = 3;
        iwi iwiVar = isx.e(idkVar, 2).u;
        if (iwiVar != null) {
            iwiVar.au(idkVar.A, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0) {
            return false;
        }
        float f = graphicsLayerElement.h;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.i;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0 || !idr.d(this.l, graphicsLayerElement.l) || !ffkj.e(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        idc idcVar = graphicsLayerElement.o;
        if (!ffkj.e(null, null)) {
            return false;
        }
        long j = this.p;
        long j2 = graphicsLayerElement.p;
        long j3 = ibw.a;
        if (!ffcp.a(j, j2) || !ffcp.a(this.q, graphicsLayerElement.q) || !icc.b(this.r, graphicsLayerElement.r)) {
            return false;
        }
        int i = graphicsLayerElement.s;
        if (!ibk.b(3, 3)) {
            return false;
        }
        ibx ibxVar = graphicsLayerElement.t;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int floatToIntBits = (((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k);
        long j = idr.a;
        int a = (((floatToIntBits * 31) + idq.a(this.l)) * 31) + this.m.hashCode();
        long j2 = ibw.a;
        return ((((((((((a * 31) + (true != this.n ? 1237 : 1231)) * 961) + ffco.a(this.p)) * 31) + ffco.a(this.q)) * 31) + this.r) * 31) + 3) * 31;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=" + this.d + ", translationY=" + this.f + ", shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + ((Object) idr.c(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) ibw.g(this.p)) + ", spotShadowColor=" + ((Object) ibw.g(this.q)) + ", compositingStrategy=" + ((Object) icc.a(this.r)) + ", blendMode=" + ((Object) ibk.a(3)) + ", colorFilter=null)";
    }
}
