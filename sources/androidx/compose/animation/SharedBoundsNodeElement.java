package androidx.compose.animation;

import defpackage.cux;
import defpackage.cuy;
import defpackage.cva;
import defpackage.cvf;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.irs;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends ivp<cuy> {
    private final cvf a;

    public SharedBoundsNodeElement(cvf cvfVar) {
        this.a = cvfVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new cuy(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        cuy cuyVar = (cuy) hvhVar;
        cvf cvfVar = cuyVar.a;
        cvf cvfVar2 = this.a;
        if (ffkj.e(cvfVar2, cvfVar)) {
            return;
        }
        cuyVar.a = cvfVar2;
        if (cuyVar.z) {
            irs.b(cuyVar, cva.a, cvfVar2);
            cuyVar.a.k = (cvf) irs.a(cuyVar, cva.a);
            cuyVar.a.j(cuyVar.b);
            cuyVar.a.j = new cux(cuyVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && ffkj.e(this.a, ((SharedBoundsNodeElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ')';
    }
}
