package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqj {
    public final jpo a;
    public final jpo b;
    public final jpo c;
    public final jpo d;
    private final jpo e;
    private final jpo f;
    private final jpo g;
    private final jpo h;
    private final jpo i;
    private final jpo j;
    private final jpo k;
    private final jpo l;
    private final jpo m;

    public fqj(jpo jpoVar, jpo jpoVar2, jpo jpoVar3, jpo jpoVar4, jpo jpoVar5, jpo jpoVar6, jpo jpoVar7, jpo jpoVar8, jpo jpoVar9, jpo jpoVar10, jpo jpoVar11, jpo jpoVar12, jpo jpoVar13) {
        this.e = jpoVar;
        this.f = jpoVar2;
        this.g = jpoVar3;
        this.h = jpoVar4;
        this.i = jpoVar5;
        this.j = jpoVar6;
        this.a = jpoVar7;
        this.k = jpoVar8;
        this.l = jpoVar9;
        this.b = jpoVar10;
        this.c = jpoVar11;
        this.d = jpoVar12;
        this.m = jpoVar13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqj)) {
            return false;
        }
        fqj fqjVar = (fqj) obj;
        return ffkj.e(this.e, fqjVar.e) && ffkj.e(this.f, fqjVar.f) && ffkj.e(this.g, fqjVar.g) && ffkj.e(this.h, fqjVar.h) && ffkj.e(this.i, fqjVar.i) && ffkj.e(this.j, fqjVar.j) && ffkj.e(this.a, fqjVar.a) && ffkj.e(this.k, fqjVar.k) && ffkj.e(this.l, fqjVar.l) && ffkj.e(this.b, fqjVar.b) && ffkj.e(this.c, fqjVar.c) && ffkj.e(this.d, fqjVar.d) && ffkj.e(this.m, fqjVar.m);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.a.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "Typography(h1=" + this.e + ", h2=" + this.f + ", h3=" + this.g + ", h4=" + this.h + ", h5=" + this.i + ", h6=" + this.j + ", subtitle1=" + this.a + ", subtitle2=" + this.k + ", body1=" + this.l + ", body2=" + this.b + ", button=" + this.c + ", caption=" + this.d + ", overline=" + this.m + ')';
    }
}
