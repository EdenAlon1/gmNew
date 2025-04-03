package androidx.compose.ui;

import defpackage.hvh;
import defpackage.hvm;
import defpackage.isx;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SensitiveNodeElement extends ivp<hvm> {
    private final boolean a = true;

    @Override // defpackage.ivp
    public final /* synthetic */ hvh d() {
        return new hvm();
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hvm hvmVar = (hvm) hvhVar;
        hvmVar.b = true;
        if (hvmVar.a) {
            return;
        }
        isx.f(hvmVar).q();
        hvmVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveNodeElement)) {
            return false;
        }
        boolean z = ((SensitiveNodeElement) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "SensitiveNodeElement(isContentSensitive=true)";
    }
}
