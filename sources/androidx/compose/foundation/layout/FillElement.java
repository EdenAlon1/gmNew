package androidx.compose.foundation.layout;

import defpackage.dzg;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends ivp<dzg> {
    private final float a;
    private final int b;

    public FillElement(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dzg(this.b, this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dzg dzgVar = (dzg) hvhVar;
        dzgVar.b = this.b;
        dzgVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.a == fillElement.a;
    }

    public final int hashCode() {
        return (this.b * 31) + Float.floatToIntBits(this.a);
    }
}
