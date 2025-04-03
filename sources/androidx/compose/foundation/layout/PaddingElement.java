package androidx.compose.foundation.layout;

import defpackage.ebc;
import defpackage.edc;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends ivp<ebc> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3))) || !(f4 >= 0.0f || Float.isNaN(f4))) {
            edc.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ebc(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ebc ebcVar = (ebc) hvhVar;
        ebcVar.a = this.a;
        ebcVar.b = this.b;
        ebcVar.c = this.c;
        ebcVar.d = this.d;
        ebcVar.e = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && jzq.b(this.a, paddingElement.a) && jzq.b(this.b, paddingElement.b) && jzq.b(this.c, paddingElement.c) && jzq.b(this.d, paddingElement.d);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + 1231;
    }
}
