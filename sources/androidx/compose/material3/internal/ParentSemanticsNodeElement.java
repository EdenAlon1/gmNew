package androidx.compose.material3.internal;

import defpackage.ffji;
import defpackage.hbu;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParentSemanticsNodeElement extends ivp<hbu> {
    private final ffji a;

    public ParentSemanticsNodeElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hbu(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hbu hbuVar = (hbu) hvhVar;
        hbuVar.a = this.a;
        ixo.a(hbuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.a == ((ParentSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
