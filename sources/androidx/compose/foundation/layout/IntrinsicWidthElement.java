package androidx.compose.foundation.layout;

import defpackage.ear;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicWidthElement extends ivp<ear> {
    private final int a;

    public IntrinsicWidthElement(int i) {
        this.a = i;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ear(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ear earVar = (ear) hvhVar;
        earVar.b = this.a;
        earVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.a == intrinsicWidthElement.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
