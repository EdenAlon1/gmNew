package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddd implements dcr {
    private final int a;
    private final dcw b;
    private final long c;
    private final long d;

    public ddd(int i, dcw dcwVar, long j) {
        this.a = i;
        this.b = dcwVar;
        if (i <= 0) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.c = (dcwVar.f() + dcwVar.g()) * 1000000;
        this.d = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (Math.min(j2 / this.c, this.a - 1) * this.c);
    }

    private final cyb g(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? d(j4 - j2, cybVar, cybVar2, cybVar3) : cybVar2;
    }

    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return (this.a * this.c) - this.d;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.b.c(f(j), cybVar, cybVar2, g(j, cybVar, cybVar3, cybVar2));
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.b.d(f(j), cybVar, cybVar2, g(j, cybVar, cybVar3, cybVar2));
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }
}
