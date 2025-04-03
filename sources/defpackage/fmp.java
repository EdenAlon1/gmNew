package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmp implements dhf {
    public final long a;
    private final boolean b;
    private final float c;
    private final ibz d = null;

    public fmp(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.dhf
    public final isw a(dwn dwnVar) {
        return new fjn(dwnVar, this.b, this.c, new fmo(this));
    }

    @Override // defpackage.dgz
    public final /* synthetic */ dig b(hfd hfdVar) {
        return dgy.a(hfdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmp)) {
            return false;
        }
        fmp fmpVar = (fmp) obj;
        if (this.b != fmpVar.b || !jzq.b(this.c, fmpVar.c)) {
            return false;
        }
        ibz ibzVar = fmpVar.d;
        if (!ffkj.e(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = fmpVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    @Override // defpackage.dhf
    public final int hashCode() {
        int floatToIntBits = ((true != this.b ? 1237 : 1231) * 31) + Float.floatToIntBits(this.c);
        long j = this.a;
        long j2 = ibw.a;
        return (floatToIntBits * 961) + ffco.a(j);
    }
}
