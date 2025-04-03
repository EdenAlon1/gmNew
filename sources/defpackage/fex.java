package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fex implements ffxy {
    final /* synthetic */ cxj a;
    final /* synthetic */ ffsk b;

    public fex(cxj cxjVar, ffsk ffskVar) {
        this.a = cxjVar;
        this.b = ffskVar;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        long j = ((iak) obj).a;
        if ((((iak) this.a.d()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L) {
            if (Float.intBitsToFloat((int) (((iak) this.a.d()).a & 4294967295L)) != Float.intBitsToFloat((int) (4294967295L & j))) {
                ffqy.d(this.b, null, null, new few(this.a, j, null), 3);
                return ffcu.a;
            }
        }
        Object e = this.a.e(new iak(j), ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }
}
