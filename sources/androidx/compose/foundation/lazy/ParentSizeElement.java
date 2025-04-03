package androidx.compose.foundation.lazy;

import defpackage.efd;
import defpackage.ffkj;
import defpackage.hkx;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParentSizeElement extends ivp<efd> {
    private final hkx b;
    private final float a = 1.0f;
    private final hkx c = null;

    public ParentSizeElement(hkx hkxVar) {
        this.b = hkxVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new efd(this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        efd efdVar = (efd) hvhVar;
        efdVar.a = 1.0f;
        efdVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        float f = parentSizeElement.a;
        if (ffkj.e(this.b, parentSizeElement.b)) {
            hkx hkxVar = parentSizeElement.c;
            if (ffkj.e(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 961) + Float.floatToIntBits(1.0f);
    }
}
