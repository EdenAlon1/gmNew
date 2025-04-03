package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlht extends dlaf {
    public final dlgu a;
    public final long b;
    public final List c;
    public final List d;
    public final eyee e;
    public final int f = 2;

    public dlht(dlgu dlguVar, long j, List list, List list2, eyee eyeeVar) {
        this.a = dlguVar;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = eyeeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlht)) {
            return false;
        }
        dlht dlhtVar = (dlht) obj;
        if (!ffkj.e(this.a, dlhtVar.a) || !ffpw.n(this.b, dlhtVar.b) || !ffkj.e(this.c, dlhtVar.c) || !ffkj.e(this.d, dlhtVar.d) || !ffkj.e(this.e, dlhtVar.e)) {
            return false;
        }
        int i = dlhtVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = ffpw.a;
        return ((((((((hashCode + ffpv.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 2;
    }
}
