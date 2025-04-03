package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dda implements dcr {
    private final dcw a;
    private final long b;
    private final long c;
    private final int d;

    public dda(dcw dcwVar, int i, long j) {
        this.a = dcwVar;
        this.d = i;
        this.b = (dcwVar.f() + dcwVar.g()) * 1000000;
        this.c = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.c;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.b;
        long j4 = j2 / j3;
        if (this.d != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }

    private final cyb g(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? this.a.d(j4 - j2, cybVar, cybVar3, cybVar2) : cybVar2;
    }

    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.c(f(j), cybVar, cybVar2, g(j, cybVar, cybVar3, cybVar2));
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.d(f(j), cybVar, cybVar2, g(j, cybVar, cybVar3, cybVar2));
    }

    @Override // defpackage.dcr
    public final boolean e() {
        return true;
    }
}
