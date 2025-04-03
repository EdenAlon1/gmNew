package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nep implements nbz {
    private final ncz a;
    private final int b;
    private final ncu c = new ncu();

    public nep(ncz nczVar, int i) {
        this.a = nczVar;
        this.b = i;
    }

    private final long c(ncp ncpVar) {
        nce nceVar;
        while (true) {
            nceVar = (nce) ncpVar;
            if (ncpVar.e() >= nceVar.a - 6) {
                break;
            }
            ncz nczVar = this.a;
            int i = this.b;
            ncu ncuVar = this.c;
            long e = ncpVar.e();
            byte[] bArr = new byte[2];
            ncpVar.i(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                ncpVar.k();
                ncpVar.g((int) (e - nceVar.b));
            } else {
                luv luvVar = new luv(16);
                System.arraycopy(bArr, 0, luvVar.a, 0, 2);
                luvVar.J(ncs.a(ncpVar, luvVar.a, 2, 14));
                ncpVar.k();
                ncpVar.g((int) (e - nceVar.b));
                if (ncv.c(luvVar, nczVar, i, ncuVar)) {
                    break;
                }
            }
            ncpVar.g(1);
        }
        long e2 = ncpVar.e();
        long j = nceVar.a;
        if (e2 < (-6) + j) {
            return this.c.a;
        }
        ncpVar.g((int) (j - ncpVar.e()));
        return this.a.j;
    }

    @Override // defpackage.nbz
    public final nby a(ncp ncpVar, long j) {
        long j2 = ((nce) ncpVar).b;
        int i = this.a.c;
        long c = c(ncpVar);
        long e = ncpVar.e();
        ncpVar.g(Math.max(6, i));
        long c2 = c(ncpVar);
        return (c > j || c2 <= j) ? c2 <= j ? new nby(-2, c2, ncpVar.e()) : new nby(-1, c, j2) : new nby(0, -9223372036854775807L, e);
    }

    @Override // defpackage.nbz
    public final /* synthetic */ void b() {
    }
}
