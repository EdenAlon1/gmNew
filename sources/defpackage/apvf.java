package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvf {
    public final engw a;
    public final long b;
    public final long c;
    private final ffji d;

    public apvf(engw engwVar, long j, long j2, ffji ffjiVar) {
        engwVar.getClass();
        this.a = engwVar;
        this.b = j;
        this.c = j2;
        this.d = ffjiVar;
    }

    public final int a(alxw alxwVar) {
        if (alxwVar instanceof apvv) {
            return a(((apvv) alxwVar).a);
        }
        if (!(alxwVar instanceof apus)) {
            return apvg.a(this.a, alxwVar, this.d);
        }
        return Math.max(Math.min((int) (((apus) alxwVar).a() - this.b), this.a.size()), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apvf)) {
            return false;
        }
        apvf apvfVar = (apvf) obj;
        return ffkj.e(this.a, apvfVar.a) && this.b == apvfVar.b && this.c == apvfVar.c && ffkj.e(this.d, apvfVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffji ffjiVar = this.d;
        return ((((hashCode + apve.a(this.b)) * 31) + apve.a(this.c)) * 31) + ffjiVar.hashCode();
    }

    public final String toString() {
        return "PagingResultsImpl(data=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ", createPagingKey=" + this.d + ")";
    }
}
