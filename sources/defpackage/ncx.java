package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncx implements ndn {
    private final ncz a;
    private final long b;

    public ncx(ncz nczVar, long j) {
        this.a = nczVar;
        this.b = j;
    }

    private final ndo d(long j, long j2) {
        return new ndo((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        lti.g(this.a.k);
        ncz nczVar = this.a;
        ncy ncyVar = nczVar.k;
        long[] jArr = ncyVar.a;
        long[] jArr2 = ncyVar.b;
        int ak = lvf.ak(jArr, nczVar.b(j), false);
        ndo d = d(ak == -1 ? 0L : jArr[ak], ak != -1 ? jArr2[ak] : 0L);
        if (d.b == j || ak == jArr.length - 1) {
            return new ndl(d, d);
        }
        int i = ak + 1;
        return new ndl(d, d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.a.a();
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}
