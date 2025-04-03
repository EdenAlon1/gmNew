package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dae implements dcr {
    private final dcr a;
    private final long b;

    public dae(dcr dcrVar, long j) {
        this.a = dcrVar;
        this.b = j;
    }

    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.a(cybVar, cybVar2, cybVar3) + this.b;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        long j2 = this.b;
        return j < j2 ? cybVar : this.a.c(j - j2, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        long j2 = this.b;
        return j < j2 ? cybVar3 : this.a.d(j - j2, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dae)) {
            return false;
        }
        dae daeVar = (dae) obj;
        return daeVar.b == this.b && ffkj.e(daeVar.a, this.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
