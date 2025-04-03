package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwi {
    public final List a;
    public final boolean b;

    public dpwi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpwi)) {
            return false;
        }
        dpwi dpwiVar = (dpwi) obj;
        return ffkj.e(this.a, dpwiVar.a) && this.b == dpwiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CameraEffectsState(effects=" + this.a + ", isInitializingEffect=" + this.b + ")";
    }

    public dpwi(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public /* synthetic */ dpwi(byte[] bArr) {
        this(ffel.a, false);
    }
}
