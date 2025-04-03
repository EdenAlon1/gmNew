package androidx.compose.foundation.layout;

import defpackage.eca;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends ivp<eca> {
    private final float a;
    private final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eca(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eca ecaVar = (eca) hvhVar;
        ecaVar.a = this.a;
        ecaVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return jzq.b(this.a, unspecifiedConstraintsElement.a) && jzq.b(this.b, unspecifiedConstraintsElement.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
