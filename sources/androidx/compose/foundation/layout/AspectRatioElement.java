package androidx.compose.foundation.layout;

import defpackage.dxx;
import defpackage.edc;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AspectRatioElement extends ivp<dxx> {
    private final float a;
    private final boolean b = false;

    public AspectRatioElement(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        edc.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dxx(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((dxx) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.a != aspectRatioElement.a) {
            return false;
        }
        boolean z = ((AspectRatioElement) obj).b;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + 1237;
    }
}
