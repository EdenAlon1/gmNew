package androidx.compose.foundation.layout;

import defpackage.ean;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends ivp<ean> {
    private final int a;

    public IntrinsicHeightElement(int i) {
        this.a = i;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ean(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ean eanVar = (ean) hvhVar;
        eanVar.b = this.a;
        eanVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.a == intrinsicHeightElement.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
