package androidx.compose.foundation.layout;

import defpackage.eaw;
import defpackage.hvh;
import defpackage.itz;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends ivp<eaw> {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eaw(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eaw eawVar = (eaw) hvhVar;
        float f = eawVar.a;
        float f2 = this.a;
        boolean b = jzq.b(f, f2);
        float f3 = this.b;
        if (!b || !jzq.b(eawVar.b, f3) || !eawVar.c) {
            itz.c(eawVar);
        }
        eawVar.a = f2;
        eawVar.b = f3;
        eawVar.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && jzq.b(this.a, offsetElement.a) && jzq.b(this.b, offsetElement.b);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) jzq.a(this.a)) + ", y=" + ((Object) jzq.a(this.b)) + ", rtlAware=true)";
    }
}
