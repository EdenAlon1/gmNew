package androidx.compose.material3.internal;

import defpackage.ffji;
import defpackage.hav;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChildSemanticsNodeElement extends ivp<hav> {
    private final ffji a;

    public ChildSemanticsNodeElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hav(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hav havVar = (hav) hvhVar;
        havVar.a = this.a;
        ixo.a(havVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.a == ((ChildSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
