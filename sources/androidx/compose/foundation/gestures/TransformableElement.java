package androidx.compose.foundation.gestures;

import defpackage.dni;
import defpackage.dud;
import defpackage.duq;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TransformableElement extends ivp<duq> {
    private final ffji a;
    private final boolean b;
    private final dni c;

    public TransformableElement(dni dniVar, ffji ffjiVar, boolean z) {
        this.c = dniVar;
        this.a = ffjiVar;
        this.b = z;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new duq(this.c, this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        duq duqVar = (duq) hvhVar;
        duqVar.a = this.a;
        dni dniVar = duqVar.f;
        dni dniVar2 = this.c;
        boolean e = ffkj.e(dniVar, dniVar2);
        boolean z = this.b;
        if (e && duqVar.b == z) {
            return;
        }
        duqVar.f = dniVar2;
        duqVar.b = z;
        duqVar.e.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return ffkj.e(this.c, transformableElement.c) && this.a == transformableElement.a && this.b == transformableElement.b;
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + dud.a(false)) * 31) + dud.a(this.b);
    }
}
