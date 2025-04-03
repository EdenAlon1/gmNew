package androidx.compose.ui.draw;

import defpackage.ffco;
import defpackage.ffcp;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.hyb;
import defpackage.ibn;
import defpackage.ibw;
import defpackage.idh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends ivp<ibn> {
    public final float a;
    public final idh b;
    public final boolean c;
    public final long d;
    public final long f;

    public ShadowGraphicsLayerElement(float f, idh idhVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = idhVar;
        this.c = z;
        this.d = j;
        this.f = j2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ibn(new hyb(this));
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ibn ibnVar = (ibn) hvhVar;
        ibnVar.a = new hyb(this);
        ibnVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!jzq.b(this.a, shadowGraphicsLayerElement.a) || !ffkj.e(this.b, shadowGraphicsLayerElement.b) || this.c != shadowGraphicsLayerElement.c) {
            return false;
        }
        long j = this.d;
        long j2 = shadowGraphicsLayerElement.d;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.f, shadowGraphicsLayerElement.f);
    }

    public final int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
        long j = ibw.a;
        return (((((floatToIntBits * 31) + (true != this.c ? 1237 : 1231)) * 31) + ffco.a(this.d)) * 31) + ffco.a(this.f);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) jzq.a(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) ibw.g(this.d)) + ", spotColor=" + ((Object) ibw.g(this.f)) + ')';
    }
}
