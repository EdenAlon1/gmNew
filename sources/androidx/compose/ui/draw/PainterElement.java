package androidx.compose.ui.draw;

import defpackage.ffkj;
import defpackage.huo;
import defpackage.hvh;
import defpackage.hxy;
import defpackage.iar;
import defpackage.ibx;
import defpackage.igq;
import defpackage.inp;
import defpackage.ith;
import defpackage.itz;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends ivp<hxy> {
    private final igq a;
    private final boolean b;
    private final huo c;
    private final inp d;
    private final float f;
    private final ibx g;

    public PainterElement(igq igqVar, boolean z, huo huoVar, inp inpVar, float f, ibx ibxVar) {
        this.a = igqVar;
        this.b = z;
        this.c = huoVar;
        this.d = inpVar;
        this.f = f;
        this.g = ibxVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hxy(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hxy hxyVar = (hxy) hvhVar;
        boolean z = hxyVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || iar.f(hxyVar.a.a(), this.a.a()))) {
            z3 = false;
        }
        hxyVar.a = this.a;
        hxyVar.b = this.b;
        hxyVar.c = this.c;
        hxyVar.d = this.d;
        hxyVar.e = this.f;
        hxyVar.f = this.g;
        if (z3) {
            itz.b(hxyVar);
        }
        ith.a(hxyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return ffkj.e(this.a, painterElement.a) && this.b == painterElement.b && ffkj.e(this.c, painterElement.c) && ffkj.e(this.d, painterElement.d) && Float.compare(this.f, painterElement.f) == 0 && ffkj.e(this.g, painterElement.g);
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.f);
        ibx ibxVar = this.g;
        return (hashCode * 31) + (ibxVar == null ? 0 : ibxVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
