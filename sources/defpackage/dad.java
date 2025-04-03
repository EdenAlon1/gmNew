package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dad implements cxt {
    private final cxt a;
    private final long b;

    public dad(cxt cxtVar, long j) {
        this.a = cxtVar;
        this.b = j;
    }

    @Override // defpackage.cxt
    public final dcr a(dbv dbvVar) {
        return new dae(this.a.a(dbvVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dad)) {
            return false;
        }
        dad dadVar = (dad) obj;
        return dadVar.b == this.b && ffkj.e(dadVar.a, this.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
