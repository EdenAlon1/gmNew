package androidx.compose.foundation;

import defpackage.deq;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibq;
import defpackage.idh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ivp<deq> {
    private final float a;
    private final ibq b;
    private final idh c;

    public BorderModifierNodeElement(float f, ibq ibqVar, idh idhVar) {
        this.a = f;
        this.b = ibqVar;
        this.c = idhVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new deq(this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        deq deqVar = (deq) hvhVar;
        float f = deqVar.b;
        float f2 = this.a;
        if (!jzq.b(f, f2)) {
            deqVar.b = f2;
            deqVar.e.b();
        }
        ibq ibqVar = this.b;
        if (!ffkj.e(deqVar.c, ibqVar)) {
            deqVar.c = ibqVar;
            deqVar.e.b();
        }
        idh idhVar = this.c;
        if (ffkj.e(deqVar.d, idhVar)) {
            return;
        }
        deqVar.d = idhVar;
        deqVar.e.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return jzq.b(this.a, borderModifierNodeElement.a) && ffkj.e(this.b, borderModifierNodeElement.b) && ffkj.e(this.c, borderModifierNodeElement.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) jzq.a(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
