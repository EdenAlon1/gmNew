package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodr {
    public final long a;
    public final ipl b;
    public final ipl c;
    public final ipl d;
    public final List e;
    public final ipl f;

    public dodr(long j, ipl iplVar, ipl iplVar2, ipl iplVar3, List list, ipl iplVar4) {
        iplVar.getClass();
        iplVar2.getClass();
        iplVar3.getClass();
        iplVar4.getClass();
        this.a = j;
        this.b = iplVar;
        this.c = iplVar2;
        this.d = iplVar3;
        this.e = list;
        this.f = iplVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dodr)) {
            return false;
        }
        dodr dodrVar = (dodr) obj;
        return jzk.g(this.a, dodrVar.a) && ffkj.e(this.b, dodrVar.b) && ffkj.e(this.c, dodrVar.c) && ffkj.e(this.d, dodrVar.d) && ffkj.e(this.e, dodrVar.e) && ffkj.e(this.f, dodrVar.f);
    }

    public final int hashCode() {
        return (((((((((jzi.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "RichCardTextMeasurables(constraints=" + jzk.e(this.a) + ", spacer=" + this.b + ", title=" + this.c + ", desc=" + this.d + ", actions=" + this.e + ", bottomSpacer=" + this.f + ")";
    }
}
