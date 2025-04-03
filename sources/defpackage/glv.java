package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glv {
    public final eqd a;
    public final eqd b;
    public final eqd c;
    public final eqd d;
    public final eqd e;
    public final eqd f;
    public final eqd g;
    public final eqd h;

    public glv(eqd eqdVar, eqd eqdVar2, eqd eqdVar3, eqd eqdVar4, eqd eqdVar5, eqd eqdVar6, eqd eqdVar7, eqd eqdVar8) {
        this.a = eqdVar;
        this.b = eqdVar2;
        this.c = eqdVar3;
        this.d = eqdVar4;
        this.e = eqdVar5;
        this.f = eqdVar6;
        this.g = eqdVar7;
        this.h = eqdVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glv)) {
            return false;
        }
        glv glvVar = (glv) obj;
        return ffkj.e(this.a, glvVar.a) && ffkj.e(this.b, glvVar.b) && ffkj.e(this.c, glvVar.c) && ffkj.e(this.d, glvVar.d) && ffkj.e(this.e, glvVar.e) && ffkj.e(this.f, glvVar.f) && ffkj.e(this.g, glvVar.g) && ffkj.e(this.h, glvVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public glv() {
        this(glu.a, glu.b, glu.c, glu.d, glu.f, glu.e, glu.g, glu.h);
        eqd eqdVar = glu.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glv(byte[] bArr) {
        this(glu.a, glu.b, glu.c, glu.d, glu.f, glu.e, glu.g, glu.h);
        eqd eqdVar = glu.a;
    }
}
