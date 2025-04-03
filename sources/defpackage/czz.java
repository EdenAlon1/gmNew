package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czz implements cyq {
    private final int a;
    private final cyl b;
    private final long c;
    private final int d = 1;

    public czz(int i, cyl cylVar, long j) {
        this.a = i;
        this.b = cylVar;
        this.c = j;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ dcr a(dbv dbvVar) {
        return new ddd(this.a, this.b.a(dbvVar), this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof czz)) {
            return false;
        }
        czz czzVar = (czz) obj;
        if (czzVar.a != this.a || !ffkj.e(czzVar.b, this.b)) {
            return false;
        }
        int i = czzVar.d;
        return dag.a(czzVar.c, this.c);
    }

    public final int hashCode() {
        int hashCode = (this.a * 31) + this.b.hashCode();
        czy.a(1);
        return (((hashCode * 31) + 1) * 31) + daf.a(this.c);
    }
}
