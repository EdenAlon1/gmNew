package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nix implements ndn {
    final /* synthetic */ niy a;

    public nix(niy niyVar) {
        this.a = niyVar;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        niy niyVar = this.a;
        BigInteger valueOf = BigInteger.valueOf(niyVar.c.f(j));
        niy niyVar2 = this.a;
        ndo ndoVar = new ndo(j, lvf.q((niyVar.a + valueOf.multiply(BigInteger.valueOf(niyVar2.b - niyVar2.a)).divide(BigInteger.valueOf(this.a.d)).longValue()) - 30000, this.a.a, r0.b - 1));
        return new ndl(ndoVar, ndoVar);
    }

    @Override // defpackage.ndn
    public final long w() {
        niy niyVar = this.a;
        return niyVar.c.e(niyVar.d);
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}
