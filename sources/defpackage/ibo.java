package defpackage;

import android.graphics.RenderEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibo extends idc {
    private final idc a = null;
    private final float b;
    private final float c;
    private final int d;

    public ibo(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.idc
    protected final RenderEffect a() {
        RenderEffect createBlurEffect;
        RenderEffect createOffsetEffect;
        float f = this.b;
        float f2 = this.c;
        if (f == 0.0f && f2 == 0.0f) {
            createOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            return createOffsetEffect;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f, f2, ibi.a(this.d));
        return createBlurEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibo)) {
            return false;
        }
        ibo iboVar = (ibo) obj;
        if (this.b != iboVar.b || this.c != iboVar.c || !idp.b(this.d, iboVar.d)) {
            return false;
        }
        idc idcVar = iboVar.a;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) idp.a(this.d)) + ')';
    }
}
