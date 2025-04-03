package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyz implements cxt {
    private final cyl a;
    private final long b;
    private final int c;

    public cyz(cyl cylVar, int i, long j) {
        this.a = cylVar;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.cxt
    public final dcr a(dbv dbvVar) {
        return new dda(this.a.b(dbvVar), this.c, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyz)) {
            return false;
        }
        cyz cyzVar = (cyz) obj;
        return ffkj.e(cyzVar.a, this.a) && cyzVar.c == this.c && dag.a(cyzVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.c;
        czy.a(i);
        return ((hashCode + i) * 31) + daf.a(this.b);
    }
}
