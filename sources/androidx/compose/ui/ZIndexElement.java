package androidx.compose.ui;

import defpackage.hvh;
import defpackage.hvt;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ZIndexElement extends ivp<hvt> {
    private final float a;

    public ZIndexElement(float f) {
        this.a = f;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hvt(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((hvt) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.a, ((ZIndexElement) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.a + ')';
    }
}
